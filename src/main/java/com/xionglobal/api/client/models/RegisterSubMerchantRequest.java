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
 * This is a model class for RegisterSubMerchantRequest type.
 */
public class RegisterSubMerchantRequest {
    private String companyName;
    private String walletAddress;
    private Double chargedFees;

    /**
     * Default constructor.
     */
    public RegisterSubMerchantRequest() {
    }

    /**
     * Initialization constructor.
     * @param  companyName  String value for companyName.
     * @param  walletAddress  String value for walletAddress.
     * @param  chargedFees  Double value for chargedFees.
     */
    public RegisterSubMerchantRequest(
            String companyName,
            String walletAddress,
            Double chargedFees) {
        this.companyName = companyName;
        this.walletAddress = walletAddress;
        this.chargedFees = chargedFees;
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
     * Getter for ChargedFees.
     * Charged fees of the company.
     * @return Returns the Double
     */
    @JsonGetter("charged_fees")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getChargedFees() {
        return chargedFees;
    }

    /**
     * Setter for ChargedFees.
     * Charged fees of the company.
     * @param chargedFees Value for Double
     */
    @JsonSetter("charged_fees")
    public void setChargedFees(Double chargedFees) {
        this.chargedFees = chargedFees;
    }

    /**
     * Converts this RegisterSubMerchantRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RegisterSubMerchantRequest [" + "companyName=" + companyName + ", walletAddress="
                + walletAddress + ", chargedFees=" + chargedFees + "]";
    }

    /**
     * Builds a new {@link RegisterSubMerchantRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RegisterSubMerchantRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .companyName(getCompanyName())
                .walletAddress(getWalletAddress())
                .chargedFees(getChargedFees());
        return builder;
    }

    /**
     * Class to build instances of {@link RegisterSubMerchantRequest}.
     */
    public static class Builder {
        private String companyName;
        private String walletAddress;
        private Double chargedFees;



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
         * Setter for chargedFees.
         * @param  chargedFees  Double value for chargedFees.
         * @return Builder
         */
        public Builder chargedFees(Double chargedFees) {
            this.chargedFees = chargedFees;
            return this;
        }

        /**
         * Builds a new {@link RegisterSubMerchantRequest} object using the set fields.
         * @return {@link RegisterSubMerchantRequest}
         */
        public RegisterSubMerchantRequest build() {
            return new RegisterSubMerchantRequest(companyName, walletAddress, chargedFees);
        }
    }
}
