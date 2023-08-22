package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SoftwareUpdateStatusSummary extends Entity implements Parsable {
    /**
     * Number of compliant devices.
     */
    private Integer compliantDeviceCount;
    /**
     * Number of compliant users.
     */
    private Integer compliantUserCount;
    /**
     * Number of conflict devices.
     */
    private Integer conflictDeviceCount;
    /**
     * Number of conflict users.
     */
    private Integer conflictUserCount;
    /**
     * The name of the policy.
     */
    private String displayName;
    /**
     * Number of devices had error.
     */
    private Integer errorDeviceCount;
    /**
     * Number of users had error.
     */
    private Integer errorUserCount;
    /**
     * Number of non compliant devices.
     */
    private Integer nonCompliantDeviceCount;
    /**
     * Number of non compliant users.
     */
    private Integer nonCompliantUserCount;
    /**
     * Number of not applicable devices.
     */
    private Integer notApplicableDeviceCount;
    /**
     * Number of not applicable users.
     */
    private Integer notApplicableUserCount;
    /**
     * Number of remediated devices.
     */
    private Integer remediatedDeviceCount;
    /**
     * Number of remediated users.
     */
    private Integer remediatedUserCount;
    /**
     * Number of unknown devices.
     */
    private Integer unknownDeviceCount;
    /**
     * Number of unknown users.
     */
    private Integer unknownUserCount;
    /**
     * Instantiates a new softwareUpdateStatusSummary and sets the default values.
     */
    public SoftwareUpdateStatusSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a softwareUpdateStatusSummary
     */
    @jakarta.annotation.Nonnull
    public static SoftwareUpdateStatusSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SoftwareUpdateStatusSummary();
    }
    /**
     * Gets the compliantDeviceCount property value. Number of compliant devices.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getCompliantDeviceCount() {
        return this.compliantDeviceCount;
    }
    /**
     * Gets the compliantUserCount property value. Number of compliant users.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getCompliantUserCount() {
        return this.compliantUserCount;
    }
    /**
     * Gets the conflictDeviceCount property value. Number of conflict devices.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getConflictDeviceCount() {
        return this.conflictDeviceCount;
    }
    /**
     * Gets the conflictUserCount property value. Number of conflict users.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getConflictUserCount() {
        return this.conflictUserCount;
    }
    /**
     * Gets the displayName property value. The name of the policy.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the errorDeviceCount property value. Number of devices had error.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getErrorDeviceCount() {
        return this.errorDeviceCount;
    }
    /**
     * Gets the errorUserCount property value. Number of users had error.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getErrorUserCount() {
        return this.errorUserCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("compliantDeviceCount", (n) -> { this.setCompliantDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("compliantUserCount", (n) -> { this.setCompliantUserCount(n.getIntegerValue()); });
        deserializerMap.put("conflictDeviceCount", (n) -> { this.setConflictDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("conflictUserCount", (n) -> { this.setConflictUserCount(n.getIntegerValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("errorDeviceCount", (n) -> { this.setErrorDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("errorUserCount", (n) -> { this.setErrorUserCount(n.getIntegerValue()); });
        deserializerMap.put("nonCompliantDeviceCount", (n) -> { this.setNonCompliantDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("nonCompliantUserCount", (n) -> { this.setNonCompliantUserCount(n.getIntegerValue()); });
        deserializerMap.put("notApplicableDeviceCount", (n) -> { this.setNotApplicableDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("notApplicableUserCount", (n) -> { this.setNotApplicableUserCount(n.getIntegerValue()); });
        deserializerMap.put("remediatedDeviceCount", (n) -> { this.setRemediatedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("remediatedUserCount", (n) -> { this.setRemediatedUserCount(n.getIntegerValue()); });
        deserializerMap.put("unknownDeviceCount", (n) -> { this.setUnknownDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("unknownUserCount", (n) -> { this.setUnknownUserCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the nonCompliantDeviceCount property value. Number of non compliant devices.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNonCompliantDeviceCount() {
        return this.nonCompliantDeviceCount;
    }
    /**
     * Gets the nonCompliantUserCount property value. Number of non compliant users.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNonCompliantUserCount() {
        return this.nonCompliantUserCount;
    }
    /**
     * Gets the notApplicableDeviceCount property value. Number of not applicable devices.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNotApplicableDeviceCount() {
        return this.notApplicableDeviceCount;
    }
    /**
     * Gets the notApplicableUserCount property value. Number of not applicable users.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNotApplicableUserCount() {
        return this.notApplicableUserCount;
    }
    /**
     * Gets the remediatedDeviceCount property value. Number of remediated devices.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getRemediatedDeviceCount() {
        return this.remediatedDeviceCount;
    }
    /**
     * Gets the remediatedUserCount property value. Number of remediated users.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getRemediatedUserCount() {
        return this.remediatedUserCount;
    }
    /**
     * Gets the unknownDeviceCount property value. Number of unknown devices.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getUnknownDeviceCount() {
        return this.unknownDeviceCount;
    }
    /**
     * Gets the unknownUserCount property value. Number of unknown users.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getUnknownUserCount() {
        return this.unknownUserCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("compliantDeviceCount", this.getCompliantDeviceCount());
        writer.writeIntegerValue("compliantUserCount", this.getCompliantUserCount());
        writer.writeIntegerValue("conflictDeviceCount", this.getConflictDeviceCount());
        writer.writeIntegerValue("conflictUserCount", this.getConflictUserCount());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("errorDeviceCount", this.getErrorDeviceCount());
        writer.writeIntegerValue("errorUserCount", this.getErrorUserCount());
        writer.writeIntegerValue("nonCompliantDeviceCount", this.getNonCompliantDeviceCount());
        writer.writeIntegerValue("nonCompliantUserCount", this.getNonCompliantUserCount());
        writer.writeIntegerValue("notApplicableDeviceCount", this.getNotApplicableDeviceCount());
        writer.writeIntegerValue("notApplicableUserCount", this.getNotApplicableUserCount());
        writer.writeIntegerValue("remediatedDeviceCount", this.getRemediatedDeviceCount());
        writer.writeIntegerValue("remediatedUserCount", this.getRemediatedUserCount());
        writer.writeIntegerValue("unknownDeviceCount", this.getUnknownDeviceCount());
        writer.writeIntegerValue("unknownUserCount", this.getUnknownUserCount());
    }
    /**
     * Sets the compliantDeviceCount property value. Number of compliant devices.
     * @param value Value to set for the compliantDeviceCount property.
     */
    public void setCompliantDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.compliantDeviceCount = value;
    }
    /**
     * Sets the compliantUserCount property value. Number of compliant users.
     * @param value Value to set for the compliantUserCount property.
     */
    public void setCompliantUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.compliantUserCount = value;
    }
    /**
     * Sets the conflictDeviceCount property value. Number of conflict devices.
     * @param value Value to set for the conflictDeviceCount property.
     */
    public void setConflictDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.conflictDeviceCount = value;
    }
    /**
     * Sets the conflictUserCount property value. Number of conflict users.
     * @param value Value to set for the conflictUserCount property.
     */
    public void setConflictUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.conflictUserCount = value;
    }
    /**
     * Sets the displayName property value. The name of the policy.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the errorDeviceCount property value. Number of devices had error.
     * @param value Value to set for the errorDeviceCount property.
     */
    public void setErrorDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.errorDeviceCount = value;
    }
    /**
     * Sets the errorUserCount property value. Number of users had error.
     * @param value Value to set for the errorUserCount property.
     */
    public void setErrorUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.errorUserCount = value;
    }
    /**
     * Sets the nonCompliantDeviceCount property value. Number of non compliant devices.
     * @param value Value to set for the nonCompliantDeviceCount property.
     */
    public void setNonCompliantDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.nonCompliantDeviceCount = value;
    }
    /**
     * Sets the nonCompliantUserCount property value. Number of non compliant users.
     * @param value Value to set for the nonCompliantUserCount property.
     */
    public void setNonCompliantUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.nonCompliantUserCount = value;
    }
    /**
     * Sets the notApplicableDeviceCount property value. Number of not applicable devices.
     * @param value Value to set for the notApplicableDeviceCount property.
     */
    public void setNotApplicableDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.notApplicableDeviceCount = value;
    }
    /**
     * Sets the notApplicableUserCount property value. Number of not applicable users.
     * @param value Value to set for the notApplicableUserCount property.
     */
    public void setNotApplicableUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.notApplicableUserCount = value;
    }
    /**
     * Sets the remediatedDeviceCount property value. Number of remediated devices.
     * @param value Value to set for the remediatedDeviceCount property.
     */
    public void setRemediatedDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.remediatedDeviceCount = value;
    }
    /**
     * Sets the remediatedUserCount property value. Number of remediated users.
     * @param value Value to set for the remediatedUserCount property.
     */
    public void setRemediatedUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.remediatedUserCount = value;
    }
    /**
     * Sets the unknownDeviceCount property value. Number of unknown devices.
     * @param value Value to set for the unknownDeviceCount property.
     */
    public void setUnknownDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.unknownDeviceCount = value;
    }
    /**
     * Sets the unknownUserCount property value. Number of unknown users.
     * @param value Value to set for the unknownUserCount property.
     */
    public void setUnknownUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.unknownUserCount = value;
    }
}
