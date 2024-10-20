// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Setting for the connector check connectivity.
 */
@Fluent
public class ConnectivityCriteria implements JsonSerializable<ConnectivityCriteria> {
    /*
     * type of connectivity
     */
    private ConnectivityType type;

    /*
     * Queries for checking connectivity
     */
    private List<String> value;

    /**
     * Creates an instance of ConnectivityCriteria class.
     */
    public ConnectivityCriteria() {
    }

    /**
     * Get the type property: type of connectivity.
     * 
     * @return the type value.
     */
    public ConnectivityType type() {
        return this.type;
    }

    /**
     * Set the type property: type of connectivity.
     * 
     * @param type the type value to set.
     * @return the ConnectivityCriteria object itself.
     */
    public ConnectivityCriteria withType(ConnectivityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the value property: Queries for checking connectivity.
     * 
     * @return the value value.
     */
    public List<String> value() {
        return this.value;
    }

    /**
     * Set the value property: Queries for checking connectivity.
     * 
     * @param value the value value to set.
     * @return the ConnectivityCriteria object itself.
     */
    public ConnectivityCriteria withValue(List<String> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConnectivityCriteria from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConnectivityCriteria if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConnectivityCriteria.
     */
    public static ConnectivityCriteria fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConnectivityCriteria deserializedConnectivityCriteria = new ConnectivityCriteria();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedConnectivityCriteria.type = ConnectivityType.fromString(reader.getString());
                } else if ("value".equals(fieldName)) {
                    List<String> value = reader.readArray(reader1 -> reader1.getString());
                    deserializedConnectivityCriteria.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConnectivityCriteria;
        });
    }
}
