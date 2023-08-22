package com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.userprocessingresults;

import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.userprocessingresults.count.CountRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.userprocessingresults.item.UserProcessingResultItemRequestBuilder;
import com.microsoft.graph.identitygovernance.lifecycleworkflows.workflows.item.userprocessingresults.microsoftgraphidentitygovernancesummarywithstartdatetimewithenddatetime.MicrosoftGraphIdentityGovernanceSummaryWithStartDateTimeWithEndDateTimeRequestBuilder;
import com.microsoft.graph.models.identitygovernance.UserProcessingResultCollectionResponse;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.time.OffsetDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Provides operations to manage the userProcessingResults property of the microsoft.graph.identityGovernance.workflow entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserProcessingResultsRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the userProcessingResults property of the microsoft.graph.identityGovernance.workflow entity.
     * @param userProcessingResultId The unique identifier of userProcessingResult
     * @return a UserProcessingResultItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public UserProcessingResultItemRequestBuilder byUserProcessingResultId(@jakarta.annotation.Nonnull final String userProcessingResultId) {
        Objects.requireNonNull(userProcessingResultId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("userProcessingResult%2Did", userProcessingResultId);
        return new UserProcessingResultItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new UserProcessingResultsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserProcessingResultsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/workflows/{workflow%2Did}/userProcessingResults{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new UserProcessingResultsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UserProcessingResultsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/workflows/{workflow%2Did}/userProcessingResults{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Get the userProcessingResult resources for a workflow.
     * @return a CompletableFuture of userProcessingResultCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/identitygovernance-workflow-list-userprocessingresults?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UserProcessingResultCollectionResponse> get() {
        return get(null);
    }
    /**
     * Get the userProcessingResult resources for a workflow.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of userProcessingResultCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/identitygovernance-workflow-list-userprocessingresults?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<UserProcessingResultCollectionResponse> get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendAsync(requestInfo, UserProcessingResultCollectionResponse::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Provides operations to call the summary method.
     * @param endDateTime Usage: endDateTime={endDateTime}
     * @param startDateTime Usage: startDateTime={startDateTime}
     * @return a microsoftGraphIdentityGovernanceSummaryWithStartDateTimeWithEndDateTimeRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public MicrosoftGraphIdentityGovernanceSummaryWithStartDateTimeWithEndDateTimeRequestBuilder microsoftGraphIdentityGovernanceSummaryWithStartDateTimeWithEndDateTime(@jakarta.annotation.Nonnull final OffsetDateTime endDateTime, @jakarta.annotation.Nonnull final OffsetDateTime startDateTime) {
        Objects.requireNonNull(endDateTime);
        Objects.requireNonNull(startDateTime);
        return new MicrosoftGraphIdentityGovernanceSummaryWithStartDateTimeWithEndDateTimeRequestBuilder(pathParameters, requestAdapter, endDateTime, startDateTime);
    }
    /**
     * Get the userProcessingResult resources for a workflow.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the userProcessingResult resources for a workflow.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.GET;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.headers.add("Accept", "application/json");
        if (requestConfiguration != null) {
            final GetRequestConfiguration requestConfig = new GetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get the userProcessingResult resources for a workflow.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Include count of items
         */
        @QueryParameter(name = "%24count")
        @jakarta.annotation.Nullable
        public Boolean count;
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Filter items by property values
         */
        @QueryParameter(name = "%24filter")
        @jakarta.annotation.Nullable
        public String filter;
        /**
         * Order items by property values
         */
        @QueryParameter(name = "%24orderby")
        @jakarta.annotation.Nullable
        public String[] orderby;
        /**
         * Search items by search phrases
         */
        @QueryParameter(name = "%24search")
        @jakarta.annotation.Nullable
        public String search;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
        /**
         * Skip the first n items
         */
        @QueryParameter(name = "%24skip")
        @jakarta.annotation.Nullable
        public Integer skip;
        /**
         * Show only the first n items
         */
        @QueryParameter(name = "%24top")
        @jakarta.annotation.Nullable
        public Integer top;
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
}
