// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

/**
 * Samples for ConnectionType Get.
 */
public final class ConnectionTypeGetSamples {
    /*
     * x-ms-original-file:
     * specification/automation/resource-manager/Microsoft.Automation/preview/2020-01-13-preview/examples/
     * getConnectionType.json
     */
    /**
     * Sample code: Get connection type.
     * 
     * @param manager Entry point to AutomationManager.
     */
    public static void getConnectionType(com.azure.resourcemanager.automation.AutomationManager manager) {
        manager.connectionTypes()
            .getWithResponse("rg", "myAutomationAccount22", "myCT", com.azure.core.util.Context.NONE);
    }
}
