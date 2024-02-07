package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ThreatAssessmentResultType implements ValuedEnum {
    CheckPolicy("checkPolicy"),
    Rescan("rescan"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ThreatAssessmentResultType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ThreatAssessmentResultType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "checkPolicy": return CheckPolicy;
            case "rescan": return Rescan;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
