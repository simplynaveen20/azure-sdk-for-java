/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2018_02_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ClusterVersions.
 */
public class ClusterVersionsInner {
    /** The Retrofit service to perform REST calls. */
    private ClusterVersionsService service;
    /** The service client containing this operation class. */
    private ServiceFabricManagementClientImpl client;

    /**
     * Initializes an instance of ClusterVersionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ClusterVersionsInner(Retrofit retrofit, ServiceFabricManagementClientImpl client) {
        this.service = retrofit.create(ClusterVersionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ClusterVersions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ClusterVersionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.servicefabric.v2018_02_01.ClusterVersions get" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.ServiceFabric/locations/{location}/clusterVersions/{clusterVersion}")
        Observable<Response<ResponseBody>> get(@Path("location") String location, @Path("subscriptionId") String subscriptionId, @Path("clusterVersion") String clusterVersion, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.servicefabric.v2018_02_01.ClusterVersions getByEnvironment" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.ServiceFabric/locations/{location}/environments/{environment}/clusterVersions/{clusterVersion}")
        Observable<Response<ResponseBody>> getByEnvironment(@Path("location") String location, @Path("environment") String environment, @Path("subscriptionId") String subscriptionId, @Path("clusterVersion") String clusterVersion, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.servicefabric.v2018_02_01.ClusterVersions list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.ServiceFabric/locations/{location}/clusterVersions")
        Observable<Response<ResponseBody>> list(@Path("location") String location, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.servicefabric.v2018_02_01.ClusterVersions listByEnvironment" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.ServiceFabric/locations/{location}/environments/{environment}/clusterVersions")
        Observable<Response<ResponseBody>> listByEnvironment(@Path("location") String location, @Path("environment") String environment, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets information about a Service Fabric cluster code version available in the specified location.
     * Gets information about an available Service Fabric cluster code version.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param clusterVersion The cluster code version.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ClusterCodeVersionsListResultInner object if successful.
     */
    public ClusterCodeVersionsListResultInner get(String location, String clusterVersion) {
        return getWithServiceResponseAsync(location, clusterVersion).toBlocking().single().body();
    }

