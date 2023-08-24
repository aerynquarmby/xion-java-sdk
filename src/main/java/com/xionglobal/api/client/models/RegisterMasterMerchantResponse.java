/*
 * RestApiClient
 *
 * This file was automatically generated for XionGlobal by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.xionglobal.api.client.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.xionglobal.api.client.DateTimeHelper;
import java.time.LocalDateTime;

/**
 * This is a model class for RegisterMasterMerchantResponse type.
 */
public class RegisterMasterMerchantResponse {
    private String companyName;
    private String walletAddress;
    private LocalDateTime createdAt;

    /**
     * Default constructor.
     */
    public RegisterMasterMerchantResponse() {
    }

    /**
     * Initialization constructor.
     * @param  companyName  String value for companyName.
     * @param  walletAddress  String value for walletAddress.
     * @param  createdAt  LocalDateTime value for createdAt.
     */
    public RegisterMasterMerchantResponse(
            String companyName,
            String walletAddress,
            LocalDateTime createdAt) {
        this.companyName = companyName;
        this.walletAddress = walletAddress;
        this.createdAt = createdAt;
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
     * Getter for CreatedAt.
     * Date and time master merchant was created.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * Date and time master merchant was created.
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Converts this RegisterMasterMerchantResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RegisterMasterMerchantResponse [" + "companyName=" + companyName
                + ", walletAddress=" + walletAddress + ", createdAt=" + createdAt + "]";
    }

    /**
     * Builds a new {@link RegisterMasterMerchantResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RegisterMasterMerchantResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .companyName(getCompanyName())
                .walletAddress(getWalletAddress())
                .createdAt(getCreatedAt());
        return builder;
    }

    /**
     * Class to build instances of {@link RegisterMasterMerchantResponse}.
     */
    public static class Builder {
        private String companyName;
        private String walletAddress;
        private LocalDateTime createdAt;



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
         * Setter for createdAt.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Builds a new {@link RegisterMasterMerchantResponse} object using the set fields.
         * @return {@link RegisterMasterMerchantResponse}
         */
        public RegisterMasterMerchantResponse build() {
            return new RegisterMasterMerchantResponse(companyName, walletAddress, createdAt);
        }
    }
}
