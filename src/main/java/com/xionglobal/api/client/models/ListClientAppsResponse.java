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
 * This is a model class for ListClientAppsResponse type.
 */
public class ListClientAppsResponse {
    private String merchantWalletAddress;
    private List<ClientId> clientIds;

    /**
     * Default constructor.
     */
    public ListClientAppsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  merchantWalletAddress  String value for merchantWalletAddress.
     * @param  clientIds  List of ClientId value for clientIds.
     */
    public ListClientAppsResponse(
            String merchantWalletAddress,
            List<ClientId> clientIds) {
        this.merchantWalletAddress = merchantWalletAddress;
        this.clientIds = clientIds;
    }

    /**
     * Getter for MerchantWalletAddress.
     * Wallet address of merchant.
     * @return Returns the String
     */
    @JsonGetter("merchantWalletAddress")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMerchantWalletAddress() {
        return merchantWalletAddress;
    }

    /**
     * Setter for MerchantWalletAddress.
     * Wallet address of merchant.
     * @param merchantWalletAddress Value for String
     */
    @JsonSetter("merchantWalletAddress")
    public void setMerchantWalletAddress(String merchantWalletAddress) {
        this.merchantWalletAddress = merchantWalletAddress;
    }

    /**
     * Getter for ClientIds.
     * List of client Ids created by the merchant.
     * @return Returns the List of ClientId
     */
    @JsonGetter("clientIds")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ClientId> getClientIds() {
        return clientIds;
    }

    /**
     * Setter for ClientIds.
     * List of client Ids created by the merchant.
     * @param clientIds Value for List of ClientId
     */
    @JsonSetter("clientIds")
    public void setClientIds(List<ClientId> clientIds) {
        this.clientIds = clientIds;
    }

    /**
     * Converts this ListClientAppsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListClientAppsResponse [" + "merchantWalletAddress=" + merchantWalletAddress
                + ", clientIds=" + clientIds + "]";
    }

    /**
     * Builds a new {@link ListClientAppsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListClientAppsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .merchantWalletAddress(getMerchantWalletAddress())
                .clientIds(getClientIds());
        return builder;
    }

    /**
     * Class to build instances of {@link ListClientAppsResponse}.
     */
    public static class Builder {
        private String merchantWalletAddress;
        private List<ClientId> clientIds;



        /**
         * Setter for merchantWalletAddress.
         * @param  merchantWalletAddress  String value for merchantWalletAddress.
         * @return Builder
         */
        public Builder merchantWalletAddress(String merchantWalletAddress) {
            this.merchantWalletAddress = merchantWalletAddress;
            return this;
        }

        /**
         * Setter for clientIds.
         * @param  clientIds  List of ClientId value for clientIds.
         * @return Builder
         */
        public Builder clientIds(List<ClientId> clientIds) {
            this.clientIds = clientIds;
            return this;
        }

        /**
         * Builds a new {@link ListClientAppsResponse} object using the set fields.
         * @return {@link ListClientAppsResponse}
         */
        public ListClientAppsResponse build() {
            return new ListClientAppsResponse(merchantWalletAddress, clientIds);
        }
    }
}
