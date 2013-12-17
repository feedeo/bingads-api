package com.feedeo.bingadsapi.impl;

import com.feedeo.bingadsapi.session.BingAdsSession;

import java.rmi.Remote;

/**
 * User: maglju
 * Date: 2013-12-17
 * Time: 09:35
 */
public interface ReturnValueInterceptor<T extends Remote> {
    void intercept(BingAdsSession session, T service, SoapCallReturnInfo soapCallReturnInfo);
}
