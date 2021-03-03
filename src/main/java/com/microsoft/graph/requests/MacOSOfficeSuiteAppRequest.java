// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.MacOSOfficeSuiteApp;
import com.microsoft.graph.models.MobileAppAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSOffice Suite App Request.
 */
public class MacOSOfficeSuiteAppRequest extends BaseRequest<MacOSOfficeSuiteApp> {
	
    /**
     * The request for the MacOSOfficeSuiteApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSOfficeSuiteAppRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MacOSOfficeSuiteApp.class);
    }

    /**
     * Gets the MacOSOfficeSuiteApp from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MacOSOfficeSuiteApp> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the MacOSOfficeSuiteApp from the service
     *
     * @return the MacOSOfficeSuiteApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSOfficeSuiteApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MacOSOfficeSuiteApp> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public MacOSOfficeSuiteApp delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this MacOSOfficeSuiteApp with a source
     *
     * @param sourceMacOSOfficeSuiteApp the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MacOSOfficeSuiteApp> patchAsync(@Nonnull final MacOSOfficeSuiteApp sourceMacOSOfficeSuiteApp) {
        return sendAsync(HttpMethod.PATCH, sourceMacOSOfficeSuiteApp);
    }

    /**
     * Patches this MacOSOfficeSuiteApp with a source
     *
     * @param sourceMacOSOfficeSuiteApp the source object with updates
     * @return the updated MacOSOfficeSuiteApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSOfficeSuiteApp patch(@Nonnull final MacOSOfficeSuiteApp sourceMacOSOfficeSuiteApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceMacOSOfficeSuiteApp);
    }

    /**
     * Creates a MacOSOfficeSuiteApp with a new object
     *
     * @param newMacOSOfficeSuiteApp the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MacOSOfficeSuiteApp> postAsync(@Nonnull final MacOSOfficeSuiteApp newMacOSOfficeSuiteApp) {
        return sendAsync(HttpMethod.POST, newMacOSOfficeSuiteApp);
    }

    /**
     * Creates a MacOSOfficeSuiteApp with a new object
     *
     * @param newMacOSOfficeSuiteApp the new object to create
     * @return the created MacOSOfficeSuiteApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSOfficeSuiteApp post(@Nonnull final MacOSOfficeSuiteApp newMacOSOfficeSuiteApp) throws ClientException {
        return send(HttpMethod.POST, newMacOSOfficeSuiteApp);
    }

    /**
     * Creates a MacOSOfficeSuiteApp with a new object
     *
     * @param newMacOSOfficeSuiteApp the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<MacOSOfficeSuiteApp> putAsync(@Nonnull final MacOSOfficeSuiteApp newMacOSOfficeSuiteApp) {
        return sendAsync(HttpMethod.PUT, newMacOSOfficeSuiteApp);
    }

    /**
     * Creates a MacOSOfficeSuiteApp with a new object
     *
     * @param newMacOSOfficeSuiteApp the object to create/update
     * @return the created MacOSOfficeSuiteApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSOfficeSuiteApp put(@Nonnull final MacOSOfficeSuiteApp newMacOSOfficeSuiteApp) throws ClientException {
        return send(HttpMethod.PUT, newMacOSOfficeSuiteApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public MacOSOfficeSuiteAppRequest select(@Nonnull final String value) {
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
     public MacOSOfficeSuiteAppRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

