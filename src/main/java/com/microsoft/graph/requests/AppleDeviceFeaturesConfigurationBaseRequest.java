// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AppleDeviceFeaturesConfigurationBase;
import com.microsoft.graph.models.DeviceConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Apple Device Features Configuration Base Request.
 */
public class AppleDeviceFeaturesConfigurationBaseRequest extends BaseRequest<AppleDeviceFeaturesConfigurationBase> {
	
    /**
     * The request for the AppleDeviceFeaturesConfigurationBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public AppleDeviceFeaturesConfigurationBaseRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends AppleDeviceFeaturesConfigurationBase> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the AppleDeviceFeaturesConfigurationBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AppleDeviceFeaturesConfigurationBaseRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AppleDeviceFeaturesConfigurationBase.class);
    }

    /**
     * Gets the AppleDeviceFeaturesConfigurationBase from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AppleDeviceFeaturesConfigurationBase> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AppleDeviceFeaturesConfigurationBase from the service
     *
     * @return the AppleDeviceFeaturesConfigurationBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AppleDeviceFeaturesConfigurationBase get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AppleDeviceFeaturesConfigurationBase> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AppleDeviceFeaturesConfigurationBase delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AppleDeviceFeaturesConfigurationBase with a source
     *
     * @param sourceAppleDeviceFeaturesConfigurationBase the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AppleDeviceFeaturesConfigurationBase> patchAsync(@Nonnull final AppleDeviceFeaturesConfigurationBase sourceAppleDeviceFeaturesConfigurationBase) {
        return sendAsync(HttpMethod.PATCH, sourceAppleDeviceFeaturesConfigurationBase);
    }

    /**
     * Patches this AppleDeviceFeaturesConfigurationBase with a source
     *
     * @param sourceAppleDeviceFeaturesConfigurationBase the source object with updates
     * @return the updated AppleDeviceFeaturesConfigurationBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AppleDeviceFeaturesConfigurationBase patch(@Nonnull final AppleDeviceFeaturesConfigurationBase sourceAppleDeviceFeaturesConfigurationBase) throws ClientException {
        return send(HttpMethod.PATCH, sourceAppleDeviceFeaturesConfigurationBase);
    }

    /**
     * Creates a AppleDeviceFeaturesConfigurationBase with a new object
     *
     * @param newAppleDeviceFeaturesConfigurationBase the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AppleDeviceFeaturesConfigurationBase> postAsync(@Nonnull final AppleDeviceFeaturesConfigurationBase newAppleDeviceFeaturesConfigurationBase) {
        return sendAsync(HttpMethod.POST, newAppleDeviceFeaturesConfigurationBase);
    }

    /**
     * Creates a AppleDeviceFeaturesConfigurationBase with a new object
     *
     * @param newAppleDeviceFeaturesConfigurationBase the new object to create
     * @return the created AppleDeviceFeaturesConfigurationBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AppleDeviceFeaturesConfigurationBase post(@Nonnull final AppleDeviceFeaturesConfigurationBase newAppleDeviceFeaturesConfigurationBase) throws ClientException {
        return send(HttpMethod.POST, newAppleDeviceFeaturesConfigurationBase);
    }

    /**
     * Creates a AppleDeviceFeaturesConfigurationBase with a new object
     *
     * @param newAppleDeviceFeaturesConfigurationBase the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AppleDeviceFeaturesConfigurationBase> putAsync(@Nonnull final AppleDeviceFeaturesConfigurationBase newAppleDeviceFeaturesConfigurationBase) {
        return sendAsync(HttpMethod.PUT, newAppleDeviceFeaturesConfigurationBase);
    }

    /**
     * Creates a AppleDeviceFeaturesConfigurationBase with a new object
     *
     * @param newAppleDeviceFeaturesConfigurationBase the object to create/update
     * @return the created AppleDeviceFeaturesConfigurationBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AppleDeviceFeaturesConfigurationBase put(@Nonnull final AppleDeviceFeaturesConfigurationBase newAppleDeviceFeaturesConfigurationBase) throws ClientException {
        return send(HttpMethod.PUT, newAppleDeviceFeaturesConfigurationBase);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AppleDeviceFeaturesConfigurationBaseRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public AppleDeviceFeaturesConfigurationBaseRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

