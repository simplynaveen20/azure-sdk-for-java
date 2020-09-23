/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.compute.v2020_06_01.Gallery;
import rx.Observable;
import com.microsoft.azure.management.compute.v2020_06_01.GalleryUpdate;
import com.microsoft.azure.management.compute.v2020_06_01.GalleryIdentifier;
import rx.functions.Func1;

class GalleryImpl extends GroupableResourceCoreImpl<Gallery, GalleryInner, GalleryImpl, ComputeManager> implements Gallery, Gallery.Definition, Gallery.Update {
    private GalleryUpdate updateParameter;
    GalleryImpl(String name, GalleryInner inner, ComputeManager manager) {
        super(name, inner, manager);
        this.updateParameter = new GalleryUpdate();
    }

    @Override
    public Observable<Gallery> createResourceAsync() {
        GalleriesInner client = this.manager().inner().galleries();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<GalleryInner, GalleryInner>() {
               @Override
               public GalleryInner call(GalleryInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Gallery> updateResourceAsync() {
        GalleriesInner client = this.manager().inner().galleries();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<GalleryInner, GalleryInner>() {
               @Override
               public GalleryInner call(GalleryInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<GalleryInner> getInnerAsync() {
        GalleriesInner client = this.manager().inner().galleries();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new GalleryUpdate();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public GalleryIdentifier identifier() {
        return this.inner().identifier();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public GalleryImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.inner().withDescription(description);
        } else {
            this.updateParameter.withDescription(description);
        }
        return this;
    }

    @Override
    public GalleryImpl withIdentifier(GalleryIdentifier identifier) {
        if (isInCreateMode()) {
            this.inner().withIdentifier(identifier);
        } else {
            this.updateParameter.withIdentifier(identifier);
        }
        return this;
    }

}