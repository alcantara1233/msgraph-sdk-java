// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;
import com.microsoft.graph.security.requests.EdiscoveryCustodianApplyHoldRequest;
import com.microsoft.graph.security.models.EdiscoveryCustodian;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.security.models.EdiscoveryCustodianApplyHoldParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Custodian Apply Hold Request Builder.
 */
public class EdiscoveryCustodianApplyHoldRequestBuilder extends BaseActionRequestBuilder<EdiscoveryCustodian> {

    private EdiscoveryCustodianApplyHoldParameterSet body;
    /**
     * The request builder for this EdiscoveryCustodianApplyHold
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EdiscoveryCustodianApplyHoldRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this EdiscoveryCustodianApplyHold
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public EdiscoveryCustodianApplyHoldRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final EdiscoveryCustodianApplyHoldParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the EdiscoveryCustodianApplyHoldRequest
     *
     * @param requestOptions the options for the request
     * @return the EdiscoveryCustodianApplyHoldRequest instance
     */
    @Nonnull
    public EdiscoveryCustodianApplyHoldRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the EdiscoveryCustodianApplyHoldRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the EdiscoveryCustodianApplyHoldRequest instance
     */
    @Nonnull
    public EdiscoveryCustodianApplyHoldRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final EdiscoveryCustodianApplyHoldRequest request = new EdiscoveryCustodianApplyHoldRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
