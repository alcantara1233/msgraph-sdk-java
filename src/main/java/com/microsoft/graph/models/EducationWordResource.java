package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationWordResource extends EducationResource implements Parsable {
    /** Location of the file on disk. */
    private String _fileUrl;
    /**
     * Instantiates a new EducationWordResource and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationWordResource() {
        super();
        this.setOdataType("#microsoft.graph.educationWordResource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EducationWordResource
     */
    @javax.annotation.Nonnull
    public static EducationWordResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationWordResource();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationWordResource currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("fileUrl", (n) -> { currentObject.setFileUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the fileUrl property value. Location of the file on disk.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileUrl() {
        return this._fileUrl;
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
        writer.writeStringValue("fileUrl", this.getFileUrl());
    }
    /**
     * Sets the fileUrl property value. Location of the file on disk.
     * @param value Value to set for the fileUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileUrl(@javax.annotation.Nullable final String value) {
        this._fileUrl = value;
    }
}
