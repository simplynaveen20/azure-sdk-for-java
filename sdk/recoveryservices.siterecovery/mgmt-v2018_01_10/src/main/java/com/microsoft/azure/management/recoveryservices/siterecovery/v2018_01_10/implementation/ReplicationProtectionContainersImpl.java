/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.ReplicationProtectionContainers;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import rx.Completable;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.ProtectionContainer;

class ReplicationProtectionContainersImpl extends WrapperImpl<ReplicationProtectionContainersInner> implements ReplicationProtectionContainers {
    private final RecoveryServicesManager manager;

    ReplicationProtectionContainersImpl(RecoveryServicesManager manager) {
        super(manager.inner().replicationProtectionContainers());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public ProtectionContainerImpl define(String name) {
        return wrapModel(name);
    }

    private ProtectionContainerImpl wrapModel(ProtectionContainerInner inner) {
        return  new ProtectionContainerImpl(inner, manager());
    }

    private ProtectionContainerImpl wrapModel(String name) {
        return new ProtectionContainerImpl(name, this.manager());
    }

    @Override
    public Observable<ProtectionContainer> discoverProtectableItemAsync(String fabricName, String protectionContainerName) {
        ReplicationProtectionContainersInner client = this.inner();
        return client.discoverProtectableItemAsync(fabricName, protectionContainerName)
        .map(new Func1<ProtectionContainerInner, ProtectionContainer>() {
            @Override
            public ProtectionContainer call(ProtectionContainerInner inner) {
                return new ProtectionContainerImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String fabricName, String protectionContainerName) {
        ReplicationProtectionContainersInner client = this.inner();
        return client.deleteAsync(fabricName, protectionContainerName).toCompletable();
    }

    @Override
    public Observable<ProtectionContainer> switchProtectionAsync(String fabricName, String protectionContainerName) {
        ReplicationProtectionContainersInner client = this.inner();
        return client.switchProtectionAsync(fabricName, protectionContainerName)
        .map(new Func1<ProtectionContainerInner, ProtectionContainer>() {
            @Override
            public ProtectionContainer call(ProtectionContainerInner inner) {
                return new ProtectionContainerImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ProtectionContainer> listAsync() {
        ReplicationProtectionContainersInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ProtectionContainerInner>, Iterable<ProtectionContainerInner>>() {
            @Override
            public Iterable<ProtectionContainerInner> call(Page<ProtectionContainerInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ProtectionContainerInner, ProtectionContainer>() {
            @Override
            public ProtectionContainer call(ProtectionContainerInner inner) {
                return new ProtectionContainerImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ProtectionContainer> listByReplicationFabricsAsync(final String fabricName) {
        ReplicationProtectionContainersInner client = this.inner();
        return client.listByReplicationFabricsAsync(fabricName)
        .flatMapIterable(new Func1<Page<ProtectionContainerInner>, Iterable<ProtectionContainerInner>>() {
            @Override
            public Iterable<ProtectionContainerInner> call(Page<ProtectionContainerInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ProtectionContainerInner, ProtectionContainer>() {
            @Override
            public ProtectionContainer call(ProtectionContainerInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ProtectionContainer> getAsync(String fabricName, String protectionContainerName) {
        ReplicationProtectionContainersInner client = this.inner();
        return client.getAsync(fabricName, protectionContainerName)
        .map(new Func1<ProtectionContainerInner, ProtectionContainer>() {
            @Override
            public ProtectionContainer call(ProtectionContainerInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
