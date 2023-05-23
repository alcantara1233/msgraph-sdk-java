// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Synchronization;
import com.microsoft.graph.models.SynchronizationSecretKeyStringValuePair;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Request.
 */
public class SynchronizationRequest extends BaseRequest<Synchronization> {
	
    /**
     * The request for the Synchronization
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SynchronizationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Synchronization.class);
    }

    /**
     * Gets the Synchronization from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Synchronization> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Synchronization from the service
     *
     * @return the Synchronization from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Synchronization get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Synchronization> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Synchronization delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Synchronization with a source
     *
     * @param sourceSynchronization the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Synchronization> patchAsync(@Nonnull final Synchronization sourceSynchronization) {
        return sendAsync(HttpMethod.PATCH, sourceSynchronization);
    }

    /**
     * Patches this Synchronization with a source
     *
     * @param sourceSynchronization the source object with updates
     * @return the updated Synchronization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Synchronization patch(@Nonnull final Synchronization sourceSynchronization) throws ClientException {
        return send(HttpMethod.PATCH, sourceSynchronization);
    }

    /**
     * Creates a Synchronization with a new object
     *
     * @param newSynchronization the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Synchronization> postAsync(@Nonnull final Synchronization newSynchronization) {
        return sendAsync(HttpMethod.POST, newSynchronization);
    }

    /**
     * Creates a Synchronization with a new object
     *
     * @param newSynchronization the new object to create
     * @return the created Synchronization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Synchronization post(@Nonnull final Synchronization newSynchronization) throws ClientException {
        return send(HttpMethod.POST, newSynchronization);
    }

    /**
     * Creates a Synchronization with a new object
     *
     * @param newSynchronization the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Synchronization> putAsync(@Nonnull final Synchronization newSynchronization) {
        return sendAsync(HttpMethod.PUT, newSynchronization);
    }

    /**
     * Creates a Synchronization with a new object
     *
     * @param newSynchronization the object to create/update
     * @return the created Synchronization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Synchronization put(@Nonnull final Synchronization newSynchronization) throws ClientException {
        return send(HttpMethod.PUT, newSynchronization);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public SynchronizationRequest select(@Nonnull final String value) {
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
     public SynchronizationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

