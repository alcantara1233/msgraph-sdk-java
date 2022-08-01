// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.CrossTenantAccessPolicyB2BSetting;
import com.microsoft.graph.models.CrossTenantAccessPolicyInboundTrust;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cross Tenant Access Policy Configuration Default.
 */
public class CrossTenantAccessPolicyConfigurationDefault extends Entity implements IJsonBackedObject {


    /**
     * The B2b Collaboration Inbound.
     * Defines your default configuration for users from other organizations accessing your resources via Azure AD B2B collaboration.
     */
    @SerializedName(value = "b2bCollaborationInbound", alternate = {"B2bCollaborationInbound"})
    @Expose
	@Nullable
    public CrossTenantAccessPolicyB2BSetting b2bCollaborationInbound;

    /**
     * The B2b Collaboration Outbound.
     * Defines your default configuration for users in your organization going outbound to access resources in another organization via Azure AD B2B collaboration.
     */
    @SerializedName(value = "b2bCollaborationOutbound", alternate = {"B2bCollaborationOutbound"})
    @Expose
	@Nullable
    public CrossTenantAccessPolicyB2BSetting b2bCollaborationOutbound;

    /**
     * The B2b Direct Connect Inbound.
     * Defines your default configuration for users from other organizations accessing your resources via Azure AD B2B direct connect.
     */
    @SerializedName(value = "b2bDirectConnectInbound", alternate = {"B2bDirectConnectInbound"})
    @Expose
	@Nullable
    public CrossTenantAccessPolicyB2BSetting b2bDirectConnectInbound;

    /**
     * The B2b Direct Connect Outbound.
     * Defines your default configuration for users in your organization going outbound to access resources in another organization via Azure AD B2B direct connect.
     */
    @SerializedName(value = "b2bDirectConnectOutbound", alternate = {"B2bDirectConnectOutbound"})
    @Expose
	@Nullable
    public CrossTenantAccessPolicyB2BSetting b2bDirectConnectOutbound;

    /**
     * The Inbound Trust.
     * Determines the default configuration for trusting other Conditional Access claims from external Azure AD organizations.
     */
    @SerializedName(value = "inboundTrust", alternate = {"InboundTrust"})
    @Expose
	@Nullable
    public CrossTenantAccessPolicyInboundTrust inboundTrust;

    /**
     * The Is Service Default.
     * If true, the default configuration is set to the system default configuration. If false, the default settings have been customized.
     */
    @SerializedName(value = "isServiceDefault", alternate = {"IsServiceDefault"})
    @Expose
	@Nullable
    public Boolean isServiceDefault;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}