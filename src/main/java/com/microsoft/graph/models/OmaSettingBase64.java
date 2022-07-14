package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OmaSettingBase64 extends OmaSetting implements Parsable {
    /** File name associated with the Value property (.cer */
    private String _fileName;
    /** Value. (Base64 encoded string) */
    private String _value;
    /**
     * Instantiates a new OmaSettingBase64 and sets the default values.
     * @return a void
     */
    public OmaSettingBase64() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OmaSettingBase64
     */
    @javax.annotation.Nonnull
    public static OmaSettingBase64 createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OmaSettingBase64();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OmaSettingBase64 currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("fileName", (n) -> { currentObject.setFileName(n.getStringValue()); });
            this.put("value", (n) -> { currentObject.setValue(n.getStringValue()); });
        }};
    }
    /**
     * Gets the fileName property value. File name associated with the Value property (.cer
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileName() {
        return this._fileName;
    }
    /**
     * Gets the value property value. Value. (Base64 encoded string)
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValue() {
        return this._value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("fileName", this.getFileName());
        writer.writeStringValue("value", this.getValue());
    }
    /**
     * Sets the fileName property value. File name associated with the Value property (.cer
     * @param value Value to set for the fileName property.
     * @return a void
     */
    public void setFileName(@javax.annotation.Nullable final String value) {
        this._fileName = value;
    }
    /**
     * Sets the value property value. Value. (Base64 encoded string)
     * @param value Value to set for the value property.
     * @return a void
     */
    public void setValue(@javax.annotation.Nullable final String value) {
        this._value = value;
    }
}
