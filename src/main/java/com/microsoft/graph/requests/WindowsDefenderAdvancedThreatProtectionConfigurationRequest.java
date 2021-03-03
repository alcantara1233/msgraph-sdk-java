// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WindowsDefenderAdvancedThreatProtectionConfiguration;
import com.microsoft.graph.models.DeviceConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Defender Advanced Threat Protection Configuration Request.
 */
public class WindowsDefenderAdvancedThreatProtectionConfigurationRequest extends BaseRequest<WindowsDefenderAdvancedThreatProtectionConfiguration> {
	
    /**
     * The request for the WindowsDefenderAdvancedThreatProtectionConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsDefenderAdvancedThreatProtectionConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsDefenderAdvancedThreatProtectionConfiguration.class);
    }

    /**
     * Gets the WindowsDefenderAdvancedThreatProtectionConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsDefenderAdvancedThreatProtectionConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the WindowsDefenderAdvancedThreatProtectionConfiguration from the service
     *
     * @return the WindowsDefenderAdvancedThreatProtectionConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsDefenderAdvancedThreatProtectionConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsDefenderAdvancedThreatProtectionConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public WindowsDefenderAdvancedThreatProtectionConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WindowsDefenderAdvancedThreatProtectionConfiguration with a source
     *
     * @param sourceWindowsDefenderAdvancedThreatProtectionConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsDefenderAdvancedThreatProtectionConfiguration> patchAsync(@Nonnull final WindowsDefenderAdvancedThreatProtectionConfiguration sourceWindowsDefenderAdvancedThreatProtectionConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceWindowsDefenderAdvancedThreatProtectionConfiguration);
    }

    /**
     * Patches this WindowsDefenderAdvancedThreatProtectionConfiguration with a source
     *
     * @param sourceWindowsDefenderAdvancedThreatProtectionConfiguration the source object with updates
     * @return the updated WindowsDefenderAdvancedThreatProtectionConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsDefenderAdvancedThreatProtectionConfiguration patch(@Nonnull final WindowsDefenderAdvancedThreatProtectionConfiguration sourceWindowsDefenderAdvancedThreatProtectionConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsDefenderAdvancedThreatProtectionConfiguration);
    }

    /**
     * Creates a WindowsDefenderAdvancedThreatProtectionConfiguration with a new object
     *
     * @param newWindowsDefenderAdvancedThreatProtectionConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsDefenderAdvancedThreatProtectionConfiguration> postAsync(@Nonnull final WindowsDefenderAdvancedThreatProtectionConfiguration newWindowsDefenderAdvancedThreatProtectionConfiguration) {
        return sendAsync(HttpMethod.POST, newWindowsDefenderAdvancedThreatProtectionConfiguration);
    }

    /**
     * Creates a WindowsDefenderAdvancedThreatProtectionConfiguration with a new object
     *
     * @param newWindowsDefenderAdvancedThreatProtectionConfiguration the new object to create
     * @return the created WindowsDefenderAdvancedThreatProtectionConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsDefenderAdvancedThreatProtectionConfiguration post(@Nonnull final WindowsDefenderAdvancedThreatProtectionConfiguration newWindowsDefenderAdvancedThreatProtectionConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindowsDefenderAdvancedThreatProtectionConfiguration);
    }

    /**
     * Creates a WindowsDefenderAdvancedThreatProtectionConfiguration with a new object
     *
     * @param newWindowsDefenderAdvancedThreatProtectionConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsDefenderAdvancedThreatProtectionConfiguration> putAsync(@Nonnull final WindowsDefenderAdvancedThreatProtectionConfiguration newWindowsDefenderAdvancedThreatProtectionConfiguration) {
        return sendAsync(HttpMethod.PUT, newWindowsDefenderAdvancedThreatProtectionConfiguration);
    }

    /**
     * Creates a WindowsDefenderAdvancedThreatProtectionConfiguration with a new object
     *
     * @param newWindowsDefenderAdvancedThreatProtectionConfiguration the object to create/update
     * @return the created WindowsDefenderAdvancedThreatProtectionConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsDefenderAdvancedThreatProtectionConfiguration put(@Nonnull final WindowsDefenderAdvancedThreatProtectionConfiguration newWindowsDefenderAdvancedThreatProtectionConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newWindowsDefenderAdvancedThreatProtectionConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WindowsDefenderAdvancedThreatProtectionConfigurationRequest select(@Nonnull final String value) {
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
     public WindowsDefenderAdvancedThreatProtectionConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

