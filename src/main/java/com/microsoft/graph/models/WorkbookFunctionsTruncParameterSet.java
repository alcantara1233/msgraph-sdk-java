// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.WorkbookFunctionResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Trunc Parameter Set.
 */
public class WorkbookFunctionsTruncParameterSet {
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
     * Instiaciates a new WorkbookFunctionsTruncParameterSet
     */
    public WorkbookFunctionsTruncParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsTruncParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsTruncParameterSet(@Nonnull final WorkbookFunctionsTruncParameterSetBuilder builder) {
        this.number = builder.number;
        this.numDigits = builder.numDigits;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsTruncParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsTruncParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsTruncParameterSet
     */
    public static final class WorkbookFunctionsTruncParameterSetBuilder {
        /**
         * The number parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement number;
        /**
         * Sets the Number
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsTruncParameterSetBuilder withNumber(@Nullable final com.google.gson.JsonElement val) {
            this.number = val;
            return this;
        }
        /**
         * The numDigits parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement numDigits;
        /**
         * Sets the NumDigits
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsTruncParameterSetBuilder withNumDigits(@Nullable final com.google.gson.JsonElement val) {
            this.numDigits = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsTruncParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsTruncParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsTruncParameterSet build() {
            return new WorkbookFunctionsTruncParameterSet(this);
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
}