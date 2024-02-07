package com.microsoft.graph.groups.item.sites.item.onenote.sectiongroups.item;

import com.microsoft.graph.groups.item.sites.item.onenote.sectiongroups.item.parentnotebook.ParentNotebookRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.onenote.sectiongroups.item.parentsectiongroup.ParentSectionGroupRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.onenote.sectiongroups.item.sectiongroups.SectionGroupsRequestBuilder;
import com.microsoft.graph.groups.item.sites.item.onenote.sectiongroups.item.sections.SectionsRequestBuilder;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.models.SectionGroup;
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
 * Provides operations to manage the sectionGroups property of the microsoft.graph.onenote entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SectionGroupItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to manage the parentNotebook property of the microsoft.graph.sectionGroup entity.
     */
    @jakarta.annotation.Nonnull
    public ParentNotebookRequestBuilder parentNotebook() {
        return new ParentNotebookRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the parentSectionGroup property of the microsoft.graph.sectionGroup entity.
     */
    @jakarta.annotation.Nonnull
    public ParentSectionGroupRequestBuilder parentSectionGroup() {
        return new ParentSectionGroupRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the sectionGroups property of the microsoft.graph.sectionGroup entity.
     */
    @jakarta.annotation.Nonnull
    public SectionGroupsRequestBuilder sectionGroups() {
        return new SectionGroupsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the sections property of the microsoft.graph.sectionGroup entity.
     */
    @jakarta.annotation.Nonnull
    public SectionsRequestBuilder sections() {
        return new SectionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new SectionGroupItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SectionGroupItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/sites/{site%2Did}/onenote/sectionGroups/{sectionGroup%2Did}{?%24expand,%24select}", pathParameters);
    }
    /**
     * Instantiates a new SectionGroupItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SectionGroupItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/groups/{group%2Did}/sites/{site%2Did}/onenote/sectionGroups/{sectionGroup%2Did}{?%24expand,%24select}", rawUrl);
    }
    /**
     * Delete navigation property sectionGroups for groups
     */
    public void delete() {
        delete(null);
    }
    /**
     * Delete navigation property sectionGroups for groups
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
     * Retrieve the properties and relationships of a sectionGroup object.
     * @return a SectionGroup
     * @see <a href="https://learn.microsoft.com/graph/api/sectiongroup-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SectionGroup get() {
        return get(null);
    }
    /**
     * Retrieve the properties and relationships of a sectionGroup object.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a SectionGroup
     * @see <a href="https://learn.microsoft.com/graph/api/sectiongroup-get?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public SectionGroup get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SectionGroup::createFromDiscriminatorValue);
    }
    /**
     * Update the navigation property sectionGroups in groups
     * @param body The request body
     * @return a SectionGroup
     */
    @jakarta.annotation.Nullable
    public SectionGroup patch(@jakarta.annotation.Nonnull final SectionGroup body) {
        return patch(body, null);
    }
    /**
     * Update the navigation property sectionGroups in groups
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a SectionGroup
     */
    @jakarta.annotation.Nullable
    public SectionGroup patch(@jakarta.annotation.Nonnull final SectionGroup body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SectionGroup::createFromDiscriminatorValue);
    }
    /**
     * Delete navigation property sectionGroups for groups
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete navigation property sectionGroups for groups
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
     * Retrieve the properties and relationships of a sectionGroup object.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the properties and relationships of a sectionGroup object.
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
     * Update the navigation property sectionGroups in groups
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final SectionGroup body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update the navigation property sectionGroups in groups
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final SectionGroup body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a SectionGroupItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SectionGroupItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SectionGroupItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Retrieve the properties and relationships of a sectionGroup object.
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
