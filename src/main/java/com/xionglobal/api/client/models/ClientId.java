/*
 * RestApiClient
 *
 * This file was automatically generated for XionGlobal by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.xionglobal.api.client.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.xionglobal.api.client.DateTimeHelper;
import java.time.LocalDateTime;

/**
 * This is a model class for ClientId type.
 */
public class ClientId {
    private String clientId;
    private String name;
    private LocalDateTime createdAt;

    /**
     * Default constructor.
     */
    public ClientId() {
    }

    /**
     * Initialization constructor.
     * @param  clientId  String value for clientId.
     * @param  name  String value for name.
     * @param  createdAt  LocalDateTime value for createdAt.
     */
    public ClientId(
            String clientId,
            String name,
            LocalDateTime createdAt) {
        this.clientId = clientId;
        this.name = name;
        this.createdAt = createdAt;
    }

    /**
     * Getter for ClientId.
     * Client Id of the client app.
     * @return Returns the String
     */
    @JsonGetter("clientId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getClientId() {
        return clientId;
    }

    /**
     * Setter for ClientId.
     * Client Id of the client app.
     * @param clientId Value for String
     */
    @JsonSetter("clientId")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * Getter for Name.
     * Name of the client app.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the client app.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for CreatedAt.
     * Date and time client Id was created.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("createdAt")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * Date and time client Id was created.
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("createdAt")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Converts this ClientId into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ClientId [" + "clientId=" + clientId + ", name=" + name + ", createdAt=" + createdAt
                + "]";
    }

    /**
     * Builds a new {@link ClientId.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ClientId.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .clientId(getClientId())
                .name(getName())
                .createdAt(getCreatedAt());
        return builder;
    }

    /**
     * Class to build instances of {@link ClientId}.
     */
    public static class Builder {
        private String clientId;
        private String name;
        private LocalDateTime createdAt;



        /**
         * Setter for clientId.
         * @param  clientId  String value for clientId.
         * @return Builder
         */
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Builds a new {@link ClientId} object using the set fields.
         * @return {@link ClientId}
         */
        public ClientId build() {
            return new ClientId(clientId, name, createdAt);
        }
    }
}
