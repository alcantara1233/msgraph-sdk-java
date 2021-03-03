// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AndroidWorkProfileCompliancePolicy;
import com.microsoft.graph.models.DeviceCompliancePolicyAssignment;
import com.microsoft.graph.models.DeviceComplianceScheduledActionForRule;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Work Profile Compliance Policy Request.
 */
public class AndroidWorkProfileCompliancePolicyRequest extends BaseRequest<AndroidWorkProfileCompliancePolicy> {
	
    /**
     * The request for the AndroidWorkProfileCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidWorkProfileCompliancePolicyRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidWorkProfileCompliancePolicy.class);
    }

    /**
     * Gets the AndroidWorkProfileCompliancePolicy from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileCompliancePolicy> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AndroidWorkProfileCompliancePolicy from the service
     *
     * @return the AndroidWorkProfileCompliancePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileCompliancePolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileCompliancePolicy> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AndroidWorkProfileCompliancePolicy delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AndroidWorkProfileCompliancePolicy with a source
     *
     * @param sourceAndroidWorkProfileCompliancePolicy the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileCompliancePolicy> patchAsync(@Nonnull final AndroidWorkProfileCompliancePolicy sourceAndroidWorkProfileCompliancePolicy) {
        return sendAsync(HttpMethod.PATCH, sourceAndroidWorkProfileCompliancePolicy);
    }

    /**
     * Patches this AndroidWorkProfileCompliancePolicy with a source
     *
     * @param sourceAndroidWorkProfileCompliancePolicy the source object with updates
     * @return the updated AndroidWorkProfileCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileCompliancePolicy patch(@Nonnull final AndroidWorkProfileCompliancePolicy sourceAndroidWorkProfileCompliancePolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidWorkProfileCompliancePolicy);
    }

    /**
     * Creates a AndroidWorkProfileCompliancePolicy with a new object
     *
     * @param newAndroidWorkProfileCompliancePolicy the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileCompliancePolicy> postAsync(@Nonnull final AndroidWorkProfileCompliancePolicy newAndroidWorkProfileCompliancePolicy) {
        return sendAsync(HttpMethod.POST, newAndroidWorkProfileCompliancePolicy);
    }

    /**
     * Creates a AndroidWorkProfileCompliancePolicy with a new object
     *
     * @param newAndroidWorkProfileCompliancePolicy the new object to create
     * @return the created AndroidWorkProfileCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileCompliancePolicy post(@Nonnull final AndroidWorkProfileCompliancePolicy newAndroidWorkProfileCompliancePolicy) throws ClientException {
        return send(HttpMethod.POST, newAndroidWorkProfileCompliancePolicy);
    }

    /**
     * Creates a AndroidWorkProfileCompliancePolicy with a new object
     *
     * @param newAndroidWorkProfileCompliancePolicy the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AndroidWorkProfileCompliancePolicy> putAsync(@Nonnull final AndroidWorkProfileCompliancePolicy newAndroidWorkProfileCompliancePolicy) {
        return sendAsync(HttpMethod.PUT, newAndroidWorkProfileCompliancePolicy);
    }

    /**
     * Creates a AndroidWorkProfileCompliancePolicy with a new object
     *
     * @param newAndroidWorkProfileCompliancePolicy the object to create/update
     * @return the created AndroidWorkProfileCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileCompliancePolicy put(@Nonnull final AndroidWorkProfileCompliancePolicy newAndroidWorkProfileCompliancePolicy) throws ClientException {
        return send(HttpMethod.PUT, newAndroidWorkProfileCompliancePolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidWorkProfileCompliancePolicyRequest select(@Nonnull final String value) {
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
     public AndroidWorkProfileCompliancePolicyRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

