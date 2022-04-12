// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.UnifiedRoleEligibilityScheduleRequest;
import com.microsoft.graph.requests.UnifiedRoleEligibilityScheduleRequestCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.UnifiedRoleEligibilityScheduleRequestCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Eligibility Schedule Request Collection Page.
 */
public class UnifiedRoleEligibilityScheduleRequestCollectionPage extends BaseCollectionPage<UnifiedRoleEligibilityScheduleRequest, UnifiedRoleEligibilityScheduleRequestCollectionRequestBuilder> {

    /**
     * A collection page for UnifiedRoleEligibilityScheduleRequest
     *
     * @param response the serialized UnifiedRoleEligibilityScheduleRequestCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UnifiedRoleEligibilityScheduleRequestCollectionPage(@Nonnull final UnifiedRoleEligibilityScheduleRequestCollectionResponse response, @Nonnull final UnifiedRoleEligibilityScheduleRequestCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for UnifiedRoleEligibilityScheduleRequest
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public UnifiedRoleEligibilityScheduleRequestCollectionPage(@Nonnull final java.util.List<UnifiedRoleEligibilityScheduleRequest> pageContents, @Nullable final UnifiedRoleEligibilityScheduleRequestCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
