/**
 * ICampaignManagementService.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.campaignmanagement;

public interface ICampaignManagementService extends java.rmi.Remote {
    com.microsoft.bingads.v11.campaignmanagement.AddCampaignsResponse addCampaigns(com.microsoft.bingads.v11.campaignmanagement.AddCampaignsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetCampaignsByAccountIdResponse getCampaignsByAccountId(com.microsoft.bingads.v11.campaignmanagement.GetCampaignsByAccountIdRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetCampaignsByIdsResponse getCampaignsByIds(com.microsoft.bingads.v11.campaignmanagement.GetCampaignsByIdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.DeleteCampaignsResponse deleteCampaigns(com.microsoft.bingads.v11.campaignmanagement.DeleteCampaignsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.UpdateCampaignsResponse updateCampaigns(com.microsoft.bingads.v11.campaignmanagement.UpdateCampaignsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetNegativeSitesByCampaignIdsResponse getNegativeSitesByCampaignIds(com.microsoft.bingads.v11.campaignmanagement.GetNegativeSitesByCampaignIdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.SetNegativeSitesToCampaignsResponse setNegativeSitesToCampaigns(com.microsoft.bingads.v11.campaignmanagement.SetNegativeSitesToCampaignsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetConfigValueResponse getConfigValue(com.microsoft.bingads.v11.campaignmanagement.GetConfigValueRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetBSCCountriesResponse getBSCCountries(com.microsoft.bingads.v11.campaignmanagement.GetBSCCountriesRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.AddAdGroupsResponse addAdGroups(com.microsoft.bingads.v11.campaignmanagement.AddAdGroupsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.DeleteAdGroupsResponse deleteAdGroups(com.microsoft.bingads.v11.campaignmanagement.DeleteAdGroupsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetAdGroupsByIdsResponse getAdGroupsByIds(com.microsoft.bingads.v11.campaignmanagement.GetAdGroupsByIdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetAdGroupsByCampaignIdResponse getAdGroupsByCampaignId(com.microsoft.bingads.v11.campaignmanagement.GetAdGroupsByCampaignIdRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.UpdateAdGroupsResponse updateAdGroups(com.microsoft.bingads.v11.campaignmanagement.UpdateAdGroupsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetNegativeSitesByAdGroupIdsResponse getNegativeSitesByAdGroupIds(com.microsoft.bingads.v11.campaignmanagement.GetNegativeSitesByAdGroupIdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.SetNegativeSitesToAdGroupsResponse setNegativeSitesToAdGroups(com.microsoft.bingads.v11.campaignmanagement.SetNegativeSitesToAdGroupsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetGeoLocationsFileUrlResponse getGeoLocationsFileUrl(com.microsoft.bingads.v11.campaignmanagement.GetGeoLocationsFileUrlRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.AddAdsResponse addAds(com.microsoft.bingads.v11.campaignmanagement.AddAdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.DeleteAdsResponse deleteAds(com.microsoft.bingads.v11.campaignmanagement.DeleteAdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetAdsByEditorialStatusResponse getAdsByEditorialStatus(com.microsoft.bingads.v11.campaignmanagement.GetAdsByEditorialStatusRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetAdsByIdsResponse getAdsByIds(com.microsoft.bingads.v11.campaignmanagement.GetAdsByIdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetAdsByAdGroupIdResponse getAdsByAdGroupId(com.microsoft.bingads.v11.campaignmanagement.GetAdsByAdGroupIdRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.UpdateAdsResponse updateAds(com.microsoft.bingads.v11.campaignmanagement.UpdateAdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.AddKeywordsResponse addKeywords(com.microsoft.bingads.v11.campaignmanagement.AddKeywordsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.DeleteKeywordsResponse deleteKeywords(com.microsoft.bingads.v11.campaignmanagement.DeleteKeywordsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByEditorialStatusResponse getKeywordsByEditorialStatus(com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByEditorialStatusRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByIdsResponse getKeywordsByIds(com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByIdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByAdGroupIdResponse getKeywordsByAdGroupId(com.microsoft.bingads.v11.campaignmanagement.GetKeywordsByAdGroupIdRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.UpdateKeywordsResponse updateKeywords(com.microsoft.bingads.v11.campaignmanagement.UpdateKeywordsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.AppealEditorialRejectionsResponse appealEditorialRejections(com.microsoft.bingads.v11.campaignmanagement.AppealEditorialRejectionsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetEditorialReasonsByIdsResponse getEditorialReasonsByIds(com.microsoft.bingads.v11.campaignmanagement.GetEditorialReasonsByIdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetAccountMigrationStatusesResponse getAccountMigrationStatuses(com.microsoft.bingads.v11.campaignmanagement.GetAccountMigrationStatusesRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.SetAccountPropertiesResponse setAccountProperties(com.microsoft.bingads.v11.campaignmanagement.SetAccountPropertiesRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetAccountPropertiesResponse getAccountProperties(com.microsoft.bingads.v11.campaignmanagement.GetAccountPropertiesRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.AddAdExtensionsResponse addAdExtensions(com.microsoft.bingads.v11.campaignmanagement.AddAdExtensionsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsByIdsResponse getAdExtensionsByIds(com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsByIdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.UpdateAdExtensionsResponse updateAdExtensions(com.microsoft.bingads.v11.campaignmanagement.UpdateAdExtensionsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.DeleteAdExtensionsResponse deleteAdExtensions(com.microsoft.bingads.v11.campaignmanagement.DeleteAdExtensionsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsEditorialReasonsResponse getAdExtensionsEditorialReasons(com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsEditorialReasonsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.SetAdExtensionsAssociationsResponse setAdExtensionsAssociations(com.microsoft.bingads.v11.campaignmanagement.SetAdExtensionsAssociationsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsAssociationsResponse getAdExtensionsAssociations(com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionsAssociationsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.DeleteAdExtensionsAssociationsResponse deleteAdExtensionsAssociations(com.microsoft.bingads.v11.campaignmanagement.DeleteAdExtensionsAssociationsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionIdsByAccountIdResponse getAdExtensionIdsByAccountId(com.microsoft.bingads.v11.campaignmanagement.GetAdExtensionIdsByAccountIdRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.AddMediaResponse addMedia(com.microsoft.bingads.v11.campaignmanagement.AddMediaRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.DeleteMediaResponse deleteMedia(com.microsoft.bingads.v11.campaignmanagement.DeleteMediaRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetMediaByIdsResponse getMediaByIds(com.microsoft.bingads.v11.campaignmanagement.GetMediaByIdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetMediaMetaDataByAccountIdResponse getMediaMetaDataByAccountId(com.microsoft.bingads.v11.campaignmanagement.GetMediaMetaDataByAccountIdRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetMediaMetaDataByIdsResponse getMediaMetaDataByIds(com.microsoft.bingads.v11.campaignmanagement.GetMediaMetaDataByIdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetMediaAssociationsResponse getMediaAssociations(com.microsoft.bingads.v11.campaignmanagement.GetMediaAssociationsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetAdGroupCriterionsByIdsResponse getAdGroupCriterionsByIds(com.microsoft.bingads.v11.campaignmanagement.GetAdGroupCriterionsByIdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.AddAdGroupCriterionsResponse addAdGroupCriterions(com.microsoft.bingads.v11.campaignmanagement.AddAdGroupCriterionsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.UpdateAdGroupCriterionsResponse updateAdGroupCriterions(com.microsoft.bingads.v11.campaignmanagement.UpdateAdGroupCriterionsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.DeleteAdGroupCriterionsResponse deleteAdGroupCriterions(com.microsoft.bingads.v11.campaignmanagement.DeleteAdGroupCriterionsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.ApplyProductPartitionActionsResponse applyProductPartitionActions(com.microsoft.bingads.v11.campaignmanagement.ApplyProductPartitionActionsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetBMCStoresByCustomerIdResponse getBMCStoresByCustomerId(com.microsoft.bingads.v11.campaignmanagement.GetBMCStoresByCustomerIdRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.AddNegativeKeywordsToEntitiesResponse addNegativeKeywordsToEntities(com.microsoft.bingads.v11.campaignmanagement.AddNegativeKeywordsToEntitiesRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetNegativeKeywordsByEntityIdsResponse getNegativeKeywordsByEntityIds(com.microsoft.bingads.v11.campaignmanagement.GetNegativeKeywordsByEntityIdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.DeleteNegativeKeywordsFromEntitiesResponse deleteNegativeKeywordsFromEntities(com.microsoft.bingads.v11.campaignmanagement.DeleteNegativeKeywordsFromEntitiesRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetSharedEntitiesByAccountIdResponse getSharedEntitiesByAccountId(com.microsoft.bingads.v11.campaignmanagement.GetSharedEntitiesByAccountIdRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.AddSharedEntityResponse addSharedEntity(com.microsoft.bingads.v11.campaignmanagement.AddSharedEntityRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetListItemsBySharedListResponse getListItemsBySharedList(com.microsoft.bingads.v11.campaignmanagement.GetListItemsBySharedListRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.AddListItemsToSharedListResponse addListItemsToSharedList(com.microsoft.bingads.v11.campaignmanagement.AddListItemsToSharedListRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.UpdateSharedEntitiesResponse updateSharedEntities(com.microsoft.bingads.v11.campaignmanagement.UpdateSharedEntitiesRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.DeleteListItemsFromSharedListResponse deleteListItemsFromSharedList(com.microsoft.bingads.v11.campaignmanagement.DeleteListItemsFromSharedListRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.SetSharedEntityAssociationsResponse setSharedEntityAssociations(com.microsoft.bingads.v11.campaignmanagement.SetSharedEntityAssociationsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.DeleteSharedEntityAssociationsResponse deleteSharedEntityAssociations(com.microsoft.bingads.v11.campaignmanagement.DeleteSharedEntityAssociationsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetSharedEntityAssociationsBySharedEntityIdsResponse getSharedEntityAssociationsBySharedEntityIds(com.microsoft.bingads.v11.campaignmanagement.GetSharedEntityAssociationsBySharedEntityIdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetSharedEntityAssociationsByEntityIdsResponse getSharedEntityAssociationsByEntityIds(com.microsoft.bingads.v11.campaignmanagement.GetSharedEntityAssociationsByEntityIdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.DeleteSharedEntitiesResponse deleteSharedEntities(com.microsoft.bingads.v11.campaignmanagement.DeleteSharedEntitiesRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetCampaignSizesByAccountIdResponse getCampaignSizesByAccountId(com.microsoft.bingads.v11.campaignmanagement.GetCampaignSizesByAccountIdRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.AddCampaignCriterionsResponse addCampaignCriterions(com.microsoft.bingads.v11.campaignmanagement.AddCampaignCriterionsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.UpdateCampaignCriterionsResponse updateCampaignCriterions(com.microsoft.bingads.v11.campaignmanagement.UpdateCampaignCriterionsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.DeleteCampaignCriterionsResponse deleteCampaignCriterions(com.microsoft.bingads.v11.campaignmanagement.DeleteCampaignCriterionsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetCampaignCriterionsByIdsResponse getCampaignCriterionsByIds(com.microsoft.bingads.v11.campaignmanagement.GetCampaignCriterionsByIdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.AddBudgetsResponse addBudgets(com.microsoft.bingads.v11.campaignmanagement.AddBudgetsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.UpdateBudgetsResponse updateBudgets(com.microsoft.bingads.v11.campaignmanagement.UpdateBudgetsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.DeleteBudgetsResponse deleteBudgets(com.microsoft.bingads.v11.campaignmanagement.DeleteBudgetsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetBudgetsByIdsResponse getBudgetsByIds(com.microsoft.bingads.v11.campaignmanagement.GetBudgetsByIdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetCampaignIdsByBudgetIdsResponse getCampaignIdsByBudgetIds(com.microsoft.bingads.v11.campaignmanagement.GetCampaignIdsByBudgetIdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.AddAudiencesResponse addAudiences(com.microsoft.bingads.v11.campaignmanagement.AddAudiencesRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.UpdateAudiencesResponse updateAudiences(com.microsoft.bingads.v11.campaignmanagement.UpdateAudiencesRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.DeleteAudiencesResponse deleteAudiences(com.microsoft.bingads.v11.campaignmanagement.DeleteAudiencesRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetAudiencesByIdsResponse getAudiencesByIds(com.microsoft.bingads.v11.campaignmanagement.GetAudiencesByIdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetUetTagsByIdsResponse getUetTagsByIds(com.microsoft.bingads.v11.campaignmanagement.GetUetTagsByIdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.AddUetTagsResponse addUetTags(com.microsoft.bingads.v11.campaignmanagement.AddUetTagsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.UpdateUetTagsResponse updateUetTags(com.microsoft.bingads.v11.campaignmanagement.UpdateUetTagsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetConversionGoalsByIdsResponse getConversionGoalsByIds(com.microsoft.bingads.v11.campaignmanagement.GetConversionGoalsByIdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetConversionGoalsByTagIdsResponse getConversionGoalsByTagIds(com.microsoft.bingads.v11.campaignmanagement.GetConversionGoalsByTagIdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.AddConversionGoalsResponse addConversionGoals(com.microsoft.bingads.v11.campaignmanagement.AddConversionGoalsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.UpdateConversionGoalsResponse updateConversionGoals(com.microsoft.bingads.v11.campaignmanagement.UpdateConversionGoalsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.ApplyOfflineConversionsResponse applyOfflineConversions(com.microsoft.bingads.v11.campaignmanagement.ApplyOfflineConversionsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.AddLabelsResponse addLabels(com.microsoft.bingads.v11.campaignmanagement.AddLabelsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.DeleteLabelsResponse deleteLabels(com.microsoft.bingads.v11.campaignmanagement.DeleteLabelsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.UpdateLabelsResponse updateLabels(com.microsoft.bingads.v11.campaignmanagement.UpdateLabelsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetLabelsByIdsResponse getLabelsByIds(com.microsoft.bingads.v11.campaignmanagement.GetLabelsByIdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.SetLabelAssociationsResponse setLabelAssociations(com.microsoft.bingads.v11.campaignmanagement.SetLabelAssociationsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.DeleteLabelAssociationsResponse deleteLabelAssociations(com.microsoft.bingads.v11.campaignmanagement.DeleteLabelAssociationsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetLabelAssociationsByEntityIdsResponse getLabelAssociationsByEntityIds(com.microsoft.bingads.v11.campaignmanagement.GetLabelAssociationsByEntityIdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.campaignmanagement.GetLabelAssociationsByLabelIdsResponse getLabelAssociationsByLabelIds(com.microsoft.bingads.v11.campaignmanagement.GetLabelAssociationsByLabelIdsRequest parameters) throws java.rmi.RemoteException;
}
