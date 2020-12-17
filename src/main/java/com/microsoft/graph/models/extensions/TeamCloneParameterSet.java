// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.generated.TeamVisibilityType;
import com.microsoft.graph.models.generated.ClonableTeamParts;
import java.util.EnumSet;
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
 * The class for the Team Clone Parameter Set.
 */
public class TeamCloneParameterSet {
    /**
     * The display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The mail Nickname.
     * 
     */
    @SerializedName(value = "mailNickname", alternate = {"MailNickname"})
    @Expose
	@Nullable
    public String mailNickname;

    /**
     * The classification.
     * 
     */
    @SerializedName(value = "classification", alternate = {"Classification"})
    @Expose
	@Nullable
    public String classification;

    /**
     * The visibility.
     * 
     */
    @SerializedName(value = "visibility", alternate = {"Visibility"})
    @Expose
	@Nullable
    public TeamVisibilityType visibility;

    /**
     * The parts To Clone.
     * 
     */
    @SerializedName(value = "partsToClone", alternate = {"PartsToClone"})
    @Expose
	@Nullable
    public EnumSet<ClonableTeamParts> partsToClone;


    /**
     * Instiaciates a new TeamCloneParameterSet
     */
    public TeamCloneParameterSet() {}
    private TeamCloneParameterSet(@Nonnull final TeamCloneParameterSetBuilder builder) {
        this.displayName = builder.displayName;
        this.description = builder.description;
        this.mailNickname = builder.mailNickname;
        this.classification = builder.classification;
        this.visibility = builder.visibility;
        this.partsToClone = builder.partsToClone;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static TeamCloneParameterSetBuilder newBuilder() {
        return new TeamCloneParameterSetBuilder();
    }
    /**
     * Fluent builder for the TeamCloneParameterSet
     */
    public static final class TeamCloneParameterSetBuilder {
        private String displayName;
        /**
         * Sets the DisplayName
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TeamCloneParameterSetBuilder withDisplayName(@Nullable final String val) {
            this.displayName = val;
            return this;
        }
        private String description;
        /**
         * Sets the Description
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TeamCloneParameterSetBuilder withDescription(@Nullable final String val) {
            this.description = val;
            return this;
        }
        private String mailNickname;
        /**
         * Sets the MailNickname
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TeamCloneParameterSetBuilder withMailNickname(@Nullable final String val) {
            this.mailNickname = val;
            return this;
        }
        private String classification;
        /**
         * Sets the Classification
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TeamCloneParameterSetBuilder withClassification(@Nullable final String val) {
            this.classification = val;
            return this;
        }
        private TeamVisibilityType visibility;
        /**
         * Sets the Visibility
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TeamCloneParameterSetBuilder withVisibility(@Nullable final TeamVisibilityType val) {
            this.visibility = val;
            return this;
        }
        private EnumSet<ClonableTeamParts> partsToClone;
        /**
         * Sets the PartsToClone
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TeamCloneParameterSetBuilder withPartsToClone(@Nullable final EnumSet<ClonableTeamParts> val) {
            this.partsToClone = val;
            return this;
        }
        private TeamCloneParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public TeamCloneParameterSet build() {
            return new TeamCloneParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.displayName != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("displayName", displayName));
        }
        if(this.description != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("description", description));
        }
        if(this.mailNickname != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("mailNickname", mailNickname));
        }
        if(this.classification != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("classification", classification));
        }
        if(this.visibility != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("visibility", visibility));
        }
        if(this.partsToClone != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("partsToClone", partsToClone));
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
