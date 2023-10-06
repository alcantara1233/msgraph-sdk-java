// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.security.models.HostReputation;
import com.microsoft.graph.security.models.WhoisRecord;
import com.microsoft.graph.security.models.Artifact;
import com.microsoft.graph.security.requests.HostComponentCollectionPage;
import com.microsoft.graph.security.requests.HostCookieCollectionPage;
import com.microsoft.graph.security.requests.HostSslCertificateCollectionPage;
import com.microsoft.graph.security.requests.SubdomainCollectionPage;
import com.microsoft.graph.security.requests.HostTrackerCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Host.
 */
public class Host extends Artifact implements IJsonBackedObject {


    /**
     * The First Seen Date Time.
     * The first date and time when this host was observed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    @SerializedName(value = "firstSeenDateTime", alternate = {"FirstSeenDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime firstSeenDateTime;

    /**
     * The Last Seen Date Time.
     * The most recent date and time when this host was observed. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    @SerializedName(value = "lastSeenDateTime", alternate = {"LastSeenDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastSeenDateTime;

    /**
     * The Child Host Pairs.
     * The hostPairs that are resources associated with a host, where that host is the parentHost and has an outgoing pairing to a cihldHost.
     */
	@Nullable
    public com.microsoft.graph.security.requests.HostPairCollectionPage childHostPairs;

    /**
     * The Components.
     * The hostComponents that are associated with this host.
     */
	@Nullable
    public com.microsoft.graph.security.requests.HostComponentCollectionPage components;

    /**
     * The Cookies.
     * The hostCookies that are associated with this host.
     */
	@Nullable
    public com.microsoft.graph.security.requests.HostCookieCollectionPage cookies;

    /**
     * The Host Pairs.
     * The hostPairs that are associated with this host, where this host is either the parentHost or childHost.
     */
	@Nullable
    public com.microsoft.graph.security.requests.HostPairCollectionPage hostPairs;

    /**
     * The Parent Host Pairs.
     * The hostPairs that are associated with a host, where that host is the childHost and has an incoming pairing with a parentHost.
     */
	@Nullable
    public com.microsoft.graph.security.requests.HostPairCollectionPage parentHostPairs;

    /**
     * The Passive Dns.
     * Passive DNS retrieval about this host.
     */
	@Nullable
    public com.microsoft.graph.security.requests.PassiveDnsRecordCollectionPage passiveDns;

    /**
     * The Passive Dns Reverse.
     * Reverse passive DNS retrieval about this host.
     */
	@Nullable
    public com.microsoft.graph.security.requests.PassiveDnsRecordCollectionPage passiveDnsReverse;

    /**
     * The Reputation.
     * Represents a calculated reputation of this host.
     */
    @SerializedName(value = "reputation", alternate = {"Reputation"})
    @Expose
	@Nullable
    public HostReputation reputation;

    /**
     * The Ssl Certificates.
     * The hostSslCertificates that are associated with this host.
     */
	@Nullable
    public com.microsoft.graph.security.requests.HostSslCertificateCollectionPage sslCertificates;

    /**
     * The Subdomains.
     * The subdomains that are associated with this host.
     */
	@Nullable
    public com.microsoft.graph.security.requests.SubdomainCollectionPage subdomains;

    /**
     * The Trackers.
     * The hostTrackers that are associated with this host.
     */
	@Nullable
    public com.microsoft.graph.security.requests.HostTrackerCollectionPage trackers;

    /**
     * The Whois.
     * The most recent whoisRecord for this host.
     */
    @SerializedName(value = "whois", alternate = {"Whois"})
    @Expose
	@Nullable
    public WhoisRecord whois;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("childHostPairs")) {
            childHostPairs = serializer.deserializeObject(json.get("childHostPairs"), com.microsoft.graph.security.requests.HostPairCollectionPage.class);
        }

        if (json.has("components")) {
            components = serializer.deserializeObject(json.get("components"), com.microsoft.graph.security.requests.HostComponentCollectionPage.class);
        }

        if (json.has("cookies")) {
            cookies = serializer.deserializeObject(json.get("cookies"), com.microsoft.graph.security.requests.HostCookieCollectionPage.class);
        }

        if (json.has("hostPairs")) {
            hostPairs = serializer.deserializeObject(json.get("hostPairs"), com.microsoft.graph.security.requests.HostPairCollectionPage.class);
        }

        if (json.has("parentHostPairs")) {
            parentHostPairs = serializer.deserializeObject(json.get("parentHostPairs"), com.microsoft.graph.security.requests.HostPairCollectionPage.class);
        }

        if (json.has("passiveDns")) {
            passiveDns = serializer.deserializeObject(json.get("passiveDns"), com.microsoft.graph.security.requests.PassiveDnsRecordCollectionPage.class);
        }

        if (json.has("passiveDnsReverse")) {
            passiveDnsReverse = serializer.deserializeObject(json.get("passiveDnsReverse"), com.microsoft.graph.security.requests.PassiveDnsRecordCollectionPage.class);
        }

        if (json.has("sslCertificates")) {
            sslCertificates = serializer.deserializeObject(json.get("sslCertificates"), com.microsoft.graph.security.requests.HostSslCertificateCollectionPage.class);
        }

        if (json.has("subdomains")) {
            subdomains = serializer.deserializeObject(json.get("subdomains"), com.microsoft.graph.security.requests.SubdomainCollectionPage.class);
        }

        if (json.has("trackers")) {
            trackers = serializer.deserializeObject(json.get("trackers"), com.microsoft.graph.security.requests.HostTrackerCollectionPage.class);
        }
    }
}
