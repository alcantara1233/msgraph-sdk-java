package com.microsoft.graph.users.item.planner.plans.item.buckets.item.tasks.item.assignedtotaskboardformat;

import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.PlannerAssignedToTaskBoardTaskFormat;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the assignedToTaskBoardFormat property of the microsoft.graph.plannerTask entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AssignedToTaskBoardFormatRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new AssignedToTaskBoardFormatRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AssignedToTaskBoardFormatRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/planner/plans/{plannerPlan%2Did}/buckets/{plannerBucket%2Did}/tasks/{plannerTask%2Did}/assignedToTaskBoardFormat{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new AssignedToTaskBoardFormatRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AssignedToTaskBoardFormatRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user%2Did}/planner/plans/{plannerPlan%2Did}/buckets/{plannerBucket%2Did}/tasks/{plannerTask%2Did}/assignedToTaskBoardFormat{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property assignedToTaskBoardFormat for users
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property assignedToTaskBoardFormat for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Retrieve the properties and relationships of a plannerAssignedToTaskBoardTaskFormat object.
     * @return a PlannerAssignedToTaskBoardTaskFormat
     * @see <a href="https://learn.microsoft.com/graph/api/plannerassignedtotaskboardtaskformat-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PlannerAssignedToTaskBoardTaskFormat get() {
        return get(null);
    }
    /**
     * Retrieve the properties and relationships of a plannerAssignedToTaskBoardTaskFormat object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a PlannerAssignedToTaskBoardTaskFormat
     * @see <a href="https://learn.microsoft.com/graph/api/plannerassignedtotaskboardtaskformat-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PlannerAssignedToTaskBoardTaskFormat get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PlannerAssignedToTaskBoardTaskFormat::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property assignedToTaskBoardFormat in users
     * @param body The request body
     * @return a PlannerAssignedToTaskBoardTaskFormat
     * @see <a href="https://learn.microsoft.com/graph/api/plannerassignedtotaskboardtaskformat-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PlannerAssignedToTaskBoardTaskFormat patch(@jakarta.annotation.Nonnull final PlannerAssignedToTaskBoardTaskFormat body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property assignedToTaskBoardFormat in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a PlannerAssignedToTaskBoardTaskFormat
     * @see <a href="https://learn.microsoft.com/graph/api/plannerassignedtotaskboardtaskformat-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public PlannerAssignedToTaskBoardTaskFormat patch(@jakarta.annotation.Nonnull final PlannerAssignedToTaskBoardTaskFormat body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PlannerAssignedToTaskBoardTaskFormat::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property assignedToTaskBoardFormat for users
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property assignedToTaskBoardFormat for users
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Retrieve the properties and relationships of a plannerAssignedToTaskBoardTaskFormat object.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and relationships of a plannerAssignedToTaskBoardTaskFormat object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property assignedToTaskBoardFormat in users
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final PlannerAssignedToTaskBoardTaskFormat body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property assignedToTaskBoardFormat in users
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final PlannerAssignedToTaskBoardTaskFormat body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a AssignedToTaskBoardFormatRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AssignedToTaskBoardFormatRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AssignedToTaskBoardFormatRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve the properties and relationships of a plannerAssignedToTaskBoardTaskFormat object.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Expand related entities
         */
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a Map<String, Object>
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("%24expand", expand);
            allQueryParams.put("%24select", select);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
