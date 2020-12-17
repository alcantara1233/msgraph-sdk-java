// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.generated.ExchangeIdFormat;
import com.microsoft.graph.models.extensions.ConvertIdResult;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.UserTranslateExchangeIdsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserTranslateExchangeIdsCollectionRequest;
import com.microsoft.graph.requests.extensions.UserTranslateExchangeIdsCollectionResponse;
import com.microsoft.graph.models.extensions.UserTranslateExchangeIdsParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseActionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Translate Exchange Ids Collection Request Builder.
 */
public class UserTranslateExchangeIdsCollectionRequestBuilder extends BaseActionCollectionRequestBuilder<ConvertIdResult, UserTranslateExchangeIdsCollectionRequestBuilder, UserTranslateExchangeIdsCollectionResponse, UserTranslateExchangeIdsCollectionPage, UserTranslateExchangeIdsCollectionRequest> {

    private UserTranslateExchangeIdsParameterSet body;
    /**
     * The request builder for this collection of User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public UserTranslateExchangeIdsCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final UserTranslateExchangeIdsParameterSet parameters) {
        super(requestUrl, client, requestOptions, UserTranslateExchangeIdsCollectionRequestBuilder.class, UserTranslateExchangeIdsCollectionRequest.class);
        this.body = parameters;
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the UserTranslateExchangeIdsCollectionRequest instance
     */
    @Override
    @Nonnull
    public UserTranslateExchangeIdsCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final UserTranslateExchangeIdsCollectionRequest request = super.buildRequest(requestOptions);
            request.body = this.body;
            return request;
    }
}
