package com.feedeo.bingadsapi.impl;

import com.feedeo.bingadsapi.session.BingAdsSession;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.rmi.Remote;

/**
 * User: maglju
 * Date: 2013-12-17
 * Time: 10:38
 */
public class LoggingInterceptor<T extends Remote> implements ReturnValueInterceptor<T> {
    private static final Logger log = Logger.getLogger(LoggingInterceptor.class);

    private PrettyPrinter prettyPrinter = new PrettyPrinter();

    @Override
    public void intercept(BingAdsSession session, T service, SoapCallReturnInfo soapCallReturnInfo) {
        logRequest(soapCallReturnInfo);
        logSoapXml(soapCallReturnInfo);
    }

    private void logSoapXml(SoapCallReturnInfo soapCallReturnInfo) {
        if (log.isEnabledFor(Level.INFO) ||
            (log.isEnabledFor(Level.WARN) && soapCallReturnInfo.getThrowable() != null)) {
            String prettyRequest = "SOAP Request:\n" + prettyPrinter.prettyPrint(soapCallReturnInfo.getSoapRequestXml());
            String prettyResponse = "SOAP Response:\n" + prettyPrinter.prettyPrint(soapCallReturnInfo.getSoapResponseXml());
            if (soapCallReturnInfo.getThrowable() == null) {
                log.info(prettyRequest);
                log.info(prettyResponse);
            } else {
                log.warn(prettyRequest);
                log.warn(prettyResponse);
            }
        }
    }

    private void logRequest(SoapCallReturnInfo soapCallReturnInfo) {
        if (log.isEnabledFor(Level.INFO)) {
            log.info("SOAP Request: Service: \"" + soapCallReturnInfo.getServiceName() +
                     "\" Method: \"" + soapCallReturnInfo.getMethodName() +
                     "\" URL: \"" + soapCallReturnInfo.getUrl() + "\"");
        }
    }
}