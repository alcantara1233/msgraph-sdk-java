package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PendingOperations implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** A property that indicates that an operation that might update the binary content of a file is pending completion. */
    private PendingContentUpdate _pendingContentUpdate;
    /**
     * Instantiates a new pendingOperations and sets the default values.
     * @return a void
     */
    public PendingOperations() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.pendingOperations");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a pendingOperations
     */
    @javax.annotation.Nonnull
    public static PendingOperations createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PendingOperations();
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
        final PendingOperations currentObject = this;
        return new HashMap<>(2) {{
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("pendingContentUpdate", (n) -> { currentObject.setPendingContentUpdate(n.getObjectValue(PendingContentUpdate::createFromDiscriminatorValue)); });
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
     * Gets the pendingContentUpdate property value. A property that indicates that an operation that might update the binary content of a file is pending completion.
     * @return a pendingContentUpdate
     */
    @javax.annotation.Nullable
    public PendingContentUpdate getPendingContentUpdate() {
        return this._pendingContentUpdate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("pendingContentUpdate", this.getPendingContentUpdate());
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
     * Sets the pendingContentUpdate property value. A property that indicates that an operation that might update the binary content of a file is pending completion.
     * @param value Value to set for the pendingContentUpdate property.
     * @return a void
     */
    public void setPendingContentUpdate(@javax.annotation.Nullable final PendingContentUpdate value) {
        this._pendingContentUpdate = value;
    }
}
