// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AccessReviewInstance;
import com.microsoft.graph.models.AccessReviewInstanceFilterByCurrentUserOptions;
import com.microsoft.graph.requests.AccessReviewReviewerCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessReviewReviewerRequestBuilder;
import com.microsoft.graph.requests.AccessReviewInstanceDecisionItemCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessReviewInstanceDecisionItemRequestBuilder;
import com.microsoft.graph.requests.AccessReviewStageCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessReviewStageRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Instance Request.
 */
public class AccessReviewInstanceRequest extends BaseRequest<AccessReviewInstance> {
	
    /**
     * The request for the AccessReviewInstance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessReviewInstanceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessReviewInstance.class);
    }

    /**
     * Gets the AccessReviewInstance from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessReviewInstance> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AccessReviewInstance from the service
     *
     * @return the AccessReviewInstance from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessReviewInstance get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessReviewInstance> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AccessReviewInstance delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AccessReviewInstance with a source
     *
     * @param sourceAccessReviewInstance the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessReviewInstance> patchAsync(@Nonnull final AccessReviewInstance sourceAccessReviewInstance) {
        return sendAsync(HttpMethod.PATCH, sourceAccessReviewInstance);
    }

    /**
     * Patches this AccessReviewInstance with a source
     *
     * @param sourceAccessReviewInstance the source object with updates
     * @return the updated AccessReviewInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessReviewInstance patch(@Nonnull final AccessReviewInstance sourceAccessReviewInstance) throws ClientException {
        return send(HttpMethod.PATCH, sourceAccessReviewInstance);
    }

    /**
     * Creates a AccessReviewInstance with a new object
     *
     * @param newAccessReviewInstance the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessReviewInstance> postAsync(@Nonnull final AccessReviewInstance newAccessReviewInstance) {
        return sendAsync(HttpMethod.POST, newAccessReviewInstance);
    }

    /**
     * Creates a AccessReviewInstance with a new object
     *
     * @param newAccessReviewInstance the new object to create
     * @return the created AccessReviewInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessReviewInstance post(@Nonnull final AccessReviewInstance newAccessReviewInstance) throws ClientException {
        return send(HttpMethod.POST, newAccessReviewInstance);
    }

    /**
     * Creates a AccessReviewInstance with a new object
     *
     * @param newAccessReviewInstance the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessReviewInstance> putAsync(@Nonnull final AccessReviewInstance newAccessReviewInstance) {
        return sendAsync(HttpMethod.PUT, newAccessReviewInstance);
    }

    /**
     * Creates a AccessReviewInstance with a new object
     *
     * @param newAccessReviewInstance the object to create/update
     * @return the created AccessReviewInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessReviewInstance put(@Nonnull final AccessReviewInstance newAccessReviewInstance) throws ClientException {
        return send(HttpMethod.PUT, newAccessReviewInstance);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AccessReviewInstanceRequest select(@Nonnull final String value) {
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
     public AccessReviewInstanceRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

