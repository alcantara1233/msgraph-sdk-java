// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.ReportRootGetSkypeForBusinessActivityUserDetailRequest;
import com.microsoft.graph.models.ReportRoot;

import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.models.ReportRootGetSkypeForBusinessActivityUserDetailParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Skype For Business Activity User Detail Request Builder.
 */
public class ReportRootGetSkypeForBusinessActivityUserDetailRequestBuilder extends BaseFunctionRequestBuilder<java.io.InputStream> {

    /**
     * The request builder for this ReportRootGetSkypeForBusinessActivityUserDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetSkypeForBusinessActivityUserDetailRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this ReportRootGetSkypeForBusinessActivityUserDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ReportRootGetSkypeForBusinessActivityUserDetailRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ReportRootGetSkypeForBusinessActivityUserDetailParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }

    /**
     * Creates the ReportRootGetSkypeForBusinessActivityUserDetailRequest
     *
     * @param requestOptions the options for the request
     * @return the ReportRootGetSkypeForBusinessActivityUserDetailRequest instance
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessActivityUserDetailRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ReportRootGetSkypeForBusinessActivityUserDetailRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ReportRootGetSkypeForBusinessActivityUserDetailRequest instance
     */
    @Nonnull
    public ReportRootGetSkypeForBusinessActivityUserDetailRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ReportRootGetSkypeForBusinessActivityUserDetailRequest request = new ReportRootGetSkypeForBusinessActivityUserDetailRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
        }
        return request;
    }
}
