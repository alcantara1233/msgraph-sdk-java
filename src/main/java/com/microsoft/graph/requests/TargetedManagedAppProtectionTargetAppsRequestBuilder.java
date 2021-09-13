// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.TargetedManagedAppProtectionTargetAppsRequest;
import com.microsoft.graph.models.TargetedManagedAppProtection;
import com.microsoft.graph.models.ManagedMobileApp;
import com.microsoft.graph.models.TargetedManagedAppGroupType;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.TargetedManagedAppProtectionTargetAppsParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Targeted Managed App Protection Target Apps Request Builder.
 */
public class TargetedManagedAppProtectionTargetAppsRequestBuilder extends BaseActionRequestBuilder<TargetedManagedAppProtection> {

    /**
     * The request builder for this TargetedManagedAppProtectionTargetApps
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TargetedManagedAppProtectionTargetAppsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private TargetedManagedAppProtectionTargetAppsParameterSet body;
    /**
     * The request builder for this TargetedManagedAppProtectionTargetApps
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public TargetedManagedAppProtectionTargetAppsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final TargetedManagedAppProtectionTargetAppsParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the TargetedManagedAppProtectionTargetAppsRequest
     *
     * @param requestOptions the options for the request
     * @return the TargetedManagedAppProtectionTargetAppsRequest instance
     */
    @Nonnull
    public TargetedManagedAppProtectionTargetAppsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the TargetedManagedAppProtectionTargetAppsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the TargetedManagedAppProtectionTargetAppsRequest instance
     */
    @Nonnull
    public TargetedManagedAppProtectionTargetAppsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final TargetedManagedAppProtectionTargetAppsRequest request = new TargetedManagedAppProtectionTargetAppsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}