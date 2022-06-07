// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.callrecords.models.AudioCodec;
import com.microsoft.graph.callrecords.models.MediaStreamDirection;
import com.microsoft.graph.callrecords.models.VideoCodec;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Media Stream.
 */
public class MediaStream implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Audio Codec.
     * Codec name used to encode audio for transmission on the network. Possible values are: unknown, invalid, cn, pcma, pcmu, amrWide, g722, g7221, g7221c, g729, multiChannelAudio, muchv2, opus, satin, satinFullband, rtAudio8, rtAudio16, silk, silkNarrow, silkWide, siren, xmsRTA, unknownFutureValue.
     */
    @SerializedName(value = "audioCodec", alternate = {"AudioCodec"})
    @Expose
	@Nullable
    public AudioCodec audioCodec;

    /**
     * The Average Audio Degradation.
     * Average Network Mean Opinion Score degradation for stream. Represents how much the network loss and jitter has impacted the quality of received audio.
     */
    @SerializedName(value = "averageAudioDegradation", alternate = {"AverageAudioDegradation"})
    @Expose
	@Nullable
    public Float averageAudioDegradation;

    /**
     * The Average Audio Network Jitter.
     * Average jitter for the stream computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     */
    @SerializedName(value = "averageAudioNetworkJitter", alternate = {"AverageAudioNetworkJitter"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration averageAudioNetworkJitter;

    /**
     * The Average Bandwidth Estimate.
     * Average estimated bandwidth available between two endpoints in bits per second.
     */
    @SerializedName(value = "averageBandwidthEstimate", alternate = {"AverageBandwidthEstimate"})
    @Expose
	@Nullable
    public Long averageBandwidthEstimate;

    /**
     * The Average Jitter.
     * Average jitter for the stream computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     */
    @SerializedName(value = "averageJitter", alternate = {"AverageJitter"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration averageJitter;

    /**
     * The Average Packet Loss Rate.
     * Average packet loss rate for stream.
     */
    @SerializedName(value = "averagePacketLossRate", alternate = {"AveragePacketLossRate"})
    @Expose
	@Nullable
    public Float averagePacketLossRate;

    /**
     * The Average Ratio Of Concealed Samples.
     * Ratio of the number of audio frames with samples generated by packet loss concealment to the total number of audio frames.
     */
    @SerializedName(value = "averageRatioOfConcealedSamples", alternate = {"AverageRatioOfConcealedSamples"})
    @Expose
	@Nullable
    public Float averageRatioOfConcealedSamples;

    /**
     * The Average Received Frame Rate.
     * Average frames per second received for all video streams computed over the duration of the session.
     */
    @SerializedName(value = "averageReceivedFrameRate", alternate = {"AverageReceivedFrameRate"})
    @Expose
	@Nullable
    public Float averageReceivedFrameRate;

    /**
     * The Average Round Trip Time.
     * Average network propagation round-trip time computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     */
    @SerializedName(value = "averageRoundTripTime", alternate = {"AverageRoundTripTime"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration averageRoundTripTime;

    /**
     * The Average Video Frame Loss Percentage.
     * Average percentage of video frames lost as displayed to the user.
     */
    @SerializedName(value = "averageVideoFrameLossPercentage", alternate = {"AverageVideoFrameLossPercentage"})
    @Expose
	@Nullable
    public Float averageVideoFrameLossPercentage;

    /**
     * The Average Video Frame Rate.
     * Average frames per second received for a video stream, computed over the duration of the session.
     */
    @SerializedName(value = "averageVideoFrameRate", alternate = {"AverageVideoFrameRate"})
    @Expose
	@Nullable
    public Float averageVideoFrameRate;

    /**
     * The Average Video Packet Loss Rate.
     * Average fraction of packets lost, as specified in [RFC 3550][], computed over the duration of the session.
     */
    @SerializedName(value = "averageVideoPacketLossRate", alternate = {"AverageVideoPacketLossRate"})
    @Expose
	@Nullable
    public Float averageVideoPacketLossRate;

    /**
     * The End Date Time.
     * UTC time when the stream ended. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime endDateTime;

    /**
     * The Low Frame Rate Ratio.
     * Fraction of the call where frame rate is less than 7.5 frames per second.
     */
    @SerializedName(value = "lowFrameRateRatio", alternate = {"LowFrameRateRatio"})
    @Expose
	@Nullable
    public Float lowFrameRateRatio;

    /**
     * The Low Video Processing Capability Ratio.
     * Fraction of the call that the client is running less than 70% expected video processing capability.
     */
    @SerializedName(value = "lowVideoProcessingCapabilityRatio", alternate = {"LowVideoProcessingCapabilityRatio"})
    @Expose
	@Nullable
    public Float lowVideoProcessingCapabilityRatio;

    /**
     * The Max Audio Network Jitter.
     * Maximum of audio network jitter computed over each of the 20 second windows during the session, denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     */
    @SerializedName(value = "maxAudioNetworkJitter", alternate = {"MaxAudioNetworkJitter"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration maxAudioNetworkJitter;

    /**
     * The Max Jitter.
     * Maximum jitter for the stream computed as specified in RFC 3550, denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     */
    @SerializedName(value = "maxJitter", alternate = {"MaxJitter"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration maxJitter;

    /**
     * The Max Packet Loss Rate.
     * Maximum packet loss rate for the stream.
     */
    @SerializedName(value = "maxPacketLossRate", alternate = {"MaxPacketLossRate"})
    @Expose
	@Nullable
    public Float maxPacketLossRate;

    /**
     * The Max Ratio Of Concealed Samples.
     * Maximum ratio of packets concealed by the healer.
     */
    @SerializedName(value = "maxRatioOfConcealedSamples", alternate = {"MaxRatioOfConcealedSamples"})
    @Expose
	@Nullable
    public Float maxRatioOfConcealedSamples;

    /**
     * The Max Round Trip Time.
     * Maximum network propagation round-trip time computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     */
    @SerializedName(value = "maxRoundTripTime", alternate = {"MaxRoundTripTime"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration maxRoundTripTime;

    /**
     * The Packet Utilization.
     * Packet count for the stream.
     */
    @SerializedName(value = "packetUtilization", alternate = {"PacketUtilization"})
    @Expose
	@Nullable
    public Long packetUtilization;

    /**
     * The Post Forward Error Correction Packet Loss Rate.
     * Packet loss rate after FEC has been applied aggregated across all video streams and codecs.
     */
    @SerializedName(value = "postForwardErrorCorrectionPacketLossRate", alternate = {"PostForwardErrorCorrectionPacketLossRate"})
    @Expose
	@Nullable
    public Float postForwardErrorCorrectionPacketLossRate;

    /**
     * The Start Date Time.
     * UTC time when the stream started. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime startDateTime;

    /**
     * The Stream Direction.
     * Indicates the direction of the media stream. Possible values are: callerToCallee, calleeToCaller.
     */
    @SerializedName(value = "streamDirection", alternate = {"StreamDirection"})
    @Expose
	@Nullable
    public MediaStreamDirection streamDirection;

    /**
     * The Stream Id.
     * Unique identifier for the stream.
     */
    @SerializedName(value = "streamId", alternate = {"StreamId"})
    @Expose
	@Nullable
    public String streamId;

    /**
     * The Video Codec.
     * Codec name used to encode video for transmission on the network. Possible values are: unknown, invalid, av1, h263, h264, h264s, h264uc, h265, rtvc1, rtVideo, xrtvc1, unknownFutureValue.
     */
    @SerializedName(value = "videoCodec", alternate = {"VideoCodec"})
    @Expose
	@Nullable
    public VideoCodec videoCodec;

    /**
     * The Was Media Bypassed.
     * True if the media stream bypassed the Mediation Server and went straight between client and PSTN Gateway/PBX, false otherwise.
     */
    @SerializedName(value = "wasMediaBypassed", alternate = {"WasMediaBypassed"})
    @Expose
	@Nullable
    public Boolean wasMediaBypassed;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
