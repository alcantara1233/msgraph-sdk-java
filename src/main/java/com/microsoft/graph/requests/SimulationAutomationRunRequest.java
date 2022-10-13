// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.SimulationAutomationRun;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Simulation Automation Run Request.
 */
public class SimulationAutomationRunRequest extends BaseRequest<SimulationAutomationRun> {
	
    /**
     * The request for the SimulationAutomationRun
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SimulationAutomationRunRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SimulationAutomationRun.class);
    }

    /**
     * Gets the SimulationAutomationRun from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SimulationAutomationRun> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the SimulationAutomationRun from the service
     *
     * @return the SimulationAutomationRun from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SimulationAutomationRun get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SimulationAutomationRun> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public SimulationAutomationRun delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this SimulationAutomationRun with a source
     *
     * @param sourceSimulationAutomationRun the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SimulationAutomationRun> patchAsync(@Nonnull final SimulationAutomationRun sourceSimulationAutomationRun) {
        return sendAsync(HttpMethod.PATCH, sourceSimulationAutomationRun);
    }

    /**
     * Patches this SimulationAutomationRun with a source
     *
     * @param sourceSimulationAutomationRun the source object with updates
     * @return the updated SimulationAutomationRun
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SimulationAutomationRun patch(@Nonnull final SimulationAutomationRun sourceSimulationAutomationRun) throws ClientException {
        return send(HttpMethod.PATCH, sourceSimulationAutomationRun);
    }

    /**
     * Creates a SimulationAutomationRun with a new object
     *
     * @param newSimulationAutomationRun the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SimulationAutomationRun> postAsync(@Nonnull final SimulationAutomationRun newSimulationAutomationRun) {
        return sendAsync(HttpMethod.POST, newSimulationAutomationRun);
    }

    /**
     * Creates a SimulationAutomationRun with a new object
     *
     * @param newSimulationAutomationRun the new object to create
     * @return the created SimulationAutomationRun
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SimulationAutomationRun post(@Nonnull final SimulationAutomationRun newSimulationAutomationRun) throws ClientException {
        return send(HttpMethod.POST, newSimulationAutomationRun);
    }

    /**
     * Creates a SimulationAutomationRun with a new object
     *
     * @param newSimulationAutomationRun the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SimulationAutomationRun> putAsync(@Nonnull final SimulationAutomationRun newSimulationAutomationRun) {
        return sendAsync(HttpMethod.PUT, newSimulationAutomationRun);
    }

    /**
     * Creates a SimulationAutomationRun with a new object
     *
     * @param newSimulationAutomationRun the object to create/update
     * @return the created SimulationAutomationRun
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SimulationAutomationRun put(@Nonnull final SimulationAutomationRun newSimulationAutomationRun) throws ClientException {
        return send(HttpMethod.PUT, newSimulationAutomationRun);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public SimulationAutomationRunRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public SimulationAutomationRunRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

