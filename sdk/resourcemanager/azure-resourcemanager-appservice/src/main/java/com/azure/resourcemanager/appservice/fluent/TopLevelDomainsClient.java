// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.WebSiteManagementClient;
import com.azure.resourcemanager.appservice.fluent.inner.TldLegalAgreementCollectionInner;
import com.azure.resourcemanager.appservice.fluent.inner.TldLegalAgreementInner;
import com.azure.resourcemanager.appservice.fluent.inner.TopLevelDomainCollectionInner;
import com.azure.resourcemanager.appservice.fluent.inner.TopLevelDomainInner;
import com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException;
import com.azure.resourcemanager.appservice.models.TopLevelDomainAgreementOption;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in TopLevelDomains. */
public final class TopLevelDomainsClient {
    private final ClientLogger logger = new ClientLogger(TopLevelDomainsClient.class);

    /** The proxy service used to perform REST calls. */
    private final TopLevelDomainsService service;

    /** The service client containing this operation class. */
    private final WebSiteManagementClient client;

    /**
     * Initializes an instance of TopLevelDomainsClient.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public TopLevelDomainsClient(WebSiteManagementClient client) {
        this.service =
            RestProxy.create(TopLevelDomainsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for WebSiteManagementClientTopLevelDomains to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "WebSiteManagementCli")
    private interface TopLevelDomainsService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.DomainRegistration/topLevelDomains")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseErrorException.class)
        Mono<Response<TopLevelDomainCollectionInner>> list(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.DomainRegistration/topLevelDomains/{name}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseErrorException.class)
        Mono<Response<TopLevelDomainInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("name") String name,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/providers/Microsoft.DomainRegistration/topLevelDomains/{name}"
                + "/listAgreements")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseErrorException.class)
        Mono<Response<TldLegalAgreementCollectionInner>> listAgreements(
            @HostParam("$host") String endpoint,
            @PathParam("name") String name,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") TopLevelDomainAgreementOption agreementOption,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseErrorException.class)
        Mono<Response<TopLevelDomainCollectionInner>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseErrorException.class)
        Mono<Response<TldLegalAgreementCollectionInner>> listAgreementsNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Description for Get all top-level domains supported for registration.
     *
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Top-level domains.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<TopLevelDomainInner>> listSinglePageAsync() {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            context))
            .<PagedResponse<TopLevelDomainInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Description for Get all top-level domains supported for registration.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Top-level domains.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<TopLevelDomainInner>> listSinglePageAsync(Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), this.client.getSubscriptionId(), this.client.getApiVersion(), context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Description for Get all top-level domains supported for registration.
     *
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Top-level domains.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<TopLevelDomainInner> listAsync() {
        return new PagedFlux<>(() -> listSinglePageAsync(), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Description for Get all top-level domains supported for registration.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Top-level domains.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<TopLevelDomainInner> listAsync(Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(context), nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Description for Get all top-level domains supported for registration.
     *
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Top-level domains.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TopLevelDomainInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Description for Get all top-level domains supported for registration.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Top-level domains.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TopLevelDomainInner> list(Context context) {
        return new PagedIterable<>(listAsync(context));
    }

    /**
     * Description for Get details of a top-level domain.
     *
     * @param name Name of the top-level domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a top level domain object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<TopLevelDomainInner>> getWithResponseAsync(String name) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            name,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Description for Get details of a top-level domain.
     *
     * @param name Name of the top-level domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a top level domain object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<TopLevelDomainInner>> getWithResponseAsync(String name, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(), name, this.client.getSubscriptionId(), this.client.getApiVersion(), context);
    }

    /**
     * Description for Get details of a top-level domain.
     *
     * @param name Name of the top-level domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a top level domain object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TopLevelDomainInner> getAsync(String name) {
        return getWithResponseAsync(name)
            .flatMap(
                (Response<TopLevelDomainInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Description for Get details of a top-level domain.
     *
     * @param name Name of the top-level domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a top level domain object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TopLevelDomainInner> getAsync(String name, Context context) {
        return getWithResponseAsync(name, context)
            .flatMap(
                (Response<TopLevelDomainInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Description for Get details of a top-level domain.
     *
     * @param name Name of the top-level domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a top level domain object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TopLevelDomainInner get(String name) {
        return getAsync(name).block();
    }

    /**
     * Description for Get details of a top-level domain.
     *
     * @param name Name of the top-level domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a top level domain object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TopLevelDomainInner get(String name, Context context) {
        return getAsync(name, context).block();
    }

    /**
     * Description for Gets all legal agreements that user needs to accept before purchasing a domain.
     *
     * @param name Name of the top-level domain.
     * @param agreementOption Options for retrieving the list of top level domain legal agreements.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of top-level domain legal agreements.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<TldLegalAgreementInner>> listAgreementsSinglePageAsync(
        String name, TopLevelDomainAgreementOption agreementOption) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (agreementOption == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter agreementOption is required and cannot be null."));
        } else {
            agreementOption.validate();
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listAgreements(
                            this.client.getEndpoint(),
                            name,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            agreementOption,
                            context))
            .<PagedResponse<TldLegalAgreementInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Description for Gets all legal agreements that user needs to accept before purchasing a domain.
     *
     * @param name Name of the top-level domain.
     * @param agreementOption Options for retrieving the list of top level domain legal agreements.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of top-level domain legal agreements.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<TldLegalAgreementInner>> listAgreementsSinglePageAsync(
        String name, TopLevelDomainAgreementOption agreementOption, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (name == null) {
            return Mono.error(new IllegalArgumentException("Parameter name is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (agreementOption == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter agreementOption is required and cannot be null."));
        } else {
            agreementOption.validate();
        }
        context = this.client.mergeContext(context);
        return service
            .listAgreements(
                this.client.getEndpoint(),
                name,
                this.client.getSubscriptionId(),
                this.client.getApiVersion(),
                agreementOption,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Description for Gets all legal agreements that user needs to accept before purchasing a domain.
     *
     * @param name Name of the top-level domain.
     * @param agreementOption Options for retrieving the list of top level domain legal agreements.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of top-level domain legal agreements.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<TldLegalAgreementInner> listAgreementsAsync(
        String name, TopLevelDomainAgreementOption agreementOption) {
        return new PagedFlux<>(
            () -> listAgreementsSinglePageAsync(name, agreementOption),
            nextLink -> listAgreementsNextSinglePageAsync(nextLink));
    }

    /**
     * Description for Gets all legal agreements that user needs to accept before purchasing a domain.
     *
     * @param name Name of the top-level domain.
     * @param agreementOption Options for retrieving the list of top level domain legal agreements.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of top-level domain legal agreements.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<TldLegalAgreementInner> listAgreementsAsync(
        String name, TopLevelDomainAgreementOption agreementOption, Context context) {
        return new PagedFlux<>(
            () -> listAgreementsSinglePageAsync(name, agreementOption, context),
            nextLink -> listAgreementsNextSinglePageAsync(nextLink, context));
    }

    /**
     * Description for Gets all legal agreements that user needs to accept before purchasing a domain.
     *
     * @param name Name of the top-level domain.
     * @param agreementOption Options for retrieving the list of top level domain legal agreements.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of top-level domain legal agreements.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TldLegalAgreementInner> listAgreements(
        String name, TopLevelDomainAgreementOption agreementOption) {
        return new PagedIterable<>(listAgreementsAsync(name, agreementOption));
    }

    /**
     * Description for Gets all legal agreements that user needs to accept before purchasing a domain.
     *
     * @param name Name of the top-level domain.
     * @param agreementOption Options for retrieving the list of top level domain legal agreements.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of top-level domain legal agreements.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TldLegalAgreementInner> listAgreements(
        String name, TopLevelDomainAgreementOption agreementOption, Context context) {
        return new PagedIterable<>(listAgreementsAsync(name, agreementOption, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Top-level domains.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<TopLevelDomainInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, context))
            .<PagedResponse<TopLevelDomainInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Top-level domains.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<TopLevelDomainInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of top-level domain legal agreements.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<TldLegalAgreementInner>> listAgreementsNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.listAgreementsNext(nextLink, context))
            .<PagedResponse<TldLegalAgreementInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of top-level domain legal agreements.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<TldLegalAgreementInner>> listAgreementsNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        context = this.client.mergeContext(context);
        return service
            .listAgreementsNext(nextLink, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}