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
 * This is a model class for IframeProductsResponse type.
 */
public class IframeProductsResponse {
    private String referenceId;
    private String productCode;
    private String productName;
    private Double productPrice;
    private String remarks;

    /**
     * Default constructor.
     */
    public IframeProductsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  referenceId  String value for referenceId.
     * @param  productCode  String value for productCode.
     * @param  productName  String value for productName.
     * @param  productPrice  Double value for productPrice.
     * @param  remarks  String value for remarks.
     */
    public IframeProductsResponse(
            String referenceId,
            String productCode,
            String productName,
            Double productPrice,
            String remarks) {
        this.referenceId = referenceId;
        this.productCode = productCode;
        this.productName = productName;
        this.productPrice = productPrice;
        this.remarks = remarks;
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
     * Getter for ProductCode.
     * @return Returns the String
     */
    @JsonGetter("product_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProductCode() {
        return productCode;
    }

    /**
     * Setter for ProductCode.
     * @param productCode Value for String
     */
    @JsonSetter("product_code")
    public void setProductCode(String productCode) {
        this.productCode = productCode;
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
     * Getter for Remarks.
     * @return Returns the String
     */
    @JsonGetter("remarks")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRemarks() {
        return remarks;
    }

    /**
     * Setter for Remarks.
     * @param remarks Value for String
     */
    @JsonSetter("remarks")
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * Converts this IframeProductsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "IframeProductsResponse [" + "referenceId=" + referenceId + ", productCode="
                + productCode + ", productName=" + productName + ", productPrice=" + productPrice
                + ", remarks=" + remarks + "]";
    }

    /**
     * Builds a new {@link IframeProductsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link IframeProductsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .referenceId(getReferenceId())
                .productCode(getProductCode())
                .productName(getProductName())
                .productPrice(getProductPrice())
                .remarks(getRemarks());
        return builder;
    }

    /**
     * Class to build instances of {@link IframeProductsResponse}.
     */
    public static class Builder {
        private String referenceId;
        private String productCode;
        private String productName;
        private Double productPrice;
        private String remarks;



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
         * Setter for productCode.
         * @param  productCode  String value for productCode.
         * @return Builder
         */
        public Builder productCode(String productCode) {
            this.productCode = productCode;
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
         * Setter for remarks.
         * @param  remarks  String value for remarks.
         * @return Builder
         */
        public Builder remarks(String remarks) {
            this.remarks = remarks;
            return this;
        }

        /**
         * Builds a new {@link IframeProductsResponse} object using the set fields.
         * @return {@link IframeProductsResponse}
         */
        public IframeProductsResponse build() {
            return new IframeProductsResponse(referenceId, productCode, productName, productPrice,
                    remarks);
        }
    }
}
