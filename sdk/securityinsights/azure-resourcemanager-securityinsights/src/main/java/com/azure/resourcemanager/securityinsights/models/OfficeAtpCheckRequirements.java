// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.securityinsights.fluent.models.OfficeAtpCheckRequirementsProperties;
import java.io.IOException;

/**
 * Represents OfficeATP (Office 365 Advanced Threat Protection) requirements check request.
 */
@Fluent
public final class OfficeAtpCheckRequirements extends DataConnectorsCheckRequirements {
    /*
     * Describes the kind of connector to be checked.
     */
    private DataConnectorKind kind = DataConnectorKind.OFFICE_ATP;

    /*
     * OfficeATP (Office 365 Advanced Threat Protection) requirements check properties.
     */
    private OfficeAtpCheckRequirementsProperties innerProperties;

    /**
     * Creates an instance of OfficeAtpCheckRequirements class.
     */
    public OfficeAtpCheckRequirements() {
    }

    /**
     * Get the kind property: Describes the kind of connector to be checked.
     * 
     * @return the kind value.
     */
    @Override
    public DataConnectorKind kind() {
        return this.kind;
    }

    /**
     * Get the innerProperties property: OfficeATP (Office 365 Advanced Threat Protection) requirements check
     * properties.
     * 
     * @return the innerProperties value.
     */
    private OfficeAtpCheckRequirementsProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tenantId property: The tenant id to connect to, and get the data from.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantId();
    }

    /**
     * Set the tenantId property: The tenant id to connect to, and get the data from.
     * 
     * @param tenantId the tenantId value to set.
     * @return the OfficeAtpCheckRequirements object itself.
     */
    public OfficeAtpCheckRequirements withTenantId(String tenantId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OfficeAtpCheckRequirementsProperties();
        }
        this.innerProperties().withTenantId(tenantId);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OfficeAtpCheckRequirements from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OfficeAtpCheckRequirements if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OfficeAtpCheckRequirements.
     */
    public static OfficeAtpCheckRequirements fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OfficeAtpCheckRequirements deserializedOfficeAtpCheckRequirements = new OfficeAtpCheckRequirements();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("kind".equals(fieldName)) {
                    deserializedOfficeAtpCheckRequirements.kind = DataConnectorKind.fromString(reader.getString());
                } else if ("properties".equals(fieldName)) {
                    deserializedOfficeAtpCheckRequirements.innerProperties
                        = OfficeAtpCheckRequirementsProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOfficeAtpCheckRequirements;
        });
    }
}
