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
 * This is a model class for IframeProductsRequest type.
 */
public class IframeProductsRequest {
    private String referenceId;
    private String productName;
    private Double productPrice;

    /**
     * Default constructor.
     */
    public IframeProductsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  referenceId  String value for referenceId.
     * @param  productName  String value for productName.
     * @param  productPrice  Double value for productPrice.
     */
    public IframeProductsRequest(
            String referenceId,
            String productName,
            Double productPrice) {
        this.referenceId = referenceId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    /**
     * Getter for ReferenceId.
     * @return Returns the String
     */
    @JsonGetter("reference_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Setter for ReferenceId.
     * @param referenceId Value for String
     */
    @JsonSetter("reference_id")
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * Getter for ProductName.
     * @return Returns the String
     */
    @JsonGetter("product_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductName() {
        return productName;
    }

    /**
     * Setter for ProductName.
     * @param productName Value for String
     */
    @JsonSetter("product_name")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Getter for ProductPrice.
     * @return Returns the Double
     */
    @JsonGetter("product_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getProductPrice() {
        return productPrice;
    }

    /**
     * Setter for ProductPrice.
     * @param productPrice Value for Double
     */
    @JsonSetter("product_price")
    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * Converts this IframeProductsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "IframeProductsRequest [" + "referenceId=" + referenceId + ", productName="
                + productName + ", productPrice=" + productPrice + "]";
    }

    /**
     * Builds a new {@link IframeProductsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link IframeProductsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .referenceId(getReferenceId())
                .productName(getProductName())
                .productPrice(getProductPrice());
        return builder;
    }

    /**
     * Class to build instances of {@link IframeProductsRequest}.
     */
    public static class Builder {
        private String referenceId;
        private String productName;
        private Double productPrice;



        /**
         * Setter for referenceId.
         * @param  referenceId  String value for referenceId.
         * @return Builder
         */
        public Builder referenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }

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
         * Setter for productPrice.
         * @param  productPrice  Double value for productPrice.
         * @return Builder
         */
        public Builder productPrice(Double productPrice) {
            this.productPrice = productPrice;
            return this;
        }

        /**
         * Builds a new {@link IframeProductsRequest} object using the set fields.
         * @return {@link IframeProductsRequest}
         */
        public IframeProductsRequest build() {
            return new IframeProductsRequest(referenceId, productName, productPrice);
        }
    }
}
