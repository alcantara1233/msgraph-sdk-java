// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.TokenIssuancePolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Token Issuance Policy Collection With References Request Builder.
 */
public class TokenIssuancePolicyCollectionWithReferencesRequestBuilder extends BaseCollectionWithReferencesRequestBuilder<TokenIssuancePolicy, TokenIssuancePolicyWithReferenceRequest, TokenIssuancePolicyReferenceRequestBuilder, TokenIssuancePolicyWithReferenceRequestBuilder, TokenIssuancePolicyCollectionResponse, TokenIssuancePolicyCollectionWithReferencesPage, TokenIssuancePolicyCollectionWithReferencesRequest, TokenIssuancePolicyCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of ServicePrincipal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TokenIssuancePolicyCollectionWithReferencesRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TokenIssuancePolicyReferenceRequestBuilder.class, TokenIssuancePolicyCollectionResponse.class, TokenIssuancePolicyCollectionWithReferencesPage.class, TokenIssuancePolicyCollectionWithReferencesRequest.class);
    }
}
