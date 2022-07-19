// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.DateTimeTimeZone;
import com.microsoft.graph.models.StaffAvailabilityItem;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Booking Business Get Staff Availability Parameter Set.
 */
public class BookingBusinessGetStaffAvailabilityParameterSet {
    /**
     * The staff Ids.
     * 
     */
    @SerializedName(value = "staffIds", alternate = {"StaffIds"})
    @Expose
	@Nullable
    public java.util.List<String> staffIds;

    /**
     * The start Date Time.
     * 
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public DateTimeTimeZone startDateTime;

    /**
     * The end Date Time.
     * 
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
	@Nullable
    public DateTimeTimeZone endDateTime;


    /**
     * Instiaciates a new BookingBusinessGetStaffAvailabilityParameterSet
     */
    public BookingBusinessGetStaffAvailabilityParameterSet() {}
    /**
     * Instiaciates a new BookingBusinessGetStaffAvailabilityParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected BookingBusinessGetStaffAvailabilityParameterSet(@Nonnull final BookingBusinessGetStaffAvailabilityParameterSetBuilder builder) {
        this.staffIds = builder.staffIds;
        this.startDateTime = builder.startDateTime;
        this.endDateTime = builder.endDateTime;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static BookingBusinessGetStaffAvailabilityParameterSetBuilder newBuilder() {
        return new BookingBusinessGetStaffAvailabilityParameterSetBuilder();
    }
    /**
     * Fluent builder for the BookingBusinessGetStaffAvailabilityParameterSet
     */
    public static final class BookingBusinessGetStaffAvailabilityParameterSetBuilder {
        /**
         * The staffIds parameter value
         */
        @Nullable
        protected java.util.List<String> staffIds;
        /**
         * Sets the StaffIds
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public BookingBusinessGetStaffAvailabilityParameterSetBuilder withStaffIds(@Nullable final java.util.List<String> val) {
            this.staffIds = val;
            return this;
        }
        /**
         * The startDateTime parameter value
         */
        @Nullable
        protected DateTimeTimeZone startDateTime;
        /**
         * Sets the StartDateTime
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public BookingBusinessGetStaffAvailabilityParameterSetBuilder withStartDateTime(@Nullable final DateTimeTimeZone val) {
            this.startDateTime = val;
            return this;
        }
        /**
         * The endDateTime parameter value
         */
        @Nullable
        protected DateTimeTimeZone endDateTime;
        /**
         * Sets the EndDateTime
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public BookingBusinessGetStaffAvailabilityParameterSetBuilder withEndDateTime(@Nullable final DateTimeTimeZone val) {
            this.endDateTime = val;
            return this;
        }
        /**
         * Instanciates a new BookingBusinessGetStaffAvailabilityParameterSetBuilder
         */
        @Nullable
        protected BookingBusinessGetStaffAvailabilityParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public BookingBusinessGetStaffAvailabilityParameterSet build() {
            return new BookingBusinessGetStaffAvailabilityParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.staffIds != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("staffIds", staffIds));
        }
        if(this.startDateTime != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("startDateTime", startDateTime));
        }
        if(this.endDateTime != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("endDateTime", endDateTime));
        }
        return result;
    }
}
