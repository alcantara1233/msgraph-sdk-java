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
 * The class for the Workbook Functions Quartile_Inc Parameter Set.
 */
public class WorkbookFunctionsQuartile_IncParameterSet {
    /**
     * The array.
     * 
     */
    @SerializedName(value = "array", alternate = {"Array"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement array;

    /**
     * The quart.
     * 
     */
    @SerializedName(value = "quart", alternate = {"Quart"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement quart;


    /**
     * Instiaciates a new WorkbookFunctionsQuartile_IncParameterSet
     */
    public WorkbookFunctionsQuartile_IncParameterSet() {}
    private WorkbookFunctionsQuartile_IncParameterSet(@Nonnull final WorkbookFunctionsQuartile_IncParameterSetBuilder builder) {
        this.array = builder.array;
        this.quart = builder.quart;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsQuartile_IncParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsQuartile_IncParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsQuartile_IncParameterSet
     */
    public static final class WorkbookFunctionsQuartile_IncParameterSetBuilder {
        private com.google.gson.JsonElement array;
        /**
         * Sets the Array
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsQuartile_IncParameterSetBuilder withArray(@Nullable final com.google.gson.JsonElement val) {
            this.array = val;
            return this;
        }
        private com.google.gson.JsonElement quart;
        /**
         * Sets the Quart
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsQuartile_IncParameterSetBuilder withQuart(@Nullable final com.google.gson.JsonElement val) {
            this.quart = val;
            return this;
        }
        private WorkbookFunctionsQuartile_IncParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsQuartile_IncParameterSet build() {
            return new WorkbookFunctionsQuartile_IncParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.array != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("array", array));
        }
        if(this.quart != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("quart", quart));
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
