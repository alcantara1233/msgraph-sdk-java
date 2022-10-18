package com.microsoft.graph.workbooks.item;

import com.microsoft.graph.models.DriveItem;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.workbooks.item.analytics.AnalyticsRequestBuilder;
import com.microsoft.graph.workbooks.item.checkin.CheckinRequestBuilder;
import com.microsoft.graph.workbooks.item.checkout.CheckoutRequestBuilder;
import com.microsoft.graph.workbooks.item.children.ChildrenRequestBuilder;
import com.microsoft.graph.workbooks.item.content.ContentRequestBuilder;
import com.microsoft.graph.workbooks.item.copy.CopyRequestBuilder;
import com.microsoft.graph.workbooks.item.createlink.CreateLinkRequestBuilder;
import com.microsoft.graph.workbooks.item.createuploadsession.CreateUploadSessionRequestBuilder;
import com.microsoft.graph.workbooks.item.delta.DeltaRequestBuilder;
import com.microsoft.graph.workbooks.item.deltawithtoken.DeltaWithTokenRequestBuilder;
import com.microsoft.graph.workbooks.item.follow.FollowRequestBuilder;
import com.microsoft.graph.workbooks.item.getactivitiesbyinterval.GetActivitiesByIntervalRequestBuilder;
import com.microsoft.graph.workbooks.item.getactivitiesbyintervalwithstartdatetimewithenddatetimewithinterval.GetActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithIntervalRequestBuilder;
import com.microsoft.graph.workbooks.item.invite.InviteRequestBuilder;
import com.microsoft.graph.workbooks.item.listitem.ListItemRequestBuilder;
import com.microsoft.graph.workbooks.item.permissions.item.PermissionItemRequestBuilder;
import com.microsoft.graph.workbooks.item.permissions.PermissionsRequestBuilder;
import com.microsoft.graph.workbooks.item.preview.PreviewRequestBuilder;
import com.microsoft.graph.workbooks.item.restore.RestoreRequestBuilder;
import com.microsoft.graph.workbooks.item.searchwithq.SearchWithQRequestBuilder;
import com.microsoft.graph.workbooks.item.subscriptions.item.SubscriptionItemRequestBuilder;
import com.microsoft.graph.workbooks.item.subscriptions.SubscriptionsRequestBuilder;
import com.microsoft.graph.workbooks.item.thumbnails.item.ThumbnailSetItemRequestBuilder;
import com.microsoft.graph.workbooks.item.thumbnails.ThumbnailsRequestBuilder;
import com.microsoft.graph.workbooks.item.unfollow.UnfollowRequestBuilder;
import com.microsoft.graph.workbooks.item.validatepermission.ValidatePermissionRequestBuilder;
import com.microsoft.graph.workbooks.item.versions.item.DriveItemVersionItemRequestBuilder;
import com.microsoft.graph.workbooks.item.versions.VersionsRequestBuilder;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of driveItem entities. */
public class DriveItemItemRequestBuilder {
    /** The analytics property */
    @javax.annotation.Nonnull
    public AnalyticsRequestBuilder analytics() {
        return new AnalyticsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The checkin property */
    @javax.annotation.Nonnull
    public CheckinRequestBuilder checkin() {
        return new CheckinRequestBuilder(pathParameters, requestAdapter);
    }
    /** The checkout property */
    @javax.annotation.Nonnull
    public CheckoutRequestBuilder checkout() {
        return new CheckoutRequestBuilder(pathParameters, requestAdapter);
    }
    /** The children property */
    @javax.annotation.Nonnull
    public ChildrenRequestBuilder children() {
        return new ChildrenRequestBuilder(pathParameters, requestAdapter);
    }
    /** The content property */
    @javax.annotation.Nonnull
    public ContentRequestBuilder content() {
        return new ContentRequestBuilder(pathParameters, requestAdapter);
    }
    /** The copy property */
    @javax.annotation.Nonnull
    public CopyRequestBuilder copy() {
        return new CopyRequestBuilder(pathParameters, requestAdapter);
    }
    /** The createLink property */
    @javax.annotation.Nonnull
    public CreateLinkRequestBuilder createLink() {
        return new CreateLinkRequestBuilder(pathParameters, requestAdapter);
    }
    /** The createUploadSession property */
    @javax.annotation.Nonnull
    public CreateUploadSessionRequestBuilder createUploadSession() {
        return new CreateUploadSessionRequestBuilder(pathParameters, requestAdapter);
    }
    /** The follow property */
    @javax.annotation.Nonnull
    public FollowRequestBuilder follow() {
        return new FollowRequestBuilder(pathParameters, requestAdapter);
    }
    /** The invite property */
    @javax.annotation.Nonnull
    public InviteRequestBuilder invite() {
        return new InviteRequestBuilder(pathParameters, requestAdapter);
    }
    /** The listItem property */
    @javax.annotation.Nonnull
    public ListItemRequestBuilder listItem() {
        return new ListItemRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The permissions property */
    @javax.annotation.Nonnull
    public PermissionsRequestBuilder permissions() {
        return new PermissionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The preview property */
    @javax.annotation.Nonnull
    public PreviewRequestBuilder preview() {
        return new PreviewRequestBuilder(pathParameters, requestAdapter);
    }
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** The restore property */
    @javax.annotation.Nonnull
    public RestoreRequestBuilder restore() {
        return new RestoreRequestBuilder(pathParameters, requestAdapter);
    }
    /** The subscriptions property */
    @javax.annotation.Nonnull
    public SubscriptionsRequestBuilder subscriptions() {
        return new SubscriptionsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The thumbnails property */
    @javax.annotation.Nonnull
    public ThumbnailsRequestBuilder thumbnails() {
        return new ThumbnailsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The unfollow property */
    @javax.annotation.Nonnull
    public UnfollowRequestBuilder unfollow() {
        return new UnfollowRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /** The validatePermission property */
    @javax.annotation.Nonnull
    public ValidatePermissionRequestBuilder validatePermission() {
        return new ValidatePermissionRequestBuilder(pathParameters, requestAdapter);
    }
    /** The versions property */
    @javax.annotation.Nonnull
    public VersionsRequestBuilder versions() {
        return new VersionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.workbooks.item.children.item collection
     * @param id Unique identifier of the item
     * @return a DriveItemItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DriveItemItemRequestBuilder children(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("driveItem%2Did1", id);
        return new DriveItemItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DriveItemItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DriveItemItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/workbooks/{driveItem%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new DriveItemItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public DriveItemItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/workbooks/{driveItem%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete entity from workbooks
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete entity from workbooks
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DriveItemItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final DriveItemItemRequestBuilderDeleteRequestConfiguration requestConfig = new DriveItemItemRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get entity from workbooks by key
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get entity from workbooks by key
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<DriveItemItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final DriveItemItemRequestBuilderGetRequestConfiguration requestConfig = new DriveItemItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update entity in workbooks
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final DriveItem body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update entity in workbooks
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final DriveItem body, @javax.annotation.Nullable final java.util.function.Consumer<DriveItemItemRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final DriveItemItemRequestBuilderPatchRequestConfiguration requestConfig = new DriveItemItemRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete entity from workbooks
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete() {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Delete entity from workbooks
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<DriveItemItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createDeleteRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Void>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to call the delta method.
     * @return a deltaRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeltaRequestBuilder delta() {
        return new DeltaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the delta method.
     * @param token Usage: token='{token}'
     * @return a deltaWithTokenRequestBuilder
     */
    @javax.annotation.Nonnull
    public DeltaWithTokenRequestBuilder deltaWithToken(@javax.annotation.Nonnull final String token) {
        Objects.requireNonNull(token);
        return new DeltaWithTokenRequestBuilder(pathParameters, requestAdapter, token);
    }
    /**
     * Get entity from workbooks by key
     * @return a CompletableFuture of driveItem
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DriveItem> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DriveItem::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DriveItem>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Get entity from workbooks by key
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of driveItem
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DriveItem> get(@javax.annotation.Nullable final java.util.function.Consumer<DriveItemItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DriveItem::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DriveItem>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Provides operations to call the getActivitiesByInterval method.
     * @return a getActivitiesByIntervalRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetActivitiesByIntervalRequestBuilder getActivitiesByInterval() {
        return new GetActivitiesByIntervalRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the getActivitiesByInterval method.
     * @param endDateTime Usage: endDateTime='{endDateTime}'
     * @param interval Usage: interval='{interval}'
     * @param startDateTime Usage: startDateTime='{startDateTime}'
     * @return a getActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithIntervalRequestBuilder
     */
    @javax.annotation.Nonnull
    public GetActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithIntervalRequestBuilder getActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithInterval(@javax.annotation.Nonnull final String endDateTime, @javax.annotation.Nonnull final String interval, @javax.annotation.Nonnull final String startDateTime) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(interval);
        Objects.requireNonNull(startDateTime);
        return new GetActivitiesByIntervalWithStartDateTimeWithEndDateTimeWithIntervalRequestBuilder(pathParameters, requestAdapter, endDateTime, interval, startDateTime);
    }
    /**
     * Update entity in workbooks
     * @param body 
     * @return a CompletableFuture of driveItem
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DriveItem> patch(@javax.annotation.Nonnull final DriveItem body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DriveItem::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DriveItem>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update entity in workbooks
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of driveItem
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<DriveItem> patch(@javax.annotation.Nonnull final DriveItem body, @javax.annotation.Nullable final java.util.function.Consumer<DriveItemItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, DriveItem::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<DriveItem>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.workbooks.item.permissions.item collection
     * @param id Unique identifier of the item
     * @return a PermissionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public PermissionItemRequestBuilder permissions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("permission%2Did", id);
        return new PermissionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Provides operations to call the search method.
     * @param q Usage: q='{q}'
     * @return a searchWithQRequestBuilder
     */
    @javax.annotation.Nonnull
    public SearchWithQRequestBuilder searchWithQ(@javax.annotation.Nonnull final String q) {
        Objects.requireNonNull(q);
        return new SearchWithQRequestBuilder(pathParameters, requestAdapter, q);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.workbooks.item.subscriptions.item collection
     * @param id Unique identifier of the item
     * @return a SubscriptionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SubscriptionItemRequestBuilder subscriptions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("subscription%2Did", id);
        return new SubscriptionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.workbooks.item.thumbnails.item collection
     * @param id Unique identifier of the item
     * @return a ThumbnailSetItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ThumbnailSetItemRequestBuilder thumbnails(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("thumbnailSet%2Did", id);
        return new ThumbnailSetItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.workbooks.item.versions.item collection
     * @param id Unique identifier of the item
     * @return a DriveItemVersionItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public DriveItemVersionItemRequestBuilder versions(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("driveItemVersion%2Did", id);
        return new DriveItemVersionItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DriveItemItemRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new DriveItemItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DriveItemItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Get entity from workbooks by key */
    public class DriveItemItemRequestBuilderGetQueryParameters {
        /** Expand related entities */
        @QueryParameter(name = "%24expand")
        @javax.annotation.Nullable
        public String[] expand;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DriveItemItemRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public DriveItemItemRequestBuilderGetQueryParameters queryParameters = new DriveItemItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new DriveItemItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DriveItemItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class DriveItemItemRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new DriveItemItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public DriveItemItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
