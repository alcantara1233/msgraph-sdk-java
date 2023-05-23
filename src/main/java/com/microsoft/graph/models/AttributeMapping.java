// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.AttributeFlowBehavior;
import com.microsoft.graph.models.AttributeFlowType;
import com.microsoft.graph.models.AttributeMappingSource;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Attribute Mapping.
 */
public class AttributeMapping implements IJsonBackedObject {

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
     * The Default Value.
     * 
     */
    @SerializedName(value = "defaultValue", alternate = {"DefaultValue"})
    @Expose
	@Nullable
    public String defaultValue;

    /**
     * The Export Missing References.
     * 
     */
    @SerializedName(value = "exportMissingReferences", alternate = {"ExportMissingReferences"})
    @Expose
	@Nullable
    public Boolean exportMissingReferences;

    /**
     * The Flow Behavior.
     * 
     */
    @SerializedName(value = "flowBehavior", alternate = {"FlowBehavior"})
    @Expose
	@Nullable
    public AttributeFlowBehavior flowBehavior;

    /**
     * The Flow Type.
     * 
     */
    @SerializedName(value = "flowType", alternate = {"FlowType"})
    @Expose
	@Nullable
    public AttributeFlowType flowType;

    /**
     * The Matching Priority.
     * 
     */
    @SerializedName(value = "matchingPriority", alternate = {"MatchingPriority"})
    @Expose
	@Nullable
    public Integer matchingPriority;

    /**
     * The Source.
     * 
     */
    @SerializedName(value = "source", alternate = {"Source"})
    @Expose
	@Nullable
    public AttributeMappingSource source;

    /**
     * The Target Attribute Name.
     * 
     */
    @SerializedName(value = "targetAttributeName", alternate = {"TargetAttributeName"})
    @Expose
	@Nullable
    public String targetAttributeName;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
