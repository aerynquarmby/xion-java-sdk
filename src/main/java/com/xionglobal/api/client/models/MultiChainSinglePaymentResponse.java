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
 * This is a model class for MultiChainSinglePaymentResponse type.
 */
public class MultiChainSinglePaymentResponse {
    private String orderCode;
    private String hash;

    /**
     * Default constructor.
     */
    public MultiChainSinglePaymentResponse() {
    }

    /**
     * Initialization constructor.
     * @param  orderCode  String value for orderCode.
     * @param  hash  String value for hash.
     */
    public MultiChainSinglePaymentResponse(
            String orderCode,
            String hash) {
        this.orderCode = orderCode;
        this.hash = hash;
    }

    /**
     * Getter for OrderCode.
     * Order code
     * @return Returns the String
     */
    @JsonGetter("orderCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * Setter for OrderCode.
     * Order code
     * @param orderCode Value for String
     */
    @JsonSetter("orderCode")
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    /**
     * Getter for Hash.
     * Hash
     * @return Returns the String
     */
    @JsonGetter("hash")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHash() {
        return hash;
    }

    /**
     * Setter for Hash.
     * Hash
     * @param hash Value for String
     */
    @JsonSetter("hash")
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * Converts this MultiChainSinglePaymentResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MultiChainSinglePaymentResponse [" + "orderCode=" + orderCode + ", hash=" + hash
                + "]";
    }

    /**
     * Builds a new {@link MultiChainSinglePaymentResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MultiChainSinglePaymentResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .orderCode(getOrderCode())
                .hash(getHash());
        return builder;
    }

    /**
     * Class to build instances of {@link MultiChainSinglePaymentResponse}.
     */
    public static class Builder {
        private String orderCode;
        private String hash;



        /**
         * Setter for orderCode.
         * @param  orderCode  String value for orderCode.
         * @return Builder
         */
        public Builder orderCode(String orderCode) {
            this.orderCode = orderCode;
            return this;
        }

        /**
         * Setter for hash.
         * @param  hash  String value for hash.
         * @return Builder
         */
        public Builder hash(String hash) {
            this.hash = hash;
            return this;
        }

        /**
         * Builds a new {@link MultiChainSinglePaymentResponse} object using the set fields.
         * @return {@link MultiChainSinglePaymentResponse}
         */
        public MultiChainSinglePaymentResponse build() {
            return new MultiChainSinglePaymentResponse(orderCode, hash);
        }
    }
}
