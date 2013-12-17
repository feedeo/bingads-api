package com.feedeo.bingadsapi.impl;

import com.feedeo.bingadsapi.session.BingAdsSession;

import java.rmi.Remote;

/**
 * User: maglju
 * Date: 2013-12-17
 * Time: 09:20
 */
public class NoopBeforeInvokeInterceptor<T extends Remote> implements BeforeInvokeInterceptor<T> {
    @Override
    public void intercept(BingAdsSession session, T service) {
    }
}
