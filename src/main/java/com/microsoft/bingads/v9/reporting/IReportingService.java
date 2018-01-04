/**
 * IReportingService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.reporting;

public interface IReportingService extends java.rmi.Remote {
    com.microsoft.bingads.v9.reporting.SubmitGenerateReportResponse submitGenerateReport(com.microsoft.bingads.v9.reporting.SubmitGenerateReportRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v9.reporting.PollGenerateReportResponse pollGenerateReport(com.microsoft.bingads.v9.reporting.PollGenerateReportRequest parameters) throws java.rmi.RemoteException;
}
