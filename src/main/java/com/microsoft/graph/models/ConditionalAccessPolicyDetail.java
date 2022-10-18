// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.ConditionalAccessConditionSet;
import com.microsoft.graph.models.ConditionalAccessGrantControls;
import com.microsoft.graph.models.ConditionalAccessSessionControls;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conditional Access Policy Detail.
 */
public class ConditionalAccessPolicyDetail implements IJsonBackedObject {

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
     * The Conditions.
     * Represents the type of conditions that govern when the policy applies.
     */
    @SerializedName(value = "conditions", alternate = {"Conditions"})
    @Expose
	@Nullable
    public ConditionalAccessConditionSet conditions;

    /**
     * The Grant Controls.
     * Represents grant controls that must be fulfilled for the policy.
     */
    @SerializedName(value = "grantControls", alternate = {"GrantControls"})
    @Expose
	@Nullable
    public ConditionalAccessGrantControls grantControls;

    /**
     * The Session Controls.
     * Represents a complex type of session controls that is enforced after sign-in.
     */
    @SerializedName(value = "sessionControls", alternate = {"SessionControls"})
    @Expose
	@Nullable
    public ConditionalAccessSessionControls sessionControls;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
