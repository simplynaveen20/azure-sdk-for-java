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
 * Create network mappings input.
 */
public class CreateNetworkMappingInput {
    /**
     * Input properties for creating network mapping.
     */
    @JsonProperty(value = "properties")
    private CreateNetworkMappingInputProperties properties;

    /**
     * Get input properties for creating network mapping.
     *
     * @return the properties value
     */
    public CreateNetworkMappingInputProperties properties() {
        return this.properties;
    }

    /**
     * Set input properties for creating network mapping.
     *
     * @param properties the properties value to set
     * @return the CreateNetworkMappingInput object itself.
     */
    public CreateNetworkMappingInput withProperties(CreateNetworkMappingInputProperties properties) {
        this.properties = properties;
        return this;
    }

}
