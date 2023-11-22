package com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.charts.item.axes.valueaxis.minorgridlines;

import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.charts.item.axes.valueaxis.minorgridlines.format.FormatRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.WorkbookChartGridlines;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameter;
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
 * Provides operations to manage the minorGridlines property of the microsoft.graph.workbookChartAxis entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MinorGridlinesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the format property of the microsoft.graph.workbookChartGridlines entity.
     */
    @jakarta.annotation.Nonnull
    public FormatRequestBuilder format() {
        return new FormatRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new MinorGridlinesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MinorGridlinesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/worksheets/{workbookWorksheet%2Did}/charts/{workbookChart%2Did}/axes/valueAxis/minorGridlines{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new MinorGridlinesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MinorGridlinesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/worksheets/{workbookWorksheet%2Did}/charts/{workbookChart%2Did}/axes/valueAxis/minorGridlines{?%24select,%24expand}", rawUrl);
    }
    /**
     * Delete navigation property minorGridlines for drives
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property minorGridlines for drives
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
     * Retrieve the properties and relationships of chartgridlines object. This API is available in the following national cloud deployments.
     * @return a WorkbookChartGridlines
     * @see <a href="https://learn.microsoft.com/graph/api/chartgridlines-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public WorkbookChartGridlines get() {
        return get(null);
    }
    /**
     * Retrieve the properties and relationships of chartgridlines object. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a WorkbookChartGridlines
     * @see <a href="https://learn.microsoft.com/graph/api/chartgridlines-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public WorkbookChartGridlines get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, WorkbookChartGridlines::createFromDiscriminatorValue);
    }
    /**
     * Update the properties of chartgridlines object. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a WorkbookChartGridlines
     * @see <a href="https://learn.microsoft.com/graph/api/chartgridlines-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public WorkbookChartGridlines patch(@jakarta.annotation.Nonnull final WorkbookChartGridlines body) {
        return patch(body, null);
    }
    /**
     * Update the properties of chartgridlines object. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a WorkbookChartGridlines
     * @see <a href="https://learn.microsoft.com/graph/api/chartgridlines-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public WorkbookChartGridlines patch(@jakarta.annotation.Nonnull final WorkbookChartGridlines body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, WorkbookChartGridlines::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property minorGridlines for drives
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property minorGridlines for drives
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
     * Retrieve the properties and relationships of chartgridlines object. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and relationships of chartgridlines object. This API is available in the following national cloud deployments.
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
     * Update the properties of chartgridlines object. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WorkbookChartGridlines body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of chartgridlines object. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WorkbookChartGridlines body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a MinorGridlinesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public MinorGridlinesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MinorGridlinesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve the properties and relationships of chartgridlines object. This API is available in the following national cloud deployments.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters {
        /**
         * Expand related entities
         */
        @QueryParameter(name = "%24expand")
        @jakarta.annotation.Nullable
        public String[] expand;
        /**
         * Select properties to be returned
         */
        @QueryParameter(name = "%24select")
        @jakarta.annotation.Nullable
        public String[] select;
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
