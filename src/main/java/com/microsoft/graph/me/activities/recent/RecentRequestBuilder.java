package com.microsoft.graph.me.activities.recent;

import com.microsoft.graph.models.odataerrors.ODataError;
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
/** Provides operations to call the recent method. */
public class RecentRequestBuilder {
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new RecentRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public RecentRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/me/activities/microsoft.graph.recent(){?%24top,%24skip,%24search,%24filter,%24count,%24select,%24orderby}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new RecentRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public RecentRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/me/activities/microsoft.graph.recent(){?%24top,%24skip,%24search,%24filter,%24count,%24select,%24orderby}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Get recent activities for a given user. This OData function has some default behaviors included to make it operate like a 'most recently used' API. The service will query for the most recent historyItems, and then pull those related activities. Activities will be sorted according to the most recent **lastModified** on the **historyItem**. This means that activities without **historyItems** will not be included in the response. The UserActivity.ReadWrite.CreatedByApp permission will also apply extra filtering to the response, so that only activities created by your application are returned. This server-side filtering might result in empty pages if the user is particularly active and other applications have created more recent activities. To get your application's activities, use the **nextLink** property to paginate.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get recent activities for a given user. This OData function has some default behaviors included to make it operate like a 'most recently used' API. The service will query for the most recent historyItems, and then pull those related activities. Activities will be sorted according to the most recent **lastModified** on the **historyItem**. This means that activities without **historyItems** will not be included in the response. The UserActivity.ReadWrite.CreatedByApp permission will also apply extra filtering to the response, so that only activities created by your application are returned. This server-side filtering might result in empty pages if the user is particularly active and other applications have created more recent activities. To get your application's activities, use the **nextLink** property to paginate.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<RecentRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final RecentRequestBuilderGetRequestConfiguration requestConfig = new RecentRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get recent activities for a given user. This OData function has some default behaviors included to make it operate like a 'most recently used' API. The service will query for the most recent historyItems, and then pull those related activities. Activities will be sorted according to the most recent **lastModified** on the **historyItem**. This means that activities without **historyItems** will not be included in the response. The UserActivity.ReadWrite.CreatedByApp permission will also apply extra filtering to the response, so that only activities created by your application are returned. This server-side filtering might result in empty pages if the user is particularly active and other applications have created more recent activities. To get your application's activities, use the **nextLink** property to paginate.
     * @return a CompletableFuture of recentResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<RecentResponse> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, RecentResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<RecentResponse>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Get recent activities for a given user. This OData function has some default behaviors included to make it operate like a 'most recently used' API. The service will query for the most recent historyItems, and then pull those related activities. Activities will be sorted according to the most recent **lastModified** on the **historyItem**. This means that activities without **historyItems** will not be included in the response. The UserActivity.ReadWrite.CreatedByApp permission will also apply extra filtering to the response, so that only activities created by your application are returned. This server-side filtering might result in empty pages if the user is particularly active and other applications have created more recent activities. To get your application's activities, use the **nextLink** property to paginate.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of recentResponse
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<RecentResponse> get(@javax.annotation.Nullable final java.util.function.Consumer<RecentRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, RecentResponse::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<RecentResponse>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /** Get recent activities for a given user. This OData function has some default behaviors included to make it operate like a 'most recently used' API. The service will query for the most recent historyItems, and then pull those related activities. Activities will be sorted according to the most recent **lastModified** on the **historyItem**. This means that activities without **historyItems** will not be included in the response. The UserActivity.ReadWrite.CreatedByApp permission will also apply extra filtering to the response, so that only activities created by your application are returned. This server-side filtering might result in empty pages if the user is particularly active and other applications have created more recent activities. To get your application's activities, use the **nextLink** property to paginate. */
    public class RecentRequestBuilderGetQueryParameters {
        /** Include count of items */
        @QueryParameter(name = "%24count")
        @javax.annotation.Nullable
        public Boolean count;
        /** Filter items by property values */
        @QueryParameter(name = "%24filter")
        @javax.annotation.Nullable
        public String filter;
        /** Order items by property values */
        @QueryParameter(name = "%24orderby")
        @javax.annotation.Nullable
        public String[] orderby;
        /** Search items by search phrases */
        @QueryParameter(name = "%24search")
        @javax.annotation.Nullable
        public String search;
        /** Select properties to be returned */
        @QueryParameter(name = "%24select")
        @javax.annotation.Nullable
        public String[] select;
        /** Skip the first n items */
        @QueryParameter(name = "%24skip")
        @javax.annotation.Nullable
        public Integer skip;
        /** Show only the first n items */
        @QueryParameter(name = "%24top")
        @javax.annotation.Nullable
        public Integer top;
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class RecentRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public RecentRequestBuilderGetQueryParameters queryParameters = new RecentRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new recentRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public RecentRequestBuilderGetRequestConfiguration() {
        }
    }
}
