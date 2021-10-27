// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AuthoredNote;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authored Note Request.
 */
public class AuthoredNoteRequest extends BaseRequest<AuthoredNote> {
	
    /**
     * The request for the AuthoredNote
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuthoredNoteRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AuthoredNote.class);
    }

    /**
     * Gets the AuthoredNote from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuthoredNote> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AuthoredNote from the service
     *
     * @return the AuthoredNote from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AuthoredNote get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuthoredNote> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AuthoredNote delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AuthoredNote with a source
     *
     * @param sourceAuthoredNote the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuthoredNote> patchAsync(@Nonnull final AuthoredNote sourceAuthoredNote) {
        return sendAsync(HttpMethod.PATCH, sourceAuthoredNote);
    }

    /**
     * Patches this AuthoredNote with a source
     *
     * @param sourceAuthoredNote the source object with updates
     * @return the updated AuthoredNote
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AuthoredNote patch(@Nonnull final AuthoredNote sourceAuthoredNote) throws ClientException {
        return send(HttpMethod.PATCH, sourceAuthoredNote);
    }

    /**
     * Creates a AuthoredNote with a new object
     *
     * @param newAuthoredNote the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuthoredNote> postAsync(@Nonnull final AuthoredNote newAuthoredNote) {
        return sendAsync(HttpMethod.POST, newAuthoredNote);
    }

    /**
     * Creates a AuthoredNote with a new object
     *
     * @param newAuthoredNote the new object to create
     * @return the created AuthoredNote
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AuthoredNote post(@Nonnull final AuthoredNote newAuthoredNote) throws ClientException {
        return send(HttpMethod.POST, newAuthoredNote);
    }

    /**
     * Creates a AuthoredNote with a new object
     *
     * @param newAuthoredNote the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AuthoredNote> putAsync(@Nonnull final AuthoredNote newAuthoredNote) {
        return sendAsync(HttpMethod.PUT, newAuthoredNote);
    }

    /**
     * Creates a AuthoredNote with a new object
     *
     * @param newAuthoredNote the object to create/update
     * @return the created AuthoredNote
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AuthoredNote put(@Nonnull final AuthoredNote newAuthoredNote) throws ClientException {
        return send(HttpMethod.PUT, newAuthoredNote);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AuthoredNoteRequest select(@Nonnull final String value) {
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
     public AuthoredNoteRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
