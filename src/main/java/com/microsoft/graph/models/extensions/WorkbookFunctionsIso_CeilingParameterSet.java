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
 * The class for the Workbook Functions Iso_Ceiling Parameter Set.
 */
public class WorkbookFunctionsIso_CeilingParameterSet {
    /**
     * The number.
     * 
     */
    @SerializedName(value = "number", alternate = {"Number"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement number;

    /**
     * The significance.
     * 
     */
    @SerializedName(value = "significance", alternate = {"Significance"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement significance;


    /**
     * Instiaciates a new WorkbookFunctionsIso_CeilingParameterSet
     */
    public WorkbookFunctionsIso_CeilingParameterSet() {}
    private WorkbookFunctionsIso_CeilingParameterSet(@Nonnull final WorkbookFunctionsIso_CeilingParameterSetBuilder builder) {
        this.number = builder.number;
        this.significance = builder.significance;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsIso_CeilingParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsIso_CeilingParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsIso_CeilingParameterSet
     */
    public static final class WorkbookFunctionsIso_CeilingParameterSetBuilder {
        private com.google.gson.JsonElement number;
        /**
         * Sets the Number
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsIso_CeilingParameterSetBuilder withNumber(@Nullable final com.google.gson.JsonElement val) {
            this.number = val;
            return this;
        }
        private com.google.gson.JsonElement significance;
        /**
         * Sets the Significance
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsIso_CeilingParameterSetBuilder withSignificance(@Nullable final com.google.gson.JsonElement val) {
            this.significance = val;
            return this;
        }
        private WorkbookFunctionsIso_CeilingParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsIso_CeilingParameterSet build() {
            return new WorkbookFunctionsIso_CeilingParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.number != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("number", number));
        }
        if(this.significance != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("significance", significance));
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
