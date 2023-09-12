package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AdministrativeUnit extends DirectoryObject implements Parsable {
    /**
     * An optional description for the administrative unit. Supports $filter (eq, ne, in, startsWith), $search.
     */
    private String description;
    /**
     * Display name for the administrative unit. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderby.
     */
    private String displayName;
    /**
     * The collection of open extensions defined for this administrative unit. Nullable.
     */
    private java.util.List<Extension> extensions;
    /**
     * Users and groups that are members of this administrative unit. Supports $expand.
     */
    private java.util.List<DirectoryObject> members;
    /**
     * Scoped-role members of this administrative unit.
     */
    private java.util.List<ScopedRoleMembership> scopedRoleMembers;
    /**
     * Controls whether the administrative unit and its members are hidden or public. Can be set to HiddenMembership. If not set (value is null), the default behavior is public. When set to HiddenMembership, only members of the administrative unit can list other members of the administrative unit.
     */
    private String visibility;
    /**
     * Instantiates a new administrativeUnit and sets the default values.
     */
    public AdministrativeUnit() {
        super();
        this.setOdataType("#microsoft.graph.administrativeUnit");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a administrativeUnit
     */
    @jakarta.annotation.Nonnull
    public static AdministrativeUnit createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AdministrativeUnit();
    }
    /**
     * Gets the description property value. An optional description for the administrative unit. Supports $filter (eq, ne, in, startsWith), $search.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Display name for the administrative unit. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderby.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the extensions property value. The collection of open extensions defined for this administrative unit. Nullable.
     * @return a extension
     */
    @jakarta.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this.extensions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("extensions", (n) -> { this.setExtensions(n.getCollectionOfObjectValues(Extension::createFromDiscriminatorValue)); });
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("scopedRoleMembers", (n) -> { this.setScopedRoleMembers(n.getCollectionOfObjectValues(ScopedRoleMembership::createFromDiscriminatorValue)); });
        deserializerMap.put("visibility", (n) -> { this.setVisibility(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the members property value. Users and groups that are members of this administrative unit. Supports $expand.
     * @return a directoryObject
     */
    @jakarta.annotation.Nullable
    public java.util.List<DirectoryObject> getMembers() {
        return this.members;
    }
    /**
     * Gets the scopedRoleMembers property value. Scoped-role members of this administrative unit.
     * @return a scopedRoleMembership
     */
    @jakarta.annotation.Nullable
    public java.util.List<ScopedRoleMembership> getScopedRoleMembers() {
        return this.scopedRoleMembers;
    }
    /**
     * Gets the visibility property value. Controls whether the administrative unit and its members are hidden or public. Can be set to HiddenMembership. If not set (value is null), the default behavior is public. When set to HiddenMembership, only members of the administrative unit can list other members of the administrative unit.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getVisibility() {
        return this.visibility;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("extensions", this.getExtensions());
        writer.writeCollectionOfObjectValues("members", this.getMembers());
        writer.writeCollectionOfObjectValues("scopedRoleMembers", this.getScopedRoleMembers());
        writer.writeStringValue("visibility", this.getVisibility());
    }
    /**
     * Sets the description property value. An optional description for the administrative unit. Supports $filter (eq, ne, in, startsWith), $search.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Display name for the administrative unit. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderby.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for this administrative unit. Nullable.
     * @param value Value to set for the extensions property.
     */
    public void setExtensions(@jakarta.annotation.Nullable final java.util.List<Extension> value) {
        this.extensions = value;
    }
    /**
     * Sets the members property value. Users and groups that are members of this administrative unit. Supports $expand.
     * @param value Value to set for the members property.
     */
    public void setMembers(@jakarta.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this.members = value;
    }
    /**
     * Sets the scopedRoleMembers property value. Scoped-role members of this administrative unit.
     * @param value Value to set for the scopedRoleMembers property.
     */
    public void setScopedRoleMembers(@jakarta.annotation.Nullable final java.util.List<ScopedRoleMembership> value) {
        this.scopedRoleMembers = value;
    }
    /**
     * Sets the visibility property value. Controls whether the administrative unit and its members are hidden or public. Can be set to HiddenMembership. If not set (value is null), the default behavior is public. When set to HiddenMembership, only members of the administrative unit can list other members of the administrative unit.
     * @param value Value to set for the visibility property.
     */
    public void setVisibility(@jakarta.annotation.Nullable final String value) {
        this.visibility = value;
    }
}
