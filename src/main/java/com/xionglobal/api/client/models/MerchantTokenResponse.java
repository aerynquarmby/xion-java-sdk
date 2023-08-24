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
 * This is a model class for MerchantTokenResponse type.
 */
public class MerchantTokenResponse {
    private String type;
    private String token;
    private String referralCode;
    private String message;

    /**
     * Default constructor.
     */
    public MerchantTokenResponse() {
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  token  String value for token.
     * @param  referralCode  String value for referralCode.
     * @param  message  String value for message.
     */
    public MerchantTokenResponse(
            String type,
            String token,
            String referralCode,
            String message) {
        this.type = type;
        this.token = token;
        this.referralCode = referralCode;
        this.message = message;
    }

    /**
     * Getter for Type.
     * Type of the merchant token.
     * @return Returns the String
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Type of the merchant token.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for Token.
     * Token of the merchant.
     * @return Returns the String
     */
    @JsonGetter("token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getToken() {
        return token;
    }

    /**
     * Setter for Token.
     * Token of the merchant.
     * @param token Value for String
     */
    @JsonSetter("token")
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Getter for ReferralCode.
     * Referral code of the merchant token.
     * @return Returns the String
     */
    @JsonGetter("referral_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReferralCode() {
        return referralCode;
    }

    /**
     * Setter for ReferralCode.
     * Referral code of the merchant token.
     * @param referralCode Value for String
     */
    @JsonSetter("referral_code")
    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }

    /**
     * Getter for Message.
     * Message of the merchant token.
     * @return Returns the String
     */
    @JsonGetter("message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * Message of the merchant token.
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Converts this MerchantTokenResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MerchantTokenResponse [" + "type=" + type + ", token=" + token + ", referralCode="
                + referralCode + ", message=" + message + "]";
    }

    /**
     * Builds a new {@link MerchantTokenResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MerchantTokenResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .type(getType())
                .token(getToken())
                .referralCode(getReferralCode())
                .message(getMessage());
        return builder;
    }

    /**
     * Class to build instances of {@link MerchantTokenResponse}.
     */
    public static class Builder {
        private String type;
        private String token;
        private String referralCode;
        private String message;



        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for token.
         * @param  token  String value for token.
         * @return Builder
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * Setter for referralCode.
         * @param  referralCode  String value for referralCode.
         * @return Builder
         */
        public Builder referralCode(String referralCode) {
            this.referralCode = referralCode;
            return this;
        }

        /**
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Builds a new {@link MerchantTokenResponse} object using the set fields.
         * @return {@link MerchantTokenResponse}
         */
        public MerchantTokenResponse build() {
            return new MerchantTokenResponse(type, token, referralCode, message);
        }
    }
}
