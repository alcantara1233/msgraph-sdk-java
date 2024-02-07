package com.microsoft.graph.deviceappmanagement.mobileapps.item.graphandroidstoreapp;

import com.microsoft.graph.deviceappmanagement.mobileapps.item.graphandroidstoreapp.assignments.AssignmentsRequestBuilder;
import com.microsoft.graph.deviceappmanagement.mobileapps.item.graphandroidstoreapp.categories.CategoriesRequestBuilder;
import com.microsoft.graph.models.AndroidStoreApp;
import com.microsoft.graph.models.odataerrors.ODataError;
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
 * Casts the previous resource to androidStoreApp.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GraphAndroidStoreAppRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the assignments property of the microsoft.graph.mobileApp entity.
     */
    @jakarta.annotation.Nonnull
    public AssignmentsRequestBuilder assignments() {
        return new AssignmentsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the categories property of the microsoft.graph.mobileApp entity.
     */
    @jakarta.annotation.Nonnull
    public CategoriesRequestBuilder categories() {
        return new CategoriesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new GraphAndroidStoreAppRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GraphAndroidStoreAppRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement/mobileApps/{mobileApp%2Did}/graph.androidStoreApp{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new GraphAndroidStoreAppRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public GraphAndroidStoreAppRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/deviceAppManagement/mobileApps/{mobileApp%2Did}/graph.androidStoreApp{?%24expand,%24select}", rawUrl);
    }
    /**
     * Get the item of type microsoft.graph.mobileApp as microsoft.graph.androidStoreApp
     * @return a AndroidStoreApp
     */
    @jakarta.annotation.Nullable
    public AndroidStoreApp get() {
        return get(null);
    }
    /**
     * Get the item of type microsoft.graph.mobileApp as microsoft.graph.androidStoreApp
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AndroidStoreApp
     */
    @jakarta.annotation.Nullable
    public AndroidStoreApp get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, AndroidStoreApp::createFromDiscriminatorValue);
    }
    /**
     * Get the item of type microsoft.graph.mobileApp as microsoft.graph.androidStoreApp
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get the item of type microsoft.graph.mobileApp as microsoft.graph.androidStoreApp
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a GraphAndroidStoreAppRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public GraphAndroidStoreAppRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new GraphAndroidStoreAppRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get the item of type microsoft.graph.mobileApp as microsoft.graph.androidStoreApp
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
}
