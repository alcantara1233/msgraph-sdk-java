// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AttackSimulationRoot;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Attack Simulation Root Request Builder.
 */
public class AttackSimulationRootRequestBuilder extends BaseRequestBuilder<AttackSimulationRoot> {

    /**
     * The request builder for the AttackSimulationRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AttackSimulationRootRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the AttackSimulationRootRequest instance
     */
    @Nonnull
    public AttackSimulationRootRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the AttackSimulationRootRequest instance
     */
    @Nonnull
    public AttackSimulationRootRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.AttackSimulationRootRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the SimulationAutomation collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.SimulationAutomationCollectionRequestBuilder simulationAutomations() {
        return new com.microsoft.graph.requests.SimulationAutomationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("simulationAutomations"), getClient(), null);
    }

    /**
     * Gets a request builder for the SimulationAutomation item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.SimulationAutomationRequestBuilder simulationAutomations(@Nonnull final String id) {
        return new com.microsoft.graph.requests.SimulationAutomationRequestBuilder(getRequestUrlWithAdditionalSegment("simulationAutomations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Simulation collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.SimulationCollectionRequestBuilder simulations() {
        return new com.microsoft.graph.requests.SimulationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("simulations"), getClient(), null);
    }

    /**
     * Gets a request builder for the Simulation item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.SimulationRequestBuilder simulations(@Nonnull final String id) {
        return new com.microsoft.graph.requests.SimulationRequestBuilder(getRequestUrlWithAdditionalSegment("simulations") + "/" + id, getClient(), null);
    }
}
