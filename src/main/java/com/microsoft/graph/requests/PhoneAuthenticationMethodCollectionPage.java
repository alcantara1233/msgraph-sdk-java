// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.PhoneAuthenticationMethod;
import com.microsoft.graph.requests.PhoneAuthenticationMethodCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.PhoneAuthenticationMethodCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Phone Authentication Method Collection Page.
 */
public class PhoneAuthenticationMethodCollectionPage extends BaseCollectionPage<PhoneAuthenticationMethod, PhoneAuthenticationMethodCollectionRequestBuilder> {

    /**
     * A collection page for PhoneAuthenticationMethod
     *
     * @param response the serialized PhoneAuthenticationMethodCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PhoneAuthenticationMethodCollectionPage(@Nonnull final PhoneAuthenticationMethodCollectionResponse response, @Nonnull final PhoneAuthenticationMethodCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for PhoneAuthenticationMethod
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public PhoneAuthenticationMethodCollectionPage(@Nonnull final java.util.List<PhoneAuthenticationMethod> pageContents, @Nullable final PhoneAuthenticationMethodCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
