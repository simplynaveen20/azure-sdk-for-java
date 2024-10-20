// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.generated;

/**
 * Samples for Products List.
 */
public final class ProductsListSamples {
    /*
     * x-ms-original-file:
     * specification/azurestack/resource-manager/Microsoft.AzureStack/stable/2022-06-01/examples/Product/List.json
     */
    /**
     * Sample code: Returns a list of products.
     * 
     * @param manager Entry point to AzureStackManager.
     */
    public static void returnsAListOfProducts(com.azure.resourcemanager.azurestack.AzureStackManager manager) {
        manager.products().list("azurestack", "testregistration", com.azure.core.util.Context.NONE);
    }
}
