/*
 * RestApiClient
 *
 * This file was automatically generated for XionGlobal by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.xionglobal.api.client;

/**
 * Interface to access authentication credentials.
 */
public interface BearerAuthCredentials {

    /**
     * String value for accessToken.
     * @return accessToken
     */
    String getAccessToken();

    /**
     * Checks if provided credentials matched with existing ones.
     * @param accessToken String value for credentials.
     * @return true if credentials matched.
     */
    boolean equals(String accessToken);
}