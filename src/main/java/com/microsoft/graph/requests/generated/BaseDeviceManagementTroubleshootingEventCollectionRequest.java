// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Device Management Troubleshooting Event Collection Request.
 */
public class BaseDeviceManagementTroubleshootingEventCollectionRequest extends BaseCollectionRequest<BaseDeviceManagementTroubleshootingEventCollectionResponse, IDeviceManagementTroubleshootingEventCollectionPage> implements IBaseDeviceManagementTroubleshootingEventCollectionRequest {

    /**
     * The request builder for this collection of DeviceManagementTroubleshootingEvent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseDeviceManagementTroubleshootingEventCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseDeviceManagementTroubleshootingEventCollectionResponse.class, IDeviceManagementTroubleshootingEventCollectionPage.class);
    }

    public void get(final ICallback<IDeviceManagementTroubleshootingEventCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IDeviceManagementTroubleshootingEventCollectionPage get() throws ClientException {
        final BaseDeviceManagementTroubleshootingEventCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceManagementTroubleshootingEvent newDeviceManagementTroubleshootingEvent, final ICallback<DeviceManagementTroubleshootingEvent> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceManagementTroubleshootingEventRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceManagementTroubleshootingEvent, callback);
    }

    public DeviceManagementTroubleshootingEvent post(final DeviceManagementTroubleshootingEvent newDeviceManagementTroubleshootingEvent) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceManagementTroubleshootingEventRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceManagementTroubleshootingEvent);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementTroubleshootingEventCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (DeviceManagementTroubleshootingEventCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementTroubleshootingEventCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (DeviceManagementTroubleshootingEventCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceManagementTroubleshootingEventCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (DeviceManagementTroubleshootingEventCollectionRequest)this;
    }

    public IDeviceManagementTroubleshootingEventCollectionPage buildFromResponse(final BaseDeviceManagementTroubleshootingEventCollectionResponse response) {
        final IDeviceManagementTroubleshootingEventCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceManagementTroubleshootingEventCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceManagementTroubleshootingEventCollectionPage page = new DeviceManagementTroubleshootingEventCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}