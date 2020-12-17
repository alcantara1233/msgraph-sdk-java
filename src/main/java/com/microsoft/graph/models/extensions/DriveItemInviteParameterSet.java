// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.DriveRecipient;
import com.microsoft.graph.models.extensions.Permission;
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
 * The class for the Drive Item Invite Parameter Set.
 */
public class DriveItemInviteParameterSet {
    /**
     * The require Sign In.
     * 
     */
    @SerializedName(value = "requireSignIn", alternate = {"RequireSignIn"})
    @Expose
	@Nullable
    public Boolean requireSignIn;

    /**
     * The roles.
     * 
     */
    @SerializedName(value = "roles", alternate = {"Roles"})
    @Expose
	@Nullable
    public java.util.List<String> roles;

    /**
     * The send Invitation.
     * 
     */
    @SerializedName(value = "sendInvitation", alternate = {"SendInvitation"})
    @Expose
	@Nullable
    public Boolean sendInvitation;

    /**
     * The message.
     * 
     */
    @SerializedName(value = "message", alternate = {"Message"})
    @Expose
	@Nullable
    public String message;

    /**
     * The recipients.
     * 
     */
    @SerializedName(value = "recipients", alternate = {"Recipients"})
    @Expose
	@Nullable
    public java.util.List<DriveRecipient> recipients;

    /**
     * The expiration Date Time.
     * 
     */
    @SerializedName(value = "expirationDateTime", alternate = {"ExpirationDateTime"})
    @Expose
	@Nullable
    public String expirationDateTime;

    /**
     * The password.
     * 
     */
    @SerializedName(value = "password", alternate = {"Password"})
    @Expose
	@Nullable
    public String password;


    /**
     * Instiaciates a new DriveItemInviteParameterSet
     */
    public DriveItemInviteParameterSet() {}
    private DriveItemInviteParameterSet(@Nonnull final DriveItemInviteParameterSetBuilder builder) {
        this.requireSignIn = builder.requireSignIn;
        this.roles = builder.roles;
        this.sendInvitation = builder.sendInvitation;
        this.message = builder.message;
        this.recipients = builder.recipients;
        this.expirationDateTime = builder.expirationDateTime;
        this.password = builder.password;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DriveItemInviteParameterSetBuilder newBuilder() {
        return new DriveItemInviteParameterSetBuilder();
    }
    /**
     * Fluent builder for the DriveItemInviteParameterSet
     */
    public static final class DriveItemInviteParameterSetBuilder {
        private Boolean requireSignIn;
        /**
         * Sets the RequireSignIn
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemInviteParameterSetBuilder withRequireSignIn(@Nullable final Boolean val) {
            this.requireSignIn = val;
            return this;
        }
        private java.util.List<String> roles;
        /**
         * Sets the Roles
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemInviteParameterSetBuilder withRoles(@Nullable final java.util.List<String> val) {
            this.roles = val;
            return this;
        }
        private Boolean sendInvitation;
        /**
         * Sets the SendInvitation
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemInviteParameterSetBuilder withSendInvitation(@Nullable final Boolean val) {
            this.sendInvitation = val;
            return this;
        }
        private String message;
        /**
         * Sets the Message
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemInviteParameterSetBuilder withMessage(@Nullable final String val) {
            this.message = val;
            return this;
        }
        private java.util.List<DriveRecipient> recipients;
        /**
         * Sets the Recipients
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemInviteParameterSetBuilder withRecipients(@Nullable final java.util.List<DriveRecipient> val) {
            this.recipients = val;
            return this;
        }
        private String expirationDateTime;
        /**
         * Sets the ExpirationDateTime
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemInviteParameterSetBuilder withExpirationDateTime(@Nullable final String val) {
            this.expirationDateTime = val;
            return this;
        }
        private String password;
        /**
         * Sets the Password
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemInviteParameterSetBuilder withPassword(@Nullable final String val) {
            this.password = val;
            return this;
        }
        private DriveItemInviteParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DriveItemInviteParameterSet build() {
            return new DriveItemInviteParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.requireSignIn != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("requireSignIn", requireSignIn));
        }
        if(this.roles != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("roles", roles));
        }
        if(this.sendInvitation != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("sendInvitation", sendInvitation));
        }
        if(this.message != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("message", message));
        }
        if(this.recipients != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("recipients", recipients));
        }
        if(this.expirationDateTime != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("expirationDateTime", expirationDateTime));
        }
        if(this.password != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("password", password));
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