    /**
     * Gets information about a Service Fabric cluster code version available in the specified location.
     * Gets information about an available Service Fabric cluster code version.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param clusterVersion The cluster code version.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ClusterCodeVersionsListResultInner> getAsync(String location, String clusterVersion, final ServiceCallback<ClusterCodeVersionsListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(location, clusterVersion), serviceCallback);
    }

    /**
     * Gets information about a Service Fabric cluster code version available in the specified location.
     * Gets information about an available Service Fabric cluster code version.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param clusterVersion The cluster code version.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ClusterCodeVersionsListResultInner object
     */
    public Observable<ClusterCodeVersionsListResultInner> getAsync(String location, String clusterVersion) {
        return getWithServiceResponseAsync(location, clusterVersion).map(new Func1<ServiceResponse<ClusterCodeVersionsListResultInner>, ClusterCodeVersionsListResultInner>() {
            @Override
            public ClusterCodeVersionsListResultInner call(ServiceResponse<ClusterCodeVersionsListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets information about a Service Fabric cluster code version available in the specified location.
     * Gets information about an available Service Fabric cluster code version.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param clusterVersion The cluster code version.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ClusterCodeVersionsListResultInner object
     */
    public Observable<ServiceResponse<ClusterCodeVersionsListResultInner>> getWithServiceResponseAsync(String location, String clusterVersion) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (clusterVersion == null) {
            throw new IllegalArgumentException("Parameter clusterVersion is required and cannot be null.");
        }
        return service.get(location, this.client.subscriptionId(), clusterVersion, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ClusterCodeVersionsListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<ClusterCodeVersionsListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ClusterCodeVersionsListResultInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ClusterCodeVersionsListResultInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ClusterCodeVersionsListResultInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ClusterCodeVersionsListResultInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets information about a Service Fabric cluster code version available for the specified environment.
     * Gets information about an available Service Fabric cluster code version by environment.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all. Possible values include: 'Windows', 'Linux'
     * @param clusterVersion The cluster code version.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ClusterCodeVersionsListResultInner object if successful.
     */
    public ClusterCodeVersionsListResultInner getByEnvironment(String location, String environment, String clusterVersion) {
        return getByEnvironmentWithServiceResponseAsync(location, environment, clusterVersion).toBlocking().single().body();
    }

    /**
     * Gets information about a Service Fabric cluster code version available for the specified environment.
     * Gets information about an available Service Fabric cluster code version by environment.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all. Possible values include: 'Windows', 'Linux'
     * @param clusterVersion The cluster code version.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ClusterCodeVersionsListResultInner> getByEnvironmentAsync(String location, String environment, String clusterVersion, final ServiceCallback<ClusterCodeVersionsListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(getByEnvironmentWithServiceResponseAsync(location, environment, clusterVersion), serviceCallback);
    }

    /**
     * Gets information about a Service Fabric cluster code version available for the specified environment.
     * Gets information about an available Service Fabric cluster code version by environment.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all. Possible values include: 'Windows', 'Linux'
     * @param clusterVersion The cluster code version.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ClusterCodeVersionsListResultInner object
     */
    public Observable<ClusterCodeVersionsListResultInner> getByEnvironmentAsync(String location, String environment, String clusterVersion) {
        return getByEnvironmentWithServiceResponseAsync(location, environment, clusterVersion).map(new Func1<ServiceResponse<ClusterCodeVersionsListResultInner>, ClusterCodeVersionsListResultInner>() {
            @Override
            public ClusterCodeVersionsListResultInner call(ServiceResponse<ClusterCodeVersionsListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets information about a Service Fabric cluster code version available for the specified environment.
     * Gets information about an available Service Fabric cluster code version by environment.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all. Possible values include: 'Windows', 'Linux'
     * @param clusterVersion The cluster code version.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ClusterCodeVersionsListResultInner object
     */
    public Observable<ServiceResponse<ClusterCodeVersionsListResultInner>> getByEnvironmentWithServiceResponseAsync(String location, String environment, String clusterVersion) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (environment == null) {
            throw new IllegalArgumentException("Parameter environment is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (clusterVersion == null) {
            throw new IllegalArgumentException("Parameter clusterVersion is required and cannot be null.");
        }
        return service.getByEnvironment(location, environment, this.client.subscriptionId(), clusterVersion, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ClusterCodeVersionsListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<ClusterCodeVersionsListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ClusterCodeVersionsListResultInner> clientResponse = getByEnvironmentDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ClusterCodeVersionsListResultInner> getByEnvironmentDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ClusterCodeVersionsListResultInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ClusterCodeVersionsListResultInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the list of Service Fabric cluster code versions available for the specified location.
     * Gets all available code versions for Service Fabric cluster resources by location.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ClusterCodeVersionsListResultInner object if successful.
     */
    public ClusterCodeVersionsListResultInner list(String location) {
        return listWithServiceResponseAsync(location).toBlocking().single().body();
    }

    /**
     * Gets the list of Service Fabric cluster code versions available for the specified location.
     * Gets all available code versions for Service Fabric cluster resources by location.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ClusterCodeVersionsListResultInner> listAsync(String location, final ServiceCallback<ClusterCodeVersionsListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(location), serviceCallback);
    }

    /**
     * Gets the list of Service Fabric cluster code versions available for the specified location.
     * Gets all available code versions for Service Fabric cluster resources by location.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ClusterCodeVersionsListResultInner object
     */
    public Observable<ClusterCodeVersionsListResultInner> listAsync(String location) {
        return listWithServiceResponseAsync(location).map(new Func1<ServiceResponse<ClusterCodeVersionsListResultInner>, ClusterCodeVersionsListResultInner>() {
            @Override
            public ClusterCodeVersionsListResultInner call(ServiceResponse<ClusterCodeVersionsListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the list of Service Fabric cluster code versions available for the specified location.
     * Gets all available code versions for Service Fabric cluster resources by location.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ClusterCodeVersionsListResultInner object
     */
    public Observable<ServiceResponse<ClusterCodeVersionsListResultInner>> listWithServiceResponseAsync(String location) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        return service.list(location, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ClusterCodeVersionsListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<ClusterCodeVersionsListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ClusterCodeVersionsListResultInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ClusterCodeVersionsListResultInner> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ClusterCodeVersionsListResultInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ClusterCodeVersionsListResultInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the list of Service Fabric cluster code versions available for the specified environment.
     * Gets all available code versions for Service Fabric cluster resources by environment.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all. Possible values include: 'Windows', 'Linux'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ClusterCodeVersionsListResultInner object if successful.
     */
    public ClusterCodeVersionsListResultInner listByEnvironment(String location, String environment) {
        return listByEnvironmentWithServiceResponseAsync(location, environment).toBlocking().single().body();
    }

    /**
     * Gets the list of Service Fabric cluster code versions available for the specified environment.
     * Gets all available code versions for Service Fabric cluster resources by environment.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all. Possible values include: 'Windows', 'Linux'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ClusterCodeVersionsListResultInner> listByEnvironmentAsync(String location, String environment, final ServiceCallback<ClusterCodeVersionsListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByEnvironmentWithServiceResponseAsync(location, environment), serviceCallback);
    }

    /**
     * Gets the list of Service Fabric cluster code versions available for the specified environment.
     * Gets all available code versions for Service Fabric cluster resources by environment.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all. Possible values include: 'Windows', 'Linux'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ClusterCodeVersionsListResultInner object
     */
    public Observable<ClusterCodeVersionsListResultInner> listByEnvironmentAsync(String location, String environment) {
        return listByEnvironmentWithServiceResponseAsync(location, environment).map(new Func1<ServiceResponse<ClusterCodeVersionsListResultInner>, ClusterCodeVersionsListResultInner>() {
            @Override
            public ClusterCodeVersionsListResultInner call(ServiceResponse<ClusterCodeVersionsListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the list of Service Fabric cluster code versions available for the specified environment.
     * Gets all available code versions for Service Fabric cluster resources by environment.
     *
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param environment The operating system of the cluster. The default means all. Possible values include: 'Windows', 'Linux'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ClusterCodeVersionsListResultInner object
     */
    public Observable<ServiceResponse<ClusterCodeVersionsListResultInner>> listByEnvironmentWithServiceResponseAsync(String location, String environment) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (environment == null) {
            throw new IllegalArgumentException("Parameter environment is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        return service.listByEnvironment(location, environment, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ClusterCodeVersionsListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<ClusterCodeVersionsListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ClusterCodeVersionsListResultInner> clientResponse = listByEnvironmentDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ClusterCodeVersionsListResultInner> listByEnvironmentDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ClusterCodeVersionsListResultInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ClusterCodeVersionsListResultInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
