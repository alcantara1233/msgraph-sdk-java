// Template Source: BaseEntityCollectionWithReferencesPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Organization;
import com.microsoft.graph.models.CertificateBasedAuthConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.CertificateBasedAuthConfigurationCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.CertificateBasedAuthConfigurationCollectionWithReferencesPage;
import com.microsoft.graph.requests.CertificateBasedAuthConfigurationCollectionResponse;
import com.microsoft.graph.models.CertificateBasedAuthConfiguration;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Certificate Based Auth Configuration Collection With References Page.
 */
public class CertificateBasedAuthConfigurationCollectionWithReferencesPage extends BaseCollectionPage<CertificateBasedAuthConfiguration, CertificateBasedAuthConfigurationCollectionWithReferencesRequestBuilder> {

    /**
     * A collection page for CertificateBasedAuthConfiguration
     *
     * @param response the serialized CertificateBasedAuthConfigurationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CertificateBasedAuthConfigurationCollectionWithReferencesPage(@Nonnull final CertificateBasedAuthConfigurationCollectionResponse response, @Nullable final CertificateBasedAuthConfigurationCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }

    /**
     * Creates the collection page for CertificateBasedAuthConfiguration
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public CertificateBasedAuthConfigurationCollectionWithReferencesPage(@Nonnull final java.util.List<CertificateBasedAuthConfiguration> pageContents, @Nullable final CertificateBasedAuthConfigurationCollectionWithReferencesRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}