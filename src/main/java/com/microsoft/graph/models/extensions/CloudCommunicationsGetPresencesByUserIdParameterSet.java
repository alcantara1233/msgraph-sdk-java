// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.Presence;
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
 * The class for the Cloud Communications Get Presences By User Id Parameter Set.
 */
public class CloudCommunicationsGetPresencesByUserIdParameterSet {
    /**
     * The ids.
     * 
     */
    @SerializedName(value = "ids", alternate = {"Ids"})
    @Expose
	@Nullable
    public java.util.List<String> ids;


    /**
     * Instiaciates a new CloudCommunicationsGetPresencesByUserIdParameterSet
     */
    public CloudCommunicationsGetPresencesByUserIdParameterSet() {}
    private CloudCommunicationsGetPresencesByUserIdParameterSet(@Nonnull final CloudCommunicationsGetPresencesByUserIdParameterSetBuilder builder) {
        this.ids = builder.ids;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static CloudCommunicationsGetPresencesByUserIdParameterSetBuilder newBuilder() {
        return new CloudCommunicationsGetPresencesByUserIdParameterSetBuilder();
    }
    /**
     * Fluent builder for the CloudCommunicationsGetPresencesByUserIdParameterSet
     */
    public static final class CloudCommunicationsGetPresencesByUserIdParameterSetBuilder {
        private java.util.List<String> ids;
        /**
         * Sets the Ids
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public CloudCommunicationsGetPresencesByUserIdParameterSetBuilder withIds(@Nullable final java.util.List<String> val) {
            this.ids = val;
            return this;
        }
        private CloudCommunicationsGetPresencesByUserIdParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public CloudCommunicationsGetPresencesByUserIdParameterSet build() {
            return new CloudCommunicationsGetPresencesByUserIdParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.ids != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("ids", ids));
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
