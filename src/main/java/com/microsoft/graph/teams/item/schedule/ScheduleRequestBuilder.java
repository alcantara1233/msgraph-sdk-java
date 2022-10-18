package com.microsoft.graph.teams.item.schedule;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.Schedule;
import com.microsoft.graph.teams.item.schedule.offershiftrequests.item.OfferShiftRequestItemRequestBuilder;
import com.microsoft.graph.teams.item.schedule.offershiftrequests.OfferShiftRequestsRequestBuilder;
import com.microsoft.graph.teams.item.schedule.openshiftchangerequests.item.OpenShiftChangeRequestItemRequestBuilder;
import com.microsoft.graph.teams.item.schedule.openshiftchangerequests.OpenShiftChangeRequestsRequestBuilder;
import com.microsoft.graph.teams.item.schedule.openshifts.item.OpenShiftItemRequestBuilder;
import com.microsoft.graph.teams.item.schedule.openshifts.OpenShiftsRequestBuilder;
import com.microsoft.graph.teams.item.schedule.schedulinggroups.item.SchedulingGroupItemRequestBuilder;
import com.microsoft.graph.teams.item.schedule.schedulinggroups.SchedulingGroupsRequestBuilder;
import com.microsoft.graph.teams.item.schedule.share.ShareRequestBuilder;
import com.microsoft.graph.teams.item.schedule.shifts.item.ShiftItemRequestBuilder;
import com.microsoft.graph.teams.item.schedule.shifts.ShiftsRequestBuilder;
import com.microsoft.graph.teams.item.schedule.swapshiftschangerequests.item.SwapShiftsChangeRequestItemRequestBuilder;
import com.microsoft.graph.teams.item.schedule.swapshiftschangerequests.SwapShiftsChangeRequestsRequestBuilder;
import com.microsoft.graph.teams.item.schedule.timeoffreasons.item.TimeOffReasonItemRequestBuilder;
import com.microsoft.graph.teams.item.schedule.timeoffreasons.TimeOffReasonsRequestBuilder;
import com.microsoft.graph.teams.item.schedule.timeoffrequests.item.TimeOffRequestItemRequestBuilder;
import com.microsoft.graph.teams.item.schedule.timeoffrequests.TimeOffRequestsRequestBuilder;
import com.microsoft.graph.teams.item.schedule.timesoff.item.TimeOffItemRequestBuilder;
import com.microsoft.graph.teams.item.schedule.timesoff.TimesOffRequestBuilder;
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
/** Provides operations to manage the schedule property of the microsoft.graph.team entity. */
public class ScheduleRequestBuilder {
    /** The offerShiftRequests property */
    @javax.annotation.Nonnull
    public OfferShiftRequestsRequestBuilder offerShiftRequests() {
        return new OfferShiftRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The openShiftChangeRequests property */
    @javax.annotation.Nonnull
    public OpenShiftChangeRequestsRequestBuilder openShiftChangeRequests() {
        return new OpenShiftChangeRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The openShifts property */
    @javax.annotation.Nonnull
    public OpenShiftsRequestBuilder openShifts() {
        return new OpenShiftsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** The schedulingGroups property */
    @javax.annotation.Nonnull
    public SchedulingGroupsRequestBuilder schedulingGroups() {
        return new SchedulingGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The share property */
    @javax.annotation.Nonnull
    public ShareRequestBuilder share() {
        return new ShareRequestBuilder(pathParameters, requestAdapter);
    }
    /** The shifts property */
    @javax.annotation.Nonnull
    public ShiftsRequestBuilder shifts() {
        return new ShiftsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The swapShiftsChangeRequests property */
    @javax.annotation.Nonnull
    public SwapShiftsChangeRequestsRequestBuilder swapShiftsChangeRequests() {
        return new SwapShiftsChangeRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The timeOffReasons property */
    @javax.annotation.Nonnull
    public TimeOffReasonsRequestBuilder timeOffReasons() {
        return new TimeOffReasonsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The timeOffRequests property */
    @javax.annotation.Nonnull
    public TimeOffRequestsRequestBuilder timeOffRequests() {
        return new TimeOffRequestsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The timesOff property */
    @javax.annotation.Nonnull
    public TimesOffRequestBuilder timesOff() {
        return new TimesOffRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new ScheduleRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ScheduleRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/teams/{team%2Did}/schedule{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new ScheduleRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ScheduleRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/teams/{team%2Did}/schedule{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete navigation property schedule for teams
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property schedule for teams
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<ScheduleRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final ScheduleRequestBuilderDeleteRequestConfiguration requestConfig = new ScheduleRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Retrieve the properties and relationships of a schedule object. The schedule creation process conforms to the One API guideline for resource based long running operations (RELO).When clients use the PUT method, if the schedule is provisioned, the operation updates the schedule; otherwise, the operation starts the schedule provisioning process in the background. During schedule provisioning, clients can use the GET method to get the schedule and look at the `provisionStatus` property for the current state of the provisioning. If the provisioning failed, clients can get additional information from the `provisionStatusCode` property. Clients can also inspect the configuration of the schedule.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and relationships of a schedule object. The schedule creation process conforms to the One API guideline for resource based long running operations (RELO).When clients use the PUT method, if the schedule is provisioned, the operation updates the schedule; otherwise, the operation starts the schedule provisioning process in the background. During schedule provisioning, clients can use the GET method to get the schedule and look at the `provisionStatus` property for the current state of the provisioning. If the provisioning failed, clients can get additional information from the `provisionStatusCode` property. Clients can also inspect the configuration of the schedule.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<ScheduleRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final ScheduleRequestBuilderGetRequestConfiguration requestConfig = new ScheduleRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update the navigation property schedule in teams
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPutRequestInformation(@javax.annotation.Nonnull final Schedule body) throws URISyntaxException {
        return createPutRequestInformation(body, null);
    }
    /**
     * Update the navigation property schedule in teams
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPutRequestInformation(@javax.annotation.Nonnull final Schedule body, @javax.annotation.Nullable final java.util.function.Consumer<ScheduleRequestBuilderPutRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PUT;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final ScheduleRequestBuilderPutRequestConfiguration requestConfig = new ScheduleRequestBuilderPutRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete navigation property schedule for teams
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
     * Delete navigation property schedule for teams
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<ScheduleRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
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
     * Retrieve the properties and relationships of a schedule object. The schedule creation process conforms to the One API guideline for resource based long running operations (RELO).When clients use the PUT method, if the schedule is provisioned, the operation updates the schedule; otherwise, the operation starts the schedule provisioning process in the background. During schedule provisioning, clients can use the GET method to get the schedule and look at the `provisionStatus` property for the current state of the provisioning. If the provisioning failed, clients can get additional information from the `provisionStatusCode` property. Clients can also inspect the configuration of the schedule.
     * @return a CompletableFuture of schedule
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Schedule> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Schedule::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Schedule>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Retrieve the properties and relationships of a schedule object. The schedule creation process conforms to the One API guideline for resource based long running operations (RELO).When clients use the PUT method, if the schedule is provisioned, the operation updates the schedule; otherwise, the operation starts the schedule provisioning process in the background. During schedule provisioning, clients can use the GET method to get the schedule and look at the `provisionStatus` property for the current state of the provisioning. If the provisioning failed, clients can get additional information from the `provisionStatusCode` property. Clients can also inspect the configuration of the schedule.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of schedule
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Schedule> get(@javax.annotation.Nullable final java.util.function.Consumer<ScheduleRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Schedule::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Schedule>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.teams.item.schedule.offerShiftRequests.item collection
     * @param id Unique identifier of the item
     * @return a OfferShiftRequestItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OfferShiftRequestItemRequestBuilder offerShiftRequests(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("offerShiftRequest%2Did", id);
        return new OfferShiftRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.teams.item.schedule.openShiftChangeRequests.item collection
     * @param id Unique identifier of the item
     * @return a OpenShiftChangeRequestItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OpenShiftChangeRequestItemRequestBuilder openShiftChangeRequests(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("openShiftChangeRequest%2Did", id);
        return new OpenShiftChangeRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.teams.item.schedule.openShifts.item collection
     * @param id Unique identifier of the item
     * @return a OpenShiftItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public OpenShiftItemRequestBuilder openShifts(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("openShift%2Did", id);
        return new OpenShiftItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update the navigation property schedule in teams
     * @param body 
     * @return a CompletableFuture of schedule
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Schedule> put(@javax.annotation.Nonnull final Schedule body) {
        try {
            final RequestInformation requestInfo = createPutRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Schedule::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Schedule>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update the navigation property schedule in teams
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of schedule
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Schedule> put(@javax.annotation.Nonnull final Schedule body, @javax.annotation.Nullable final java.util.function.Consumer<ScheduleRequestBuilderPutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPutRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, Schedule::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<Schedule>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.teams.item.schedule.schedulingGroups.item collection
     * @param id Unique identifier of the item
     * @return a SchedulingGroupItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SchedulingGroupItemRequestBuilder schedulingGroups(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("schedulingGroup%2Did", id);
        return new SchedulingGroupItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.teams.item.schedule.shifts.item collection
     * @param id Unique identifier of the item
     * @return a ShiftItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ShiftItemRequestBuilder shifts(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("shift%2Did", id);
        return new ShiftItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.teams.item.schedule.swapShiftsChangeRequests.item collection
     * @param id Unique identifier of the item
     * @return a SwapShiftsChangeRequestItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public SwapShiftsChangeRequestItemRequestBuilder swapShiftsChangeRequests(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("swapShiftsChangeRequest%2Did", id);
        return new SwapShiftsChangeRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.teams.item.schedule.timeOffReasons.item collection
     * @param id Unique identifier of the item
     * @return a TimeOffReasonItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TimeOffReasonItemRequestBuilder timeOffReasons(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("timeOffReason%2Did", id);
        return new TimeOffReasonItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.teams.item.schedule.timeOffRequests.item collection
     * @param id Unique identifier of the item
     * @return a TimeOffRequestItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TimeOffRequestItemRequestBuilder timeOffRequests(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("timeOffRequest%2Did", id);
        return new TimeOffRequestItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.teams.item.schedule.timesOff.item collection
     * @param id Unique identifier of the item
     * @return a TimeOffItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public TimeOffItemRequestBuilder timesOff(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("timeOff%2Did", id);
        return new TimeOffItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ScheduleRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new scheduleRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public ScheduleRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Retrieve the properties and relationships of a schedule object. The schedule creation process conforms to the One API guideline for resource based long running operations (RELO).When clients use the PUT method, if the schedule is provisioned, the operation updates the schedule; otherwise, the operation starts the schedule provisioning process in the background. During schedule provisioning, clients can use the GET method to get the schedule and look at the `provisionStatus` property for the current state of the provisioning. If the provisioning failed, clients can get additional information from the `provisionStatusCode` property. Clients can also inspect the configuration of the schedule. */
    public class ScheduleRequestBuilderGetQueryParameters {
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
    public class ScheduleRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public ScheduleRequestBuilderGetQueryParameters queryParameters = new ScheduleRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new scheduleRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public ScheduleRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ScheduleRequestBuilderPutRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new scheduleRequestBuilderPutRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public ScheduleRequestBuilderPutRequestConfiguration() {
        }
    }
}
