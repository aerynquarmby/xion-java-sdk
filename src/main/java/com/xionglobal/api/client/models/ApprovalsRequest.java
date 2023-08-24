/*
 * RestApiClient
 *
 * This file was automatically generated for XionGlobal by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.xionglobal.api.client.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for ApprovalsRequest type.
 */
public class ApprovalsRequest {
    private Integer id;
    private String sourceUserAddress;
    private Integer sourceChain;
    private String sourceToken;
    private String destinationUserAddress;
    private Integer destinationChain;
    private String destinationToken;
    private Double amountUSD;
    private List<Double> products;

    /**
     * Default constructor.
     */
    public ApprovalsRequest() {
        destinationChain = 137;
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  sourceUserAddress  String value for sourceUserAddress.
     * @param  sourceChain  Integer value for sourceChain.
     * @param  sourceToken  String value for sourceToken.
     * @param  destinationUserAddress  String value for destinationUserAddress.
     * @param  destinationChain  Integer value for destinationChain.
     * @param  destinationToken  String value for destinationToken.
     * @param  amountUSD  Double value for amountUSD.
     * @param  products  List of Double value for products.
     */
    public ApprovalsRequest(
            Integer id,
            String sourceUserAddress,
            Integer sourceChain,
            String sourceToken,
            String destinationUserAddress,
            Integer destinationChain,
            String destinationToken,
            Double amountUSD,
            List<Double> products) {
        this.id = id;
        this.sourceUserAddress = sourceUserAddress;
        this.sourceChain = sourceChain;
        this.sourceToken = sourceToken;
        this.destinationUserAddress = destinationUserAddress;
        this.destinationChain = destinationChain;
        this.destinationToken = destinationToken;
        this.amountUSD = amountUSD;
        this.products = products;
    }

    /**
     * Getter for Id.
     * ID of product.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * ID of product.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for SourceUserAddress.
     * Wallet address of buyer.
     * @return Returns the String
     */
    @JsonGetter("sourceUserAddress")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSourceUserAddress() {
        return sourceUserAddress;
    }

    /**
     * Setter for SourceUserAddress.
     * Wallet address of buyer.
     * @param sourceUserAddress Value for String
     */
    @JsonSetter("sourceUserAddress")
    public void setSourceUserAddress(String sourceUserAddress) {
        this.sourceUserAddress = sourceUserAddress;
    }

    /**
     * Getter for SourceChain.
     * Chain ID for making the approvals.
     * @return Returns the Integer
     */
    @JsonGetter("sourceChain")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getSourceChain() {
        return sourceChain;
    }

    /**
     * Setter for SourceChain.
     * Chain ID for making the approvals.
     * @param sourceChain Value for Integer
     */
    @JsonSetter("sourceChain")
    public void setSourceChain(Integer sourceChain) {
        this.sourceChain = sourceChain;
    }

    /**
     * Getter for SourceToken.
     * Token used for approvals.
     * @return Returns the String
     */
    @JsonGetter("sourceToken")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSourceToken() {
        return sourceToken;
    }

    /**
     * Setter for SourceToken.
     * Token used for approvals.
     * @param sourceToken Value for String
     */
    @JsonSetter("sourceToken")
    public void setSourceToken(String sourceToken) {
        this.sourceToken = sourceToken;
    }

    /**
     * Getter for DestinationUserAddress.
     * Wallet address of merchant.
     * @return Returns the String
     */
    @JsonGetter("destinationUserAddress")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDestinationUserAddress() {
        return destinationUserAddress;
    }

    /**
     * Setter for DestinationUserAddress.
     * Wallet address of merchant.
     * @param destinationUserAddress Value for String
     */
    @JsonSetter("destinationUserAddress")
    public void setDestinationUserAddress(String destinationUserAddress) {
        this.destinationUserAddress = destinationUserAddress;
    }

    /**
     * Getter for DestinationChain.
     * Chain ID for polygon matic mainnet.
     * @return Returns the Integer
     */
    @JsonGetter("destinationChain")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getDestinationChain() {
        return destinationChain;
    }

    /**
     * Setter for DestinationChain.
     * Chain ID for polygon matic mainnet.
     * @param destinationChain Value for Integer
     */
    @JsonSetter("destinationChain")
    public void setDestinationChain(Integer destinationChain) {
        this.destinationChain = destinationChain;
    }

    /**
     * Getter for DestinationToken.
     * Token used for approvals.
     * @return Returns the String
     */
    @JsonGetter("destinationToken")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDestinationToken() {
        return destinationToken;
    }

    /**
     * Setter for DestinationToken.
     * Token used for approvals.
     * @param destinationToken Value for String
     */
    @JsonSetter("destinationToken")
    public void setDestinationToken(String destinationToken) {
        this.destinationToken = destinationToken;
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
     * Getter for Products.
     * List of product Ids.
     * @return Returns the List of Double
     */
    @JsonGetter("products")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Double> getProducts() {
        return products;
    }

    /**
     * Setter for Products.
     * List of product Ids.
     * @param products Value for List of Double
     */
    @JsonSetter("products")
    public void setProducts(List<Double> products) {
        this.products = products;
    }

    /**
     * Converts this ApprovalsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApprovalsRequest [" + "id=" + id + ", sourceUserAddress=" + sourceUserAddress
                + ", sourceChain=" + sourceChain + ", sourceToken=" + sourceToken
                + ", destinationUserAddress=" + destinationUserAddress + ", destinationChain="
                + destinationChain + ", destinationToken=" + destinationToken + ", amountUSD="
                + amountUSD + ", products=" + products + "]";
    }

    /**
     * Builds a new {@link ApprovalsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ApprovalsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .sourceUserAddress(getSourceUserAddress())
                .sourceChain(getSourceChain())
                .sourceToken(getSourceToken())
                .destinationUserAddress(getDestinationUserAddress())
                .destinationChain(getDestinationChain())
                .destinationToken(getDestinationToken())
                .amountUSD(getAmountUSD())
                .products(getProducts());
        return builder;
    }

    /**
     * Class to build instances of {@link ApprovalsRequest}.
     */
    public static class Builder {
        private Integer id;
        private String sourceUserAddress;
        private Integer sourceChain;
        private String sourceToken;
        private String destinationUserAddress;
        private Integer destinationChain = 137;
        private String destinationToken;
        private Double amountUSD;
        private List<Double> products;



        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for sourceUserAddress.
         * @param  sourceUserAddress  String value for sourceUserAddress.
         * @return Builder
         */
        public Builder sourceUserAddress(String sourceUserAddress) {
            this.sourceUserAddress = sourceUserAddress;
            return this;
        }

        /**
         * Setter for sourceChain.
         * @param  sourceChain  Integer value for sourceChain.
         * @return Builder
         */
        public Builder sourceChain(Integer sourceChain) {
            this.sourceChain = sourceChain;
            return this;
        }

        /**
         * Setter for sourceToken.
         * @param  sourceToken  String value for sourceToken.
         * @return Builder
         */
        public Builder sourceToken(String sourceToken) {
            this.sourceToken = sourceToken;
            return this;
        }

        /**
         * Setter for destinationUserAddress.
         * @param  destinationUserAddress  String value for destinationUserAddress.
         * @return Builder
         */
        public Builder destinationUserAddress(String destinationUserAddress) {
            this.destinationUserAddress = destinationUserAddress;
            return this;
        }

        /**
         * Setter for destinationChain.
         * @param  destinationChain  Integer value for destinationChain.
         * @return Builder
         */
        public Builder destinationChain(Integer destinationChain) {
            this.destinationChain = destinationChain;
            return this;
        }

        /**
         * Setter for destinationToken.
         * @param  destinationToken  String value for destinationToken.
         * @return Builder
         */
        public Builder destinationToken(String destinationToken) {
            this.destinationToken = destinationToken;
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
         * Setter for products.
         * @param  products  List of Double value for products.
         * @return Builder
         */
        public Builder products(List<Double> products) {
            this.products = products;
            return this;
        }

        /**
         * Builds a new {@link ApprovalsRequest} object using the set fields.
         * @return {@link ApprovalsRequest}
         */
        public ApprovalsRequest build() {
            return new ApprovalsRequest(id, sourceUserAddress, sourceChain, sourceToken,
                    destinationUserAddress, destinationChain, destinationToken, amountUSD,
                    products);
        }
    }
}
