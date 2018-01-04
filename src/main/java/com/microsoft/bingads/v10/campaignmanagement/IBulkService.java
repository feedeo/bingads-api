/**
 * IBulkService.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public interface IBulkService extends java.rmi.Remote {
  com.microsoft.bingads.v10.campaignmanagement.DownloadCampaignsByAccountIdsResponse downloadCampaignsByAccountIds(com.microsoft.bingads.v10.campaignmanagement.DownloadCampaignsByAccountIdsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.DownloadCampaignsByCampaignIdsResponse downloadCampaignsByCampaignIds(com.microsoft.bingads.v10.campaignmanagement.DownloadCampaignsByCampaignIdsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetBulkDownloadStatusResponse getBulkDownloadStatus(com.microsoft.bingads.v10.campaignmanagement.GetBulkDownloadStatusRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetBulkUploadUrlResponse getBulkUploadUrl(com.microsoft.bingads.v10.campaignmanagement.GetBulkUploadUrlRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetBulkUploadStatusResponse getBulkUploadStatus(com.microsoft.bingads.v10.campaignmanagement.GetBulkUploadStatusRequest parameters) throws java.rmi.RemoteException;
}
