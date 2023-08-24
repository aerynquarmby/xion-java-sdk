/*
 * RestApiClient
 *
 * This file was automatically generated for XionGlobal by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.xionglobal.api.client.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for RegisterTokenResponse type.
 */
public class RegisterTokenResponse {
    private String clientId;
    private String jwtToken;

    /**
     * Default constructor.
     */
    public RegisterTokenResponse() {
    }

    /**
     * Initialization constructor.
     * @param  clientId  String value for clientId.
     * @param  jwtToken  String value for jwtToken.
     */
    public RegisterTokenResponse(
            String clientId,
            String jwtToken) {
        this.clientId = clientId;
        this.jwtToken = jwtToken;
    }

    /**
     * Getter for ClientId.
     * key for the accessing endpoint.
     * @return Returns the String
     */
    @JsonGetter("clientId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getClientId() {
        return clientId;
    }

    /**
     * Setter for ClientId.
     * key for the accessing endpoint.
     * @param clientId Value for String
     */
    @JsonSetter("clientId")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * Getter for JwtToken.
     * secret(JWT) for accessing endpoint should be kept safe.
     * @return Returns the String
     */
    @JsonGetter("jwtToken")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getJwtToken() {
        return jwtToken;
    }

    /**
     * Setter for JwtToken.
     * secret(JWT) for accessing endpoint should be kept safe.
     * @param jwtToken Value for String
     */
    @JsonSetter("jwtToken")
    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    /**
     * Converts this RegisterTokenResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RegisterTokenResponse [" + "clientId=" + clientId + ", jwtToken=" + jwtToken + "]";
    }

    /**
     * Builds a new {@link RegisterTokenResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RegisterTokenResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .clientId(getClientId())
                .jwtToken(getJwtToken());
        return builder;
    }

    /**
     * Class to build instances of {@link RegisterTokenResponse}.
     */
    public static class Builder {
        private String clientId;
        private String jwtToken;



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
         * Setter for jwtToken.
         * @param  jwtToken  String value for jwtToken.
         * @return Builder
         */
        public Builder jwtToken(String jwtToken) {
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * Builds a new {@link RegisterTokenResponse} object using the set fields.
         * @return {@link RegisterTokenResponse}
         */
        public RegisterTokenResponse build() {
            return new RegisterTokenResponse(clientId, jwtToken);
        }
    }
}
