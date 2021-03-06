/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.eventgrid.v2019_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.eventgrid.v2019_06_01.EventSubscriptions;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import rx.Completable;
import com.microsoft.azure.management.eventgrid.v2019_06_01.EventSubscription;
import com.microsoft.azure.management.eventgrid.v2019_06_01.EventSubscriptionFullUrl;
import com.microsoft.azure.arm.utils.PagedListConverter;

class EventSubscriptionsImpl extends WrapperImpl<EventSubscriptionsInner> implements EventSubscriptions {
    private PagedListConverter<EventSubscriptionInner, EventSubscription> converter;
    private final EventGridManager manager;

    EventSubscriptionsImpl(EventGridManager manager) {
        super(manager.inner().eventSubscriptions());
        this.manager = manager;
        this.converter = new PagedListConverter<EventSubscriptionInner, EventSubscription>() {
            @Override
            public Observable<EventSubscription> typeConvertAsync(EventSubscriptionInner inner) {
                return Observable.just((EventSubscription) wrapModel(inner));
            }
        };
    }

    public EventGridManager manager() {
        return this.manager;
    }

    @Override
    public EventSubscriptionImpl define(String name) {
        return wrapModel(name);
    }

    private EventSubscriptionImpl wrapModel(EventSubscriptionInner inner) {
        return  new EventSubscriptionImpl(inner, manager());
    }

    private EventSubscriptionImpl wrapModel(String name) {
        return new EventSubscriptionImpl(name, this.manager());
    }

