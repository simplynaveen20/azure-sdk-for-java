/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2016_03_01.implementation;

import com.microsoft.azure.management.streamanalytics.v2016_03_01.Function;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.streamanalytics.v2016_03_01.FunctionProperties;

class FunctionImpl extends CreatableUpdatableImpl<Function, FunctionInner, FunctionImpl> implements Function, Function.Definition, Function.Update {
    private final StreamAnalyticsManager manager;
    private String resourceGroupName;
    private String jobName;
    private String functionName;

    FunctionImpl(String name, StreamAnalyticsManager manager) {
        super(name, new FunctionInner());
        this.manager = manager;
        // Set resource name
        this.functionName = name;
        //
    }

    FunctionImpl(FunctionInner inner, StreamAnalyticsManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.functionName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourcegroups");
        this.jobName = IdParsingUtils.getValueFromIdByName(inner.id(), "streamingjobs");
        this.functionName = IdParsingUtils.getValueFromIdByName(inner.id(), "functions");
        //
    }

    @Override
    public StreamAnalyticsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Function> createResourceAsync() {
        FunctionsInner client = this.manager().inner().functions();
        return client.createOrReplaceAsync(this.resourceGroupName, this.jobName, this.functionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Function> updateResourceAsync() {
        FunctionsInner client = this.manager().inner().functions();
        return client.updateAsync(this.resourceGroupName, this.jobName, this.functionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<FunctionInner> getInnerAsync() {
        FunctionsInner client = this.manager().inner().functions();
        return client.getAsync(this.resourceGroupName, this.jobName, this.functionName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public FunctionProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public FunctionImpl withExistingStreamingjob(String resourceGroupName, String jobName) {
        this.resourceGroupName = resourceGroupName;
        this.jobName = jobName;
        return this;
    }

    @Override
    public FunctionImpl withName(String name) {
        this.inner().withName(name);
        return this;
    }

    @Override
    public FunctionImpl withProperties(FunctionProperties properties) {
        this.inner().withProperties(properties);
        return this;
    }

}
