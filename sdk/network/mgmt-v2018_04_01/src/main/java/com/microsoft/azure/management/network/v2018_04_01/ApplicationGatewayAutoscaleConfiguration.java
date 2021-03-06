/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Application Gateway autoscale configuration.
 */
public class ApplicationGatewayAutoscaleConfiguration {
    /**
     * Autoscale bounds.
     */
    @JsonProperty(value = "bounds", required = true)
    private ApplicationGatewayAutoscaleBounds bounds;

    /**
     * Get autoscale bounds.
     *
     * @return the bounds value
     */
    public ApplicationGatewayAutoscaleBounds bounds() {
        return this.bounds;
    }

    /**
     * Set autoscale bounds.
     *
     * @param bounds the bounds value to set
     * @return the ApplicationGatewayAutoscaleConfiguration object itself.
     */
    public ApplicationGatewayAutoscaleConfiguration withBounds(ApplicationGatewayAutoscaleBounds bounds) {
        this.bounds = bounds;
        return this;
    }

}
