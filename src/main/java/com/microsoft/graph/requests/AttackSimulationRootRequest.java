// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AttackSimulationRoot;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Attack Simulation Root Request.
 */
public class AttackSimulationRootRequest extends BaseRequest<AttackSimulationRoot> {
	
    /**
     * The request for the AttackSimulationRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AttackSimulationRootRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AttackSimulationRoot.class);
    }

    /**
     * Gets the AttackSimulationRoot from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AttackSimulationRoot> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AttackSimulationRoot from the service
     *
     * @return the AttackSimulationRoot from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AttackSimulationRoot get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AttackSimulationRoot> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AttackSimulationRoot delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AttackSimulationRoot with a source
     *
     * @param sourceAttackSimulationRoot the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AttackSimulationRoot> patchAsync(@Nonnull final AttackSimulationRoot sourceAttackSimulationRoot) {
        return sendAsync(HttpMethod.PATCH, sourceAttackSimulationRoot);
    }

    /**
     * Patches this AttackSimulationRoot with a source
     *
     * @param sourceAttackSimulationRoot the source object with updates
     * @return the updated AttackSimulationRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AttackSimulationRoot patch(@Nonnull final AttackSimulationRoot sourceAttackSimulationRoot) throws ClientException {
        return send(HttpMethod.PATCH, sourceAttackSimulationRoot);
    }

    /**
     * Creates a AttackSimulationRoot with a new object
     *
     * @param newAttackSimulationRoot the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AttackSimulationRoot> postAsync(@Nonnull final AttackSimulationRoot newAttackSimulationRoot) {
        return sendAsync(HttpMethod.POST, newAttackSimulationRoot);
    }

    /**
     * Creates a AttackSimulationRoot with a new object
     *
     * @param newAttackSimulationRoot the new object to create
     * @return the created AttackSimulationRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AttackSimulationRoot post(@Nonnull final AttackSimulationRoot newAttackSimulationRoot) throws ClientException {
        return send(HttpMethod.POST, newAttackSimulationRoot);
    }

    /**
     * Creates a AttackSimulationRoot with a new object
     *
     * @param newAttackSimulationRoot the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AttackSimulationRoot> putAsync(@Nonnull final AttackSimulationRoot newAttackSimulationRoot) {
        return sendAsync(HttpMethod.PUT, newAttackSimulationRoot);
    }

    /**
     * Creates a AttackSimulationRoot with a new object
     *
     * @param newAttackSimulationRoot the object to create/update
     * @return the created AttackSimulationRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AttackSimulationRoot put(@Nonnull final AttackSimulationRoot newAttackSimulationRoot) throws ClientException {
        return send(HttpMethod.PUT, newAttackSimulationRoot);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AttackSimulationRootRequest select(@Nonnull final String value) {
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
     public AttackSimulationRootRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

