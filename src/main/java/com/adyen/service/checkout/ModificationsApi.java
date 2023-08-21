/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.adyen.service.checkout;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.checkout.PaymentAmountUpdateRequest;
import com.adyen.model.checkout.PaymentAmountUpdateResponse;
import com.adyen.model.checkout.PaymentCancelRequest;
import com.adyen.model.checkout.PaymentCancelResponse;
import com.adyen.model.checkout.PaymentCaptureRequest;
import com.adyen.model.checkout.PaymentCaptureResponse;
import com.adyen.model.checkout.PaymentRefundRequest;
import com.adyen.model.checkout.PaymentRefundResponse;
import com.adyen.model.checkout.PaymentReversalRequest;
import com.adyen.model.checkout.PaymentReversalResponse;
import com.adyen.model.checkout.ServiceError;
import com.adyen.model.checkout.StandalonePaymentCancelRequest;
import com.adyen.model.checkout.StandalonePaymentCancelResponse;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ModificationsApi extends Service {

    public static final String API_VERSION = "70";

    protected String baseURL;

    /**
    * Modifications constructor in {@link com.adyen.service.checkout package}.
    * @param client {@link Client } (required)
    */
    public ModificationsApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://checkout-test.adyen.com/v70");
    }

    /**
    * Modifications constructor in {@link com.adyen.service.checkout package}.
    * Please use this constructor only if you would like to pass along your own url for routing or testing purposes. The latest API version is defined in this class as a constant.
    * @param client {@link Client } (required)
    * @param baseURL {@link String } (required)
    */
    public ModificationsApi(Client client, String baseURL) {
        super(client);
        this.baseURL = baseURL;
    }

    /**
    * Cancel an authorised payment
    *
    * @param standalonePaymentCancelRequest {@link StandalonePaymentCancelRequest }  (required)
    * @return {@link StandalonePaymentCancelResponse }
    * @throws ApiException if fails to make API call
    */
    public StandalonePaymentCancelResponse cancelAuthorisedPayment(StandalonePaymentCancelRequest standalonePaymentCancelRequest) throws ApiException, IOException {
        return cancelAuthorisedPayment(standalonePaymentCancelRequest, null);
    }

    /**
    * Cancel an authorised payment
    *
    * @param standalonePaymentCancelRequest {@link StandalonePaymentCancelRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link StandalonePaymentCancelResponse }
    * @throws ApiException if fails to make API call
    */
    public StandalonePaymentCancelResponse cancelAuthorisedPayment(StandalonePaymentCancelRequest standalonePaymentCancelRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = standalonePaymentCancelRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/cancels", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return StandalonePaymentCancelResponse.fromJson(jsonResult);
    }

    /**
    * Update an authorised amount
    *
    * @param paymentPspReference {@link String } The [&#x60;pspReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment. (required)
    * @param paymentAmountUpdateRequest {@link PaymentAmountUpdateRequest }  (required)
    * @return {@link PaymentAmountUpdateResponse }
    * @throws ApiException if fails to make API call
    */
    public PaymentAmountUpdateResponse updateAuthorisedAmount(String paymentPspReference, PaymentAmountUpdateRequest paymentAmountUpdateRequest) throws ApiException, IOException {
        return updateAuthorisedAmount(paymentPspReference, paymentAmountUpdateRequest, null);
    }

    /**
    * Update an authorised amount
    *
    * @param paymentPspReference {@link String } The [&#x60;pspReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment. (required)
    * @param paymentAmountUpdateRequest {@link PaymentAmountUpdateRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link PaymentAmountUpdateResponse }
    * @throws ApiException if fails to make API call
    */
    public PaymentAmountUpdateResponse updateAuthorisedAmount(String paymentPspReference, PaymentAmountUpdateRequest paymentAmountUpdateRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (paymentPspReference == null) {
            throw new IllegalArgumentException("Please provide the paymentPspReference path parameter");
        }
        pathParams.put("paymentPspReference", paymentPspReference);

        String requestBody = paymentAmountUpdateRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/payments/{paymentPspReference}/amountUpdates", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return PaymentAmountUpdateResponse.fromJson(jsonResult);
    }

    /**
    * Cancel an authorised payment
    *
    * @param paymentPspReference {@link String } The [&#x60;pspReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment that you want to cancel.  (required)
    * @param paymentCancelRequest {@link PaymentCancelRequest }  (required)
    * @return {@link PaymentCancelResponse }
    * @throws ApiException if fails to make API call
    */
    public PaymentCancelResponse cancelAuthorisedPaymentByPspReference(String paymentPspReference, PaymentCancelRequest paymentCancelRequest) throws ApiException, IOException {
        return cancelAuthorisedPaymentByPspReference(paymentPspReference, paymentCancelRequest, null);
    }

    /**
    * Cancel an authorised payment
    *
    * @param paymentPspReference {@link String } The [&#x60;pspReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment that you want to cancel.  (required)
    * @param paymentCancelRequest {@link PaymentCancelRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link PaymentCancelResponse }
    * @throws ApiException if fails to make API call
    */
    public PaymentCancelResponse cancelAuthorisedPaymentByPspReference(String paymentPspReference, PaymentCancelRequest paymentCancelRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (paymentPspReference == null) {
            throw new IllegalArgumentException("Please provide the paymentPspReference path parameter");
        }
        pathParams.put("paymentPspReference", paymentPspReference);

        String requestBody = paymentCancelRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/payments/{paymentPspReference}/cancels", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return PaymentCancelResponse.fromJson(jsonResult);
    }

    /**
    * Capture an authorised payment
    *
    * @param paymentPspReference {@link String } The [&#x60;pspReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment that you want to capture. (required)
    * @param paymentCaptureRequest {@link PaymentCaptureRequest }  (required)
    * @return {@link PaymentCaptureResponse }
    * @throws ApiException if fails to make API call
    */
    public PaymentCaptureResponse captureAuthorisedPayment(String paymentPspReference, PaymentCaptureRequest paymentCaptureRequest) throws ApiException, IOException {
        return captureAuthorisedPayment(paymentPspReference, paymentCaptureRequest, null);
    }

    /**
    * Capture an authorised payment
    *
    * @param paymentPspReference {@link String } The [&#x60;pspReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment that you want to capture. (required)
    * @param paymentCaptureRequest {@link PaymentCaptureRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link PaymentCaptureResponse }
    * @throws ApiException if fails to make API call
    */
    public PaymentCaptureResponse captureAuthorisedPayment(String paymentPspReference, PaymentCaptureRequest paymentCaptureRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (paymentPspReference == null) {
            throw new IllegalArgumentException("Please provide the paymentPspReference path parameter");
        }
        pathParams.put("paymentPspReference", paymentPspReference);

        String requestBody = paymentCaptureRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/payments/{paymentPspReference}/captures", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return PaymentCaptureResponse.fromJson(jsonResult);
    }

    /**
    * Refund a captured payment
    *
    * @param paymentPspReference {@link String } The [&#x60;pspReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment that you want to refund. (required)
    * @param paymentRefundRequest {@link PaymentRefundRequest }  (required)
    * @return {@link PaymentRefundResponse }
    * @throws ApiException if fails to make API call
    */
    public PaymentRefundResponse refundCapturedPayment(String paymentPspReference, PaymentRefundRequest paymentRefundRequest) throws ApiException, IOException {
        return refundCapturedPayment(paymentPspReference, paymentRefundRequest, null);
    }

    /**
    * Refund a captured payment
    *
    * @param paymentPspReference {@link String } The [&#x60;pspReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment that you want to refund. (required)
    * @param paymentRefundRequest {@link PaymentRefundRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link PaymentRefundResponse }
    * @throws ApiException if fails to make API call
    */
    public PaymentRefundResponse refundCapturedPayment(String paymentPspReference, PaymentRefundRequest paymentRefundRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (paymentPspReference == null) {
            throw new IllegalArgumentException("Please provide the paymentPspReference path parameter");
        }
        pathParams.put("paymentPspReference", paymentPspReference);

        String requestBody = paymentRefundRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/payments/{paymentPspReference}/refunds", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return PaymentRefundResponse.fromJson(jsonResult);
    }

    /**
    * Refund or cancel a payment
    *
    * @param paymentPspReference {@link String } The [&#x60;pspReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment that you want to reverse.  (required)
    * @param paymentReversalRequest {@link PaymentReversalRequest }  (required)
    * @return {@link PaymentReversalResponse }
    * @throws ApiException if fails to make API call
    */
    public PaymentReversalResponse refundOrCancelPayment(String paymentPspReference, PaymentReversalRequest paymentReversalRequest) throws ApiException, IOException {
        return refundOrCancelPayment(paymentPspReference, paymentReversalRequest, null);
    }

    /**
    * Refund or cancel a payment
    *
    * @param paymentPspReference {@link String } The [&#x60;pspReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_pspReference) of the payment that you want to reverse.  (required)
    * @param paymentReversalRequest {@link PaymentReversalRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link PaymentReversalResponse }
    * @throws ApiException if fails to make API call
    */
    public PaymentReversalResponse refundOrCancelPayment(String paymentPspReference, PaymentReversalRequest paymentReversalRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (paymentPspReference == null) {
            throw new IllegalArgumentException("Please provide the paymentPspReference path parameter");
        }
        pathParams.put("paymentPspReference", paymentPspReference);

        String requestBody = paymentReversalRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/payments/{paymentPspReference}/reversals", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return PaymentReversalResponse.fromJson(jsonResult);
    }
}
