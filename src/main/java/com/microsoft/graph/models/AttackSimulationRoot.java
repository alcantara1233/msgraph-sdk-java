// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.EndUserNotificationCollectionPage;
import com.microsoft.graph.requests.LandingPageCollectionPage;
import com.microsoft.graph.requests.LoginPageCollectionPage;
import com.microsoft.graph.requests.AttackSimulationOperationCollectionPage;
import com.microsoft.graph.requests.PayloadCollectionPage;
import com.microsoft.graph.requests.SimulationAutomationCollectionPage;
import com.microsoft.graph.requests.SimulationCollectionPage;
import com.microsoft.graph.requests.TrainingCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Attack Simulation Root.
 */
public class AttackSimulationRoot extends Entity implements IJsonBackedObject {


    /**
     * The End User Notifications.
     * 
     */
    @SerializedName(value = "endUserNotifications", alternate = {"EndUserNotifications"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.EndUserNotificationCollectionPage endUserNotifications;

    /**
     * The Landing Pages.
     * 
     */
    @SerializedName(value = "landingPages", alternate = {"LandingPages"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.LandingPageCollectionPage landingPages;

    /**
     * The Login Pages.
     * 
     */
    @SerializedName(value = "loginPages", alternate = {"LoginPages"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.LoginPageCollectionPage loginPages;

    /**
     * The Operations.
     * 
     */
    @SerializedName(value = "operations", alternate = {"Operations"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.AttackSimulationOperationCollectionPage operations;

    /**
     * The Payloads.
     * 
     */
    @SerializedName(value = "payloads", alternate = {"Payloads"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.PayloadCollectionPage payloads;

    /**
     * The Simulation Automations.
     * Represents simulation automation created to run on a tenant.
     */
    @SerializedName(value = "simulationAutomations", alternate = {"SimulationAutomations"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.SimulationAutomationCollectionPage simulationAutomations;

    /**
     * The Simulations.
     * Represents an attack simulation training campaign in a tenant.
     */
    @SerializedName(value = "simulations", alternate = {"Simulations"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.SimulationCollectionPage simulations;

    /**
     * The Trainings.
     * 
     */
    @SerializedName(value = "trainings", alternate = {"Trainings"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.TrainingCollectionPage trainings;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("endUserNotifications")) {
            endUserNotifications = serializer.deserializeObject(json.get("endUserNotifications"), com.microsoft.graph.requests.EndUserNotificationCollectionPage.class);
        }

        if (json.has("landingPages")) {
            landingPages = serializer.deserializeObject(json.get("landingPages"), com.microsoft.graph.requests.LandingPageCollectionPage.class);
        }

        if (json.has("loginPages")) {
            loginPages = serializer.deserializeObject(json.get("loginPages"), com.microsoft.graph.requests.LoginPageCollectionPage.class);
        }

        if (json.has("operations")) {
            operations = serializer.deserializeObject(json.get("operations"), com.microsoft.graph.requests.AttackSimulationOperationCollectionPage.class);
        }

        if (json.has("payloads")) {
            payloads = serializer.deserializeObject(json.get("payloads"), com.microsoft.graph.requests.PayloadCollectionPage.class);
        }

        if (json.has("simulationAutomations")) {
            simulationAutomations = serializer.deserializeObject(json.get("simulationAutomations"), com.microsoft.graph.requests.SimulationAutomationCollectionPage.class);
        }

        if (json.has("simulations")) {
            simulations = serializer.deserializeObject(json.get("simulations"), com.microsoft.graph.requests.SimulationCollectionPage.class);
        }

        if (json.has("trainings")) {
            trainings = serializer.deserializeObject(json.get("trainings"), com.microsoft.graph.requests.TrainingCollectionPage.class);
        }
    }
}
