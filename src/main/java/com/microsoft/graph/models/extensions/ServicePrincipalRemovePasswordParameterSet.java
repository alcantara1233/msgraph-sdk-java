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
 * The class for the Service Principal Remove Password Parameter Set.
 */
public class ServicePrincipalRemovePasswordParameterSet {
    /**
     * The key Id.
     * 
     */
    @SerializedName(value = "keyId", alternate = {"KeyId"})
    @Expose
	@Nullable
    public java.util.UUID keyId;


    /**
     * Instiaciates a new ServicePrincipalRemovePasswordParameterSet
     */
    public ServicePrincipalRemovePasswordParameterSet() {}
    private ServicePrincipalRemovePasswordParameterSet(@Nonnull final ServicePrincipalRemovePasswordParameterSetBuilder builder) {
        this.keyId = builder.keyId;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ServicePrincipalRemovePasswordParameterSetBuilder newBuilder() {
        return new ServicePrincipalRemovePasswordParameterSetBuilder();
    }
    /**
     * Fluent builder for the ServicePrincipalRemovePasswordParameterSet
     */
    public static final class ServicePrincipalRemovePasswordParameterSetBuilder {
        private java.util.UUID keyId;
        /**
         * Sets the KeyId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ServicePrincipalRemovePasswordParameterSetBuilder withKeyId(@Nullable final java.util.UUID val) {
            this.keyId = val;
            return this;
        }
        private ServicePrincipalRemovePasswordParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ServicePrincipalRemovePasswordParameterSet build() {
            return new ServicePrincipalRemovePasswordParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.keyId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("keyId", keyId));
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
