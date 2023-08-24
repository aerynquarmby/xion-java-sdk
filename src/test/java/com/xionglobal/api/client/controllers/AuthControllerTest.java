/*
 * RestApiClient
 *
 * This file was automatically generated for XionGlobal by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.xionglobal.api.client.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.xionglobal.api.client.ApiHelper;
import com.xionglobal.api.client.RestApiClientClient;
import com.xionglobal.api.client.exceptions.ApiException;
import com.xionglobal.api.client.models.RegisterTokenRequest;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AuthControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static RestApiClientClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static AuthController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getAuthController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * This endpoint is used to register a new client access. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRegister() throws Exception {
        // Parameters for the API call
        RegisterTokenRequest body = null;

        // Set callback and perform API call
        try {
            controller.register(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

    }

}
