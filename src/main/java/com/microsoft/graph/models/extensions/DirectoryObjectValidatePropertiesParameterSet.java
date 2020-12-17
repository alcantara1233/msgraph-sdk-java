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
 * The class for the Directory Object Validate Properties Parameter Set.
 */
public class DirectoryObjectValidatePropertiesParameterSet {
    /**
     * The entity Type.
     * 
     */
    @SerializedName(value = "entityType", alternate = {"EntityType"})
    @Expose
	@Nullable
    public String entityType;

    /**
     * The display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The mail Nickname.
     * 
     */
    @SerializedName(value = "mailNickname", alternate = {"MailNickname"})
    @Expose
	@Nullable
    public String mailNickname;

    /**
     * The on Behalf Of User Id.
     * 
     */
    @SerializedName(value = "onBehalfOfUserId", alternate = {"OnBehalfOfUserId"})
    @Expose
	@Nullable
    public java.util.UUID onBehalfOfUserId;


    /**
     * Instiaciates a new DirectoryObjectValidatePropertiesParameterSet
     */
    public DirectoryObjectValidatePropertiesParameterSet() {}
    private DirectoryObjectValidatePropertiesParameterSet(@Nonnull final DirectoryObjectValidatePropertiesParameterSetBuilder builder) {
        this.entityType = builder.entityType;
        this.displayName = builder.displayName;
        this.mailNickname = builder.mailNickname;
        this.onBehalfOfUserId = builder.onBehalfOfUserId;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DirectoryObjectValidatePropertiesParameterSetBuilder newBuilder() {
        return new DirectoryObjectValidatePropertiesParameterSetBuilder();
    }
    /**
     * Fluent builder for the DirectoryObjectValidatePropertiesParameterSet
     */
    public static final class DirectoryObjectValidatePropertiesParameterSetBuilder {
        private String entityType;
        /**
         * Sets the EntityType
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DirectoryObjectValidatePropertiesParameterSetBuilder withEntityType(@Nullable final String val) {
            this.entityType = val;
            return this;
        }
        private String displayName;
        /**
         * Sets the DisplayName
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DirectoryObjectValidatePropertiesParameterSetBuilder withDisplayName(@Nullable final String val) {
            this.displayName = val;
            return this;
        }
        private String mailNickname;
        /**
         * Sets the MailNickname
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DirectoryObjectValidatePropertiesParameterSetBuilder withMailNickname(@Nullable final String val) {
            this.mailNickname = val;
            return this;
        }
        private java.util.UUID onBehalfOfUserId;
        /**
         * Sets the OnBehalfOfUserId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DirectoryObjectValidatePropertiesParameterSetBuilder withOnBehalfOfUserId(@Nullable final java.util.UUID val) {
            this.onBehalfOfUserId = val;
            return this;
        }
        private DirectoryObjectValidatePropertiesParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DirectoryObjectValidatePropertiesParameterSet build() {
            return new DirectoryObjectValidatePropertiesParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.entityType != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("entityType", entityType));
        }
        if(this.displayName != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("displayName", displayName));
        }
        if(this.mailNickname != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("mailNickname", mailNickname));
        }
        if(this.onBehalfOfUserId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("onBehalfOfUserId", onBehalfOfUserId));
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
