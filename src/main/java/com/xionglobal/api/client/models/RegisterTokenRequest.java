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
 * This is a model class for RegisterTokenRequest type.
 */
public class RegisterTokenRequest {
    private String merchantWalletAddress;
    private String name;

    /**
     * Default constructor.
     */
    public RegisterTokenRequest() {
    }

    /**
     * Initialization constructor.
     * @param  merchantWalletAddress  String value for merchantWalletAddress.
     * @param  name  String value for name.
     */
    public RegisterTokenRequest(
            String merchantWalletAddress,
            String name) {
        this.merchantWalletAddress = merchantWalletAddress;
        this.name = name;
    }

    /**
     * Getter for MerchantWalletAddress.
     * Wallet address of merchant.
     * @return Returns the String
     */
    @JsonGetter("merchantWalletAddress")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMerchantWalletAddress() {
        return merchantWalletAddress;
    }

    /**
     * Setter for MerchantWalletAddress.
     * Wallet address of merchant.
     * @param merchantWalletAddress Value for String
     */
    @JsonSetter("merchantWalletAddress")
    public void setMerchantWalletAddress(String merchantWalletAddress) {
        this.merchantWalletAddress = merchantWalletAddress;
    }

    /**
     * Getter for Name.
     * Unique name for the third-party application going to use the access token.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Unique name for the third-party application going to use the access token.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Converts this RegisterTokenRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RegisterTokenRequest [" + "merchantWalletAddress=" + merchantWalletAddress
                + ", name=" + name + "]";
    }

    /**
     * Builds a new {@link RegisterTokenRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RegisterTokenRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .merchantWalletAddress(getMerchantWalletAddress())
                .name(getName());
        return builder;
    }

    /**
     * Class to build instances of {@link RegisterTokenRequest}.
     */
    public static class Builder {
        private String merchantWalletAddress;
        private String name;



        /**
         * Setter for merchantWalletAddress.
         * @param  merchantWalletAddress  String value for merchantWalletAddress.
         * @return Builder
         */
        public Builder merchantWalletAddress(String merchantWalletAddress) {
            this.merchantWalletAddress = merchantWalletAddress;
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
         * Builds a new {@link RegisterTokenRequest} object using the set fields.
         * @return {@link RegisterTokenRequest}
         */
        public RegisterTokenRequest build() {
            return new RegisterTokenRequest(merchantWalletAddress, name);
        }
    }
}
