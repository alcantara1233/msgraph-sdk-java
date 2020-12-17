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
 * The class for the Workbook Functions Pv Parameter Set.
 */
public class WorkbookFunctionsPvParameterSet {
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
     * The pmt.
     * 
     */
    @SerializedName(value = "pmt", alternate = {"Pmt"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement pmt;

    /**
     * The fv.
     * 
     */
    @SerializedName(value = "fv", alternate = {"Fv"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement fv;

    /**
     * The type.
     * 
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement type;


    /**
     * Instiaciates a new WorkbookFunctionsPvParameterSet
     */
    public WorkbookFunctionsPvParameterSet() {}
    private WorkbookFunctionsPvParameterSet(@Nonnull final WorkbookFunctionsPvParameterSetBuilder builder) {
        this.rate = builder.rate;
        this.nper = builder.nper;
        this.pmt = builder.pmt;
        this.fv = builder.fv;
        this.type = builder.type;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsPvParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsPvParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsPvParameterSet
     */
    public static final class WorkbookFunctionsPvParameterSetBuilder {
        private com.google.gson.JsonElement rate;
        /**
         * Sets the Rate
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsPvParameterSetBuilder withRate(@Nullable final com.google.gson.JsonElement val) {
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
        public WorkbookFunctionsPvParameterSetBuilder withNper(@Nullable final com.google.gson.JsonElement val) {
            this.nper = val;
            return this;
        }
        private com.google.gson.JsonElement pmt;
        /**
         * Sets the Pmt
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsPvParameterSetBuilder withPmt(@Nullable final com.google.gson.JsonElement val) {
            this.pmt = val;
            return this;
        }
        private com.google.gson.JsonElement fv;
        /**
         * Sets the Fv
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsPvParameterSetBuilder withFv(@Nullable final com.google.gson.JsonElement val) {
            this.fv = val;
            return this;
        }
        private com.google.gson.JsonElement type;
        /**
         * Sets the Type
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsPvParameterSetBuilder withType(@Nullable final com.google.gson.JsonElement val) {
            this.type = val;
            return this;
        }
        private WorkbookFunctionsPvParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsPvParameterSet build() {
            return new WorkbookFunctionsPvParameterSet(this);
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
        if(this.pmt != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("pmt", pmt));
        }
        if(this.fv != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("fv", fv));
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
