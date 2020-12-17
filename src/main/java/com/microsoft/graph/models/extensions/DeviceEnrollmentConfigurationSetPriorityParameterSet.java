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
 * The class for the Device Enrollment Configuration Set Priority Parameter Set.
 */
public class DeviceEnrollmentConfigurationSetPriorityParameterSet {
    /**
     * The priority.
     * 
     */
    @SerializedName(value = "priority", alternate = {"Priority"})
    @Expose
	@Nullable
    public Integer priority;


    /**
     * Instiaciates a new DeviceEnrollmentConfigurationSetPriorityParameterSet
     */
    public DeviceEnrollmentConfigurationSetPriorityParameterSet() {}
    private DeviceEnrollmentConfigurationSetPriorityParameterSet(@Nonnull final DeviceEnrollmentConfigurationSetPriorityParameterSetBuilder builder) {
        this.priority = builder.priority;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DeviceEnrollmentConfigurationSetPriorityParameterSetBuilder newBuilder() {
        return new DeviceEnrollmentConfigurationSetPriorityParameterSetBuilder();
    }
    /**
     * Fluent builder for the DeviceEnrollmentConfigurationSetPriorityParameterSet
     */
    public static final class DeviceEnrollmentConfigurationSetPriorityParameterSetBuilder {
        private Integer priority;
        /**
         * Sets the Priority
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DeviceEnrollmentConfigurationSetPriorityParameterSetBuilder withPriority(@Nullable final Integer val) {
            this.priority = val;
            return this;
        }
        private DeviceEnrollmentConfigurationSetPriorityParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DeviceEnrollmentConfigurationSetPriorityParameterSet build() {
            return new DeviceEnrollmentConfigurationSetPriorityParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.priority != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("priority", priority));
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
