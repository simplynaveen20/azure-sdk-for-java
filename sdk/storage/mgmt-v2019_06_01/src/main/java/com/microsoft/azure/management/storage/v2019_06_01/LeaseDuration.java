/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for LeaseDuration.
 */
public final class LeaseDuration extends ExpandableStringEnum<LeaseDuration> {
    /** Static value Infinite for LeaseDuration. */
    public static final LeaseDuration INFINITE = fromString("Infinite");

    /** Static value Fixed for LeaseDuration. */
    public static final LeaseDuration FIXED = fromString("Fixed");

    /**
     * Creates or finds a LeaseDuration from its string representation.
     * @param name a name to look for
     * @return the corresponding LeaseDuration
     */
    @JsonCreator
    public static LeaseDuration fromString(String name) {
        return fromString(name, LeaseDuration.class);
    }

    /**
     * @return known LeaseDuration values
     */
    public static Collection<LeaseDuration> values() {
        return values(LeaseDuration.class);
    }
}
