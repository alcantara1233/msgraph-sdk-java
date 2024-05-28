package com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.replaceb;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReplaceBPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ReplaceBPostRequestBody} and sets the default values.
     */
    public ReplaceBPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ReplaceBPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static ReplaceBPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ReplaceBPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("newText", (n) -> { this.setNewText(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("numBytes", (n) -> { this.setNumBytes(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("oldText", (n) -> { this.setOldText(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("startNum", (n) -> { this.setStartNum(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the newText property value. The newText property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getNewText() {
        return this.backingStore.get("newText");
    }
    /**
     * Gets the numBytes property value. The numBytes property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getNumBytes() {
        return this.backingStore.get("numBytes");
    }
    /**
     * Gets the oldText property value. The oldText property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getOldText() {
        return this.backingStore.get("oldText");
    }
    /**
     * Gets the startNum property value. The startNum property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getStartNum() {
        return this.backingStore.get("startNum");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("newText", this.getNewText());
        writer.writeObjectValue("numBytes", this.getNumBytes());
        writer.writeObjectValue("oldText", this.getOldText());
        writer.writeObjectValue("startNum", this.getStartNum());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the newText property value. The newText property
     * @param value Value to set for the newText property.
     */
    public void setNewText(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("newText", value);
    }
    /**
     * Sets the numBytes property value. The numBytes property
     * @param value Value to set for the numBytes property.
     */
    public void setNumBytes(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("numBytes", value);
    }
    /**
     * Sets the oldText property value. The oldText property
     * @param value Value to set for the oldText property.
     */
    public void setOldText(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("oldText", value);
    }
    /**
     * Sets the startNum property value. The startNum property
     * @param value Value to set for the startNum property.
     */
    public void setStartNum(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("startNum", value);
    }
}
