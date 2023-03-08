// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Directory;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Request Builder.
 */
public class DirectoryRequestBuilder extends BaseRequestBuilder<Directory> {

    /**
     * The request builder for the Directory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DirectoryRequest instance
     */
    @Nonnull
    public DirectoryRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the DirectoryRequest instance
     */
    @Nonnull
    public DirectoryRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.DirectoryRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the AdministrativeUnit collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.AdministrativeUnitCollectionRequestBuilder administrativeUnits() {
        return new com.microsoft.graph.requests.AdministrativeUnitCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("administrativeUnits"), getClient(), null);
    }

    /**
     * Gets a request builder for the AdministrativeUnit item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.AdministrativeUnitRequestBuilder administrativeUnits(@Nonnull final String id) {
        return new com.microsoft.graph.requests.AdministrativeUnitRequestBuilder(getRequestUrlWithAdditionalSegment("administrativeUnits") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DirectoryObject collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.DirectoryObjectCollectionRequestBuilder deletedItems() {
        return new com.microsoft.graph.requests.DirectoryObjectCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deletedItems"), getClient(), null);
    }

    /**
     * Gets a request builder for the DirectoryObject item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.DirectoryObjectRequestBuilder deletedItems(@Nonnull final String id) {
        return new com.microsoft.graph.requests.DirectoryObjectRequestBuilder(getRequestUrlWithAdditionalSegment("deletedItems") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the User collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.UserCollectionRequestBuilder deletedItemsAsUser() {
        return new com.microsoft.graph.requests.UserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deletedItems") + "/microsoft.graph.user", getClient(), null);
    }

    /**
     * Gets a request builder for the User item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.UserRequestBuilder deletedItemsAsUser(@Nonnull final String id) {
        return new com.microsoft.graph.requests.UserRequestBuilder(getRequestUrlWithAdditionalSegment("deletedItems") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    /**
     *  Gets a request builder for the Group collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.GroupCollectionRequestBuilder deletedItemsAsGroup() {
        return new com.microsoft.graph.requests.GroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deletedItems") + "/microsoft.graph.group", getClient(), null);
    }

    /**
     * Gets a request builder for the Group item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.GroupRequestBuilder deletedItemsAsGroup(@Nonnull final String id) {
        return new com.microsoft.graph.requests.GroupRequestBuilder(getRequestUrlWithAdditionalSegment("deletedItems") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    /**
     *  Gets a request builder for the Application collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.ApplicationCollectionRequestBuilder deletedItemsAsApplication() {
        return new com.microsoft.graph.requests.ApplicationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deletedItems") + "/microsoft.graph.application", getClient(), null);
    }

    /**
     * Gets a request builder for the Application item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.ApplicationRequestBuilder deletedItemsAsApplication(@Nonnull final String id) {
        return new com.microsoft.graph.requests.ApplicationRequestBuilder(getRequestUrlWithAdditionalSegment("deletedItems") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    /**
     *  Gets a request builder for the IdentityProviderBase collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.IdentityProviderBaseCollectionRequestBuilder federationConfigurations() {
        return new com.microsoft.graph.requests.IdentityProviderBaseCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("federationConfigurations"), getClient(), null);
    }

    /**
     * Gets a request builder for the IdentityProviderBase item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.IdentityProviderBaseRequestBuilder federationConfigurations(@Nonnull final String id) {
        return new com.microsoft.graph.requests.IdentityProviderBaseRequestBuilder(getRequestUrlWithAdditionalSegment("federationConfigurations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the OnPremisesDirectorySynchronization collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.OnPremisesDirectorySynchronizationCollectionRequestBuilder onPremisesSynchronization() {
        return new com.microsoft.graph.requests.OnPremisesDirectorySynchronizationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("onPremisesSynchronization"), getClient(), null);
    }

    /**
     * Gets a request builder for the OnPremisesDirectorySynchronization item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.OnPremisesDirectorySynchronizationRequestBuilder onPremisesSynchronization(@Nonnull final String id) {
        return new com.microsoft.graph.requests.OnPremisesDirectorySynchronizationRequestBuilder(getRequestUrlWithAdditionalSegment("onPremisesSynchronization") + "/" + id, getClient(), null);
    }
}
