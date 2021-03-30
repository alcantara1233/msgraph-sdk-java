// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UnifiedRoleAssignment;
import com.microsoft.graph.requests.AppScopeRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.UnifiedRoleDefinitionWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Assignment Request.
 */
public class UnifiedRoleAssignmentRequest extends BaseRequest<UnifiedRoleAssignment> {
	
    /**
     * The request for the UnifiedRoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleAssignmentRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleAssignment.class);
    }

    /**
     * Gets the UnifiedRoleAssignment from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleAssignment> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the UnifiedRoleAssignment from the service
     *
     * @return the UnifiedRoleAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleAssignment> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public UnifiedRoleAssignment delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this UnifiedRoleAssignment with a source
     *
     * @param sourceUnifiedRoleAssignment the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleAssignment> patchAsync(@Nonnull final UnifiedRoleAssignment sourceUnifiedRoleAssignment) {
        return sendAsync(HttpMethod.PATCH, sourceUnifiedRoleAssignment);
    }

    /**
     * Patches this UnifiedRoleAssignment with a source
     *
     * @param sourceUnifiedRoleAssignment the source object with updates
     * @return the updated UnifiedRoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleAssignment patch(@Nonnull final UnifiedRoleAssignment sourceUnifiedRoleAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceUnifiedRoleAssignment);
    }

    /**
     * Creates a UnifiedRoleAssignment with a new object
     *
     * @param newUnifiedRoleAssignment the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleAssignment> postAsync(@Nonnull final UnifiedRoleAssignment newUnifiedRoleAssignment) {
        return sendAsync(HttpMethod.POST, newUnifiedRoleAssignment);
    }

    /**
     * Creates a UnifiedRoleAssignment with a new object
     *
     * @param newUnifiedRoleAssignment the new object to create
     * @return the created UnifiedRoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleAssignment post(@Nonnull final UnifiedRoleAssignment newUnifiedRoleAssignment) throws ClientException {
        return send(HttpMethod.POST, newUnifiedRoleAssignment);
    }

    /**
     * Creates a UnifiedRoleAssignment with a new object
     *
     * @param newUnifiedRoleAssignment the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleAssignment> putAsync(@Nonnull final UnifiedRoleAssignment newUnifiedRoleAssignment) {
        return sendAsync(HttpMethod.PUT, newUnifiedRoleAssignment);
    }

    /**
     * Creates a UnifiedRoleAssignment with a new object
     *
     * @param newUnifiedRoleAssignment the object to create/update
     * @return the created UnifiedRoleAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleAssignment put(@Nonnull final UnifiedRoleAssignment newUnifiedRoleAssignment) throws ClientException {
        return send(HttpMethod.PUT, newUnifiedRoleAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public UnifiedRoleAssignmentRequest select(@Nonnull final String value) {
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
     public UnifiedRoleAssignmentRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

