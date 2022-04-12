// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.RbacApplication;
import com.microsoft.graph.models.UnifiedRoleAssignmentScheduleInstance;
import com.microsoft.graph.models.RoleAssignmentScheduleInstanceFilterByCurrentUserOptions;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.UnifiedRoleAssignmentScheduleInstanceCollectionRequestBuilder;
import com.microsoft.graph.requests.UnifiedRoleAssignmentScheduleInstanceRequestBuilder;
import com.microsoft.graph.requests.UnifiedRoleAssignmentScheduleInstanceCollectionRequest;
import com.microsoft.graph.requests.UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Assignment Schedule Instance Collection Request Builder.
 */
public class UnifiedRoleAssignmentScheduleInstanceCollectionRequestBuilder extends BaseCollectionRequestBuilder<UnifiedRoleAssignmentScheduleInstance, UnifiedRoleAssignmentScheduleInstanceRequestBuilder, UnifiedRoleAssignmentScheduleInstanceCollectionResponse, UnifiedRoleAssignmentScheduleInstanceCollectionPage, UnifiedRoleAssignmentScheduleInstanceCollectionRequest> {

    /**
     * The request builder for this collection of RbacApplication
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleAssignmentScheduleInstanceCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleAssignmentScheduleInstanceRequestBuilder.class, UnifiedRoleAssignmentScheduleInstanceCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionRequestBuilder filterByCurrentUser(@Nonnull final UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserParameterSet parameters) {
        return new UnifiedRoleAssignmentScheduleInstanceFilterByCurrentUserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.filterByCurrentUser"), getClient(), null, parameters);
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
