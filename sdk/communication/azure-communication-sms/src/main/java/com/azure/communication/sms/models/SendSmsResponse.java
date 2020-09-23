// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.sms.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SendSmsResponse model. */
@Fluent
public final class SendSmsResponse {
    /*
     * The identifier of the outgoing SMS message
     */
    @JsonProperty(value = "messageId")
    private String messageId;

    /**
     * Get the messageId property: The identifier of the outgoing SMS message.
     *
     * @return the messageId value.
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * Set the messageId property: The identifier of the outgoing SMS message.
     *
     * @param messageId the messageId value to set.
     * @return the SendSmsResponse object itself.
     */
    public SendSmsResponse setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
}