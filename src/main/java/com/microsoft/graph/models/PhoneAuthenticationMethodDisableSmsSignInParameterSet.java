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
 * The class for the Phone Authentication Method Disable Sms Sign In Parameter Set.
 */
public class PhoneAuthenticationMethodDisableSmsSignInParameterSet {

    /**
     * Instiaciates a new PhoneAuthenticationMethodDisableSmsSignInParameterSet
     */
    public PhoneAuthenticationMethodDisableSmsSignInParameterSet() {}
    /**
     * Instiaciates a new PhoneAuthenticationMethodDisableSmsSignInParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected PhoneAuthenticationMethodDisableSmsSignInParameterSet(@Nonnull final PhoneAuthenticationMethodDisableSmsSignInParameterSetBuilder builder) {
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static PhoneAuthenticationMethodDisableSmsSignInParameterSetBuilder newBuilder() {
        return new PhoneAuthenticationMethodDisableSmsSignInParameterSetBuilder();
    }
    /**
     * Fluent builder for the PhoneAuthenticationMethodDisableSmsSignInParameterSet
     */
    public static final class PhoneAuthenticationMethodDisableSmsSignInParameterSetBuilder {
        /**
         * Instanciates a new PhoneAuthenticationMethodDisableSmsSignInParameterSetBuilder
         */
        @Nullable
        protected PhoneAuthenticationMethodDisableSmsSignInParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public PhoneAuthenticationMethodDisableSmsSignInParameterSet build() {
            return new PhoneAuthenticationMethodDisableSmsSignInParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        return result;
    }
}
