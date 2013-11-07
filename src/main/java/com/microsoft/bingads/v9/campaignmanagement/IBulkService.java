/**
 * IBulkService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v9.campaignmanagement;

public interface IBulkService extends java.rmi.Remote {
    public com.microsoft.bingads.v9.campaignmanagement.DownloadCampaignsByAccountIdsResponse downloadCampaignsByAccountIds(com.microsoft.bingads.v9.campaignmanagement.DownloadCampaignsByAccountIdsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail;
    public com.microsoft.bingads.v9.campaignmanagement.DownloadCampaignsByCampaignIdsResponse downloadCampaignsByCampaignIds(com.microsoft.bingads.v9.campaignmanagement.DownloadCampaignsByCampaignIdsRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail;
    public com.microsoft.bingads.v9.campaignmanagement.GetDownloadStatusResponse getDownloadStatus(com.microsoft.bingads.v9.campaignmanagement.GetDownloadStatusRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail;
    public com.microsoft.bingads.v9.campaignmanagement.GetBulkUploadUrlResponse getBulkUploadUrl(com.microsoft.bingads.v9.campaignmanagement.GetBulkUploadUrlRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail;
    public com.microsoft.bingads.v9.campaignmanagement.GetBulkUploadStatusResponse getBulkUploadStatus(com.microsoft.bingads.v9.campaignmanagement.GetBulkUploadStatusRequest parameters) throws java.rmi.RemoteException, com.microsoft.bingads.v9.adapi.AdApiFaultDetail, com.microsoft.bingads.v9.campaignmanagement.ApiFaultDetail;
}
