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
 * This is a model class for MultiChainSingleBillPaymentRequest type.
 */
public class MultiChainSingleBillPaymentRequest {
    private String productName;
    private Double amountUSD;
    private String token;
    private String buyerAddress;
    private Double chain;

    /**
     * Default constructor.
     */
    public MultiChainSingleBillPaymentRequest() {
    }

    /**
     * Initialization constructor.
     * @param  productName  String value for productName.
     * @param  amountUSD  Double value for amountUSD.
     * @param  token  String value for token.
     * @param  buyerAddress  String value for buyerAddress.
     * @param  chain  Double value for chain.
     */
    public MultiChainSingleBillPaymentRequest(
            String productName,
            Double amountUSD,
            String token,
            String buyerAddress,
            Double chain) {
        this.productName = productName;
        this.amountUSD = amountUSD;
        this.token = token;
        this.buyerAddress = buyerAddress;
        this.chain = chain;
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
     * Getter for AmountUSD.
     * Amount to be paid (USD).
     * @return Returns the Double
     */
    @JsonGetter("amountUSD")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getAmountUSD() {
        return amountUSD;
    }

    /**
     * Setter for AmountUSD.
     * Amount to be paid (USD).
     * @param amountUSD Value for Double
     */
    @JsonSetter("amountUSD")
    public void setAmountUSD(Double amountUSD) {
        this.amountUSD = amountUSD;
    }

    /**
     * Getter for Token.
     * Token of the amount to paid.
     * @return Returns the String
     */
    @JsonGetter("token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getToken() {
        return token;
    }

    /**
     * Setter for Token.
     * Token of the amount to paid.
     * @param token Value for String
     */
    @JsonSetter("token")
    public void setToken(String token) {
        this.token = token;
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
     * Getter for Chain.
     * Chain to be used for payment.
     * @return Returns the Double
     */
    @JsonGetter("chain")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getChain() {
        return chain;
    }

    /**
     * Setter for Chain.
     * Chain to be used for payment.
     * @param chain Value for Double
     */
    @JsonSetter("chain")
    public void setChain(Double chain) {
        this.chain = chain;
    }

    /**
     * Converts this MultiChainSingleBillPaymentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MultiChainSingleBillPaymentRequest [" + "productName=" + productName
                + ", amountUSD=" + amountUSD + ", token=" + token + ", buyerAddress=" + buyerAddress
                + ", chain=" + chain + "]";
    }

    /**
     * Builds a new {@link MultiChainSingleBillPaymentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MultiChainSingleBillPaymentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .productName(getProductName())
                .amountUSD(getAmountUSD())
                .token(getToken())
                .buyerAddress(getBuyerAddress())
                .chain(getChain());
        return builder;
    }

    /**
     * Class to build instances of {@link MultiChainSingleBillPaymentRequest}.
     */
    public static class Builder {
        private String productName;
        private Double amountUSD;
        private String token;
        private String buyerAddress;
        private Double chain;



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
         * Setter for amountUSD.
         * @param  amountUSD  Double value for amountUSD.
         * @return Builder
         */
        public Builder amountUSD(Double amountUSD) {
            this.amountUSD = amountUSD;
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
         * Setter for buyerAddress.
         * @param  buyerAddress  String value for buyerAddress.
         * @return Builder
         */
        public Builder buyerAddress(String buyerAddress) {
            this.buyerAddress = buyerAddress;
            return this;
        }

        /**
         * Setter for chain.
         * @param  chain  Double value for chain.
         * @return Builder
         */
        public Builder chain(Double chain) {
            this.chain = chain;
            return this;
        }

        /**
         * Builds a new {@link MultiChainSingleBillPaymentRequest} object using the set fields.
         * @return {@link MultiChainSingleBillPaymentRequest}
         */
        public MultiChainSingleBillPaymentRequest build() {
            return new MultiChainSingleBillPaymentRequest(productName, amountUSD, token,
                    buyerAddress, chain);
        }
    }
}
