// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.Application;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.PasswordCredential;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseCollectionReferenceRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application Collection Reference Request Builder.
 */
public class ApplicationCollectionReferenceRequestBuilder extends BaseCollectionReferenceRequestBuilder<Application, ApplicationWithReferenceRequestBuilder, ApplicationCollectionResponse, ApplicationCollectionWithReferencesPage, ApplicationCollectionReferenceRequest> {

    /**
     * The request builder for this collection of Application
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApplicationCollectionReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ApplicationWithReferenceRequestBuilder.class, ApplicationCollectionResponse.class, ApplicationCollectionWithReferencesPage.class, ApplicationCollectionReferenceRequest.class);
    }
}
