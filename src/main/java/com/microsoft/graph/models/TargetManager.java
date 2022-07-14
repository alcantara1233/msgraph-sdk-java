package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TargetManager extends SubjectSet implements Parsable {
    /** Manager level, between 1 and 4. The direct manager is 1. */
    private Integer _managerLevel;
    /**
     * Instantiates a new TargetManager and sets the default values.
     * @return a void
     */
    public TargetManager() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TargetManager
     */
    @javax.annotation.Nonnull
    public static TargetManager createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TargetManager();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TargetManager currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("managerLevel", (n) -> { currentObject.setManagerLevel(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the managerLevel property value. Manager level, between 1 and 4. The direct manager is 1.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getManagerLevel() {
        return this._managerLevel;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("managerLevel", this.getManagerLevel());
    }
    /**
     * Sets the managerLevel property value. Manager level, between 1 and 4. The direct manager is 1.
     * @param value Value to set for the managerLevel property.
     * @return a void
     */
    public void setManagerLevel(@javax.annotation.Nullable final Integer value) {
        this._managerLevel = value;
    }
}
