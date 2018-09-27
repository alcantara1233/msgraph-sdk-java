// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.Windows81CompliancePolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Windows81Compliance Policy Request.
 */
public interface IBaseWindows81CompliancePolicyRequest extends IHttpRequest {

    /**
     * Gets the Windows81CompliancePolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Windows81CompliancePolicy> callback);

    /**
     * Gets the Windows81CompliancePolicy from the service
     *
     * @return the Windows81CompliancePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows81CompliancePolicy get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Windows81CompliancePolicy> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Windows81CompliancePolicy with a source
     *
     * @param sourceWindows81CompliancePolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Windows81CompliancePolicy sourceWindows81CompliancePolicy, final ICallback<Windows81CompliancePolicy> callback);

    /**
     * Patches this Windows81CompliancePolicy with a source
     *
     * @param sourceWindows81CompliancePolicy the source object with updates
     * @return the updated Windows81CompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows81CompliancePolicy patch(final Windows81CompliancePolicy sourceWindows81CompliancePolicy) throws ClientException;

    /**
     * Posts a Windows81CompliancePolicy with a new object
     *
     * @param newWindows81CompliancePolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Windows81CompliancePolicy newWindows81CompliancePolicy, final ICallback<Windows81CompliancePolicy> callback);

    /**
     * Posts a Windows81CompliancePolicy with a new object
     *
     * @param newWindows81CompliancePolicy the new object to create
     * @return the created Windows81CompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows81CompliancePolicy post(final Windows81CompliancePolicy newWindows81CompliancePolicy) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseWindows81CompliancePolicyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseWindows81CompliancePolicyRequest expand(final String value);

}
