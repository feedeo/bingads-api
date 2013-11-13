package com.feedeo.bingadsapi.impl;

import org.apache.axis.client.Service;

import java.rmi.Remote;

/**
 * User: maglju
 * Date: 2013-11-13
 * Time: 08:47
 */
public class LocatorInstantiator {
    public <T extends Remote> Service instantiateLocator(Class<T> serviceClass) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String locatorClassSimpleName = serviceClass.getSimpleName().substring(1) + "Locator";
        String locatorClassName = serviceClass.getPackage().getName() + "." + locatorClassSimpleName;
        return (Service) Class.forName(locatorClassName).newInstance();
    }

}
