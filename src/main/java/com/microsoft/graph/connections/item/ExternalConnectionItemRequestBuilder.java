package com.microsoft.graph.connections.item;

import com.microsoft.graph.connections.item.groups.GroupsRequestBuilder;
import com.microsoft.graph.connections.item.groups.item.ExternalGroupItemRequestBuilder;
import com.microsoft.graph.connections.item.items.item.ExternalItemItemRequestBuilder;
import com.microsoft.graph.connections.item.items.ItemsRequestBuilder;
import com.microsoft.graph.connections.item.operations.item.ConnectionOperationItemRequestBuilder;
import com.microsoft.graph.connections.item.operations.OperationsRequestBuilder;
import com.microsoft.graph.connections.item.schema.SchemaRequestBuilder;
import com.microsoft.graph.models.externalconnectors.ExternalConnection;
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
/** Provides operations to manage the collection of externalConnection entities. */
public class ExternalConnectionItemRequestBuilder {
    /** The groups property */
    @javax.annotation.Nonnull
    public GroupsRequestBuilder groups() {
        return new GroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The items property */
    @javax.annotation.Nonnull
    public ItemsRequestBuilder items() {
        return new ItemsRequestBuilder(pathParameters, requestAdapter);
    }
    /** The operations property */
    @javax.annotation.Nonnull
    public OperationsRequestBuilder operations() {
        return new OperationsRequestBuilder(pathParameters, requestAdapter);
    }
    /** Path parameters for the request */
    private HashMap<String, Object> pathParameters;
    /** The request adapter to use to execute the requests. */
    private RequestAdapter requestAdapter;
    /** The schema property */
    @javax.annotation.Nonnull
    public SchemaRequestBuilder schema() {
        return new SchemaRequestBuilder(pathParameters, requestAdapter);
    }
    /** Url template to use to build the URL for the current request builder */
    private String urlTemplate;
    /**
     * Instantiates a new ExternalConnectionItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ExternalConnectionItemRequestBuilder(@javax.annotation.Nonnull final HashMap<String, Object> pathParameters, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        Objects.requireNonNull(pathParameters);
        Objects.requireNonNull(requestAdapter);
        this.urlTemplate = "{+baseurl}/connections/{externalConnection%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(pathParameters);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Instantiates a new ExternalConnectionItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     * @return a void
     */
    @javax.annotation.Nullable
    public ExternalConnectionItemRequestBuilder(@javax.annotation.Nonnull final String rawUrl, @javax.annotation.Nonnull final RequestAdapter requestAdapter) {
        this.urlTemplate = "{+baseurl}/connections/{externalConnection%2Did}{?%24select,%24expand}";
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>();
        urlTplParams.put("request-raw-url", rawUrl);
        this.pathParameters = urlTplParams;
        this.requestAdapter = requestAdapter;
    }
    /**
     * Delete entity from connections
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation() throws URISyntaxException {
        return createDeleteRequestInformation(null);
    }
    /**
     * Delete entity from connections
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createDeleteRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<ExternalConnectionItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.DELETE;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        if (requestConfiguration != null) {
            final ExternalConnectionItemRequestBuilderDeleteRequestConfiguration requestConfig = new ExternalConnectionItemRequestBuilderDeleteRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Get entity from connections by key
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation() throws URISyntaxException {
        return createGetRequestInformation(null);
    }
    /**
     * Get entity from connections by key
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createGetRequestInformation(@javax.annotation.Nullable final java.util.function.Consumer<ExternalConnectionItemRequestBuilderGetRequestConfiguration> requestConfiguration) throws URISyntaxException {
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.GET;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        if (requestConfiguration != null) {
            final ExternalConnectionItemRequestBuilderGetRequestConfiguration requestConfig = new ExternalConnectionItemRequestBuilderGetRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addQueryParameters(requestConfig.queryParameters);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Update entity in connections
     * @param body 
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final ExternalConnection body) throws URISyntaxException {
        return createPatchRequestInformation(body, null);
    }
    /**
     * Update entity in connections
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @javax.annotation.Nonnull
    public RequestInformation createPatchRequestInformation(@javax.annotation.Nonnull final ExternalConnection body, @javax.annotation.Nullable final java.util.function.Consumer<ExternalConnectionItemRequestBuilderPatchRequestConfiguration> requestConfiguration) throws URISyntaxException {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation() {{
            httpMethod = HttpMethod.PATCH;
        }};
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.addRequestHeader("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final ExternalConnectionItemRequestBuilderPatchRequestConfiguration requestConfig = new ExternalConnectionItemRequestBuilderPatchRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.addRequestHeaders(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Delete entity from connections
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
     * Delete entity from connections
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of void
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> delete(@javax.annotation.Nullable final java.util.function.Consumer<ExternalConnectionItemRequestBuilderDeleteRequestConfiguration> requestConfiguration) {
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
     * Get entity from connections by key
     * @return a CompletableFuture of externalConnection
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ExternalConnection> get() {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ExternalConnection::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<ExternalConnection>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Get entity from connections by key
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of externalConnection
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ExternalConnection> get(@javax.annotation.Nullable final java.util.function.Consumer<ExternalConnectionItemRequestBuilderGetRequestConfiguration> requestConfiguration) {
        try {
            final RequestInformation requestInfo = createGetRequestInformation(requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ExternalConnection::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<ExternalConnection>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Gets an item from the com.Microsoft.Graph.connections.item.groups.item collection
     * @param id Unique identifier of the item
     * @return a ExternalGroupItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ExternalGroupItemRequestBuilder groups(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("externalGroup%2Did", id);
        return new ExternalGroupItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.connections.item.items.item collection
     * @param id Unique identifier of the item
     * @return a ExternalItemItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ExternalItemItemRequestBuilder items(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("externalItem%2Did", id);
        return new ExternalItemItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Gets an item from the com.Microsoft.Graph.connections.item.operations.item collection
     * @param id Unique identifier of the item
     * @return a ConnectionOperationItemRequestBuilder
     */
    @javax.annotation.Nonnull
    public ConnectionOperationItemRequestBuilder operations(@javax.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("connectionOperation%2Did", id);
        return new ConnectionOperationItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Update entity in connections
     * @param body 
     * @return a CompletableFuture of externalConnection
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ExternalConnection> patch(@javax.annotation.Nonnull final ExternalConnection body) {
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, null);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ExternalConnection::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<ExternalConnection>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /**
     * Update entity in connections
     * @param body 
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a CompletableFuture of externalConnection
     */
    @javax.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<ExternalConnection> patch(@javax.annotation.Nonnull final ExternalConnection body, @javax.annotation.Nullable final java.util.function.Consumer<ExternalConnectionItemRequestBuilderPatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        try {
            final RequestInformation requestInfo = createPatchRequestInformation(body, requestConfiguration);
            final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>(2) {{
                put("4XX", ODataError::createFromDiscriminatorValue);
                put("5XX", ODataError::createFromDiscriminatorValue);
            }};
            return this.requestAdapter.sendAsync(requestInfo, ExternalConnection::createFromDiscriminatorValue, errorMapping);
        } catch (URISyntaxException ex) {
            return new java.util.concurrent.CompletableFuture<ExternalConnection>() {{
                this.completeExceptionally(ex);
            }};
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ExternalConnectionItemRequestBuilderDeleteRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new ExternalConnectionItemRequestBuilderDeleteRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public ExternalConnectionItemRequestBuilderDeleteRequestConfiguration() {
        }
    }
    /** Get entity from connections by key */
    public class ExternalConnectionItemRequestBuilderGetQueryParameters {
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
    public class ExternalConnectionItemRequestBuilderGetRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /** Request query parameters */
        @javax.annotation.Nullable
        public ExternalConnectionItemRequestBuilderGetQueryParameters queryParameters = new ExternalConnectionItemRequestBuilderGetQueryParameters();
        /**
         * Instantiates a new ExternalConnectionItemRequestBuilderGetRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public ExternalConnectionItemRequestBuilderGetRequestConfiguration() {
        }
    }
    /** Configuration for the request such as headers, query parameters, and middleware options. */
    public class ExternalConnectionItemRequestBuilderPatchRequestConfiguration {
        /** Request headers */
        @javax.annotation.Nullable
        public HashMap<String, String> headers = new HashMap<>();
        /** Request options */
        @javax.annotation.Nullable
        public java.util.List<RequestOption> options = Collections.emptyList();
        /**
         * Instantiates a new ExternalConnectionItemRequestBuilderPatchRequestConfiguration and sets the default values.
         * @return a void
         */
        @javax.annotation.Nullable
        public ExternalConnectionItemRequestBuilderPatchRequestConfiguration() {
        }
    }
}
