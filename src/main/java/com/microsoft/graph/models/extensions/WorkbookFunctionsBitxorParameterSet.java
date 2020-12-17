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
 * The class for the Workbook Functions Bitxor Parameter Set.
 */
public class WorkbookFunctionsBitxorParameterSet {
    /**
     * The number1.
     * 
     */
    @SerializedName(value = "number1", alternate = {"Number1"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement number1;

    /**
     * The number2.
     * 
     */
    @SerializedName(value = "number2", alternate = {"Number2"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement number2;


    /**
     * Instiaciates a new WorkbookFunctionsBitxorParameterSet
     */
    public WorkbookFunctionsBitxorParameterSet() {}
    private WorkbookFunctionsBitxorParameterSet(@Nonnull final WorkbookFunctionsBitxorParameterSetBuilder builder) {
        this.number1 = builder.number1;
        this.number2 = builder.number2;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsBitxorParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsBitxorParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsBitxorParameterSet
     */
    public static final class WorkbookFunctionsBitxorParameterSetBuilder {
        private com.google.gson.JsonElement number1;
        /**
         * Sets the Number1
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsBitxorParameterSetBuilder withNumber1(@Nullable final com.google.gson.JsonElement val) {
            this.number1 = val;
            return this;
        }
        private com.google.gson.JsonElement number2;
        /**
         * Sets the Number2
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsBitxorParameterSetBuilder withNumber2(@Nullable final com.google.gson.JsonElement val) {
            this.number2 = val;
            return this;
        }
        private WorkbookFunctionsBitxorParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsBitxorParameterSet build() {
            return new WorkbookFunctionsBitxorParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.number1 != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("number1", number1));
        }
        if(this.number2 != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("number2", number2));
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
