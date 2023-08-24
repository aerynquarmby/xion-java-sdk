/*
 * RestApiClient
 *
 * This file was automatically generated for XionGlobal by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.xionglobal.api.client.controllers;

import static org.junit.Assert.assertNotNull;

import com.xionglobal.api.client.RestApiClientClient;
import com.xionglobal.api.client.exceptions.ApiException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MultiChainControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static RestApiClientClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static MultiChainController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getMultiChainController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

}
