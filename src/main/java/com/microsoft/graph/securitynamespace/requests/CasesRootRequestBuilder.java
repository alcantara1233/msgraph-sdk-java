// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.CasesRoot;
import com.microsoft.graph.security.requests.EdiscoveryCaseCollectionRequestBuilder;
import com.microsoft.graph.security.requests.EdiscoveryCaseRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cases Root Request Builder.
 */
public class CasesRootRequestBuilder extends BaseRequestBuilder<CasesRoot> {

    /**
     * The request builder for the CasesRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CasesRootRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the CasesRootRequest instance
     */
    @Nonnull
    public CasesRootRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the CasesRootRequest instance
     */
    @Nonnull
    public CasesRootRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.security.requests.CasesRootRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the EdiscoveryCase collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public EdiscoveryCaseCollectionRequestBuilder ediscoveryCases() {
        return new EdiscoveryCaseCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("ediscoveryCases"), getClient(), null);
    }

    /**
     * Gets a request builder for the EdiscoveryCase item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public EdiscoveryCaseRequestBuilder ediscoveryCases(@Nonnull final String id) {
        return new EdiscoveryCaseRequestBuilder(getRequestUrlWithAdditionalSegment("ediscoveryCases") + "/" + id, getClient(), null);
    }
}