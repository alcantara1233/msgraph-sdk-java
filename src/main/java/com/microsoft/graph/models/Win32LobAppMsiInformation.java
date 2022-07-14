package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains MSI app properties for a Win32 App. */
public class Win32LobAppMsiInformation implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Indicates the package type of an MSI Win32LobApp. */
    private Win32LobAppMsiPackageType _packageType;
    /** The MSI product code. */
    private String _productCode;
    /** The MSI product name. */
    private String _productName;
    /** The MSI product version. */
    private String _productVersion;
    /** The MSI publisher. */
    private String _publisher;
    /** Whether the MSI app requires the machine to reboot to complete installation. */
    private Boolean _requiresReboot;
    /** The MSI upgrade code. */
    private String _upgradeCode;
    /**
     * Instantiates a new win32LobAppMsiInformation and sets the default values.
     * @return a void
     */
    public Win32LobAppMsiInformation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a win32LobAppMsiInformation
     */
    @javax.annotation.Nonnull
    public static Win32LobAppMsiInformation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Win32LobAppMsiInformation();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Win32LobAppMsiInformation currentObject = this;
        return new HashMap<>(7) {{
            this.put("packageType", (n) -> { currentObject.setPackageType(n.getEnumValue(Win32LobAppMsiPackageType.class)); });
            this.put("productCode", (n) -> { currentObject.setProductCode(n.getStringValue()); });
            this.put("productName", (n) -> { currentObject.setProductName(n.getStringValue()); });
            this.put("productVersion", (n) -> { currentObject.setProductVersion(n.getStringValue()); });
            this.put("publisher", (n) -> { currentObject.setPublisher(n.getStringValue()); });
            this.put("requiresReboot", (n) -> { currentObject.setRequiresReboot(n.getBooleanValue()); });
            this.put("upgradeCode", (n) -> { currentObject.setUpgradeCode(n.getStringValue()); });
        }};
    }
    /**
     * Gets the packageType property value. Indicates the package type of an MSI Win32LobApp.
     * @return a win32LobAppMsiPackageType
     */
    @javax.annotation.Nullable
    public Win32LobAppMsiPackageType getPackageType() {
        return this._packageType;
    }
    /**
     * Gets the productCode property value. The MSI product code.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductCode() {
        return this._productCode;
    }
    /**
     * Gets the productName property value. The MSI product name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductName() {
        return this._productName;
    }
    /**
     * Gets the productVersion property value. The MSI product version.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductVersion() {
        return this._productVersion;
    }
    /**
     * Gets the publisher property value. The MSI publisher.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisher() {
        return this._publisher;
    }
    /**
     * Gets the requiresReboot property value. Whether the MSI app requires the machine to reboot to complete installation.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequiresReboot() {
        return this._requiresReboot;
    }
    /**
     * Gets the upgradeCode property value. The MSI upgrade code.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUpgradeCode() {
        return this._upgradeCode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("packageType", this.getPackageType());
        writer.writeStringValue("productCode", this.getProductCode());
        writer.writeStringValue("productName", this.getProductName());
        writer.writeStringValue("productVersion", this.getProductVersion());
        writer.writeStringValue("publisher", this.getPublisher());
        writer.writeBooleanValue("requiresReboot", this.getRequiresReboot());
        writer.writeStringValue("upgradeCode", this.getUpgradeCode());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the packageType property value. Indicates the package type of an MSI Win32LobApp.
     * @param value Value to set for the packageType property.
     * @return a void
     */
    public void setPackageType(@javax.annotation.Nullable final Win32LobAppMsiPackageType value) {
        this._packageType = value;
    }
    /**
     * Sets the productCode property value. The MSI product code.
     * @param value Value to set for the productCode property.
     * @return a void
     */
    public void setProductCode(@javax.annotation.Nullable final String value) {
        this._productCode = value;
    }
    /**
     * Sets the productName property value. The MSI product name.
     * @param value Value to set for the productName property.
     * @return a void
     */
    public void setProductName(@javax.annotation.Nullable final String value) {
        this._productName = value;
    }
    /**
     * Sets the productVersion property value. The MSI product version.
     * @param value Value to set for the productVersion property.
     * @return a void
     */
    public void setProductVersion(@javax.annotation.Nullable final String value) {
        this._productVersion = value;
    }
    /**
     * Sets the publisher property value. The MSI publisher.
     * @param value Value to set for the publisher property.
     * @return a void
     */
    public void setPublisher(@javax.annotation.Nullable final String value) {
        this._publisher = value;
    }
    /**
     * Sets the requiresReboot property value. Whether the MSI app requires the machine to reboot to complete installation.
     * @param value Value to set for the requiresReboot property.
     * @return a void
     */
    public void setRequiresReboot(@javax.annotation.Nullable final Boolean value) {
        this._requiresReboot = value;
    }
    /**
     * Sets the upgradeCode property value. The MSI upgrade code.
     * @param value Value to set for the upgradeCode property.
     * @return a void
     */
    public void setUpgradeCode(@javax.annotation.Nullable final String value) {
        this._upgradeCode = value;
    }
}
