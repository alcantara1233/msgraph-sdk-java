package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Post extends OutlookItem implements Parsable {
    /** Read-only. Nullable. Supports $expand. */
    private java.util.List<Attachment> attachments;
    /** The contents of the post. This is a default property. This property can be null. */
    private ItemBody body;
    /** Unique ID of the conversation. Read-only. */
    private String conversationId;
    /** Unique ID of the conversation thread. Read-only. */
    private String conversationThreadId;
    /** The collection of open extensions defined for the post. Read-only. Nullable. Supports $expand. */
    private java.util.List<Extension> extensions;
    /** The from property */
    private Recipient from;
    /** Indicates whether the post has at least one attachment. This is a default property. */
    private Boolean hasAttachments;
    /** Read-only. Supports $expand. */
    private Post inReplyTo;
    /** The collection of multi-value extended properties defined for the post. Read-only. Nullable. */
    private java.util.List<MultiValueLegacyExtendedProperty> multiValueExtendedProperties;
    /** Conversation participants that were added to the thread as part of this post. */
    private java.util.List<Recipient> newParticipants;
    /** Specifies when the post was received. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z */
    private OffsetDateTime receivedDateTime;
    /** Contains the address of the sender. The value of Sender is assumed to be the address of the authenticated user in the case when Sender is not specified. This is a default property. */
    private Recipient sender;
    /** The collection of single-value extended properties defined for the post. Read-only. Nullable. */
    private java.util.List<SingleValueLegacyExtendedProperty> singleValueExtendedProperties;
    /**
     * Instantiates a new Post and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Post() {
        super();
        this.setOdataType("#microsoft.graph.post");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Post
     */
    @javax.annotation.Nonnull
    public static Post createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Post();
    }
    /**
     * Gets the attachments property value. Read-only. Nullable. Supports $expand.
     * @return a attachment
     */
    @javax.annotation.Nullable
    public java.util.List<Attachment> getAttachments() {
        return this.attachments;
    }
    /**
     * Gets the body property value. The contents of the post. This is a default property. This property can be null.
     * @return a itemBody
     */
    @javax.annotation.Nullable
    public ItemBody getBody() {
        return this.body;
    }
    /**
     * Gets the conversationId property value. Unique ID of the conversation. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConversationId() {
        return this.conversationId;
    }
    /**
     * Gets the conversationThreadId property value. Unique ID of the conversation thread. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getConversationThreadId() {
        return this.conversationThreadId;
    }
    /**
     * Gets the extensions property value. The collection of open extensions defined for the post. Read-only. Nullable. Supports $expand.
     * @return a extension
     */
    @javax.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this.extensions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("attachments", (n) -> { this.setAttachments(n.getCollectionOfObjectValues(Attachment::createFromDiscriminatorValue)); });
        deserializerMap.put("body", (n) -> { this.setBody(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("conversationId", (n) -> { this.setConversationId(n.getStringValue()); });
        deserializerMap.put("conversationThreadId", (n) -> { this.setConversationThreadId(n.getStringValue()); });
        deserializerMap.put("extensions", (n) -> { this.setExtensions(n.getCollectionOfObjectValues(Extension::createFromDiscriminatorValue)); });
        deserializerMap.put("from", (n) -> { this.setFrom(n.getObjectValue(Recipient::createFromDiscriminatorValue)); });
        deserializerMap.put("hasAttachments", (n) -> { this.setHasAttachments(n.getBooleanValue()); });
        deserializerMap.put("inReplyTo", (n) -> { this.setInReplyTo(n.getObjectValue(Post::createFromDiscriminatorValue)); });
        deserializerMap.put("multiValueExtendedProperties", (n) -> { this.setMultiValueExtendedProperties(n.getCollectionOfObjectValues(MultiValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        deserializerMap.put("newParticipants", (n) -> { this.setNewParticipants(n.getCollectionOfObjectValues(Recipient::createFromDiscriminatorValue)); });
        deserializerMap.put("receivedDateTime", (n) -> { this.setReceivedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("sender", (n) -> { this.setSender(n.getObjectValue(Recipient::createFromDiscriminatorValue)); });
        deserializerMap.put("singleValueExtendedProperties", (n) -> { this.setSingleValueExtendedProperties(n.getCollectionOfObjectValues(SingleValueLegacyExtendedProperty::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the from property value. The from property
     * @return a recipient
     */
    @javax.annotation.Nullable
    public Recipient getFrom() {
        return this.from;
    }
    /**
     * Gets the hasAttachments property value. Indicates whether the post has at least one attachment. This is a default property.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasAttachments() {
        return this.hasAttachments;
    }
    /**
     * Gets the inReplyTo property value. Read-only. Supports $expand.
     * @return a post
     */
    @javax.annotation.Nullable
    public Post getInReplyTo() {
        return this.inReplyTo;
    }
    /**
     * Gets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the post. Read-only. Nullable.
     * @return a multiValueLegacyExtendedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<MultiValueLegacyExtendedProperty> getMultiValueExtendedProperties() {
        return this.multiValueExtendedProperties;
    }
    /**
     * Gets the newParticipants property value. Conversation participants that were added to the thread as part of this post.
     * @return a recipient
     */
    @javax.annotation.Nullable
    public java.util.List<Recipient> getNewParticipants() {
        return this.newParticipants;
    }
    /**
     * Gets the receivedDateTime property value. Specifies when the post was received. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReceivedDateTime() {
        return this.receivedDateTime;
    }
    /**
     * Gets the sender property value. Contains the address of the sender. The value of Sender is assumed to be the address of the authenticated user in the case when Sender is not specified. This is a default property.
     * @return a recipient
     */
    @javax.annotation.Nullable
    public Recipient getSender() {
        return this.sender;
    }
    /**
     * Gets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the post. Read-only. Nullable.
     * @return a singleValueLegacyExtendedProperty
     */
    @javax.annotation.Nullable
    public java.util.List<SingleValueLegacyExtendedProperty> getSingleValueExtendedProperties() {
        return this.singleValueExtendedProperties;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("attachments", this.getAttachments());
        writer.writeObjectValue("body", this.getBody());
        writer.writeStringValue("conversationId", this.getConversationId());
        writer.writeStringValue("conversationThreadId", this.getConversationThreadId());
        writer.writeCollectionOfObjectValues("extensions", this.getExtensions());
        writer.writeObjectValue("from", this.getFrom());
        writer.writeBooleanValue("hasAttachments", this.getHasAttachments());
        writer.writeObjectValue("inReplyTo", this.getInReplyTo());
        writer.writeCollectionOfObjectValues("multiValueExtendedProperties", this.getMultiValueExtendedProperties());
        writer.writeCollectionOfObjectValues("newParticipants", this.getNewParticipants());
        writer.writeOffsetDateTimeValue("receivedDateTime", this.getReceivedDateTime());
        writer.writeObjectValue("sender", this.getSender());
        writer.writeCollectionOfObjectValues("singleValueExtendedProperties", this.getSingleValueExtendedProperties());
    }
    /**
     * Sets the attachments property value. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the attachments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAttachments(@javax.annotation.Nullable final java.util.List<Attachment> value) {
        this.attachments = value;
    }
    /**
     * Sets the body property value. The contents of the post. This is a default property. This property can be null.
     * @param value Value to set for the body property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBody(@javax.annotation.Nullable final ItemBody value) {
        this.body = value;
    }
    /**
     * Sets the conversationId property value. Unique ID of the conversation. Read-only.
     * @param value Value to set for the conversationId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConversationId(@javax.annotation.Nullable final String value) {
        this.conversationId = value;
    }
    /**
     * Sets the conversationThreadId property value. Unique ID of the conversation thread. Read-only.
     * @param value Value to set for the conversationThreadId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConversationThreadId(@javax.annotation.Nullable final String value) {
        this.conversationThreadId = value;
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for the post. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the extensions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExtensions(@javax.annotation.Nullable final java.util.List<Extension> value) {
        this.extensions = value;
    }
    /**
     * Sets the from property value. The from property
     * @param value Value to set for the from property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFrom(@javax.annotation.Nullable final Recipient value) {
        this.from = value;
    }
    /**
     * Sets the hasAttachments property value. Indicates whether the post has at least one attachment. This is a default property.
     * @param value Value to set for the hasAttachments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHasAttachments(@javax.annotation.Nullable final Boolean value) {
        this.hasAttachments = value;
    }
    /**
     * Sets the inReplyTo property value. Read-only. Supports $expand.
     * @param value Value to set for the inReplyTo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInReplyTo(@javax.annotation.Nullable final Post value) {
        this.inReplyTo = value;
    }
    /**
     * Sets the multiValueExtendedProperties property value. The collection of multi-value extended properties defined for the post. Read-only. Nullable.
     * @param value Value to set for the multiValueExtendedProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMultiValueExtendedProperties(@javax.annotation.Nullable final java.util.List<MultiValueLegacyExtendedProperty> value) {
        this.multiValueExtendedProperties = value;
    }
    /**
     * Sets the newParticipants property value. Conversation participants that were added to the thread as part of this post.
     * @param value Value to set for the newParticipants property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNewParticipants(@javax.annotation.Nullable final java.util.List<Recipient> value) {
        this.newParticipants = value;
    }
    /**
     * Sets the receivedDateTime property value. Specifies when the post was received. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     * @param value Value to set for the receivedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReceivedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.receivedDateTime = value;
    }
    /**
     * Sets the sender property value. Contains the address of the sender. The value of Sender is assumed to be the address of the authenticated user in the case when Sender is not specified. This is a default property.
     * @param value Value to set for the sender property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSender(@javax.annotation.Nullable final Recipient value) {
        this.sender = value;
    }
    /**
     * Sets the singleValueExtendedProperties property value. The collection of single-value extended properties defined for the post. Read-only. Nullable.
     * @param value Value to set for the singleValueExtendedProperties property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSingleValueExtendedProperties(@javax.annotation.Nullable final java.util.List<SingleValueLegacyExtendedProperty> value) {
        this.singleValueExtendedProperties = value;
    }
}
