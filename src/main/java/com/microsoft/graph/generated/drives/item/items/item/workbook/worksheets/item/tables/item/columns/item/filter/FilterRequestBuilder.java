package com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.item.columns.item.filter;

import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.item.columns.item.filter.apply.ApplyRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.item.columns.item.filter.applybottomitemsfilter.ApplyBottomItemsFilterRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.item.columns.item.filter.applybottompercentfilter.ApplyBottomPercentFilterRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.item.columns.item.filter.applycellcolorfilter.ApplyCellColorFilterRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.item.columns.item.filter.applycustomfilter.ApplyCustomFilterRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.item.columns.item.filter.applydynamicfilter.ApplyDynamicFilterRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.item.columns.item.filter.applyfontcolorfilter.ApplyFontColorFilterRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.item.columns.item.filter.applyiconfilter.ApplyIconFilterRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.item.columns.item.filter.applytopitemsfilter.ApplyTopItemsFilterRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.item.columns.item.filter.applytoppercentfilter.ApplyTopPercentFilterRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.item.columns.item.filter.applyvaluesfilter.ApplyValuesFilterRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.worksheets.item.tables.item.columns.item.filter.clear.ClearRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.WorkbookFilter;
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
 * Provides operations to manage the filter property of the microsoft.graph.workbookTableColumn entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FilterRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the apply method.
     * @return a {@link ApplyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApplyRequestBuilder apply() {
        return new ApplyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the applyBottomItemsFilter method.
     * @return a {@link ApplyBottomItemsFilterRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApplyBottomItemsFilterRequestBuilder applyBottomItemsFilter() {
        return new ApplyBottomItemsFilterRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the applyBottomPercentFilter method.
     * @return a {@link ApplyBottomPercentFilterRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApplyBottomPercentFilterRequestBuilder applyBottomPercentFilter() {
        return new ApplyBottomPercentFilterRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the applyCellColorFilter method.
     * @return a {@link ApplyCellColorFilterRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApplyCellColorFilterRequestBuilder applyCellColorFilter() {
        return new ApplyCellColorFilterRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the applyCustomFilter method.
     * @return a {@link ApplyCustomFilterRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApplyCustomFilterRequestBuilder applyCustomFilter() {
        return new ApplyCustomFilterRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the applyDynamicFilter method.
     * @return a {@link ApplyDynamicFilterRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApplyDynamicFilterRequestBuilder applyDynamicFilter() {
        return new ApplyDynamicFilterRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the applyFontColorFilter method.
     * @return a {@link ApplyFontColorFilterRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApplyFontColorFilterRequestBuilder applyFontColorFilter() {
        return new ApplyFontColorFilterRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the applyIconFilter method.
     * @return a {@link ApplyIconFilterRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApplyIconFilterRequestBuilder applyIconFilter() {
        return new ApplyIconFilterRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the applyTopItemsFilter method.
     * @return a {@link ApplyTopItemsFilterRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApplyTopItemsFilterRequestBuilder applyTopItemsFilter() {
        return new ApplyTopItemsFilterRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the applyTopPercentFilter method.
     * @return a {@link ApplyTopPercentFilterRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApplyTopPercentFilterRequestBuilder applyTopPercentFilter() {
        return new ApplyTopPercentFilterRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the applyValuesFilter method.
     * @return a {@link ApplyValuesFilterRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApplyValuesFilterRequestBuilder applyValuesFilter() {
        return new ApplyValuesFilterRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the clear method.
     * @return a {@link ClearRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ClearRequestBuilder clear() {
        return new ClearRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link FilterRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FilterRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/worksheets/{workbookWorksheet%2Did}/tables/{workbookTable%2Did}/columns/{workbookTableColumn%2Did}/filter{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new {@link FilterRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FilterRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/worksheets/{workbookWorksheet%2Did}/tables/{workbookTable%2Did}/columns/{workbookTableColumn%2Did}/filter{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property filter for drives
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property filter for drives
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    public void delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * Retrieve the filter applied to the column. Read-only.
     * @return a {@link WorkbookFilter}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public WorkbookFilter get() {
        return get(null);
    }
    /**
     * Retrieve the filter applied to the column. Read-only.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link WorkbookFilter}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public WorkbookFilter get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, WorkbookFilter::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property filter in drives
     * @param body The request body
     * @return a {@link WorkbookFilter}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public WorkbookFilter patch(@jakarta.annotation.Nonnull final WorkbookFilter body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property filter in drives
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link WorkbookFilter}
     * @throws ODataError When receiving a 4XX or 5XX status code
     */
    @jakarta.annotation.Nullable
    public WorkbookFilter patch(@jakarta.annotation.Nonnull final WorkbookFilter body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, WorkbookFilter::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property filter for drives
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property filter for drives
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/worksheets/{workbookWorksheet%2Did}/tables/{workbookTable%2Did}/columns/{workbookTableColumn%2Did}/filter", pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Retrieve the filter applied to the column. Read-only.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the filter applied to the column. Read-only.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Update the navigation property filter in drives
     * @param body The request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WorkbookFilter body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property filter in drives
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WorkbookFilter body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/worksheets/{workbookWorksheet%2Did}/tables/{workbookTable%2Did}/columns/{workbookTableColumn%2Did}/filter", pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link FilterRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FilterRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new FilterRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve the filter applied to the column. Read-only.
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
         * @return a {@link Map<String, Object>}
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
