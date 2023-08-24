/*
 * RestApiClient
 *
 * This file was automatically generated for XionGlobal by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.xionglobal.api.client;

import com.xionglobal.api.client.controllers.AuthController;
import com.xionglobal.api.client.controllers.GeneralAPIController;
import com.xionglobal.api.client.controllers.IframeController;
import com.xionglobal.api.client.controllers.MerchantController;
import com.xionglobal.api.client.controllers.MultiChainController;
import com.xionglobal.api.client.controllers.SingleBillPaymentsController;

/**
 * Gateway interface for the library.
 * This acts as a factory for Controllers.
 * It holds the state of the SDK.
 */
public interface RestApiClientClientInterface extends Configuration {
    
    /**
     * Provides access to GeneralAPI controller.
     * @return Returns the GeneralAPIController instance
     */
    GeneralAPIController getGeneralAPIController();

    /**
     * Provides access to Auth controller.
     * @return Returns the AuthController instance
     */
    AuthController getAuthController();

    /**
     * Provides access to SingleBillPayments controller.
     * @return Returns the SingleBillPaymentsController instance
     */
    SingleBillPaymentsController getSingleBillPaymentsController();

    /**
     * Provides access to Iframe controller.
     * @return Returns the IframeController instance
     */
    IframeController getIframeController();

    /**
     * Provides access to MultiChain controller.
     * @return Returns the MultiChainController instance
     */
    MultiChainController getMultiChainController();

    /**
     * Provides access to Merchant controller.
     * @return Returns the MerchantController instance
     */
    MerchantController getMerchantController();

}