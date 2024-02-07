package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppHostedMediaConfig extends MediaConfig implements Parsable {
    /**
     * Instantiates a new AppHostedMediaConfig and sets the default values.
     */
    public AppHostedMediaConfig() {
        super();
        this.setOdataType("#microsoft.graph.appHostedMediaConfig");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AppHostedMediaConfig
     */
    @jakarta.annotation.Nonnull
    public static AppHostedMediaConfig createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppHostedMediaConfig();
    }
    /**
     * Gets the blob property value. The media configuration blob generated by smart media agent.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBlob() {
        return this.backingStore.get("blob");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("blob", (n) -> { this.setBlob(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("blob", this.getBlob());
    }
    /**
     * Sets the blob property value. The media configuration blob generated by smart media agent.
     * @param value Value to set for the blob property.
     */
    public void setBlob(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("blob", value);
    }
}
