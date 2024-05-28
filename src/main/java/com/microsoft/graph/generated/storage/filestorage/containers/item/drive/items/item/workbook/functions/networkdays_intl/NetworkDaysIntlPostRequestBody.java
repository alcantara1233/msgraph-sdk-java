package com.microsoft.graph.storage.filestorage.containers.item.drive.items.item.workbook.functions.networkdays_intl;

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
public class NetworkDaysIntlPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link NetworkDaysIntlPostRequestBody} and sets the default values.
     */
    public NetworkDaysIntlPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link NetworkDaysIntlPostRequestBody}
     */
    @jakarta.annotation.Nonnull
    public static NetworkDaysIntlPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NetworkDaysIntlPostRequestBody();
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
     * Gets the endDate property value. The endDate property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getEndDate() {
        return this.backingStore.get("endDate");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("endDate", (n) -> { this.setEndDate(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("holidays", (n) -> { this.setHolidays(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("startDate", (n) -> { this.setStartDate(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("weekend", (n) -> { this.setWeekend(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the holidays property value. The holidays property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getHolidays() {
        return this.backingStore.get("holidays");
    }
    /**
     * Gets the startDate property value. The startDate property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getStartDate() {
        return this.backingStore.get("startDate");
    }
    /**
     * Gets the weekend property value. The weekend property
     * @return a {@link Json}
     */
    @jakarta.annotation.Nullable
    public Json getWeekend() {
        return this.backingStore.get("weekend");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("endDate", this.getEndDate());
        writer.writeObjectValue("holidays", this.getHolidays());
        writer.writeObjectValue("startDate", this.getStartDate());
        writer.writeObjectValue("weekend", this.getWeekend());
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
     * Sets the endDate property value. The endDate property
     * @param value Value to set for the endDate property.
     */
    public void setEndDate(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("endDate", value);
    }
    /**
     * Sets the holidays property value. The holidays property
     * @param value Value to set for the holidays property.
     */
    public void setHolidays(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("holidays", value);
    }
    /**
     * Sets the startDate property value. The startDate property
     * @param value Value to set for the startDate property.
     */
    public void setStartDate(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("startDate", value);
    }
    /**
     * Sets the weekend property value. The weekend property
     * @param value Value to set for the weekend property.
     */
    public void setWeekend(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("weekend", value);
    }
}
