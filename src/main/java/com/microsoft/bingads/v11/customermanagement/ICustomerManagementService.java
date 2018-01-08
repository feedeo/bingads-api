/**
 * ICustomerManagementService.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.bingads.v11.customermanagement;

public interface ICustomerManagementService extends java.rmi.Remote {
    com.microsoft.bingads.v11.customermanagement.GetAccountsInfoResponse getAccountsInfo(com.microsoft.bingads.v11.customermanagement.GetAccountsInfoRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.FindAccountsResponse findAccounts(com.microsoft.bingads.v11.customermanagement.FindAccountsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.AddAccountResponse addAccount(com.microsoft.bingads.v11.customermanagement.AddAccountRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.UpdateAccountResponse updateAccount(com.microsoft.bingads.v11.customermanagement.UpdateAccountRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.GetCustomerResponse getCustomer(com.microsoft.bingads.v11.customermanagement.GetCustomerRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.UpdateCustomerResponse updateCustomer(com.microsoft.bingads.v11.customermanagement.UpdateCustomerRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.SignupCustomerResponse signupCustomer(com.microsoft.bingads.v11.customermanagement.SignupCustomerRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.GetAccountResponse getAccount(com.microsoft.bingads.v11.customermanagement.GetAccountRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.GetCustomersInfoResponse getCustomersInfo(com.microsoft.bingads.v11.customermanagement.GetCustomersInfoRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.DeleteAccountResponse deleteAccount(com.microsoft.bingads.v11.customermanagement.DeleteAccountRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.DeleteCustomerResponse deleteCustomer(com.microsoft.bingads.v11.customermanagement.DeleteCustomerRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.UpdateUserResponse updateUser(com.microsoft.bingads.v11.customermanagement.UpdateUserRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.UpdateUserRolesResponse updateUserRoles(com.microsoft.bingads.v11.customermanagement.UpdateUserRolesRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.GetUserResponse getUser(com.microsoft.bingads.v11.customermanagement.GetUserRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.GetCurrentUserResponse getCurrentUser(com.microsoft.bingads.v11.customermanagement.GetCurrentUserRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.DeleteUserResponse deleteUser(com.microsoft.bingads.v11.customermanagement.DeleteUserRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.GetUsersInfoResponse getUsersInfo(com.microsoft.bingads.v11.customermanagement.GetUsersInfoRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.GetCustomerPilotFeaturesResponse getCustomerPilotFeatures(com.microsoft.bingads.v11.customermanagement.GetCustomerPilotFeaturesRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.GetPilotFeaturesCountriesResponse getPilotFeaturesCountries(com.microsoft.bingads.v11.customermanagement.GetPilotFeaturesCountriesRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.GetAccessibleCustomerResponse getAccessibleCustomer(com.microsoft.bingads.v11.customermanagement.GetAccessibleCustomerRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.FindAccountsOrCustomersInfoResponse findAccountsOrCustomersInfo(com.microsoft.bingads.v11.customermanagement.FindAccountsOrCustomersInfoRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.UpgradeCustomerToAgencyResponse upgradeCustomerToAgency(com.microsoft.bingads.v11.customermanagement.UpgradeCustomerToAgencyRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.AddPrepayAccountResponse addPrepayAccount(com.microsoft.bingads.v11.customermanagement.AddPrepayAccountRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.UpdatePrepayAccountResponse updatePrepayAccount(com.microsoft.bingads.v11.customermanagement.UpdatePrepayAccountRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.MapCustomerIdToExternalCustomerIdResponse mapCustomerIdToExternalCustomerId(com.microsoft.bingads.v11.customermanagement.MapCustomerIdToExternalCustomerIdRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.MapAccountIdToExternalAccountIdsResponse mapAccountIdToExternalAccountIds(com.microsoft.bingads.v11.customermanagement.MapAccountIdToExternalAccountIdsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.SearchCustomersResponse searchCustomers(com.microsoft.bingads.v11.customermanagement.SearchCustomersRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.AddClientLinksResponse addClientLinks(com.microsoft.bingads.v11.customermanagement.AddClientLinksRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.UpdateClientLinksResponse updateClientLinks(com.microsoft.bingads.v11.customermanagement.UpdateClientLinksRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.SearchClientLinksResponse searchClientLinks(com.microsoft.bingads.v11.customermanagement.SearchClientLinksRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.SearchAccountsResponse searchAccounts(com.microsoft.bingads.v11.customermanagement.SearchAccountsRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.SendUserInvitationResponse sendUserInvitation(com.microsoft.bingads.v11.customermanagement.SendUserInvitationRequest parameters) throws java.rmi.RemoteException;

    com.microsoft.bingads.v11.customermanagement.SearchUserInvitationsResponse searchUserInvitations(com.microsoft.bingads.v11.customermanagement.SearchUserInvitationsRequest parameters) throws java.rmi.RemoteException;
}
