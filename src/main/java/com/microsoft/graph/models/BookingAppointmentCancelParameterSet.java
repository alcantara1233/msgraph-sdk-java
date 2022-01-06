// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Booking Appointment Cancel Parameter Set.
 */
public class BookingAppointmentCancelParameterSet {
    /**
     * The cancellation Message.
     * 
     */
    @SerializedName(value = "cancellationMessage", alternate = {"CancellationMessage"})
    @Expose
	@Nullable
    public String cancellationMessage;


    /**
     * Instiaciates a new BookingAppointmentCancelParameterSet
     */
    public BookingAppointmentCancelParameterSet() {}
    /**
     * Instiaciates a new BookingAppointmentCancelParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected BookingAppointmentCancelParameterSet(@Nonnull final BookingAppointmentCancelParameterSetBuilder builder) {
        this.cancellationMessage = builder.cancellationMessage;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static BookingAppointmentCancelParameterSetBuilder newBuilder() {
        return new BookingAppointmentCancelParameterSetBuilder();
    }
    /**
     * Fluent builder for the BookingAppointmentCancelParameterSet
     */
    public static final class BookingAppointmentCancelParameterSetBuilder {
        /**
         * The cancellationMessage parameter value
         */
        @Nullable
        protected String cancellationMessage;
        /**
         * Sets the CancellationMessage
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public BookingAppointmentCancelParameterSetBuilder withCancellationMessage(@Nullable final String val) {
            this.cancellationMessage = val;
            return this;
        }
        /**
         * Instanciates a new BookingAppointmentCancelParameterSetBuilder
         */
        @Nullable
        protected BookingAppointmentCancelParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public BookingAppointmentCancelParameterSet build() {
            return new BookingAppointmentCancelParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.cancellationMessage != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("cancellationMessage", cancellationMessage));
        }
        return result;
    }
}