// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.VirtualEventRegistration;
import com.microsoft.graph.requests.VirtualEventRegistrationCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.VirtualEventRegistrationCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Virtual Event Registration Collection Page.
 */
public class VirtualEventRegistrationCollectionPage extends BaseCollectionPage<VirtualEventRegistration, VirtualEventRegistrationCollectionRequestBuilder> {

    /**
     * A collection page for VirtualEventRegistration
     *
     * @param response the serialized VirtualEventRegistrationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public VirtualEventRegistrationCollectionPage(@Nonnull final VirtualEventRegistrationCollectionResponse response, @Nonnull final VirtualEventRegistrationCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for VirtualEventRegistration
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public VirtualEventRegistrationCollectionPage(@Nonnull final java.util.List<VirtualEventRegistration> pageContents, @Nullable final VirtualEventRegistrationCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
