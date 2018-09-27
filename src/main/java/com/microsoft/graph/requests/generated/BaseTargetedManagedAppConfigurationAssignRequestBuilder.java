// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppConfigurationAssignRequest;
import com.microsoft.graph.requests.extensions.TargetedManagedAppConfigurationAssignRequest;
import com.microsoft.graph.models.extensions.TargetedManagedAppPolicyAssignment;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Targeted Managed App Configuration Assign Request Builder.
 */
public class BaseTargetedManagedAppConfigurationAssignRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this TargetedManagedAppConfigurationAssign
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param assignments the assignments
     */
    public BaseTargetedManagedAppConfigurationAssignRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final java.util.List<TargetedManagedAppPolicyAssignment> assignments) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("assignments", assignments);
    }

    /**
     * Creates the ITargetedManagedAppConfigurationAssignRequest
     *
     * @return the ITargetedManagedAppConfigurationAssignRequest instance
     */
    public ITargetedManagedAppConfigurationAssignRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the ITargetedManagedAppConfigurationAssignRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ITargetedManagedAppConfigurationAssignRequest instance
     */
    public ITargetedManagedAppConfigurationAssignRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        TargetedManagedAppConfigurationAssignRequest request = new TargetedManagedAppConfigurationAssignRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("assignments")) {
            request.body.assignments = getParameter("assignments");
        }

        return request;
    }
}