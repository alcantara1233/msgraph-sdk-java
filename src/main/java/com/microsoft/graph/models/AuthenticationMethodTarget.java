package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthenticationMethodTarget extends Entity implements Parsable {
    /**
     * Determines if the user is enforced to register the authentication method.
     */
    private Boolean isRegistrationRequired;
    /**
     * The targetType property
     */
    private AuthenticationMethodTargetType targetType;
    /**
     * Instantiates a new authenticationMethodTarget and sets the default values.
     */
    public AuthenticationMethodTarget() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationMethodTarget
     */
    @jakarta.annotation.Nonnull
    public static AuthenticationMethodTarget createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.microsoftAuthenticatorAuthenticationMethodTarget": return new MicrosoftAuthenticatorAuthenticationMethodTarget();
                case "#microsoft.graph.smsAuthenticationMethodTarget": return new SmsAuthenticationMethodTarget();
            }
        }
        return new AuthenticationMethodTarget();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isRegistrationRequired", (n) -> { this.setIsRegistrationRequired(n.getBooleanValue()); });
        deserializerMap.put("targetType", (n) -> { this.setTargetType(n.getEnumValue(AuthenticationMethodTargetType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isRegistrationRequired property value. Determines if the user is enforced to register the authentication method.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRegistrationRequired() {
        return this.isRegistrationRequired;
    }
    /**
     * Gets the targetType property value. The targetType property
     * @return a authenticationMethodTargetType
     */
    @jakarta.annotation.Nullable
    public AuthenticationMethodTargetType getTargetType() {
        return this.targetType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isRegistrationRequired", this.getIsRegistrationRequired());
        writer.writeEnumValue("targetType", this.getTargetType());
    }
    /**
     * Sets the isRegistrationRequired property value. Determines if the user is enforced to register the authentication method.
     * @param value Value to set for the isRegistrationRequired property.
     */
    public void setIsRegistrationRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.isRegistrationRequired = value;
    }
    /**
     * Sets the targetType property value. The targetType property
     * @param value Value to set for the targetType property.
     */
    public void setTargetType(@jakarta.annotation.Nullable final AuthenticationMethodTargetType value) {
        this.targetType = value;
    }
}
