/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.automation.v2015_10_31.AutomationAccounts;
import com.microsoft.azure.management.automation.v2015_10_31.AutomationAccount;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class AutomationAccountsImpl extends GroupableResourcesCoreImpl<AutomationAccount, AutomationAccountImpl, AutomationAccountInner, AutomationAccountsInner, AutomationManager>  implements AutomationAccounts {
    protected AutomationAccountsImpl(AutomationManager manager) {
        super(manager.inner().automationAccounts(), manager);
    }

    @Override
    protected Observable<AutomationAccountInner> getInnerAsync(String resourceGroupName, String name) {
        AutomationAccountsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        AutomationAccountsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<AutomationAccount> listByResourceGroup(String resourceGroupName) {
        AutomationAccountsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<AutomationAccount> listByResourceGroupAsync(String resourceGroupName) {
        AutomationAccountsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<AutomationAccountInner>, Iterable<AutomationAccountInner>>() {
            @Override
            public Iterable<AutomationAccountInner> call(Page<AutomationAccountInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AutomationAccountInner, AutomationAccount>() {
            @Override
            public AutomationAccount call(AutomationAccountInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<AutomationAccount> list() {
        AutomationAccountsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<AutomationAccount> listAsync() {
        AutomationAccountsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<AutomationAccountInner>, Iterable<AutomationAccountInner>>() {
            @Override
            public Iterable<AutomationAccountInner> call(Page<AutomationAccountInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AutomationAccountInner, AutomationAccount>() {
            @Override
            public AutomationAccount call(AutomationAccountInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public AutomationAccountImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected AutomationAccountImpl wrapModel(AutomationAccountInner inner) {
        return  new AutomationAccountImpl(inner.name(), inner, manager());
    }

    @Override
    protected AutomationAccountImpl wrapModel(String name) {
        return new AutomationAccountImpl(name, new AutomationAccountInner(), this.manager());
    }

}
