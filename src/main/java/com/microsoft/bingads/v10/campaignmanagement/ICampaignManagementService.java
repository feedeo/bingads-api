/**
 * ICampaignManagementService.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v10.campaignmanagement;

public interface ICampaignManagementService extends java.rmi.Remote {
  com.microsoft.bingads.v10.campaignmanagement.AddCampaignsResponse addCampaigns(com.microsoft.bingads.v10.campaignmanagement.AddCampaignsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetCampaignsByAccountIdResponse getCampaignsByAccountId(com.microsoft.bingads.v10.campaignmanagement.GetCampaignsByAccountIdRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetCampaignsByIdsResponse getCampaignsByIds(com.microsoft.bingads.v10.campaignmanagement.GetCampaignsByIdsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.DeleteCampaignsResponse deleteCampaigns(com.microsoft.bingads.v10.campaignmanagement.DeleteCampaignsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.UpdateCampaignsResponse updateCampaigns(com.microsoft.bingads.v10.campaignmanagement.UpdateCampaignsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetNegativeSitesByCampaignIdsResponse getNegativeSitesByCampaignIds(com.microsoft.bingads.v10.campaignmanagement.GetNegativeSitesByCampaignIdsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.SetNegativeSitesToCampaignsResponse setNegativeSitesToCampaigns(com.microsoft.bingads.v10.campaignmanagement.SetNegativeSitesToCampaignsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetConfigValueResponse getConfigValue(com.microsoft.bingads.v10.campaignmanagement.GetConfigValueRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.AddAdGroupsResponse addAdGroups(com.microsoft.bingads.v10.campaignmanagement.AddAdGroupsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.DeleteAdGroupsResponse deleteAdGroups(com.microsoft.bingads.v10.campaignmanagement.DeleteAdGroupsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetAdGroupsByIdsResponse getAdGroupsByIds(com.microsoft.bingads.v10.campaignmanagement.GetAdGroupsByIdsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetAdGroupsByCampaignIdResponse getAdGroupsByCampaignId(com.microsoft.bingads.v10.campaignmanagement.GetAdGroupsByCampaignIdRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.UpdateAdGroupsResponse updateAdGroups(com.microsoft.bingads.v10.campaignmanagement.UpdateAdGroupsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetNegativeSitesByAdGroupIdsResponse getNegativeSitesByAdGroupIds(com.microsoft.bingads.v10.campaignmanagement.GetNegativeSitesByAdGroupIdsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.SetNegativeSitesToAdGroupsResponse setNegativeSitesToAdGroups(com.microsoft.bingads.v10.campaignmanagement.SetNegativeSitesToAdGroupsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.DeleteTargetsFromLibraryResponse deleteTargetsFromLibrary(com.microsoft.bingads.v10.campaignmanagement.DeleteTargetsFromLibraryRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetTargetsInfoFromLibraryResponse getTargetsInfoFromLibrary(com.microsoft.bingads.v10.campaignmanagement.GetTargetsInfoFromLibraryRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.SetTargetToAdGroupResponse setTargetToAdGroup(com.microsoft.bingads.v10.campaignmanagement.SetTargetToAdGroupRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.DeleteTargetFromAdGroupResponse deleteTargetFromAdGroup(com.microsoft.bingads.v10.campaignmanagement.DeleteTargetFromAdGroupRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.SetTargetToCampaignResponse setTargetToCampaign(com.microsoft.bingads.v10.campaignmanagement.SetTargetToCampaignRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.DeleteTargetFromCampaignResponse deleteTargetFromCampaign(com.microsoft.bingads.v10.campaignmanagement.DeleteTargetFromCampaignRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.AddTargetsToLibraryResponse addTargetsToLibrary(com.microsoft.bingads.v10.campaignmanagement.AddTargetsToLibraryRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.UpdateTargetsInLibraryResponse updateTargetsInLibrary(com.microsoft.bingads.v10.campaignmanagement.UpdateTargetsInLibraryRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetTargetsByIdsResponse getTargetsByIds(com.microsoft.bingads.v10.campaignmanagement.GetTargetsByIdsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetTargetsByAdGroupIdsResponse getTargetsByAdGroupIds(com.microsoft.bingads.v10.campaignmanagement.GetTargetsByAdGroupIdsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetTargetsByCampaignIdsResponse getTargetsByCampaignIds(com.microsoft.bingads.v10.campaignmanagement.GetTargetsByCampaignIdsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.AddAdsResponse addAds(com.microsoft.bingads.v10.campaignmanagement.AddAdsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.DeleteAdsResponse deleteAds(com.microsoft.bingads.v10.campaignmanagement.DeleteAdsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetAdsByEditorialStatusResponse getAdsByEditorialStatus(com.microsoft.bingads.v10.campaignmanagement.GetAdsByEditorialStatusRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetAdsByIdsResponse getAdsByIds(com.microsoft.bingads.v10.campaignmanagement.GetAdsByIdsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetAdsByAdGroupIdResponse getAdsByAdGroupId(com.microsoft.bingads.v10.campaignmanagement.GetAdsByAdGroupIdRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.UpdateAdsResponse updateAds(com.microsoft.bingads.v10.campaignmanagement.UpdateAdsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.AddKeywordsResponse addKeywords(com.microsoft.bingads.v10.campaignmanagement.AddKeywordsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.DeleteKeywordsResponse deleteKeywords(com.microsoft.bingads.v10.campaignmanagement.DeleteKeywordsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByEditorialStatusResponse getKeywordsByEditorialStatus(com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByEditorialStatusRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByIdsResponse getKeywordsByIds(com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByIdsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByAdGroupIdResponse getKeywordsByAdGroupId(com.microsoft.bingads.v10.campaignmanagement.GetKeywordsByAdGroupIdRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.UpdateKeywordsResponse updateKeywords(com.microsoft.bingads.v10.campaignmanagement.UpdateKeywordsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.AppealEditorialRejectionsResponse appealEditorialRejections(com.microsoft.bingads.v10.campaignmanagement.AppealEditorialRejectionsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.AddSitePlacementsResponse addSitePlacements(com.microsoft.bingads.v10.campaignmanagement.AddSitePlacementsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.DeleteSitePlacementsResponse deleteSitePlacements(com.microsoft.bingads.v10.campaignmanagement.DeleteSitePlacementsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetSitePlacementsByIdsResponse getSitePlacementsByIds(com.microsoft.bingads.v10.campaignmanagement.GetSitePlacementsByIdsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetSitePlacementsByAdGroupIdResponse getSitePlacementsByAdGroupId(com.microsoft.bingads.v10.campaignmanagement.GetSitePlacementsByAdGroupIdRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.UpdateSitePlacementsResponse updateSitePlacements(com.microsoft.bingads.v10.campaignmanagement.UpdateSitePlacementsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetPlacementDetailsForUrlsResponse getPlacementDetailsForUrls(com.microsoft.bingads.v10.campaignmanagement.GetPlacementDetailsForUrlsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetEditorialReasonsByIdsResponse getEditorialReasonsByIds(com.microsoft.bingads.v10.campaignmanagement.GetEditorialReasonsByIdsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetAccountMigrationStatusesResponse getAccountMigrationStatuses(com.microsoft.bingads.v10.campaignmanagement.GetAccountMigrationStatusesRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.AddAdExtensionsResponse addAdExtensions(com.microsoft.bingads.v10.campaignmanagement.AddAdExtensionsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsByIdsResponse getAdExtensionsByIds(com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsByIdsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.UpdateAdExtensionsResponse updateAdExtensions(com.microsoft.bingads.v10.campaignmanagement.UpdateAdExtensionsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.DeleteAdExtensionsResponse deleteAdExtensions(com.microsoft.bingads.v10.campaignmanagement.DeleteAdExtensionsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsEditorialReasonsResponse getAdExtensionsEditorialReasons(com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsEditorialReasonsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.SetAdExtensionsAssociationsResponse setAdExtensionsAssociations(com.microsoft.bingads.v10.campaignmanagement.SetAdExtensionsAssociationsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsAssociationsResponse getAdExtensionsAssociations(com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionsAssociationsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.DeleteAdExtensionsAssociationsResponse deleteAdExtensionsAssociations(com.microsoft.bingads.v10.campaignmanagement.DeleteAdExtensionsAssociationsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionIdsByAccountIdResponse getAdExtensionIdsByAccountId(com.microsoft.bingads.v10.campaignmanagement.GetAdExtensionIdsByAccountIdRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.AddMediaResponse addMedia(com.microsoft.bingads.v10.campaignmanagement.AddMediaRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.DeleteMediaResponse deleteMedia(com.microsoft.bingads.v10.campaignmanagement.DeleteMediaRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetMediaByIdsResponse getMediaByIds(com.microsoft.bingads.v10.campaignmanagement.GetMediaByIdsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetMediaMetaDataByAccountIdResponse getMediaMetaDataByAccountId(com.microsoft.bingads.v10.campaignmanagement.GetMediaMetaDataByAccountIdRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetMediaMetaDataByIdsResponse getMediaMetaDataByIds(com.microsoft.bingads.v10.campaignmanagement.GetMediaMetaDataByIdsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetMediaAssociationsResponse getMediaAssociations(com.microsoft.bingads.v10.campaignmanagement.GetMediaAssociationsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetAdGroupCriterionsByIdsResponse getAdGroupCriterionsByIds(com.microsoft.bingads.v10.campaignmanagement.GetAdGroupCriterionsByIdsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.AddAdGroupCriterionsResponse addAdGroupCriterions(com.microsoft.bingads.v10.campaignmanagement.AddAdGroupCriterionsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.UpdateAdGroupCriterionsResponse updateAdGroupCriterions(com.microsoft.bingads.v10.campaignmanagement.UpdateAdGroupCriterionsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.DeleteAdGroupCriterionsResponse deleteAdGroupCriterions(com.microsoft.bingads.v10.campaignmanagement.DeleteAdGroupCriterionsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.ApplyProductPartitionActionsResponse applyProductPartitionActions(com.microsoft.bingads.v10.campaignmanagement.ApplyProductPartitionActionsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetBMCStoresByCustomerIdResponse getBMCStoresByCustomerId(com.microsoft.bingads.v10.campaignmanagement.GetBMCStoresByCustomerIdRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.AddNegativeKeywordsToEntitiesResponse addNegativeKeywordsToEntities(com.microsoft.bingads.v10.campaignmanagement.AddNegativeKeywordsToEntitiesRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetNegativeKeywordsByEntityIdsResponse getNegativeKeywordsByEntityIds(com.microsoft.bingads.v10.campaignmanagement.GetNegativeKeywordsByEntityIdsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.DeleteNegativeKeywordsFromEntitiesResponse deleteNegativeKeywordsFromEntities(com.microsoft.bingads.v10.campaignmanagement.DeleteNegativeKeywordsFromEntitiesRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetSharedEntitiesByAccountIdResponse getSharedEntitiesByAccountId(com.microsoft.bingads.v10.campaignmanagement.GetSharedEntitiesByAccountIdRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.AddSharedEntityResponse addSharedEntity(com.microsoft.bingads.v10.campaignmanagement.AddSharedEntityRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetListItemsBySharedListResponse getListItemsBySharedList(com.microsoft.bingads.v10.campaignmanagement.GetListItemsBySharedListRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.AddListItemsToSharedListResponse addListItemsToSharedList(com.microsoft.bingads.v10.campaignmanagement.AddListItemsToSharedListRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.UpdateSharedEntitiesResponse updateSharedEntities(com.microsoft.bingads.v10.campaignmanagement.UpdateSharedEntitiesRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.DeleteListItemsFromSharedListResponse deleteListItemsFromSharedList(com.microsoft.bingads.v10.campaignmanagement.DeleteListItemsFromSharedListRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.SetSharedEntityAssociationsResponse setSharedEntityAssociations(com.microsoft.bingads.v10.campaignmanagement.SetSharedEntityAssociationsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.DeleteSharedEntityAssociationsResponse deleteSharedEntityAssociations(com.microsoft.bingads.v10.campaignmanagement.DeleteSharedEntityAssociationsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetSharedEntityAssociationsBySharedEntityIdsResponse getSharedEntityAssociationsBySharedEntityIds(com.microsoft.bingads.v10.campaignmanagement.GetSharedEntityAssociationsBySharedEntityIdsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetSharedEntityAssociationsByEntityIdsResponse getSharedEntityAssociationsByEntityIds(com.microsoft.bingads.v10.campaignmanagement.GetSharedEntityAssociationsByEntityIdsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.DeleteSharedEntitiesResponse deleteSharedEntities(com.microsoft.bingads.v10.campaignmanagement.DeleteSharedEntitiesRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetCampaignSizesByAccountIdResponse getCampaignSizesByAccountId(com.microsoft.bingads.v10.campaignmanagement.GetCampaignSizesByAccountIdRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.AddCampaignCriterionsResponse addCampaignCriterions(com.microsoft.bingads.v10.campaignmanagement.AddCampaignCriterionsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.UpdateCampaignCriterionsResponse updateCampaignCriterions(com.microsoft.bingads.v10.campaignmanagement.UpdateCampaignCriterionsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.DeleteCampaignCriterionsResponse deleteCampaignCriterions(com.microsoft.bingads.v10.campaignmanagement.DeleteCampaignCriterionsRequest parameters) throws java.rmi.RemoteException;

  com.microsoft.bingads.v10.campaignmanagement.GetCampaignCriterionsByIdsResponse getCampaignCriterionsByIds(com.microsoft.bingads.v10.campaignmanagement.GetCampaignCriterionsByIdsRequest parameters) throws java.rmi.RemoteException;
}
