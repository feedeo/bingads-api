package com.feedeo.bingadsapi.impl;

/**
 * User: maglju
 * Date: 2013-12-17
 * Time: 09:33
 */
public class SoapCallReturnInfo {
    private Object returnValue;
    private String url;
    private String serviceName;
    private String methodName;
    private String soapRequestXml;
    private String soapResponseXml;
    private Throwable throwable;

    public Object getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(Object returnValue) {
        this.returnValue = returnValue;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getSoapRequestXml() {
        return soapRequestXml;
    }

    public void setSoapRequestXml(String soapRequestXml) {
        this.soapRequestXml = soapRequestXml;
    }

    public String getSoapResponseXml() {
        return soapResponseXml;
    }

    public void setSoapResponseXml(String soapResponseXml) {
        this.soapResponseXml = soapResponseXml;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
