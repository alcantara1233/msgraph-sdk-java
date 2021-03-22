// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.DirectoryObject;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Endpoint.
 */
public class Endpoint extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Capability.
     * Describes the capability that is associated with this resource. (e.g. Messages, Conversations, etc.)  Not nullable. Read-only.
     */
    @SerializedName(value = "capability", alternate = {"Capability"})
    @Expose
	@Nullable
    public String capability;

    /**
     * The Provider Id.
     * Application id of the publishing underlying service. Not nullable. Read-only.
     */
    @SerializedName(value = "providerId", alternate = {"ProviderId"})
    @Expose
	@Nullable
    public String providerId;

    /**
     * The Provider Name.
     * Name of the publishing underlying service. Read-only.
     */
    @SerializedName(value = "providerName", alternate = {"ProviderName"})
    @Expose
	@Nullable
    public String providerName;

    /**
     * The Provider Resource Id.
     * For Microsoft 365 groups, this is set to a well-known name for the resource (e.g. Yammer.FeedURL etc.). Not nullable. Read-only.
     */
    @SerializedName(value = "providerResourceId", alternate = {"ProviderResourceId"})
    @Expose
	@Nullable
    public String providerResourceId;

    /**
     * The Uri.
     * URL of the published resource. Not nullable. Read-only.
     */
    @SerializedName(value = "uri", alternate = {"Uri"})
    @Expose
	@Nullable
    public String uri;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}