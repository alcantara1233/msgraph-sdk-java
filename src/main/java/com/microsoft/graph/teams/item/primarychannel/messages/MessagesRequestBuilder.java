package com.microsoft.graph.teams.item.primarychannel.messages;

import com.microsoft.graph.models.ChatMessage;
import com.microsoft.graph.models.ChatMessageCollectionResponse;
import com.microsoft.graph.models.odataerrors.ODataError;
import com.microsoft.graph.teams.item.primarychannel.messages.count.CountRequestBuilder;
import com.microsoft.graph.teams.item.primarychannel.messages.delta.DeltaRequestBuilder;
import com.microsoft.graph.teams.item.primarychannel.messages.item.ChatMessageItemRequestBuilder;
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
 * Provides operations to manage the messages property of the microsoft.graph.channel entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MessagesRequestBuilder extends BaseRequestBuilder {
    /**
     * Provides operations to count the resources in the collection.
     */
    @jakarta.annotation.Nonnull
    public CountRequestBuilder count() {
        return new CountRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to call the delta method.
     */
    @jakarta.annotation.Nonnull
    public DeltaRequestBuilder delta() {
        return new DeltaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Provides operations to manage the messages property of the microsoft.graph.channel entity.
     * @param chatMessageId The unique identifier of chatMessage
     * @return a ChatMessageItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ChatMessageItemRequestBuilder byChatMessageId(@jakarta.annotation.Nonnull final String chatMessageId) {
        Objects.requireNonNull(chatMessageId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("chatMessage%2Did", chatMessageId);
        return new ChatMessageItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new MessagesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MessagesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/teams/{team%2Did}/primaryChannel/messages{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", pathParameters);
    }
    /**
     * Instantiates a new MessagesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MessagesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/teams/{team%2Did}/primaryChannel/messages{?%24top,%24skip,%24search,%24filter,%24count,%24orderby,%24select,%24expand}", rawUrl);
    }
    /**
     * Retrieve the list of messages (without the replies) in a channel of a team.  To get the replies for a message, call the list message replies or the get message reply API.  This method supports federation. To list channel messages in application context, the request must be made from the tenant that the channel owner belongs to (represented by the tenantId property on the channel). This API is available in the following national cloud deployments.
     * @return a ChatMessageCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/channel-list-messages?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ChatMessageCollectionResponse get() {
        return get(null);
    }
    /**
     * Retrieve the list of messages (without the replies) in a channel of a team.  To get the replies for a message, call the list message replies or the get message reply API.  This method supports federation. To list channel messages in application context, the request must be made from the tenant that the channel owner belongs to (represented by the tenantId property on the channel). This API is available in the following national cloud deployments.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ChatMessageCollectionResponse
     * @see <a href="https://learn.microsoft.com/graph/api/channel-list-messages?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ChatMessageCollectionResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ChatMessageCollectionResponse::createFromDiscriminatorValue);
    }
    /**
     * Send a new chatMessage in the specified channel. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a ChatMessage
     * @see <a href="https://learn.microsoft.com/graph/api/channel-post-messages?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ChatMessage post(@jakarta.annotation.Nonnull final ChatMessage body) {
        return post(body, null);
    }
    /**
     * Send a new chatMessage in the specified channel. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ChatMessage
     * @see <a href="https://learn.microsoft.com/graph/api/channel-post-messages?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nullable
    public ChatMessage post(@jakarta.annotation.Nonnull final ChatMessage body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ChatMessage::createFromDiscriminatorValue);
    }
    /**
     * Retrieve the list of messages (without the replies) in a channel of a team.  To get the replies for a message, call the list message replies or the get message reply API.  This method supports federation. To list channel messages in application context, the request must be made from the tenant that the channel owner belongs to (represented by the tenantId property on the channel). This API is available in the following national cloud deployments.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the list of messages (without the replies) in a channel of a team.  To get the replies for a message, call the list message replies or the get message reply API.  This method supports federation. To list channel messages in application context, the request must be made from the tenant that the channel owner belongs to (represented by the tenantId property on the channel). This API is available in the following national cloud deployments.
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
     * Send a new chatMessage in the specified channel. This API is available in the following national cloud deployments.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ChatMessage body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Send a new chatMessage in the specified channel. This API is available in the following national cloud deployments.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ChatMessage body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a MessagesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public MessagesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new MessagesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Retrieve the list of messages (without the replies) in a channel of a team.  To get the replies for a message, call the list message replies or the get message reply API.  This method supports federation. To list channel messages in application context, the request must be made from the tenant that the channel owner belongs to (represented by the tenantId property on the channel). This API is available in the following national cloud deployments.
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
