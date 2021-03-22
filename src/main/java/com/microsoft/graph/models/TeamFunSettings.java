// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.GiphyRatingType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Team Fun Settings.
 */
public class TeamFunSettings implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Allow Custom Memes.
     * If set to true, enables users to include custom memes.
     */
    @SerializedName(value = "allowCustomMemes", alternate = {"AllowCustomMemes"})
    @Expose
	@Nullable
    public Boolean allowCustomMemes;

    /**
     * The Allow Giphy.
     * If set to true, enables Giphy use.
     */
    @SerializedName(value = "allowGiphy", alternate = {"AllowGiphy"})
    @Expose
	@Nullable
    public Boolean allowGiphy;

    /**
     * The Allow Stickers And Memes.
     * If set to true, enables users to include stickers and memes.
     */
    @SerializedName(value = "allowStickersAndMemes", alternate = {"AllowStickersAndMemes"})
    @Expose
	@Nullable
    public Boolean allowStickersAndMemes;

    /**
     * The Giphy Content Rating.
     * Giphy content rating. Possible values are: moderate, strict.
     */
    @SerializedName(value = "giphyContentRating", alternate = {"GiphyContentRating"})
    @Expose
	@Nullable
    public GiphyRatingType giphyContentRating;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}