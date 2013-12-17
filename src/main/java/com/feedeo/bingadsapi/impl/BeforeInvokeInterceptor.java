package com.feedeo.bingadsapi.impl;

import com.feedeo.bingadsapi.session.BingAdsSession;

import java.io.IOException;

/**
 * User: maglju
 * Date: 2013-12-17
 * Time: 09:12
 */
public interface BeforeInvokeInterceptor<T extends java.rmi.Remote> {
    void intercept(BingAdsSession session, T service) throws IOException;
}
