/*
 * RestApiClient
 *
 * This file was automatically generated for XionGlobal by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.xionglobal.api.client.controllers;

import com.xionglobal.api.client.Environment;
import com.xionglobal.api.client.RestApiClientClient;
import com.xionglobal.api.client.testing.HttpCallbackCatcher;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.Timeout;

/**
 * Base class for all test cases.
 */
public class BaseControllerTest {
    /**
     * Test configuration.
     */
    public static final int REQUEST_TIMEOUT = 30;

    public static final double ASSERT_PRECISION = 0.01;
    
    /**
     * Global rules for tests.
     */
    @Rule
    public Timeout globalTimeout = Timeout.seconds(REQUEST_TIMEOUT);
    
    /**
     * Test fixtures,
     * Used to serve as HttpCallback and to capture request & response.
     */

    protected static HttpCallbackCatcher httpResponse;
    
    /**
     * Setup test.
     */
    @BeforeClass
    public static void setUp() throws Exception {
        httpResponse = new HttpCallbackCatcher(); 
    }

    /**
     * Tear down test.
     */
    @AfterClass
    public static void tearDown() throws Exception {
        httpResponse = null;
    }

    /**
     * Create test configuration from Environment variables.
     */
    protected static RestApiClientClient createConfigurationFromEnvironment() {
        RestApiClientClient.Builder builder = new RestApiClientClient.Builder();

        final String environment = System.getenv("REST_API_CLIENT_ENVIRONMENT");
        final String timeout = System.getenv("REST_API_CLIENT_TIMEOUT");
        final String accessToken = System.getenv("REST_API_CLIENT_ACCESS_TOKEN");

        if (accessToken != null) {
            builder.accessToken(accessToken);
        }
        if (environment != null) {
            builder.environment(Environment.fromString(environment));
        }
        if (timeout != null) {
            builder.httpClientConfig(configBuilder -> configBuilder.timeout(
                    Long.parseLong(timeout)));
        }
        return builder.build();
    }

    
    /**
     * Create test configuration.
     */
    protected static RestApiClientClient createConfiguration() {
        // Set Configuration parameters for test execution
        RestApiClientClient config = createConfigurationFromEnvironment();
        config = config.newBuilder()
                .httpCallback(httpResponse)
                .build();
        return config;
    }
}
