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
 * This is a model class for SingleBillPaymentRequest type.
 */
public class SingleBillPaymentRequest {
    private String productName;
    private Double amount;
    private String currency;
    private String buyerAddress;

    /**
     * Default constructor.
     */
    public SingleBillPaymentRequest() {
    }

    /**
     * Initialization constructor.
     * @param  productName  String value for productName.
     * @param  amount  Double value for amount.
     * @param  currency  String value for currency.
     * @param  buyerAddress  String value for buyerAddress.
     */
    public SingleBillPaymentRequest(
            String productName,
            Double amount,
            String currency,
            String buyerAddress) {
        this.productName = productName;
        this.amount = amount;
        this.currency = currency;
        this.buyerAddress = buyerAddress;
    }

    /**
     * Getter for ProductName.
     * Name of the product.
     * @return Returns the String
     */
    @JsonGetter("productName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductName() {
        return productName;
    }

    /**
     * Setter for ProductName.
     * Name of the product.
     * @param productName Value for String
     */
    @JsonSetter("productName")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Getter for Amount.
     * Amount to be paid (USD).
     * @return Returns the Double
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Amount to be paid (USD).
     * @param amount Value for Double
     */
    @JsonSetter("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * Getter for Currency.
     * Currency of the amount to paid.
     * @return Returns the String
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * Currency of the amount to paid.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for BuyerAddress.
     * Buyer's wallet address.
     * @return Returns the String
     */
    @JsonGetter("buyerAddress")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBuyerAddress() {
        return buyerAddress;
    }

    /**
     * Setter for BuyerAddress.
     * Buyer's wallet address.
     * @param buyerAddress Value for String
     */
    @JsonSetter("buyerAddress")
    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    /**
     * Converts this SingleBillPaymentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SingleBillPaymentRequest [" + "productName=" + productName + ", amount=" + amount
                + ", currency=" + currency + ", buyerAddress=" + buyerAddress + "]";
    }

    /**
     * Builds a new {@link SingleBillPaymentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SingleBillPaymentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .productName(getProductName())
                .amount(getAmount())
                .currency(getCurrency())
                .buyerAddress(getBuyerAddress());
        return builder;
    }

    /**
     * Class to build instances of {@link SingleBillPaymentRequest}.
     */
    public static class Builder {
        private String productName;
        private Double amount;
        private String currency;
        private String buyerAddress;



        /**
         * Setter for productName.
         * @param  productName  String value for productName.
         * @return Builder
         */
        public Builder productName(String productName) {
            this.productName = productName;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  Double value for amount.
         * @return Builder
         */
        public Builder amount(Double amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for currency.
         * @param  currency  String value for currency.
         * @return Builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Setter for buyerAddress.
         * @param  buyerAddress  String value for buyerAddress.
         * @return Builder
         */
        public Builder buyerAddress(String buyerAddress) {
            this.buyerAddress = buyerAddress;
            return this;
        }

        /**
         * Builds a new {@link SingleBillPaymentRequest} object using the set fields.
         * @return {@link SingleBillPaymentRequest}
         */
        public SingleBillPaymentRequest build() {
            return new SingleBillPaymentRequest(productName, amount, currency, buyerAddress);
        }
    }
}
