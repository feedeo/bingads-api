package com.feedeo.bingadsapi.impl;

import com.feedeo.bingadsapi.service.HasPartialErrors;
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
            (log.isEnabledFor(Level.WARN) && hasError(soapCallReturnInfo))) {
            String prettyRequest = "SOAP Request:\n" + prettyPrinter.prettyPrint(soapCallReturnInfo.getSoapRequestXml());
            String prettyResponse = "SOAP Response:\n" + prettyPrinter.prettyPrint(soapCallReturnInfo.getSoapResponseXml());
            if (hasError(soapCallReturnInfo)) {
                log.warn(prettyRequest);
                log.warn(prettyResponse);
            } else {
                log.info(prettyRequest);
                log.info(prettyResponse);
            }
        }
    }

    private boolean hasError(SoapCallReturnInfo soapCallReturnInfo) {
        if (soapCallReturnInfo.getReturnValue() instanceof HasPartialErrors) {
            HasPartialErrors returnValue = (HasPartialErrors) soapCallReturnInfo.getReturnValue();
            return returnValue.getPartialErrors() != null && returnValue.getPartialErrors().length > 0;
        }

        return soapCallReturnInfo.getThrowable() != null;
    }

    private void logRequest(SoapCallReturnInfo soapCallReturnInfo) {
        if (log.isEnabledFor(Level.INFO)) {
            log.info("SOAP Request: Service: \"" + soapCallReturnInfo.getServiceName() +
                     "\" Method: \"" + soapCallReturnInfo.getMethodName() +
                     "\" URL: \"" + soapCallReturnInfo.getUrl() + "\"");
        }
    }
}