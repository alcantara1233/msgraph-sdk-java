// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MailFolder;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.models.extensions.Recipient;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.MessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageRequestBuilder;
import com.microsoft.graph.requests.extensions.MessageCollectionRequest;
import com.microsoft.graph.requests.extensions.MessageDeltaCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.extensions.MessageForwardParameterSet;
import com.microsoft.graph.models.extensions.MessageCopyParameterSet;
import com.microsoft.graph.models.extensions.MessageMoveParameterSet;
import com.microsoft.graph.models.extensions.MessageCreateForwardParameterSet;
import com.microsoft.graph.models.extensions.MessageCreateReplyParameterSet;
import com.microsoft.graph.models.extensions.MessageCreateReplyAllParameterSet;
import com.microsoft.graph.models.extensions.MessageReplyParameterSet;
import com.microsoft.graph.models.extensions.MessageReplyAllParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Message Collection Request Builder.
 */
public class MessageCollectionRequestBuilder extends BaseCollectionRequestBuilder<Message, MessageRequestBuilder, MessageCollectionResponse, MessageCollectionPage, MessageCollectionRequest> {

    /**
     * The request builder for this collection of MailFolder
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MessageCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MessageRequestBuilder.class, MessageCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public MessageDeltaCollectionRequestBuilder delta() {
        return new MessageDeltaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.delta"), getClient(), null);
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
