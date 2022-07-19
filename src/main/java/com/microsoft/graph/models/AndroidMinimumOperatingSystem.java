package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Contains properties for the minimum operating system required for an Android mobile app. */
public class AndroidMinimumOperatingSystem implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** Version 10.0 or later. */
    private Boolean _v10_0;
    /** Version 11.0 or later. */
    private Boolean _v11_0;
    /** Version 4.0 or later. */
    private Boolean _v4_0;
    /** Version 4.0.3 or later. */
    private Boolean _v4_0_3;
    /** Version 4.1 or later. */
    private Boolean _v4_1;
    /** Version 4.2 or later. */
    private Boolean _v4_2;
    /** Version 4.3 or later. */
    private Boolean _v4_3;
    /** Version 4.4 or later. */
    private Boolean _v4_4;
    /** Version 5.0 or later. */
    private Boolean _v5_0;
    /** Version 5.1 or later. */
    private Boolean _v5_1;
    /**
     * Instantiates a new androidMinimumOperatingSystem and sets the default values.
     * @return a void
     */
    public AndroidMinimumOperatingSystem() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.androidMinimumOperatingSystem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidMinimumOperatingSystem
     */
    @javax.annotation.Nonnull
    public static AndroidMinimumOperatingSystem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidMinimumOperatingSystem();
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
        final AndroidMinimumOperatingSystem currentObject = this;
        return new HashMap<>(11) {{
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("v10_0", (n) -> { currentObject.setV10_0(n.getBooleanValue()); });
            this.put("v11_0", (n) -> { currentObject.setV11_0(n.getBooleanValue()); });
            this.put("v4_0", (n) -> { currentObject.setV4_0(n.getBooleanValue()); });
            this.put("v4_0_3", (n) -> { currentObject.setV4_0_3(n.getBooleanValue()); });
            this.put("v4_1", (n) -> { currentObject.setV4_1(n.getBooleanValue()); });
            this.put("v4_2", (n) -> { currentObject.setV4_2(n.getBooleanValue()); });
            this.put("v4_3", (n) -> { currentObject.setV4_3(n.getBooleanValue()); });
            this.put("v4_4", (n) -> { currentObject.setV4_4(n.getBooleanValue()); });
            this.put("v5_0", (n) -> { currentObject.setV5_0(n.getBooleanValue()); });
            this.put("v5_1", (n) -> { currentObject.setV5_1(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the v10_0 property value. Version 10.0 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV10_0() {
        return this._v10_0;
    }
    /**
     * Gets the v11_0 property value. Version 11.0 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV11_0() {
        return this._v11_0;
    }
    /**
     * Gets the v4_0 property value. Version 4.0 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV4_0() {
        return this._v4_0;
    }
    /**
     * Gets the v4_0_3 property value. Version 4.0.3 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV4_0_3() {
        return this._v4_0_3;
    }
    /**
     * Gets the v4_1 property value. Version 4.1 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV4_1() {
        return this._v4_1;
    }
    /**
     * Gets the v4_2 property value. Version 4.2 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV4_2() {
        return this._v4_2;
    }
    /**
     * Gets the v4_3 property value. Version 4.3 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV4_3() {
        return this._v4_3;
    }
    /**
     * Gets the v4_4 property value. Version 4.4 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV4_4() {
        return this._v4_4;
    }
    /**
     * Gets the v5_0 property value. Version 5.0 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV5_0() {
        return this._v5_0;
    }
    /**
     * Gets the v5_1 property value. Version 5.1 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getV5_1() {
        return this._v5_1;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("v10_0", this.getV10_0());
        writer.writeBooleanValue("v11_0", this.getV11_0());
        writer.writeBooleanValue("v4_0", this.getV4_0());
        writer.writeBooleanValue("v4_0_3", this.getV4_0_3());
        writer.writeBooleanValue("v4_1", this.getV4_1());
        writer.writeBooleanValue("v4_2", this.getV4_2());
        writer.writeBooleanValue("v4_3", this.getV4_3());
        writer.writeBooleanValue("v4_4", this.getV4_4());
        writer.writeBooleanValue("v5_0", this.getV5_0());
        writer.writeBooleanValue("v5_1", this.getV5_1());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the v10_0 property value. Version 10.0 or later.
     * @param value Value to set for the v10_0 property.
     * @return a void
     */
    public void setV10_0(@javax.annotation.Nullable final Boolean value) {
        this._v10_0 = value;
    }
    /**
     * Sets the v11_0 property value. Version 11.0 or later.
     * @param value Value to set for the v11_0 property.
     * @return a void
     */
    public void setV11_0(@javax.annotation.Nullable final Boolean value) {
        this._v11_0 = value;
    }
    /**
     * Sets the v4_0 property value. Version 4.0 or later.
     * @param value Value to set for the v4_0 property.
     * @return a void
     */
    public void setV4_0(@javax.annotation.Nullable final Boolean value) {
        this._v4_0 = value;
    }
    /**
     * Sets the v4_0_3 property value. Version 4.0.3 or later.
     * @param value Value to set for the v4_0_3 property.
     * @return a void
     */
    public void setV4_0_3(@javax.annotation.Nullable final Boolean value) {
        this._v4_0_3 = value;
    }
    /**
     * Sets the v4_1 property value. Version 4.1 or later.
     * @param value Value to set for the v4_1 property.
     * @return a void
     */
    public void setV4_1(@javax.annotation.Nullable final Boolean value) {
        this._v4_1 = value;
    }
    /**
     * Sets the v4_2 property value. Version 4.2 or later.
     * @param value Value to set for the v4_2 property.
     * @return a void
     */
    public void setV4_2(@javax.annotation.Nullable final Boolean value) {
        this._v4_2 = value;
    }
    /**
     * Sets the v4_3 property value. Version 4.3 or later.
     * @param value Value to set for the v4_3 property.
     * @return a void
     */
    public void setV4_3(@javax.annotation.Nullable final Boolean value) {
        this._v4_3 = value;
    }
    /**
     * Sets the v4_4 property value. Version 4.4 or later.
     * @param value Value to set for the v4_4 property.
     * @return a void
     */
    public void setV4_4(@javax.annotation.Nullable final Boolean value) {
        this._v4_4 = value;
    }
    /**
     * Sets the v5_0 property value. Version 5.0 or later.
     * @param value Value to set for the v5_0 property.
     * @return a void
     */
    public void setV5_0(@javax.annotation.Nullable final Boolean value) {
        this._v5_0 = value;
    }
    /**
     * Sets the v5_1 property value. Version 5.1 or later.
     * @param value Value to set for the v5_1 property.
     * @return a void
     */
    public void setV5_1(@javax.annotation.Nullable final Boolean value) {
        this._v5_1 = value;
    }
}
