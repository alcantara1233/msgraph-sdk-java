// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;
import com.microsoft.graph.security.models.EdiscoverySearch;
import com.microsoft.graph.security.requests.EdiscoverySearchCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.security.requests.EdiscoverySearchCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Search Collection Page.
 */
public class EdiscoverySearchCollectionPage extends BaseCollectionPage<EdiscoverySearch, EdiscoverySearchCollectionRequestBuilder> {

    /**
     * A collection page for EdiscoverySearch
     *
     * @param response the serialized EdiscoverySearchCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public EdiscoverySearchCollectionPage(@Nonnull final EdiscoverySearchCollectionResponse response, @Nonnull final EdiscoverySearchCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for EdiscoverySearch
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public EdiscoverySearchCollectionPage(@Nonnull final java.util.List<EdiscoverySearch> pageContents, @Nullable final EdiscoverySearchCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}