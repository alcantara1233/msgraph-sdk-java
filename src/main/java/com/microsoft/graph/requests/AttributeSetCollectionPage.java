// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.AttributeSet;
import com.microsoft.graph.requests.AttributeSetCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.AttributeSetCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Attribute Set Collection Page.
 */
public class AttributeSetCollectionPage extends BaseCollectionPage<AttributeSet, AttributeSetCollectionRequestBuilder> {

    /**
     * A collection page for AttributeSet
     *
     * @param response the serialized AttributeSetCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AttributeSetCollectionPage(@Nonnull final AttributeSetCollectionResponse response, @Nonnull final AttributeSetCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for AttributeSet
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AttributeSetCollectionPage(@Nonnull final java.util.List<AttributeSet> pageContents, @Nullable final AttributeSetCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
