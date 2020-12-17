// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;


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
 * The class for the Workbook Filter Apply Top Percent Filter Parameter Set.
 */
public class WorkbookFilterApplyTopPercentFilterParameterSet {
    /**
     * The percent.
     * 
     */
    @SerializedName(value = "percent", alternate = {"Percent"})
    @Expose
	@Nullable
    public Integer percent;


    /**
     * Instiaciates a new WorkbookFilterApplyTopPercentFilterParameterSet
     */
    public WorkbookFilterApplyTopPercentFilterParameterSet() {}
    private WorkbookFilterApplyTopPercentFilterParameterSet(@Nonnull final WorkbookFilterApplyTopPercentFilterParameterSetBuilder builder) {
        this.percent = builder.percent;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFilterApplyTopPercentFilterParameterSetBuilder newBuilder() {
        return new WorkbookFilterApplyTopPercentFilterParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFilterApplyTopPercentFilterParameterSet
     */
    public static final class WorkbookFilterApplyTopPercentFilterParameterSetBuilder {
        private Integer percent;
        /**
         * Sets the Percent
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFilterApplyTopPercentFilterParameterSetBuilder withPercent(@Nullable final Integer val) {
            this.percent = val;
            return this;
        }
        private WorkbookFilterApplyTopPercentFilterParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFilterApplyTopPercentFilterParameterSet build() {
            return new WorkbookFilterApplyTopPercentFilterParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.percent != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("percent", percent));
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
