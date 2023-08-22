package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties, inherited properties and actions for an MDM mobile app configuration status for a device.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedDeviceMobileAppConfigurationDeviceStatus extends Entity implements Parsable {
    /**
     * The DateTime when device compliance grace period expires
     */
    private OffsetDateTime complianceGracePeriodExpirationDateTime;
    /**
     * Device name of the DevicePolicyStatus.
     */
    private String deviceDisplayName;
    /**
     * The device model that is being reported
     */
    private String deviceModel;
    /**
     * Last modified date time of the policy report.
     */
    private OffsetDateTime lastReportedDateTime;
    /**
     * The status property
     */
    private ComplianceStatus status;
    /**
     * The User Name that is being reported
     */
    private String userName;
    /**
     * UserPrincipalName.
     */
    private String userPrincipalName;
    /**
     * Instantiates a new managedDeviceMobileAppConfigurationDeviceStatus and sets the default values.
     */
    public ManagedDeviceMobileAppConfigurationDeviceStatus() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedDeviceMobileAppConfigurationDeviceStatus
     */
    @jakarta.annotation.Nonnull
    public static ManagedDeviceMobileAppConfigurationDeviceStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedDeviceMobileAppConfigurationDeviceStatus();
    }
    /**
     * Gets the complianceGracePeriodExpirationDateTime property value. The DateTime when device compliance grace period expires
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getComplianceGracePeriodExpirationDateTime() {
        return this.complianceGracePeriodExpirationDateTime;
    }
    /**
     * Gets the deviceDisplayName property value. Device name of the DevicePolicyStatus.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceDisplayName() {
        return this.deviceDisplayName;
    }
    /**
     * Gets the deviceModel property value. The device model that is being reported
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDeviceModel() {
        return this.deviceModel;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("complianceGracePeriodExpirationDateTime", (n) -> { this.setComplianceGracePeriodExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deviceDisplayName", (n) -> { this.setDeviceDisplayName(n.getStringValue()); });
        deserializerMap.put("deviceModel", (n) -> { this.setDeviceModel(n.getStringValue()); });
        deserializerMap.put("lastReportedDateTime", (n) -> { this.setLastReportedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(ComplianceStatus.class)); });
        deserializerMap.put("userName", (n) -> { this.setUserName(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastReportedDateTime property value. Last modified date time of the policy report.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastReportedDateTime() {
        return this.lastReportedDateTime;
    }
    /**
     * Gets the status property value. The status property
     * @return a complianceStatus
     */
    @jakarta.annotation.Nullable
    public ComplianceStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the userName property value. The User Name that is being reported
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserName() {
        return this.userName;
    }
    /**
     * Gets the userPrincipalName property value. UserPrincipalName.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("complianceGracePeriodExpirationDateTime", this.getComplianceGracePeriodExpirationDateTime());
        writer.writeStringValue("deviceDisplayName", this.getDeviceDisplayName());
        writer.writeStringValue("deviceModel", this.getDeviceModel());
        writer.writeOffsetDateTimeValue("lastReportedDateTime", this.getLastReportedDateTime());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("userName", this.getUserName());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the complianceGracePeriodExpirationDateTime property value. The DateTime when device compliance grace period expires
     * @param value Value to set for the complianceGracePeriodExpirationDateTime property.
     */
    public void setComplianceGracePeriodExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.complianceGracePeriodExpirationDateTime = value;
    }
    /**
     * Sets the deviceDisplayName property value. Device name of the DevicePolicyStatus.
     * @param value Value to set for the deviceDisplayName property.
     */
    public void setDeviceDisplayName(@jakarta.annotation.Nullable final String value) {
        this.deviceDisplayName = value;
    }
    /**
     * Sets the deviceModel property value. The device model that is being reported
     * @param value Value to set for the deviceModel property.
     */
    public void setDeviceModel(@jakarta.annotation.Nullable final String value) {
        this.deviceModel = value;
    }
    /**
     * Sets the lastReportedDateTime property value. Last modified date time of the policy report.
     * @param value Value to set for the lastReportedDateTime property.
     */
    public void setLastReportedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastReportedDateTime = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final ComplianceStatus value) {
        this.status = value;
    }
    /**
     * Sets the userName property value. The User Name that is being reported
     * @param value Value to set for the userName property.
     */
    public void setUserName(@jakarta.annotation.Nullable final String value) {
        this.userName = value;
    }
    /**
     * Sets the userPrincipalName property value. UserPrincipalName.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
