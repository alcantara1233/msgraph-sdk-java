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
 * The class for the Workbook Filter Apply Dynamic Filter Parameter Set.
 */
public class WorkbookFilterApplyDynamicFilterParameterSet {
    /**
     * The criteria.
     * 
     */
    @SerializedName(value = "criteria", alternate = {"Criteria"})
    @Expose
	@Nullable
    public String criteria;


    /**
     * Instiaciates a new WorkbookFilterApplyDynamicFilterParameterSet
     */
    public WorkbookFilterApplyDynamicFilterParameterSet() {}
    private WorkbookFilterApplyDynamicFilterParameterSet(@Nonnull final WorkbookFilterApplyDynamicFilterParameterSetBuilder builder) {
        this.criteria = builder.criteria;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFilterApplyDynamicFilterParameterSetBuilder newBuilder() {
        return new WorkbookFilterApplyDynamicFilterParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFilterApplyDynamicFilterParameterSet
     */
    public static final class WorkbookFilterApplyDynamicFilterParameterSetBuilder {
        private String criteria;
        /**
         * Sets the Criteria
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFilterApplyDynamicFilterParameterSetBuilder withCriteria(@Nullable final String val) {
            this.criteria = val;
            return this;
        }
        private WorkbookFilterApplyDynamicFilterParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFilterApplyDynamicFilterParameterSet build() {
            return new WorkbookFilterApplyDynamicFilterParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.criteria != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("criteria", criteria));
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
