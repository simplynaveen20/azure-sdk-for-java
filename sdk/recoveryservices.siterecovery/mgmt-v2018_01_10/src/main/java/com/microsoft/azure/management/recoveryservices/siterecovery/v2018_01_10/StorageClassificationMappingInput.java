/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Storage mapping input.
 */
public class StorageClassificationMappingInput {
    /**
     * Storage mapping input properties.
     */
    @JsonProperty(value = "properties")
    private StorageMappingInputProperties properties;

    /**
     * Get storage mapping input properties.
     *
     * @return the properties value
     */
    public StorageMappingInputProperties properties() {
        return this.properties;
    }

    /**
     * Set storage mapping input properties.
     *
     * @param properties the properties value to set
     * @return the StorageClassificationMappingInput object itself.
     */
    public StorageClassificationMappingInput withProperties(StorageMappingInputProperties properties) {
        this.properties = properties;
        return this;
    }

}
