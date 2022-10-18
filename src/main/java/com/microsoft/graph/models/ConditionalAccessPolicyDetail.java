package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConditionalAccessPolicyDetail implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The conditions property */
    private ConditionalAccessConditionSet _conditions;
    /** Represents grant controls that must be fulfilled for the policy. */
    private ConditionalAccessGrantControls _grantControls;
    /** The OdataType property */
    private String _odataType;
    /** Represents a complex type of session controls that is enforced after sign-in. */
    private ConditionalAccessSessionControls _sessionControls;
    /**
     * Instantiates a new conditionalAccessPolicyDetail and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConditionalAccessPolicyDetail() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.conditionalAccessPolicyDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a conditionalAccessPolicyDetail
     */
    @javax.annotation.Nonnull
    public static ConditionalAccessPolicyDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessPolicyDetail();
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
     * Gets the conditions property value. The conditions property
     * @return a conditionalAccessConditionSet
     */
    @javax.annotation.Nullable
    public ConditionalAccessConditionSet getConditions() {
        return this._conditions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ConditionalAccessPolicyDetail currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(4) {{
            this.put("conditions", (n) -> { currentObject.setConditions(n.getObjectValue(ConditionalAccessConditionSet::createFromDiscriminatorValue)); });
            this.put("grantControls", (n) -> { currentObject.setGrantControls(n.getObjectValue(ConditionalAccessGrantControls::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("sessionControls", (n) -> { currentObject.setSessionControls(n.getObjectValue(ConditionalAccessSessionControls::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the grantControls property value. Represents grant controls that must be fulfilled for the policy.
     * @return a conditionalAccessGrantControls
     */
    @javax.annotation.Nullable
    public ConditionalAccessGrantControls getGrantControls() {
        return this._grantControls;
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
     * Gets the sessionControls property value. Represents a complex type of session controls that is enforced after sign-in.
     * @return a conditionalAccessSessionControls
     */
    @javax.annotation.Nullable
    public ConditionalAccessSessionControls getSessionControls() {
        return this._sessionControls;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("conditions", this.getConditions());
        writer.writeObjectValue("grantControls", this.getGrantControls());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("sessionControls", this.getSessionControls());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the conditions property value. The conditions property
     * @param value Value to set for the conditions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConditions(@javax.annotation.Nullable final ConditionalAccessConditionSet value) {
        this._conditions = value;
    }
    /**
     * Sets the grantControls property value. Represents grant controls that must be fulfilled for the policy.
     * @param value Value to set for the grantControls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGrantControls(@javax.annotation.Nullable final ConditionalAccessGrantControls value) {
        this._grantControls = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the sessionControls property value. Represents a complex type of session controls that is enforced after sign-in.
     * @param value Value to set for the sessionControls property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSessionControls(@javax.annotation.Nullable final ConditionalAccessSessionControls value) {
        this._sessionControls = value;
    }
}
