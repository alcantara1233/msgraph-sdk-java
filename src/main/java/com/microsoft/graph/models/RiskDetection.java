// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.ActivityType;
import com.microsoft.graph.models.RiskDetectionTimingType;
import com.microsoft.graph.models.SignInLocation;
import com.microsoft.graph.models.RiskDetail;
import com.microsoft.graph.models.RiskLevel;
import com.microsoft.graph.models.RiskState;
import com.microsoft.graph.models.TokenIssuerType;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Risk Detection.
 */
public class RiskDetection extends Entity implements IJsonBackedObject {


    /**
     * The Activity.
     * Indicates the activity type the detected risk is linked to. Possible values are: signin, user, unknownFutureValue.
     */
    @SerializedName(value = "activity", alternate = {"Activity"})
    @Expose
	@Nullable
    public ActivityType activity;

    /**
     * The Activity Date Time.
     * Date and time that the risky activity occurred. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is look like this: 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "activityDateTime", alternate = {"ActivityDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime activityDateTime;

    /**
     * The Additional Info.
     * Additional information associated with the risk detection in JSON format. For example, '[{/'Key/':/'userAgent/',/'Value/':/'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36/'}]'. Possible keys in the additionalInfo JSON string are: userAgent, alertUrl, relatedEventTimeInUtc, relatedUserAgent, deviceInformation, relatedLocation, requestId, correlationId, lastActivityTimeInUtc, malwareName, clientLocation, clientIp, riskReasons. For more information about riskReasons and possible values, see riskReasons values.
     */
    @SerializedName(value = "additionalInfo", alternate = {"AdditionalInfo"})
    @Expose
	@Nullable
    public String additionalInfo;

    /**
     * The Correlation Id.
     * Correlation ID of the sign-in associated with the risk detection. This property is null if the risk detection is not associated with a sign-in.
     */
    @SerializedName(value = "correlationId", alternate = {"CorrelationId"})
    @Expose
	@Nullable
    public String correlationId;

    /**
     * The Detected Date Time.
     * Date and time that the risk was detected. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 looks like this: 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "detectedDateTime", alternate = {"DetectedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime detectedDateTime;

    /**
     * The Detection Timing Type.
     * Timing of the detected risk (real-time/offline). Possible values are: notDefined, realtime, nearRealtime, offline, unknownFutureValue.
     */
    @SerializedName(value = "detectionTimingType", alternate = {"DetectionTimingType"})
    @Expose
	@Nullable
    public RiskDetectionTimingType detectionTimingType;

    /**
     * The Ip Address.
     * Provides the IP address of the client from where the risk occurred.
     */
    @SerializedName(value = "ipAddress", alternate = {"IpAddress"})
    @Expose
	@Nullable
    public String ipAddress;

    /**
     * The Last Updated Date Time.
     * Date and time that the risk detection was last updated. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is look like this: 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "lastUpdatedDateTime", alternate = {"LastUpdatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastUpdatedDateTime;

    /**
     * The Location.
     * Location of the sign-in.
     */
    @SerializedName(value = "location", alternate = {"Location"})
    @Expose
	@Nullable
    public SignInLocation location;

    /**
     * The Request Id.
     * Request ID of the sign-in associated with the risk detection. This property is null if the risk detection is not associated with a sign-in.
     */
    @SerializedName(value = "requestId", alternate = {"RequestId"})
    @Expose
	@Nullable
    public String requestId;

    /**
     * The Risk Detail.
     * Details of the detected risk. The possible values are: none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, hidden, adminConfirmedUserCompromised, unknownFutureValue, m365DAdminDismissedDetection. Note that you must use the Prefer: include - unknown -enum-members request header to get the following value(s) in this evolvable enum: m365DAdminDismissedDetection.
     */
    @SerializedName(value = "riskDetail", alternate = {"RiskDetail"})
    @Expose
	@Nullable
    public RiskDetail riskDetail;

    /**
     * The Risk Event Type.
     * The type of risk event detected. The possible values are unlikelyTravel, anonymizedIPAddress, maliciousIPAddress, unfamiliarFeatures, malwareInfectedIPAddress, suspiciousIPAddress, leakedCredentials, investigationsThreatIntelligence, generic,adminConfirmedUserCompromised, passwordSpray, impossibleTravel, newCountry, anomalousToken, tokenIssuerAnomaly,suspiciousBrowser, riskyIPAddress, mcasSuspiciousInboxManipulationRules, suspiciousInboxForwarding, and anomalousUserActivity. If the risk detection is a premium detection, will show generic. For more information about each value, see riskEventType values.
     */
    @SerializedName(value = "riskEventType", alternate = {"RiskEventType"})
    @Expose
	@Nullable
    public String riskEventType;

    /**
     * The Risk Level.
     * Level of the detected risk. Possible values are: low, medium, high, hidden, none, unknownFutureValue.
     */
    @SerializedName(value = "riskLevel", alternate = {"RiskLevel"})
    @Expose
	@Nullable
    public RiskLevel riskLevel;

    /**
     * The Risk State.
     * The state of a detected risky user or sign-in. Possible values are: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, unknownFutureValue.
     */
    @SerializedName(value = "riskState", alternate = {"RiskState"})
    @Expose
	@Nullable
    public RiskState riskState;

    /**
     * The Source.
     * Source of the risk detection. For example, activeDirectory.
     */
    @SerializedName(value = "source", alternate = {"Source"})
    @Expose
	@Nullable
    public String source;

    /**
     * The Token Issuer Type.
     * Indicates the type of token issuer for the detected sign-in risk. Possible values are: AzureAD, ADFederationServices, UnknownFutureValue.
     */
    @SerializedName(value = "tokenIssuerType", alternate = {"TokenIssuerType"})
    @Expose
	@Nullable
    public TokenIssuerType tokenIssuerType;

    /**
     * The User Display Name.
     * The user principal name (UPN) of the user.
     */
    @SerializedName(value = "userDisplayName", alternate = {"UserDisplayName"})
    @Expose
	@Nullable
    public String userDisplayName;

    /**
     * The User Id.
     * Unique ID of the user.
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
	@Nullable
    public String userId;

    /**
     * The User Principal Name.
     * The user principal name (UPN) of the user.
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
	@Nullable
    public String userPrincipalName;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
