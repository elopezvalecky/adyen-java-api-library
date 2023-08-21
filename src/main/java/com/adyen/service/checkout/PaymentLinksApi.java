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
import com.adyen.model.checkout.PaymentLinkRequest;
import com.adyen.model.checkout.PaymentLinkResponse;
import com.adyen.model.checkout.ServiceError;
import com.adyen.model.checkout.UpdatePaymentLinkRequest;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PaymentLinksApi extends Service {

    public static final String API_VERSION = "70";

    protected String baseURL;

    public PaymentLinksApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://checkout-test.adyen.com/v70");
    }

    public PaymentLinksApi(Client client, String baseURL) {
        super(client);
        this.baseURL = baseURL;
    }

    /**
    * Get a payment link
    *
    * @param linkId {@link String } Unique identifier of the payment link. (required)
    * @return {@link PaymentLinkResponse }
    * @throws ApiException if fails to make API call
    */
    public PaymentLinkResponse getPaymentLink(String linkId) throws ApiException, IOException {
        return getPaymentLink(linkId, null);
    }

    /**
    * Get a payment link
    *
    * @param linkId {@link String } Unique identifier of the payment link. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link PaymentLinkResponse }
    * @throws ApiException if fails to make API call
    */
    public PaymentLinkResponse getPaymentLink(String linkId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (linkId == null) {
            throw new IllegalArgumentException("Please provide the linkId path parameter");
        }
        pathParams.put("linkId", linkId);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/paymentLinks/{linkId}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams);
        return PaymentLinkResponse.fromJson(jsonResult);
    }

    /**
    * Update the status of a payment link
    *
    * @param linkId {@link String } Unique identifier of the payment link. (required)
    * @param updatePaymentLinkRequest {@link UpdatePaymentLinkRequest }  (required)
    * @return {@link PaymentLinkResponse }
    * @throws ApiException if fails to make API call
    */
    public PaymentLinkResponse updatePaymentLink(String linkId, UpdatePaymentLinkRequest updatePaymentLinkRequest) throws ApiException, IOException {
        return updatePaymentLink(linkId, updatePaymentLinkRequest, null);
    }

    /**
    * Update the status of a payment link
    *
    * @param linkId {@link String } Unique identifier of the payment link. (required)
    * @param updatePaymentLinkRequest {@link UpdatePaymentLinkRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link PaymentLinkResponse }
    * @throws ApiException if fails to make API call
    */
    public PaymentLinkResponse updatePaymentLink(String linkId, UpdatePaymentLinkRequest updatePaymentLinkRequest, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (linkId == null) {
            throw new IllegalArgumentException("Please provide the linkId path parameter");
        }
        pathParams.put("linkId", linkId);

        String requestBody = updatePaymentLinkRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/paymentLinks/{linkId}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.PATCH, pathParams);
        return PaymentLinkResponse.fromJson(jsonResult);
    }

    /**
    * Create a payment link
    *
    * @param paymentLinkRequest {@link PaymentLinkRequest }  (required)
    * @return {@link PaymentLinkResponse }
    * @throws ApiException if fails to make API call
    */
    public PaymentLinkResponse paymentLinks(PaymentLinkRequest paymentLinkRequest) throws ApiException, IOException {
        return paymentLinks(paymentLinkRequest, null);
    }

    /**
    * Create a payment link
    *
    * @param paymentLinkRequest {@link PaymentLinkRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link PaymentLinkResponse }
    * @throws ApiException if fails to make API call
    */
    public PaymentLinkResponse paymentLinks(PaymentLinkRequest paymentLinkRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = paymentLinkRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/paymentLinks", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return PaymentLinkResponse.fromJson(jsonResult);
    }
}
