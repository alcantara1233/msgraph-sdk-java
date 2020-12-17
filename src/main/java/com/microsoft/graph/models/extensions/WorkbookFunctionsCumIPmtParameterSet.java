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
 * The class for the Workbook Functions Cum IPmt Parameter Set.
 */
public class WorkbookFunctionsCumIPmtParameterSet {
    /**
     * The rate.
     * 
     */
    @SerializedName(value = "rate", alternate = {"Rate"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement rate;

    /**
     * The nper.
     * 
     */
    @SerializedName(value = "nper", alternate = {"Nper"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement nper;

    /**
     * The pv.
     * 
     */
    @SerializedName(value = "pv", alternate = {"Pv"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement pv;

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
     * The type.
     * 
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement type;


    /**
     * Instiaciates a new WorkbookFunctionsCumIPmtParameterSet
     */
    public WorkbookFunctionsCumIPmtParameterSet() {}
    private WorkbookFunctionsCumIPmtParameterSet(@Nonnull final WorkbookFunctionsCumIPmtParameterSetBuilder builder) {
        this.rate = builder.rate;
        this.nper = builder.nper;
        this.pv = builder.pv;
        this.startPeriod = builder.startPeriod;
        this.endPeriod = builder.endPeriod;
        this.type = builder.type;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsCumIPmtParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsCumIPmtParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsCumIPmtParameterSet
     */
    public static final class WorkbookFunctionsCumIPmtParameterSetBuilder {
        private com.google.gson.JsonElement rate;
        /**
         * Sets the Rate
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsCumIPmtParameterSetBuilder withRate(@Nullable final com.google.gson.JsonElement val) {
            this.rate = val;
            return this;
        }
        private com.google.gson.JsonElement nper;
        /**
         * Sets the Nper
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsCumIPmtParameterSetBuilder withNper(@Nullable final com.google.gson.JsonElement val) {
            this.nper = val;
            return this;
        }
        private com.google.gson.JsonElement pv;
        /**
         * Sets the Pv
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsCumIPmtParameterSetBuilder withPv(@Nullable final com.google.gson.JsonElement val) {
            this.pv = val;
            return this;
        }
        private com.google.gson.JsonElement startPeriod;
        /**
         * Sets the StartPeriod
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsCumIPmtParameterSetBuilder withStartPeriod(@Nullable final com.google.gson.JsonElement val) {
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
        public WorkbookFunctionsCumIPmtParameterSetBuilder withEndPeriod(@Nullable final com.google.gson.JsonElement val) {
            this.endPeriod = val;
            return this;
        }
        private com.google.gson.JsonElement type;
        /**
         * Sets the Type
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsCumIPmtParameterSetBuilder withType(@Nullable final com.google.gson.JsonElement val) {
            this.type = val;
            return this;
        }
        private WorkbookFunctionsCumIPmtParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsCumIPmtParameterSet build() {
            return new WorkbookFunctionsCumIPmtParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.rate != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("rate", rate));
        }
        if(this.nper != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("nper", nper));
        }
        if(this.pv != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("pv", pv));
        }
        if(this.startPeriod != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("startPeriod", startPeriod));
        }
        if(this.endPeriod != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("endPeriod", endPeriod));
        }
        if(this.type != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("type", type));
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
