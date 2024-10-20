// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.resourcemanager.customerinsights.fluent.models.KpiDefinitionInner;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of KpiDefinition.
 */
public interface KpiDefinition {
    /**
     * Gets the entityType property: The mapping entity type.
     * 
     * @return the entityType value.
     */
    EntityTypes entityType();

    /**
     * Gets the entityTypeName property: The mapping entity name.
     * 
     * @return the entityTypeName value.
     */
    String entityTypeName();

    /**
     * Gets the tenantId property: The hub name.
     * 
     * @return the tenantId value.
     */
    String tenantId();

    /**
     * Gets the kpiName property: The KPI name.
     * 
     * @return the kpiName value.
     */
    String kpiName();

    /**
     * Gets the displayName property: Localized display name for the KPI.
     * 
     * @return the displayName value.
     */
    Map<String, String> displayName();

    /**
     * Gets the description property: Localized description for the KPI.
     * 
     * @return the description value.
     */
    Map<String, String> description();

    /**
     * Gets the calculationWindow property: The calculation window.
     * 
     * @return the calculationWindow value.
     */
    CalculationWindowTypes calculationWindow();

    /**
     * Gets the calculationWindowFieldName property: Name of calculation window field.
     * 
     * @return the calculationWindowFieldName value.
     */
    String calculationWindowFieldName();

    /**
     * Gets the function property: The computation function for the KPI.
     * 
     * @return the function value.
     */
    KpiFunctions function();

    /**
     * Gets the expression property: The computation expression for the KPI.
     * 
     * @return the expression value.
     */
    String expression();

    /**
     * Gets the unit property: The unit of measurement for the KPI.
     * 
     * @return the unit value.
     */
    String unit();

    /**
     * Gets the filter property: The filter expression for the KPI.
     * 
     * @return the filter value.
     */
    String filter();

    /**
     * Gets the groupBy property: the group by properties for the KPI.
     * 
     * @return the groupBy value.
     */
    List<String> groupBy();

    /**
     * Gets the groupByMetadata property: The KPI GroupByMetadata.
     * 
     * @return the groupByMetadata value.
     */
    List<KpiGroupByMetadata> groupByMetadata();

    /**
     * Gets the participantProfilesMetadata property: The participant profiles.
     * 
     * @return the participantProfilesMetadata value.
     */
    List<KpiParticipantProfilesMetadata> participantProfilesMetadata();

    /**
     * Gets the provisioningState property: Provisioning state.
     * 
     * @return the provisioningState value.
     */
    ProvisioningStates provisioningState();

    /**
     * Gets the thresHolds property: The KPI thresholds.
     * 
     * @return the thresHolds value.
     */
    KpiThresholds thresHolds();

    /**
     * Gets the aliases property: The aliases.
     * 
     * @return the aliases value.
     */
    List<KpiAlias> aliases();

    /**
     * Gets the extracts property: The KPI extracts.
     * 
     * @return the extracts value.
     */
    List<KpiExtract> extracts();

    /**
     * Gets the inner com.azure.resourcemanager.customerinsights.fluent.models.KpiDefinitionInner object.
     * 
     * @return the inner object.
     */
    KpiDefinitionInner innerModel();
}
