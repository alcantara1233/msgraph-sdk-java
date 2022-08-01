// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;
import com.microsoft.graph.security.requests.EdiscoveryCustodianActivateRequest;
import com.microsoft.graph.security.models.EdiscoveryCustodian;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Custodian Activate Request Builder.
 */
public class EdiscoveryCustodianActivateRequestBuilder extends BaseActionRequestBuilder<EdiscoveryCustodian> {

    /**
     * The request builder for this EdiscoveryCustodianActivate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EdiscoveryCustodianActivateRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the EdiscoveryCustodianActivateRequest
     *
     * @param requestOptions the options for the request
     * @return the EdiscoveryCustodianActivateRequest instance
     */
    @Nonnull
    public EdiscoveryCustodianActivateRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the EdiscoveryCustodianActivateRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the EdiscoveryCustodianActivateRequest instance
     */
    @Nonnull
    public EdiscoveryCustodianActivateRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final EdiscoveryCustodianActivateRequest request = new EdiscoveryCustodianActivateRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}