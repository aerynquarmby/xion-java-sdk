# Xion Java SDK

The Xion Java SDK offers developers an effortless way to integrate cryptocurrency payments into their applications. Whether you're crafting a Java-based web server, a mobile app backend, or a standalone Java application, this SDK streamlines the process of integrating Xion's payment solutions.

## Table of Contents

- [Requirements](#requirements)
- [Installation](#installation)
- [Configuration](#configuration)
  - [Authentication](#authentication)
  - [Environment Setup](#environment-setup)
- [Usage](#usage)
  - [Single Billing API](#single-billing-api)
  - [Multi-Chain API](#multi-chain-api)
  - [Order Code API](#order-code-api)
  - [iFrame Integration](#iframe-integration)
- [Token Approvals](#token-approvals)
  - [Using ThirdWeb](#using-thirdweb)
  - [Using ethers.js](#using-ethersjs)
- [Support](#support)
- [Additional Resources](#additional-resources)

## Requirements

- Java 1.8 or later.
- Maven for dependency management.
- An API key, which can be obtained by registering as a merchant on [xionpay.app](https://xionpay.app) or via the API.

## Installation

1. Clone the repository:
\```bash
git clone https://github.com/aerynquarmby/xion-java-sdk.git
\```

2. Navigate to the project directory:
\```bash
cd xion-java-sdk
\```

3. Install the SDK to your local Maven repository:
\```bash
mvn install
\```

## Configuration

### Authentication

Authenticate your API requests using the API key from Xion:
\```java
GlobalConfiguration globalConfig = new GlobalConfiguration();
globalConfig.setAuthenticationKey("YOUR_XION_API_KEY");
\```

### Environment Setup

The SDK caters to both production and testnet/staging environments:
\```java
globalConfig.setEnvironment(Environment.PRODUCTION); // For production
// OR
globalConfig.setEnvironment(Environment.TESTNET); // For testnet/staging
\```

## Usage

### Single Billing API

To execute a single bill payment:
\```java
DefaultSingleBillPaymentsController controller = new DefaultSingleBillPaymentsController(globalConfig);
SingleBillPaymentRequest request = new SingleBillPaymentRequest();
// Populate the request attributes
SingleBillPaymentResponse response = controller.singleBillPayment(request);
\```

### Multi-Chain API

The Multi-Chain API facilitates transactions across multiple blockchain networks. To utilize this:
\```java
DefaultMultiChainController multiChainController = new DefaultMultiChainController(globalConfig);
// Use the methods provided by the controller for multi-chain operations
\```

### Order Code API

After using the Single Billing API, you can verify an order's status:
\```java
String orderCode = "YOUR_ORDER_CODE";
String status = controller.getOrderStatus(orderCode);
\```

### iFrame Integration

For iFrame payments integration:
\```java
DefaultIframeController iframeController = new DefaultIframeController(globalConfig);
IframeProductsRequest iframeRequest = new IframeProductsRequest();
// Define the request attributes
IframeProductsResponse iframeResponse = iframeController.getIframeProducts(iframeRequest);
\```

## Token Approvals

For the Single Billing API to function with USDT (Polygon), clients must set up token approvals. The API can only be invoked if the consumer has approved tokens with Xion's XGWallet as the spender.

### Using ThirdWeb

ThirdWeb offers a simplified way to set up token approvals:
1. Install the ThirdWeb SDK.
2. Use the `approve` method provided by ThirdWeb to approve tokens.

### Using ethers.js

For manual setup using ethers.js:
1. Install the ethers.js library.
2. Interact with the USDT contract on Polygon to call the `approve` method, setting Xion's XGWallet as the spender.
\```javascript
const { ethers } = require('ethers');

const provider = new ethers.providers.JsonRpcProvider(YOUR_RPC_URL);
const signer = provider.getSigner();

const usdtContract = new ethers.Contract(USDT_CONTRACT_ADDRESS, USDT_ABI, signer);
const approveTx = await usdtContract.approve(XG_WALLET_ADDRESS, APPROVE_AMOUNT);

await approveTx.wait();
\```
Replace placeholders (`YOUR_RPC_URL`, `USDT_CONTRACT_ADDRESS`, `USDT_ABI`, `XG_WALLET_ADDRESS`, `APPROVE_AMOUNT`) with appropriate values.

## Support

For inquiries or issues related to the Xion Java SDK, contact our [support team](mailto:support@xionpay.app).

## Additional Resources

- [Xion API Documentation](https://apimatic.io/apidocs/xionglobal)
- [Xion's GitHub Profile](https://github.com/xion-global)
