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
 * The class for the Workbook Functions Round Parameter Set.
 */
public class WorkbookFunctionsRoundParameterSet {
    /**
     * The number.
     * 
     */
    @SerializedName(value = "number", alternate = {"Number"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement number;

    /**
     * The num Digits.
     * 
     */
    @SerializedName(value = "numDigits", alternate = {"NumDigits"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement numDigits;


    /**
     * Instiaciates a new WorkbookFunctionsRoundParameterSet
     */
    public WorkbookFunctionsRoundParameterSet() {}
    private WorkbookFunctionsRoundParameterSet(@Nonnull final WorkbookFunctionsRoundParameterSetBuilder builder) {
        this.number = builder.number;
        this.numDigits = builder.numDigits;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsRoundParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsRoundParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsRoundParameterSet
     */
    public static final class WorkbookFunctionsRoundParameterSetBuilder {
        private com.google.gson.JsonElement number;
        /**
         * Sets the Number
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsRoundParameterSetBuilder withNumber(@Nullable final com.google.gson.JsonElement val) {
            this.number = val;
            return this;
        }
        private com.google.gson.JsonElement numDigits;
        /**
         * Sets the NumDigits
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsRoundParameterSetBuilder withNumDigits(@Nullable final com.google.gson.JsonElement val) {
            this.numDigits = val;
            return this;
        }
        private WorkbookFunctionsRoundParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsRoundParameterSet build() {
            return new WorkbookFunctionsRoundParameterSet(this);
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
        if(this.numDigits != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("numDigits", numDigits));
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
