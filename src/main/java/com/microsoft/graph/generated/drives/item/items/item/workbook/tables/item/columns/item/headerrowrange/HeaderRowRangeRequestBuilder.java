package com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange;

import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.boundingrectwithanotherrange.BoundingRectWithAnotherRangeRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.cellwithrowwithcolumn.CellWithRowWithColumnRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.clear.ClearRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.columnsafter.ColumnsAfterRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.columnsafterwithcount.ColumnsAfterWithCountRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.columnsbefore.ColumnsBeforeRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.columnsbeforewithcount.ColumnsBeforeWithCountRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.columnwithcolumn.ColumnWithColumnRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.delete.DeleteRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.entirecolumn.EntireColumnRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.entirerow.EntireRowRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.format.FormatRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.insert.InsertRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.intersectionwithanotherrange.IntersectionWithAnotherRangeRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.lastcell.LastCellRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.lastcolumn.LastColumnRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.lastrow.LastRowRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.merge.MergeRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.offsetrangewithrowoffsetwithcolumnoffset.OffsetRangeWithRowOffsetWithColumnOffsetRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.resizedrangewithdeltarowswithdeltacolumns.ResizedRangeWithDeltaRowsWithDeltaColumnsRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.rowsabove.RowsAboveRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.rowsabovewithcount.RowsAboveWithCountRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.rowsbelow.RowsBelowRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.rowsbelowwithcount.RowsBelowWithCountRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.rowwithrow.RowWithRowRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.sort.SortRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.unmerge.UnmergeRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.usedrange.UsedRangeRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.usedrangewithvaluesonly.UsedRangeWithValuesOnlyRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.visibleview.VisibleViewRequestBuilder;
import com.microsoft.graph.drives.item.items.item.workbook.tables.item.columns.item.headerrowrange.worksheet.WorksheetRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.WorkbookRange;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
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
 * Provides operations to call the headerRowRange method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HeaderRowRangeRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to call the clear method.
     * @return a {@link ClearRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ClearRequestBuilder clear() {
        return new ClearRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the columnsAfter method.
     * @return a {@link ColumnsAfterRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ColumnsAfterRequestBuilder columnsAfter() {
        return new ColumnsAfterRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the columnsBefore method.
     * @return a {@link ColumnsBeforeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ColumnsBeforeRequestBuilder columnsBefore() {
        return new ColumnsBeforeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the delete method.
     * @return a {@link DeleteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DeleteRequestBuilder deletePath() {
        return new DeleteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the entireColumn method.
     * @return a {@link EntireColumnRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EntireColumnRequestBuilder entireColumn() {
        return new EntireColumnRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the entireRow method.
     * @return a {@link EntireRowRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EntireRowRequestBuilder entireRow() {
        return new EntireRowRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the format property of the microsoft.graph.workbookRange entity.
     * @return a {@link FormatRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FormatRequestBuilder format() {
        return new FormatRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the insert method.
     * @return a {@link InsertRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InsertRequestBuilder insert() {
        return new InsertRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the lastCell method.
     * @return a {@link LastCellRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LastCellRequestBuilder lastCell() {
        return new LastCellRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the lastColumn method.
     * @return a {@link LastColumnRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LastColumnRequestBuilder lastColumn() {
        return new LastColumnRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the lastRow method.
     * @return a {@link LastRowRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public LastRowRequestBuilder lastRow() {
        return new LastRowRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the merge method.
     * @return a {@link MergeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MergeRequestBuilder merge() {
        return new MergeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rowsAbove method.
     * @return a {@link RowsAboveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RowsAboveRequestBuilder rowsAbove() {
        return new RowsAboveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the rowsBelow method.
     * @return a {@link RowsBelowRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RowsBelowRequestBuilder rowsBelow() {
        return new RowsBelowRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the sort property of the microsoft.graph.workbookRange entity.
     * @return a {@link SortRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SortRequestBuilder sort() {
        return new SortRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the unmerge method.
     * @return a {@link UnmergeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UnmergeRequestBuilder unmerge() {
        return new UnmergeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the usedRange method.
     * @return a {@link UsedRangeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UsedRangeRequestBuilder usedRange() {
        return new UsedRangeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the visibleView method.
     * @return a {@link VisibleViewRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public VisibleViewRequestBuilder visibleView() {
        return new VisibleViewRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the worksheet property of the microsoft.graph.workbookRange entity.
     * @return a {@link WorksheetRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WorksheetRequestBuilder worksheet() {
        return new WorksheetRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the boundingRect method.
     * @param anotherRange Usage: anotherRange='{anotherRange}'
     * @return a {@link BoundingRectWithAnotherRangeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public BoundingRectWithAnotherRangeRequestBuilder boundingRectWithAnotherRange(@jakarta.annotation.Nonnull final String anotherRange) {
        Objects.requireNonNull(anotherRange);
        return new BoundingRectWithAnotherRangeRequestBuilder(pathParameters, requestAdapter, anotherRange);
    }
    /**
     * Provides operations to call the cell method.
     * @param column Usage: column={column}
     * @param row Usage: row={row}
     * @return a {@link CellWithRowWithColumnRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CellWithRowWithColumnRequestBuilder cellWithRowWithColumn(@jakarta.annotation.Nonnull final Integer column, @jakarta.annotation.Nonnull final Integer row) {
        Objects.requireNonNull(column);
        Objects.requireNonNull(row);
        return new CellWithRowWithColumnRequestBuilder(pathParameters, requestAdapter, column, row);
    }
    /**
     * Provides operations to call the columnsAfter method.
     * @param count Usage: count={count}
     * @return a {@link ColumnsAfterWithCountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ColumnsAfterWithCountRequestBuilder columnsAfterWithCount(@jakarta.annotation.Nonnull final Integer count) {
        Objects.requireNonNull(count);
        return new ColumnsAfterWithCountRequestBuilder(pathParameters, requestAdapter, count);
    }
    /**
     * Provides operations to call the columnsBefore method.
     * @param count Usage: count={count}
     * @return a {@link ColumnsBeforeWithCountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ColumnsBeforeWithCountRequestBuilder columnsBeforeWithCount(@jakarta.annotation.Nonnull final Integer count) {
        Objects.requireNonNull(count);
        return new ColumnsBeforeWithCountRequestBuilder(pathParameters, requestAdapter, count);
    }
    /**
     * Provides operations to call the column method.
     * @param column Usage: column={column}
     * @return a {@link ColumnWithColumnRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ColumnWithColumnRequestBuilder columnWithColumn(@jakarta.annotation.Nonnull final Integer column) {
        Objects.requireNonNull(column);
        return new ColumnWithColumnRequestBuilder(pathParameters, requestAdapter, column);
    }
    /**
     * Instantiates a new {@link HeaderRowRangeRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public HeaderRowRangeRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/tables/{workbookTable%2Did}/columns/{workbookTableColumn%2Did}/headerRowRange()", pathParameters);
    }
    /**
     * Instantiates a new {@link HeaderRowRangeRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public HeaderRowRangeRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/drives/{drive%2Did}/items/{driveItem%2Did}/workbook/tables/{workbookTable%2Did}/columns/{workbookTableColumn%2Did}/headerRowRange()", rawUrl);
    }
    /**
     * Gets the range object associated with the header row of the column.
     * @return a {@link WorkbookRange}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/tablecolumn-headerrowrange?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public WorkbookRange get() {
        return get(null);
    }
    /**
     * Gets the range object associated with the header row of the column.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link WorkbookRange}
     * @throws ODataError When receiving a 4XX or 5XX status code
     * @see <a href="https://learn.microsoft.com/graph/api/tablecolumn-headerrowrange?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public WorkbookRange get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("XXX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, WorkbookRange::createFromDiscriminatorValue);
    }
    /**
     * Provides operations to call the intersection method.
     * @param anotherRange Usage: anotherRange='{anotherRange}'
     * @return a {@link IntersectionWithAnotherRangeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IntersectionWithAnotherRangeRequestBuilder intersectionWithAnotherRange(@jakarta.annotation.Nonnull final String anotherRange) {
        Objects.requireNonNull(anotherRange);
        return new IntersectionWithAnotherRangeRequestBuilder(pathParameters, requestAdapter, anotherRange);
    }
    /**
     * Provides operations to call the offsetRange method.
     * @param columnOffset Usage: columnOffset={columnOffset}
     * @param rowOffset Usage: rowOffset={rowOffset}
     * @return a {@link OffsetRangeWithRowOffsetWithColumnOffsetRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OffsetRangeWithRowOffsetWithColumnOffsetRequestBuilder offsetRangeWithRowOffsetWithColumnOffset(@jakarta.annotation.Nonnull final Integer columnOffset, @jakarta.annotation.Nonnull final Integer rowOffset) {
        Objects.requireNonNull(columnOffset);
        Objects.requireNonNull(rowOffset);
        return new OffsetRangeWithRowOffsetWithColumnOffsetRequestBuilder(pathParameters, requestAdapter, columnOffset, rowOffset);
    }
    /**
     * Provides operations to call the resizedRange method.
     * @param deltaColumns Usage: deltaColumns={deltaColumns}
     * @param deltaRows Usage: deltaRows={deltaRows}
     * @return a {@link ResizedRangeWithDeltaRowsWithDeltaColumnsRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ResizedRangeWithDeltaRowsWithDeltaColumnsRequestBuilder resizedRangeWithDeltaRowsWithDeltaColumns(@jakarta.annotation.Nonnull final Integer deltaColumns, @jakarta.annotation.Nonnull final Integer deltaRows) {
        Objects.requireNonNull(deltaColumns);
        Objects.requireNonNull(deltaRows);
        return new ResizedRangeWithDeltaRowsWithDeltaColumnsRequestBuilder(pathParameters, requestAdapter, deltaColumns, deltaRows);
    }
    /**
     * Provides operations to call the rowsAbove method.
     * @param count Usage: count={count}
     * @return a {@link RowsAboveWithCountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RowsAboveWithCountRequestBuilder rowsAboveWithCount(@jakarta.annotation.Nonnull final Integer count) {
        Objects.requireNonNull(count);
        return new RowsAboveWithCountRequestBuilder(pathParameters, requestAdapter, count);
    }
    /**
     * Provides operations to call the rowsBelow method.
     * @param count Usage: count={count}
     * @return a {@link RowsBelowWithCountRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RowsBelowWithCountRequestBuilder rowsBelowWithCount(@jakarta.annotation.Nonnull final Integer count) {
        Objects.requireNonNull(count);
        return new RowsBelowWithCountRequestBuilder(pathParameters, requestAdapter, count);
    }
    /**
     * Provides operations to call the row method.
     * @param row Usage: row={row}
     * @return a {@link RowWithRowRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RowWithRowRequestBuilder rowWithRow(@jakarta.annotation.Nonnull final Integer row) {
        Objects.requireNonNull(row);
        return new RowWithRowRequestBuilder(pathParameters, requestAdapter, row);
    }
    /**
     * Gets the range object associated with the header row of the column.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Gets the range object associated with the header row of the column.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Provides operations to call the usedRange method.
     * @param valuesOnly Usage: valuesOnly={valuesOnly}
     * @return a {@link UsedRangeWithValuesOnlyRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UsedRangeWithValuesOnlyRequestBuilder usedRangeWithValuesOnly(@jakarta.annotation.Nonnull final Boolean valuesOnly) {
        Objects.requireNonNull(valuesOnly);
        return new UsedRangeWithValuesOnlyRequestBuilder(pathParameters, requestAdapter, valuesOnly);
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link HeaderRowRangeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public HeaderRowRangeRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new HeaderRowRangeRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
