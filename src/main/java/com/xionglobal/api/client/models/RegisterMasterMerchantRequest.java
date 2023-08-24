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
 * This is a model class for RegisterMasterMerchantRequest type.
 */
public class RegisterMasterMerchantRequest {
    private String companyName;
    private String walletAddress;

    /**
     * Default constructor.
     */
    public RegisterMasterMerchantRequest() {
    }

    /**
     * Initialization constructor.
     * @param  companyName  String value for companyName.
     * @param  walletAddress  String value for walletAddress.
     */
    public RegisterMasterMerchantRequest(
            String companyName,
            String walletAddress) {
        this.companyName = companyName;
        this.walletAddress = walletAddress;
    }

    /**
     * Getter for CompanyName.
     * Name of the company.
     * @return Returns the String
     */
    @JsonGetter("company_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Setter for CompanyName.
     * Name of the company.
     * @param companyName Value for String
     */
    @JsonSetter("company_name")
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * Getter for WalletAddress.
     * Wallet address of the company.
     * @return Returns the String
     */
    @JsonGetter("wallet_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getWalletAddress() {
        return walletAddress;
    }

    /**
     * Setter for WalletAddress.
     * Wallet address of the company.
     * @param walletAddress Value for String
     */
    @JsonSetter("wallet_address")
    public void setWalletAddress(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    /**
     * Converts this RegisterMasterMerchantRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RegisterMasterMerchantRequest [" + "companyName=" + companyName + ", walletAddress="
                + walletAddress + "]";
    }

    /**
     * Builds a new {@link RegisterMasterMerchantRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RegisterMasterMerchantRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .companyName(getCompanyName())
                .walletAddress(getWalletAddress());
        return builder;
    }

    /**
     * Class to build instances of {@link RegisterMasterMerchantRequest}.
     */
    public static class Builder {
        private String companyName;
        private String walletAddress;



        /**
         * Setter for companyName.
         * @param  companyName  String value for companyName.
         * @return Builder
         */
        public Builder companyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        /**
         * Setter for walletAddress.
         * @param  walletAddress  String value for walletAddress.
         * @return Builder
         */
        public Builder walletAddress(String walletAddress) {
            this.walletAddress = walletAddress;
            return this;
        }

        /**
         * Builds a new {@link RegisterMasterMerchantRequest} object using the set fields.
         * @return {@link RegisterMasterMerchantRequest}
         */
        public RegisterMasterMerchantRequest build() {
            return new RegisterMasterMerchantRequest(companyName, walletAddress);
        }
    }
}
