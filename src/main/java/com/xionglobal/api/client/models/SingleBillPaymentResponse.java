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
 * This is a model class for SingleBillPaymentResponse type.
 */
public class SingleBillPaymentResponse {
    private String orderCode;
    private String transactionHash;
    private String status;

    /**
     * Default constructor.
     */
    public SingleBillPaymentResponse() {
    }

    /**
     * Initialization constructor.
     * @param  orderCode  String value for orderCode.
     * @param  transactionHash  String value for transactionHash.
     * @param  status  String value for status.
     */
    public SingleBillPaymentResponse(
            String orderCode,
            String transactionHash,
            String status) {
        this.orderCode = orderCode;
        this.transactionHash = transactionHash;
        this.status = status;
    }

    /**
     * Getter for OrderCode.
     * Order code for single payment.
     * @return Returns the String
     */
    @JsonGetter("orderCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * Setter for OrderCode.
     * Order code for single payment.
     * @param orderCode Value for String
     */
    @JsonSetter("orderCode")
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    /**
     * Getter for TransactionHash.
     * Transaction hash of the payment.
     * @return Returns the String
     */
    @JsonGetter("transactionHash")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTransactionHash() {
        return transactionHash;
    }

    /**
     * Setter for TransactionHash.
     * Transaction hash of the payment.
     * @param transactionHash Value for String
     */
    @JsonSetter("transactionHash")
    public void setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
    }

    /**
     * Getter for Status.
     * Status of the payment.
     * @return Returns the String
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Status of the payment.
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Converts this SingleBillPaymentResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SingleBillPaymentResponse [" + "orderCode=" + orderCode + ", transactionHash="
                + transactionHash + ", status=" + status + "]";
    }

    /**
     * Builds a new {@link SingleBillPaymentResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SingleBillPaymentResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .orderCode(getOrderCode())
                .transactionHash(getTransactionHash())
                .status(getStatus());
        return builder;
    }

    /**
     * Class to build instances of {@link SingleBillPaymentResponse}.
     */
    public static class Builder {
        private String orderCode;
        private String transactionHash;
        private String status;



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
         * Setter for transactionHash.
         * @param  transactionHash  String value for transactionHash.
         * @return Builder
         */
        public Builder transactionHash(String transactionHash) {
            this.transactionHash = transactionHash;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Builds a new {@link SingleBillPaymentResponse} object using the set fields.
         * @return {@link SingleBillPaymentResponse}
         */
        public SingleBillPaymentResponse build() {
            return new SingleBillPaymentResponse(orderCode, transactionHash, status);
        }
    }
}