    @Override
    public Observable<EventSubscription> getAsync(String scope, String eventSubscriptionName) {
        EventSubscriptionsInner client = this.inner();
        return client.getAsync(scope, eventSubscriptionName)
        .map(new Func1<EventSubscriptionInner, EventSubscription>() {
            @Override
            public EventSubscription call(EventSubscriptionInner inner) {
                return new EventSubscriptionImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String scope, String eventSubscriptionName) {
        EventSubscriptionsInner client = this.inner();
        return client.deleteAsync(scope, eventSubscriptionName).toCompletable();
    }

    @Override
    public Observable<EventSubscriptionFullUrl> getFullUrlAsync(String scope, String eventSubscriptionName) {
        EventSubscriptionsInner client = this.inner();
        return client.getFullUrlAsync(scope, eventSubscriptionName)
        .map(new Func1<EventSubscriptionFullUrlInner, EventSubscriptionFullUrl>() {
            @Override
            public EventSubscriptionFullUrl call(EventSubscriptionFullUrlInner inner) {
                return new EventSubscriptionFullUrlImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<EventSubscription> listGlobalBySubscriptionForTopicTypeAsync(final String topicTypeName) {
        EventSubscriptionsInner client = this.inner();
        return client.listGlobalBySubscriptionForTopicTypeAsync(topicTypeName)
        .flatMapIterable(new Func1<Page<EventSubscriptionInner>, Iterable<EventSubscriptionInner>>() {
            @Override
            public Iterable<EventSubscriptionInner> call(Page<EventSubscriptionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EventSubscriptionInner, EventSubscription>() {
            @Override
            public EventSubscription call(EventSubscriptionInner inner) {
                return new EventSubscriptionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<EventSubscription> listGlobalByResourceGroupForTopicTypeAsync(final String resourceGroupName, final String topicTypeName) {
        EventSubscriptionsInner client = this.inner();
        return client.listGlobalByResourceGroupForTopicTypeAsync(resourceGroupName, topicTypeName)
        .flatMapIterable(new Func1<Page<EventSubscriptionInner>, Iterable<EventSubscriptionInner>>() {
            @Override
            public Iterable<EventSubscriptionInner> call(Page<EventSubscriptionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EventSubscriptionInner, EventSubscription>() {
            @Override
            public EventSubscription call(EventSubscriptionInner inner) {
                return new EventSubscriptionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<EventSubscription> listRegionalBySubscriptionAsync(final String location) {
        EventSubscriptionsInner client = this.inner();
        return client.listRegionalBySubscriptionAsync(location)
        .flatMapIterable(new Func1<Page<EventSubscriptionInner>, Iterable<EventSubscriptionInner>>() {
            @Override
            public Iterable<EventSubscriptionInner> call(Page<EventSubscriptionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EventSubscriptionInner, EventSubscription>() {
            @Override
            public EventSubscription call(EventSubscriptionInner inner) {
                return new EventSubscriptionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<EventSubscription> listRegionalByResourceGroupAsync(final String resourceGroupName, final String location) {
        EventSubscriptionsInner client = this.inner();
        return client.listRegionalByResourceGroupAsync(resourceGroupName, location)
        .flatMapIterable(new Func1<Page<EventSubscriptionInner>, Iterable<EventSubscriptionInner>>() {
            @Override
            public Iterable<EventSubscriptionInner> call(Page<EventSubscriptionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EventSubscriptionInner, EventSubscription>() {
            @Override
            public EventSubscription call(EventSubscriptionInner inner) {
                return new EventSubscriptionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<EventSubscription> listRegionalBySubscriptionForTopicTypeAsync(final String location, final String topicTypeName) {
        EventSubscriptionsInner client = this.inner();
        return client.listRegionalBySubscriptionForTopicTypeAsync(location, topicTypeName)
        .flatMapIterable(new Func1<Page<EventSubscriptionInner>, Iterable<EventSubscriptionInner>>() {
            @Override
            public Iterable<EventSubscriptionInner> call(Page<EventSubscriptionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EventSubscriptionInner, EventSubscription>() {
            @Override
            public EventSubscription call(EventSubscriptionInner inner) {
                return new EventSubscriptionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<EventSubscription> listRegionalByResourceGroupForTopicTypeAsync(final String resourceGroupName, final String location, final String topicTypeName) {
        EventSubscriptionsInner client = this.inner();
        return client.listRegionalByResourceGroupForTopicTypeAsync(resourceGroupName, location, topicTypeName)
        .flatMapIterable(new Func1<Page<EventSubscriptionInner>, Iterable<EventSubscriptionInner>>() {
            @Override
            public Iterable<EventSubscriptionInner> call(Page<EventSubscriptionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EventSubscriptionInner, EventSubscription>() {
            @Override
            public EventSubscription call(EventSubscriptionInner inner) {
                return new EventSubscriptionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<EventSubscription> listByResourceAsync(final String resourceGroupName, final String providerNamespace, final String resourceTypeName, final String resourceName) {
        EventSubscriptionsInner client = this.inner();
        return client.listByResourceAsync(resourceGroupName, providerNamespace, resourceTypeName, resourceName)
        .flatMapIterable(new Func1<Page<EventSubscriptionInner>, Iterable<EventSubscriptionInner>>() {
            @Override
            public Iterable<EventSubscriptionInner> call(Page<EventSubscriptionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EventSubscriptionInner, EventSubscription>() {
            @Override
            public EventSubscription call(EventSubscriptionInner inner) {
                return new EventSubscriptionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<EventSubscription> listByDomainTopicAsync(final String resourceGroupName, final String domainName, final String topicName) {
        EventSubscriptionsInner client = this.inner();
        return client.listByDomainTopicAsync(resourceGroupName, domainName, topicName)
        .flatMapIterable(new Func1<Page<EventSubscriptionInner>, Iterable<EventSubscriptionInner>>() {
            @Override
            public Iterable<EventSubscriptionInner> call(Page<EventSubscriptionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EventSubscriptionInner, EventSubscription>() {
            @Override
            public EventSubscription call(EventSubscriptionInner inner) {
                return new EventSubscriptionImpl(inner, manager());
            }
        });
    }

    @Override
    public PagedList<EventSubscription> list() {
        EventSubscriptionsInner client = this.inner();
        return converter.convert(client.list());
    }

    @Override
    public Observable<EventSubscription> listAsync() {
        EventSubscriptionsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<EventSubscriptionInner>, Iterable<EventSubscriptionInner>>() {
            @Override
            public Iterable<EventSubscriptionInner> call(Page<EventSubscriptionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EventSubscriptionInner, EventSubscription>() {
            @Override
            public EventSubscription call(EventSubscriptionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<EventSubscription> listByResourceGroup(String resourceGroupName) {
        EventSubscriptionsInner client = this.inner();
        return converter.convert(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<EventSubscription> listByResourceGroupAsync(String resourceGroupName) {
        EventSubscriptionsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<EventSubscriptionInner>, Iterable<EventSubscriptionInner>>() {
            @Override
            public Iterable<EventSubscriptionInner> call(Page<EventSubscriptionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<EventSubscriptionInner, EventSubscription>() {
            @Override
            public EventSubscription call(EventSubscriptionInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
