package com.microsoft.graph.identitygovernance.lifecycleworkflows.deleteditems.workflows.item.microsoftgraphidentitygovernanceactivate;

import com.microsoft.graph.models.odataerrors.ODataError;
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
 * Provides operations to call the activate method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MicrosoftGraphIdentityGovernanceActivateRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new MicrosoftGraphIdentityGovernanceActivateRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphIdentityGovernanceActivateRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/deletedItems/workflows/{workflow%2Did}/microsoft.graph.identityGovernance.activate", pathParameters);
    }
    /**
     * Instantiates a new MicrosoftGraphIdentityGovernanceActivateRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public MicrosoftGraphIdentityGovernanceActivateRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/identityGovernance/lifecycleWorkflows/deletedItems/workflows/{workflow%2Did}/microsoft.graph.identityGovernance.activate", rawUrl);
    }
    /**
     * Run a workflow object on-demand. You can run any workflow on-demand, including scheduled workflows. Workflows created from the 'Real-time employee termination' template are run on-demand only. When you run a workflow on demand, the tasks are executed regardless of whether the user state matches the scope and trigger execution conditions.
     * @param body The request body
     * @see <a href="https://learn.microsoft.com/graph/api/identitygovernance-workflow-activate?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> post(@jakarta.annotation.Nonnull final ActivatePostRequestBody body) {
        return post(body, null);
    }
    /**
     * Run a workflow object on-demand. You can run any workflow on-demand, including scheduled workflows. Workflows created from the 'Real-time employee termination' template are run on-demand only. When you run a workflow on demand, the tasks are executed regardless of whether the user state matches the scope and trigger execution conditions.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @see <a href="https://learn.microsoft.com/graph/api/identitygovernance-workflow-activate?view=graph-rest-1.0">Find more info here</a>
     */
    @jakarta.annotation.Nonnull
    public java.util.concurrent.CompletableFuture<Void> post(@jakarta.annotation.Nonnull final ActivatePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("4XX", ODataError::createFromDiscriminatorValue);
        errorMapping.put("5XX", ODataError::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitiveAsync(requestInfo, Void.class, errorMapping);
    }
    /**
     * Run a workflow object on-demand. You can run any workflow on-demand, including scheduled workflows. Workflows created from the 'Real-time employee termination' template are run on-demand only. When you run a workflow on demand, the tasks are executed regardless of whether the user state matches the scope and trigger execution conditions.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ActivatePostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Run a workflow object on-demand. You can run any workflow on-demand, including scheduled workflows. Workflows created from the 'Real-time employee termination' template are run on-demand only. When you run a workflow on demand, the tasks are executed regardless of whether the user state matches the scope and trigger execution conditions.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ActivatePostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation();
        requestInfo.httpMethod = HttpMethod.POST;
        requestInfo.urlTemplate = urlTemplate;
        requestInfo.pathParameters = pathParameters;
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        if (requestConfiguration != null) {
            final PostRequestConfiguration requestConfig = new PostRequestConfiguration();
            requestConfiguration.accept(requestConfig);
            requestInfo.headers.putAll(requestConfig.headers);
            requestInfo.addRequestOptions(requestConfig.options);
        }
        return requestInfo;
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
