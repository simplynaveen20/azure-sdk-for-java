// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of WorkflowVersionTriggers.
 */
public interface WorkflowVersionTriggers {
    /**
     * Get the callback url for a trigger of a workflow version.
     * 
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param versionId The workflow versionId.
     * @param triggerName The workflow trigger name.
     * @param parameters The callback URL parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the callback url for a trigger of a workflow version along with {@link Response}.
     */
    Response<WorkflowTriggerCallbackUrl> listCallbackUrlWithResponse(String resourceGroupName, String workflowName,
        String versionId, String triggerName, GetCallbackUrlParameters parameters, Context context);

    /**
     * Get the callback url for a trigger of a workflow version.
     * 
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param versionId The workflow versionId.
     * @param triggerName The workflow trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the callback url for a trigger of a workflow version.
     */
    WorkflowTriggerCallbackUrl listCallbackUrl(String resourceGroupName, String workflowName, String versionId,
        String triggerName);
}
