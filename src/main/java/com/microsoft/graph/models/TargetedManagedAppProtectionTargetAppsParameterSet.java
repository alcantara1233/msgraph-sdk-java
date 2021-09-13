// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.ManagedMobileApp;
import com.microsoft.graph.models.TargetedManagedAppGroupType;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Targeted Managed App Protection Target Apps Parameter Set.
 */
public class TargetedManagedAppProtectionTargetAppsParameterSet {
    /**
     * The apps.
     * 
     */
    @SerializedName(value = "apps", alternate = {"Apps"})
    @Expose
	@Nullable
    public java.util.List<ManagedMobileApp> apps;

    /**
     * The app Group Type.
     * 
     */
    @SerializedName(value = "appGroupType", alternate = {"AppGroupType"})
    @Expose
	@Nullable
    public TargetedManagedAppGroupType appGroupType;


    /**
     * Instiaciates a new TargetedManagedAppProtectionTargetAppsParameterSet
     */
    public TargetedManagedAppProtectionTargetAppsParameterSet() {}
    /**
     * Instiaciates a new TargetedManagedAppProtectionTargetAppsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected TargetedManagedAppProtectionTargetAppsParameterSet(@Nonnull final TargetedManagedAppProtectionTargetAppsParameterSetBuilder builder) {
        this.apps = builder.apps;
        this.appGroupType = builder.appGroupType;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static TargetedManagedAppProtectionTargetAppsParameterSetBuilder newBuilder() {
        return new TargetedManagedAppProtectionTargetAppsParameterSetBuilder();
    }
    /**
     * Fluent builder for the TargetedManagedAppProtectionTargetAppsParameterSet
     */
    public static final class TargetedManagedAppProtectionTargetAppsParameterSetBuilder {
        /**
         * The apps parameter value
         */
        @Nullable
        protected java.util.List<ManagedMobileApp> apps;
        /**
         * Sets the Apps
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TargetedManagedAppProtectionTargetAppsParameterSetBuilder withApps(@Nullable final java.util.List<ManagedMobileApp> val) {
            this.apps = val;
            return this;
        }
        /**
         * The appGroupType parameter value
         */
        @Nullable
        protected TargetedManagedAppGroupType appGroupType;
        /**
         * Sets the AppGroupType
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TargetedManagedAppProtectionTargetAppsParameterSetBuilder withAppGroupType(@Nullable final TargetedManagedAppGroupType val) {
            this.appGroupType = val;
            return this;
        }
        /**
         * Instanciates a new TargetedManagedAppProtectionTargetAppsParameterSetBuilder
         */
        @Nullable
        protected TargetedManagedAppProtectionTargetAppsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public TargetedManagedAppProtectionTargetAppsParameterSet build() {
            return new TargetedManagedAppProtectionTargetAppsParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.apps != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("apps", apps));
        }
        if(this.appGroupType != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("appGroupType", appGroupType));
        }
        return result;
    }
}