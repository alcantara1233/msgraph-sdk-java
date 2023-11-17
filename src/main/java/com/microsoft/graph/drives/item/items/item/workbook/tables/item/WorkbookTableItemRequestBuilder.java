package com.microsoft.graph.drives.item.items.item.workbook.tables.item;

import com.microsoft.graph.drives.item.items.item.workbook.tables.item.clearfilters.ClearFiltersRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.ColumnsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.converttorange.ConvertToRangeRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.databodyrange.DataBodyRangeRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.headerrowrange.HeaderRowRangeRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.range.RangeRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.reapplyfilters.ReapplyFiltersRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.rows.RowsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.sort.SortRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.totalrowrange.TotalRowRangeRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.worksheet.WorksheetRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.WorkbookTable;
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
 * Provides operations to manage the tables property of the microsoft.graph.workbook entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WorkbookTableItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the clearFilters method.
     */
    @jakarta.annotation.Nonnull
    public ClearFiltersRequestBuilder clearFilters() {
        return new ClearFiltersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the columns property of the microsoft.graph.workbookTable entity.
     */
    @jakarta.annotation.Nonnull
    public ColumnsRequestBuilder columns() {
        return new ColumnsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the convertToRange method.
     */
    @jakarta.annotation.Nonnull
    public ConvertToRangeRequestBuilder convertToRange() {
        return new ConvertToRangeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the dataBodyRange method.
     */
    @jakarta.annotation.Nonnull
    public DataBodyRangeRequestBuilder dataBodyRange() {
        return new DataBodyRangeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the headerRowRange method.
     */
    @jakarta.annotation.Nonnull
    public HeaderRowRangeRequestBuilder headerRowRange() {
        return new HeaderRowRangeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the range method.
     */
    @jakarta.annotation.Nonnull
    public RangeRequestBuilder range() {
        return new RangeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the reapplyFilters method.
     */
    @jakarta.annotation.Nonnull
    public ReapplyFiltersRequestBuilder reapplyFilters() {
        return new ReapplyFiltersRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the rows property of the microsoft.graph.workbookTable entity.
     */
    @jakarta.annotation.Nonnull
    public RowsRequestBuilder rows() {
        return new RowsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the sort property of the microsoft.graph.workbookTable entity.
     */
    @jakarta.annotation.Nonnull
    public SortRequestBuilder sort() {
        return new SortRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the totalRowRange method.
     */
    @jakarta.annotation.Nonnull
    public TotalRowRangeRequestBuilder totalRowRange() {
        return new TotalRowRangeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the worksheet property of the microsoft.graph.workbookTable entity.
     */
    @jakarta.annotation.Nonnull
    public WorksheetRequestBuilder worksheet() {
        return new WorksheetRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WorkbookTableItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WorkbookTableItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/tables/{workbookTable%2Did}{?%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new WorkbookTableItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WorkbookTableItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/tables/{workbookTable%2Did}{?%24select,%24expand}", rawUrl);
    }
    /**
     * Deletes the table. This API is available in the following national cloud deployments.
     * @see <a href="https://learn.microsoft.com/graph/api/table-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete() {
        delete(null);
    }
    /**
     * Deletes the table. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @see <a href="https://learn.microsoft.com/graph/api/table-delete?view=graph-rest-1.0">Find more info here</a>
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, Void.class, errorMapping);
    }
    /**
     * Retrieve the properties and relationships of table object. This API is available in the following national cloud deployments.
     * @return a WorkbookTable
     * @see <a href="https://learn.microsoft.com/graph/api/table-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public WorkbookTable get() {
        return get(null);
    }
    /**
     * Retrieve the properties and relationships of table object. This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a WorkbookTable
     * @see <a href="https://learn.microsoft.com/graph/api/table-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public WorkbookTable get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, WorkbookTable::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Update the properties of table object. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a WorkbookTable
     * @see <a href="https://learn.microsoft.com/graph/api/table-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public WorkbookTable patch(@jakarta.annotation.Nonnull final WorkbookTable body) {
        return patch(body, null);
    }
    /**
     * Update the properties of table object. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a WorkbookTable
     * @see <a href="https://learn.microsoft.com/graph/api/table-update?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public WorkbookTable patch(@jakarta.annotation.Nonnull final WorkbookTable body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, WorkbookTable::createFromDiscriminatorValue, errorMapping);
    }
    /**
     * Deletes the table. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Deletes the table. This API is available in the following national cloud deployments.
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
     * Retrieve the properties and relationships of table object. This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and relationships of table object. This API is available in the following national cloud deployments.
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
     * Update the properties of table object. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WorkbookTable body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the properties of table object. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WorkbookTable body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a WorkbookTableItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WorkbookTableItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WorkbookTableItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve the properties and relationships of table object. This API is available in the following national cloud deployments.
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
