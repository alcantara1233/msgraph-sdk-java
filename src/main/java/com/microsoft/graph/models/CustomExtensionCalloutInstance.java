// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.CustomExtensionCalloutInstanceStatus;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Custom Extension Callout Instance.
 */
public class CustomExtensionCalloutInstance implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Custom Extension Id.
     * Identification of the custom extension that was triggered at this instance.
     */
    @SerializedName(value = "customExtensionId", alternate = {"CustomExtensionId"})
    @Expose
	@Nullable
    public String customExtensionId;

    /**
     * The Detail.
     * Details provided by the logic app during the callback of the request instance.
     */
    @SerializedName(value = "detail", alternate = {"Detail"})
    @Expose
	@Nullable
    public String detail;

    /**
     * The External Correlation Id.
     * The unique run identifier for the logic app.
     */
    @SerializedName(value = "externalCorrelationId", alternate = {"ExternalCorrelationId"})
    @Expose
	@Nullable
    public String externalCorrelationId;

    /**
     * The Id.
     * Unique identifier for the callout instance. Read-only.
     */
    @SerializedName(value = "id", alternate = {"Id"})
    @Expose
	@Nullable
    public String id;

    /**
     * The Status.
     * The status of the request to the custom extension. The possible values are: calloutSent, callbackReceived, calloutFailed, callbackTimedOut, waitingForCallback, unknownFutureValue.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public CustomExtensionCalloutInstanceStatus status;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
