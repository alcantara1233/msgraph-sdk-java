// Template Source: BaseMethodCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Presence;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.CloudCommunicationsGetPresencesByUserIdCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CloudCommunicationsGetPresencesByUserIdCollectionResponse;
import com.microsoft.graph.models.extensions.Presence;
import com.microsoft.graph.models.extensions.CloudCommunicationsGetPresencesByUserIdBody;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseActionCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud Communications Get Presences By User Id Collection Request.
 */
public class CloudCommunicationsGetPresencesByUserIdCollectionRequest extends BaseActionCollectionRequest<Presence, CloudCommunicationsGetPresencesByUserIdCollectionResponse, CloudCommunicationsGetPresencesByUserIdCollectionPage> {


    /** The body for the method */
    protected CloudCommunicationsGetPresencesByUserIdBody body;


    /**
     * The request for this CloudCommunicationsGetPresencesByUserId
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters the parameters for the service method
     */
    public CloudCommunicationsGetPresencesByUserIdCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final CloudCommunicationsGetPresencesByUserIdBody parameters) {
        super(requestUrl, client, requestOptions, CloudCommunicationsGetPresencesByUserIdCollectionResponse.class, CloudCommunicationsGetPresencesByUserIdCollectionPage.class, CloudCommunicationsGetPresencesByUserIdCollectionRequestBuilder.class);
        body = parameters;
    }


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public CloudCommunicationsGetPresencesByUserIdCollectionRequest select(@Nonnull final String value) {
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
    public CloudCommunicationsGetPresencesByUserIdCollectionRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public CloudCommunicationsGetPresencesByUserIdCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public CloudCommunicationsGetPresencesByUserIdCollectionRequest count() {
        addCountOption(true);
        return this;
    }
    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public CloudCommunicationsGetPresencesByUserIdCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public CloudCommunicationsGetPresencesByUserIdCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public CloudCommunicationsGetPresencesByUserIdCollectionRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public CloudCommunicationsGetPresencesByUserIdCollectionRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

}
