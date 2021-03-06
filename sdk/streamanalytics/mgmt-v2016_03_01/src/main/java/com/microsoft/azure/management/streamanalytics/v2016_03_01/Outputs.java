/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2016_03_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.streamanalytics.v2016_03_01.implementation.OutputsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Outputs.
 */
public interface Outputs extends SupportsCreating<Output.DefinitionStages.Blank>, HasInner<OutputsInner> {
    /**
     * Tests whether an output’s datasource is reachable and usable by the Azure Stream Analytics service.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param jobName The name of the streaming job.
     * @param outputName The name of the output.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ResourceTestStatus> testAsync(String resourceGroupName, String jobName, String outputName);

    /**
     * Gets details about the specified output.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param jobName The name of the streaming job.
     * @param outputName The name of the output.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Output> getAsync(String resourceGroupName, String jobName, String outputName);

    /**
     * Lists all of the outputs under the specified streaming job.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param jobName The name of the streaming job.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Output> listByStreamingJobAsync(final String resourceGroupName, final String jobName);

    /**
     * Deletes an output from the streaming job.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param jobName The name of the streaming job.
     * @param outputName The name of the output.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String jobName, String outputName);

}
