// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EducationClass;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.DeltaCollectionPage;
import com.microsoft.graph.requests.EducationClassDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.EducationClassDeltaCollectionPage;
import com.microsoft.graph.requests.EducationClassDeltaCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Class Delta Collection Page.
 */
public class EducationClassDeltaCollectionPage extends DeltaCollectionPage<EducationClass, EducationClassDeltaCollectionRequestBuilder> {

    /**
     * A collection page for EducationClass.
     *
     * @param response The serialized EducationClassDeltaCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public EducationClassDeltaCollectionPage(@Nonnull final EducationClassDeltaCollectionResponse response, @Nonnull final EducationClassDeltaCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for EducationClassDelta
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public EducationClassDeltaCollectionPage(@Nonnull final java.util.List<EducationClass> pageContents, @Nullable final EducationClassDeltaCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}