// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.EdiscoveryCase;
import com.microsoft.graph.security.models.EdiscoveryNoncustodialDataSource;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.security.requests.EdiscoveryNoncustodialDataSourceCollectionRequestBuilder;
import com.microsoft.graph.security.requests.EdiscoveryNoncustodialDataSourceRequestBuilder;
import com.microsoft.graph.security.requests.EdiscoveryNoncustodialDataSourceCollectionRequest;
import com.microsoft.graph.security.requests.EdiscoveryNoncustodialDataSourceApplyHoldRequestBuilder;
import com.microsoft.graph.security.requests.EdiscoveryNoncustodialDataSourceRemoveHoldRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.security.models.EdiscoveryNoncustodialDataSourceApplyHoldParameterSet;
import com.microsoft.graph.security.models.EdiscoveryNoncustodialDataSourceRemoveHoldParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Noncustodial Data Source Collection Request Builder.
 */
public class EdiscoveryNoncustodialDataSourceCollectionRequestBuilder extends BaseCollectionRequestBuilder<EdiscoveryNoncustodialDataSource, EdiscoveryNoncustodialDataSourceRequestBuilder, EdiscoveryNoncustodialDataSourceCollectionResponse, EdiscoveryNoncustodialDataSourceCollectionPage, EdiscoveryNoncustodialDataSourceCollectionRequest> {

    /**
     * The request builder for this collection of EdiscoveryCase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EdiscoveryNoncustodialDataSourceCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EdiscoveryNoncustodialDataSourceRequestBuilder.class, EdiscoveryNoncustodialDataSourceCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public EdiscoveryNoncustodialDataSourceApplyHoldRequestBuilder applyHold(@Nonnull final EdiscoveryNoncustodialDataSourceApplyHoldParameterSet parameters) {
        return new EdiscoveryNoncustodialDataSourceApplyHoldRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.security.applyHold"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public EdiscoveryNoncustodialDataSourceRemoveHoldRequestBuilder removeHold(@Nonnull final EdiscoveryNoncustodialDataSourceRemoveHoldParameterSet parameters) {
        return new EdiscoveryNoncustodialDataSourceRemoveHoldRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.security.removeHold"), getClient(), null, parameters);
    }

    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}