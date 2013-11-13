package com.feedeo.bingadsapi.impl;

import org.apache.axis.client.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.rmi.Remote;

/**
 * User: maglju
 * Date: 2013-11-13
 * Time: 08:57
 */
public class ServiceInstantiator {
    public <T extends Remote> T instantiateService(Service locator, Class<T> serviceClass)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String methodName = "getBasicHttpBinding_" + serviceClass.getSimpleName();
        Method method = locator.getClass().getMethod(methodName);
        return (T) method.invoke(locator);
    }
}
