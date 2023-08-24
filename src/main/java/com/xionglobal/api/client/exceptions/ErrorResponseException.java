/*
 * RestApiClient
 *
 * This file was automatically generated for XionGlobal by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.xionglobal.api.client.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for ErrorResponseException type.
 */
public class ErrorResponseException extends ApiException {
    private static final long serialVersionUID = 2029683767797886894L;
    private String status;
    private String message;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public ErrorResponseException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Status.
     * Status of the request
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for Status.
     * Status of the request
     * @param status Value for String
     */
    @JsonSetter("status")
    private void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for Message.
     * Message of the request
     * @return Returns the String
     */
    @JsonGetter("message")
    public String getMessageField() {
        return this.message;
    }

    /**
     * Setter for Message.
     * Message of the request
     * @param messageField Value for String
     */
    @JsonSetter("message")
    private void setMessageField(String messageField) {
        this.message = messageField;
    }
}
