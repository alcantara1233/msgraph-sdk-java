package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UriClickSecurityState implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The clickAction property */
    private String clickAction;
    /** The clickDateTime property */
    private OffsetDateTime clickDateTime;
    /** The id property */
    private String id;
    /** The OdataType property */
    private String odataType;
    /** The sourceId property */
    private String sourceId;
    /** The uriDomain property */
    private String uriDomain;
    /** The verdict property */
    private String verdict;
    /**
     * Instantiates a new UriClickSecurityState and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UriClickSecurityState() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UriClickSecurityState
     */
    @javax.annotation.Nonnull
    public static UriClickSecurityState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UriClickSecurityState();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the clickAction property value. The clickAction property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClickAction() {
        return this.clickAction;
    }
    /**
     * Gets the clickDateTime property value. The clickDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getClickDateTime() {
        return this.clickDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("clickAction", (n) -> { this.setClickAction(n.getStringValue()); });
        deserializerMap.put("clickDateTime", (n) -> { this.setClickDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sourceId", (n) -> { this.setSourceId(n.getStringValue()); });
        deserializerMap.put("uriDomain", (n) -> { this.setUriDomain(n.getStringValue()); });
        deserializerMap.put("verdict", (n) -> { this.setVerdict(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the sourceId property value. The sourceId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceId() {
        return this.sourceId;
    }
    /**
     * Gets the uriDomain property value. The uriDomain property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUriDomain() {
        return this.uriDomain;
    }
    /**
     * Gets the verdict property value. The verdict property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVerdict() {
        return this.verdict;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("clickAction", this.getClickAction());
        writer.writeOffsetDateTimeValue("clickDateTime", this.getClickDateTime());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("sourceId", this.getSourceId());
        writer.writeStringValue("uriDomain", this.getUriDomain());
        writer.writeStringValue("verdict", this.getVerdict());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the clickAction property value. The clickAction property
     * @param value Value to set for the clickAction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClickAction(@javax.annotation.Nullable final String value) {
        this.clickAction = value;
    }
    /**
     * Sets the clickDateTime property value. The clickDateTime property
     * @param value Value to set for the clickDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClickDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.clickDateTime = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setId(@javax.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the sourceId property value. The sourceId property
     * @param value Value to set for the sourceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceId(@javax.annotation.Nullable final String value) {
        this.sourceId = value;
    }
    /**
     * Sets the uriDomain property value. The uriDomain property
     * @param value Value to set for the uriDomain property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUriDomain(@javax.annotation.Nullable final String value) {
        this.uriDomain = value;
    }
    /**
     * Sets the verdict property value. The verdict property
     * @param value Value to set for the verdict property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVerdict(@javax.annotation.Nullable final String value) {
        this.verdict = value;
    }
}
