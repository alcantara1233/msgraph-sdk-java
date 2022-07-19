// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.AllowedTargetScope;
import com.microsoft.graph.models.AccessPackageAutomaticRequestSettings;
import com.microsoft.graph.models.ExpirationPattern;
import com.microsoft.graph.models.AccessPackageAssignmentApprovalSettings;
import com.microsoft.graph.models.AccessPackageAssignmentRequestorSettings;
import com.microsoft.graph.models.AccessPackageAssignmentReviewSettings;
import com.microsoft.graph.models.SubjectSet;
import com.microsoft.graph.models.AccessPackage;
import com.microsoft.graph.models.AccessPackageCatalog;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Policy.
 */
public class AccessPackageAssignmentPolicy extends Entity implements IJsonBackedObject {


    /**
     * The Allowed Target Scope.
     * Principals that can be assigned the access package through this policy. The possible values are: notSpecified, specificDirectoryUsers, specificConnectedOrganizationUsers, specificDirectoryServicePrincipals, allMemberUsers, allDirectoryUsers, allDirectoryServicePrincipals, allConfiguredConnectedOrganizationUsers, allExternalUsers, unknownFutureValue.
     */
    @SerializedName(value = "allowedTargetScope", alternate = {"AllowedTargetScope"})
    @Expose
	@Nullable
    public AllowedTargetScope allowedTargetScope;

    /**
     * The Automatic Request Settings.
     * 
     */
    @SerializedName(value = "automaticRequestSettings", alternate = {"AutomaticRequestSettings"})
    @Expose
	@Nullable
    public AccessPackageAutomaticRequestSettings automaticRequestSettings;

    /**
     * The Created Date Time.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Description.
     * The description of the policy.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * The display name of the policy. Supports $filter (eq).
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Expiration.
     * The expiration date for assignments created in this policy.
     */
    @SerializedName(value = "expiration", alternate = {"Expiration"})
    @Expose
	@Nullable
    public ExpirationPattern expiration;

    /**
     * The Modified Date Time.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "modifiedDateTime", alternate = {"ModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime modifiedDateTime;

    /**
     * The Request Approval Settings.
     * Who must approve requests for access package in this policy.
     */
    @SerializedName(value = "requestApprovalSettings", alternate = {"RequestApprovalSettings"})
    @Expose
	@Nullable
    public AccessPackageAssignmentApprovalSettings requestApprovalSettings;

    /**
     * The Requestor Settings.
     * Who can request this access package from this policy.
     */
    @SerializedName(value = "requestorSettings", alternate = {"RequestorSettings"})
    @Expose
	@Nullable
    public AccessPackageAssignmentRequestorSettings requestorSettings;

    /**
     * The Review Settings.
     * Settings for access reviews of assignments through this policy.
     */
    @SerializedName(value = "reviewSettings", alternate = {"ReviewSettings"})
    @Expose
	@Nullable
    public AccessPackageAssignmentReviewSettings reviewSettings;

    /**
     * The Specific Allowed Targets.
     * The principals that can be assigned access from an access package through this policy.
     */
    @SerializedName(value = "specificAllowedTargets", alternate = {"SpecificAllowedTargets"})
    @Expose
	@Nullable
    public java.util.List<SubjectSet> specificAllowedTargets;

    /**
     * The Access Package.
     * The access package with this policy. Read-only. Nullable. Supports $expand.
     */
    @SerializedName(value = "accessPackage", alternate = {"AccessPackage"})
    @Expose
	@Nullable
    public AccessPackage accessPackage;

    /**
     * The Catalog.
     * Catalog of the access package containing this policy. Read-only.
     */
    @SerializedName(value = "catalog", alternate = {"Catalog"})
    @Expose
	@Nullable
    public AccessPackageCatalog catalog;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
