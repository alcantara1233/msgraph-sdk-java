// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Vdb Parameter Set.
 */
public class WorkbookFunctionsVdbParameterSet {
    /**
     * The cost.
     * 
     */
    @SerializedName(value = "cost", alternate = {"Cost"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement cost;

    /**
     * The salvage.
     * 
     */
    @SerializedName(value = "salvage", alternate = {"Salvage"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement salvage;

    /**
     * The life.
     * 
     */
    @SerializedName(value = "life", alternate = {"Life"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement life;

    /**
     * The start Period.
     * 
     */
    @SerializedName(value = "startPeriod", alternate = {"StartPeriod"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement startPeriod;

    /**
     * The end Period.
     * 
     */
    @SerializedName(value = "endPeriod", alternate = {"EndPeriod"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement endPeriod;

    /**
     * The factor.
     * 
     */
    @SerializedName(value = "factor", alternate = {"Factor"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement factor;

    /**
     * The no Switch.
     * 
     */
    @SerializedName(value = "noSwitch", alternate = {"NoSwitch"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement noSwitch;


    /**
     * Instiaciates a new WorkbookFunctionsVdbParameterSet
     */
    public WorkbookFunctionsVdbParameterSet() {}
    private WorkbookFunctionsVdbParameterSet(@Nonnull final WorkbookFunctionsVdbParameterSetBuilder builder) {
        this.cost = builder.cost;
        this.salvage = builder.salvage;
        this.life = builder.life;
        this.startPeriod = builder.startPeriod;
        this.endPeriod = builder.endPeriod;
        this.factor = builder.factor;
        this.noSwitch = builder.noSwitch;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsVdbParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsVdbParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsVdbParameterSet
     */
    public static final class WorkbookFunctionsVdbParameterSetBuilder {
        private com.google.gson.JsonElement cost;
        /**
         * Sets the Cost
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsVdbParameterSetBuilder withCost(@Nullable final com.google.gson.JsonElement val) {
            this.cost = val;
            return this;
        }
        private com.google.gson.JsonElement salvage;
        /**
         * Sets the Salvage
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsVdbParameterSetBuilder withSalvage(@Nullable final com.google.gson.JsonElement val) {
            this.salvage = val;
            return this;
        }
        private com.google.gson.JsonElement life;
        /**
         * Sets the Life
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsVdbParameterSetBuilder withLife(@Nullable final com.google.gson.JsonElement val) {
            this.life = val;
            return this;
        }
        private com.google.gson.JsonElement startPeriod;
        /**
         * Sets the StartPeriod
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsVdbParameterSetBuilder withStartPeriod(@Nullable final com.google.gson.JsonElement val) {
            this.startPeriod = val;
            return this;
        }
        private com.google.gson.JsonElement endPeriod;
        /**
         * Sets the EndPeriod
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsVdbParameterSetBuilder withEndPeriod(@Nullable final com.google.gson.JsonElement val) {
            this.endPeriod = val;
            return this;
        }
        private com.google.gson.JsonElement factor;
        /**
         * Sets the Factor
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsVdbParameterSetBuilder withFactor(@Nullable final com.google.gson.JsonElement val) {
            this.factor = val;
            return this;
        }
        private com.google.gson.JsonElement noSwitch;
        /**
         * Sets the NoSwitch
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsVdbParameterSetBuilder withNoSwitch(@Nullable final com.google.gson.JsonElement val) {
            this.noSwitch = val;
            return this;
        }
        private WorkbookFunctionsVdbParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsVdbParameterSet build() {
            return new WorkbookFunctionsVdbParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.cost != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("cost", cost));
        }
        if(this.salvage != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("salvage", salvage));
        }
        if(this.life != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("life", life));
        }
        if(this.startPeriod != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("startPeriod", startPeriod));
        }
        if(this.endPeriod != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("endPeriod", endPeriod));
        }
        if(this.factor != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("factor", factor));
        }
        if(this.noSwitch != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("noSwitch", noSwitch));
        }
        return result;
    }
    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
