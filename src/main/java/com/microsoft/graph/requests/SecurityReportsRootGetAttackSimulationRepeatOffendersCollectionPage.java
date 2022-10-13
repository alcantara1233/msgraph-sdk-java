// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AttackSimulationRepeatOffender;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.SecurityReportsRootGetAttackSimulationRepeatOffendersCollectionRequestBuilder;
import com.microsoft.graph.requests.SecurityReportsRootGetAttackSimulationRepeatOffendersCollectionPage;
import com.microsoft.graph.requests.SecurityReportsRootGetAttackSimulationRepeatOffendersCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Reports Root Get Attack Simulation Repeat Offenders Collection Page.
 */
public class SecurityReportsRootGetAttackSimulationRepeatOffendersCollectionPage extends BaseCollectionPage<AttackSimulationRepeatOffender, SecurityReportsRootGetAttackSimulationRepeatOffendersCollectionRequestBuilder> {

    /**
     * A collection page for AttackSimulationRepeatOffender.
     *
     * @param response The serialized SecurityReportsRootGetAttackSimulationRepeatOffendersCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public SecurityReportsRootGetAttackSimulationRepeatOffendersCollectionPage(@Nonnull final SecurityReportsRootGetAttackSimulationRepeatOffendersCollectionResponse response, @Nonnull final SecurityReportsRootGetAttackSimulationRepeatOffendersCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for SecurityReportsRootGetAttackSimulationRepeatOffenders
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public SecurityReportsRootGetAttackSimulationRepeatOffendersCollectionPage(@Nonnull final java.util.List<AttackSimulationRepeatOffender> pageContents, @Nullable final SecurityReportsRootGetAttackSimulationRepeatOffendersCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
