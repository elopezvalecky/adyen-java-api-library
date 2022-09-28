/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 69
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.checkout.Amount;
import com.adyen.model.checkout.CheckoutOrderResponse;
import com.adyen.model.checkout.FraudResult;
import com.adyen.model.checkout.PaymentResponseAction;
import com.adyen.model.checkout.ResponsePaymentMethod;
import com.adyen.model.checkout.ThreeDS2ResponseData;
import com.adyen.model.checkout.ThreeDS2Result;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * PaymentResponse
 */

public class PaymentResponse {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private PaymentResponseAction action;

  public static final String SERIALIZED_NAME_ADDITIONAL_DATA = "additionalData";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DATA)
  private Map<String, String> additionalData = null;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Amount amount;

  public static final String SERIALIZED_NAME_DONATION_TOKEN = "donationToken";
  @SerializedName(SERIALIZED_NAME_DONATION_TOKEN)
  private String donationToken;

  public static final String SERIALIZED_NAME_FRAUD_RESULT = "fraudResult";
  @SerializedName(SERIALIZED_NAME_FRAUD_RESULT)
  private FraudResult fraudResult;

  public static final String SERIALIZED_NAME_MERCHANT_REFERENCE = "merchantReference";
  @SerializedName(SERIALIZED_NAME_MERCHANT_REFERENCE)
  private String merchantReference;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private CheckoutOrderResponse order;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "paymentMethod";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private ResponsePaymentMethod paymentMethod;

  public static final String SERIALIZED_NAME_PSP_REFERENCE = "pspReference";
  @SerializedName(SERIALIZED_NAME_PSP_REFERENCE)
  private String pspReference;

  public static final String SERIALIZED_NAME_REFUSAL_REASON = "refusalReason";
  @SerializedName(SERIALIZED_NAME_REFUSAL_REASON)
  private String refusalReason;

  public static final String SERIALIZED_NAME_REFUSAL_REASON_CODE = "refusalReasonCode";
  @SerializedName(SERIALIZED_NAME_REFUSAL_REASON_CODE)
  private String refusalReasonCode;

  /**
   * The result of the payment. For more information, see [Result codes](https://docs.adyen.com/online-payments/payment-result-codes).  Possible values:  * **AuthenticationFinished** – The payment has been successfully authenticated with 3D Secure 2. Returned for 3D Secure 2 authentication-only transactions. * **AuthenticationNotRequired** – The transaction does not require 3D Secure authentication. Returned for [standalone authentication-only integrations](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only). * **Authorised** – The payment was successfully authorised. This state serves as an indicator to proceed with the delivery of goods and services. This is a final state. * **Cancelled** – Indicates the payment has been cancelled (either by the shopper or the merchant) before processing was completed. This is a final state. * **ChallengeShopper** – The issuer requires further shopper interaction before the payment can be authenticated. Returned for 3D Secure 2 transactions. * **Error** – There was an error when the payment was being processed. The reason is given in the &#x60;refusalReason&#x60; field. This is a final state. * **IdentifyShopper** – The issuer requires the shopper&#39;s device fingerprint before the payment can be authenticated. Returned for 3D Secure 2 transactions. * **Pending** – Indicates that it is not possible to obtain the final status of the payment. This can happen if the systems providing final status information for the payment are unavailable, or if the shopper needs to take further action to complete the payment. * **PresentToShopper** – Indicates that the response contains additional information that you need to present to a shopper, so that they can use it to complete a payment. * **Received** – Indicates the payment has successfully been received by Adyen, and will be processed. This is the initial state for all payments. * **RedirectShopper** – Indicates the shopper should be redirected to an external web page or app to complete the authorisation. * **Refused** – Indicates the payment was refused. The reason is given in the &#x60;refusalReason&#x60; field. This is a final state.
   */
  @JsonAdapter(ResultCodeEnum.Adapter.class)
  public enum ResultCodeEnum {
    AUTHENTICATIONFINISHED("AuthenticationFinished"),
    
    AUTHORISED("Authorised"),
    
    CANCELLED("Cancelled"),
    
    CHALLENGESHOPPER("ChallengeShopper"),
    
    ERROR("Error"),
    
    IDENTIFYSHOPPER("IdentifyShopper"),
    
    PENDING("Pending"),
    
    PRESENTTOSHOPPER("PresentToShopper"),
    
    RECEIVED("Received"),
    
    REDIRECTSHOPPER("RedirectShopper"),
    
    REFUSED("Refused"),
    
    SUCCESS("Success");

    private String value;

    ResultCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResultCodeEnum fromValue(String value) {
      for (ResultCodeEnum b : ResultCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ResultCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResultCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResultCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResultCodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESULT_CODE = "resultCode";
  @SerializedName(SERIALIZED_NAME_RESULT_CODE)
  private ResultCodeEnum resultCode;

  public static final String SERIALIZED_NAME_THREE_D_S2_RESPONSE_DATA = "threeDS2ResponseData";
  @SerializedName(SERIALIZED_NAME_THREE_D_S2_RESPONSE_DATA)
  private ThreeDS2ResponseData threeDS2ResponseData;

  public static final String SERIALIZED_NAME_THREE_D_S2_RESULT = "threeDS2Result";
  @SerializedName(SERIALIZED_NAME_THREE_D_S2_RESULT)
  private ThreeDS2Result threeDS2Result;

  public static final String SERIALIZED_NAME_THREE_D_S_PAYMENT_DATA = "threeDSPaymentData";
  @SerializedName(SERIALIZED_NAME_THREE_D_S_PAYMENT_DATA)
  private String threeDSPaymentData;

  public PaymentResponse() { 
  }

  public PaymentResponse action(PaymentResponseAction action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentResponseAction getAction() {
    return action;
  }


  public void setAction(PaymentResponseAction action) {
    this.action = action;
  }


  public PaymentResponse additionalData(Map<String, String> additionalData) {
    
    this.additionalData = additionalData;
    return this;
  }

  public PaymentResponse putAdditionalDataItem(String key, String additionalDataItem) {
    if (this.additionalData == null) {
      this.additionalData = new HashMap<>();
    }
    this.additionalData.put(key, additionalDataItem);
    return this;
  }

   /**
   * Contains additional information about the payment. Some data fields are included only if you select them first: Go to **Customer Area** &gt; **Developers** &gt; **Additional data**.
   * @return additionalData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains additional information about the payment. Some data fields are included only if you select them first: Go to **Customer Area** > **Developers** > **Additional data**.")

  public Map<String, String> getAdditionalData() {
    return additionalData;
  }


  public void setAdditionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
  }


  public PaymentResponse amount(Amount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Amount getAmount() {
    return amount;
  }


  public void setAmount(Amount amount) {
    this.amount = amount;
  }


  public PaymentResponse donationToken(String donationToken) {
    
    this.donationToken = donationToken;
    return this;
  }

   /**
   * Donation Token containing payment details for Adyen Giving.
   * @return donationToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Donation Token containing payment details for Adyen Giving.")

  public String getDonationToken() {
    return donationToken;
  }


  public void setDonationToken(String donationToken) {
    this.donationToken = donationToken;
  }


  public PaymentResponse fraudResult(FraudResult fraudResult) {
    
    this.fraudResult = fraudResult;
    return this;
  }

   /**
   * Get fraudResult
   * @return fraudResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FraudResult getFraudResult() {
    return fraudResult;
  }


  public void setFraudResult(FraudResult fraudResult) {
    this.fraudResult = fraudResult;
  }


  public PaymentResponse merchantReference(String merchantReference) {
    
    this.merchantReference = merchantReference;
    return this;
  }

   /**
   * The reference to uniquely identify a payment. This reference is used in all communication with you about the payment status. We recommend using a unique value per payment; however, it is not a requirement. If you need to provide multiple references for a transaction, separate them with hyphens (\&quot;-\&quot;). Maximum length: 80 characters.
   * @return merchantReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reference to uniquely identify a payment. This reference is used in all communication with you about the payment status. We recommend using a unique value per payment; however, it is not a requirement. If you need to provide multiple references for a transaction, separate them with hyphens (\"-\"). Maximum length: 80 characters.")

  public String getMerchantReference() {
    return merchantReference;
  }


  public void setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
  }


  public PaymentResponse order(CheckoutOrderResponse order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CheckoutOrderResponse getOrder() {
    return order;
  }


  public void setOrder(CheckoutOrderResponse order) {
    this.order = order;
  }


  public PaymentResponse paymentMethod(ResponsePaymentMethod paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResponsePaymentMethod getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(ResponsePaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public PaymentResponse pspReference(String pspReference) {
    
    this.pspReference = pspReference;
    return this;
  }

   /**
   * Adyen&#39;s 16-character string reference associated with the transaction/request. This value is globally unique; quote it when communicating with us about this request.  &gt; For payment methods that require a redirect or additional action, you will get this value in the &#x60;/payments/details&#x60; response.
   * @return pspReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Adyen's 16-character string reference associated with the transaction/request. This value is globally unique; quote it when communicating with us about this request.  > For payment methods that require a redirect or additional action, you will get this value in the `/payments/details` response.")

  public String getPspReference() {
    return pspReference;
  }


  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }


  public PaymentResponse refusalReason(String refusalReason) {
    
    this.refusalReason = refusalReason;
    return this;
  }

   /**
   * If the payment&#39;s authorisation is refused or an error occurs during authorisation, this field holds Adyen&#39;s mapped reason for the refusal or a description of the error. When a transaction fails, the authorisation response includes &#x60;resultCode&#x60; and &#x60;refusalReason&#x60; values.  For more information, see [Refusal reasons](https://docs.adyen.com/development-resources/refusal-reasons).
   * @return refusalReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the payment's authorisation is refused or an error occurs during authorisation, this field holds Adyen's mapped reason for the refusal or a description of the error. When a transaction fails, the authorisation response includes `resultCode` and `refusalReason` values.  For more information, see [Refusal reasons](https://docs.adyen.com/development-resources/refusal-reasons).")

  public String getRefusalReason() {
    return refusalReason;
  }


  public void setRefusalReason(String refusalReason) {
    this.refusalReason = refusalReason;
  }


  public PaymentResponse refusalReasonCode(String refusalReasonCode) {
    
    this.refusalReasonCode = refusalReasonCode;
    return this;
  }

   /**
   * Code that specifies the refusal reason. For more information, see [Authorisation refusal reasons](https://docs.adyen.com/development-resources/refusal-reasons).
   * @return refusalReasonCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Code that specifies the refusal reason. For more information, see [Authorisation refusal reasons](https://docs.adyen.com/development-resources/refusal-reasons).")

  public String getRefusalReasonCode() {
    return refusalReasonCode;
  }


  public void setRefusalReasonCode(String refusalReasonCode) {
    this.refusalReasonCode = refusalReasonCode;
  }


  public PaymentResponse resultCode(ResultCodeEnum resultCode) {
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * The result of the payment. For more information, see [Result codes](https://docs.adyen.com/online-payments/payment-result-codes).  Possible values:  * **AuthenticationFinished** – The payment has been successfully authenticated with 3D Secure 2. Returned for 3D Secure 2 authentication-only transactions. * **AuthenticationNotRequired** – The transaction does not require 3D Secure authentication. Returned for [standalone authentication-only integrations](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only). * **Authorised** – The payment was successfully authorised. This state serves as an indicator to proceed with the delivery of goods and services. This is a final state. * **Cancelled** – Indicates the payment has been cancelled (either by the shopper or the merchant) before processing was completed. This is a final state. * **ChallengeShopper** – The issuer requires further shopper interaction before the payment can be authenticated. Returned for 3D Secure 2 transactions. * **Error** – There was an error when the payment was being processed. The reason is given in the &#x60;refusalReason&#x60; field. This is a final state. * **IdentifyShopper** – The issuer requires the shopper&#39;s device fingerprint before the payment can be authenticated. Returned for 3D Secure 2 transactions. * **Pending** – Indicates that it is not possible to obtain the final status of the payment. This can happen if the systems providing final status information for the payment are unavailable, or if the shopper needs to take further action to complete the payment. * **PresentToShopper** – Indicates that the response contains additional information that you need to present to a shopper, so that they can use it to complete a payment. * **Received** – Indicates the payment has successfully been received by Adyen, and will be processed. This is the initial state for all payments. * **RedirectShopper** – Indicates the shopper should be redirected to an external web page or app to complete the authorisation. * **Refused** – Indicates the payment was refused. The reason is given in the &#x60;refusalReason&#x60; field. This is a final state.
   * @return resultCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The result of the payment. For more information, see [Result codes](https://docs.adyen.com/online-payments/payment-result-codes).  Possible values:  * **AuthenticationFinished** – The payment has been successfully authenticated with 3D Secure 2. Returned for 3D Secure 2 authentication-only transactions. * **AuthenticationNotRequired** – The transaction does not require 3D Secure authentication. Returned for [standalone authentication-only integrations](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only). * **Authorised** – The payment was successfully authorised. This state serves as an indicator to proceed with the delivery of goods and services. This is a final state. * **Cancelled** – Indicates the payment has been cancelled (either by the shopper or the merchant) before processing was completed. This is a final state. * **ChallengeShopper** – The issuer requires further shopper interaction before the payment can be authenticated. Returned for 3D Secure 2 transactions. * **Error** – There was an error when the payment was being processed. The reason is given in the `refusalReason` field. This is a final state. * **IdentifyShopper** – The issuer requires the shopper's device fingerprint before the payment can be authenticated. Returned for 3D Secure 2 transactions. * **Pending** – Indicates that it is not possible to obtain the final status of the payment. This can happen if the systems providing final status information for the payment are unavailable, or if the shopper needs to take further action to complete the payment. * **PresentToShopper** – Indicates that the response contains additional information that you need to present to a shopper, so that they can use it to complete a payment. * **Received** – Indicates the payment has successfully been received by Adyen, and will be processed. This is the initial state for all payments. * **RedirectShopper** – Indicates the shopper should be redirected to an external web page or app to complete the authorisation. * **Refused** – Indicates the payment was refused. The reason is given in the `refusalReason` field. This is a final state.")

  public ResultCodeEnum getResultCode() {
    return resultCode;
  }


  public void setResultCode(ResultCodeEnum resultCode) {
    this.resultCode = resultCode;
  }


  public PaymentResponse threeDS2ResponseData(ThreeDS2ResponseData threeDS2ResponseData) {
    
    this.threeDS2ResponseData = threeDS2ResponseData;
    return this;
  }

   /**
   * Get threeDS2ResponseData
   * @return threeDS2ResponseData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ThreeDS2ResponseData getThreeDS2ResponseData() {
    return threeDS2ResponseData;
  }


  public void setThreeDS2ResponseData(ThreeDS2ResponseData threeDS2ResponseData) {
    this.threeDS2ResponseData = threeDS2ResponseData;
  }


  public PaymentResponse threeDS2Result(ThreeDS2Result threeDS2Result) {
    
    this.threeDS2Result = threeDS2Result;
    return this;
  }

   /**
   * Get threeDS2Result
   * @return threeDS2Result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ThreeDS2Result getThreeDS2Result() {
    return threeDS2Result;
  }


  public void setThreeDS2Result(ThreeDS2Result threeDS2Result) {
    this.threeDS2Result = threeDS2Result;
  }


  public PaymentResponse threeDSPaymentData(String threeDSPaymentData) {
    
    this.threeDSPaymentData = threeDSPaymentData;
    return this;
  }

   /**
   * When non-empty, contains a value that you must submit to the &#x60;/payments/details&#x60; endpoint as &#x60;paymentData&#x60;.
   * @return threeDSPaymentData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When non-empty, contains a value that you must submit to the `/payments/details` endpoint as `paymentData`.")

  public String getThreeDSPaymentData() {
    return threeDSPaymentData;
  }


  public void setThreeDSPaymentData(String threeDSPaymentData) {
    this.threeDSPaymentData = threeDSPaymentData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentResponse paymentResponse = (PaymentResponse) o;
    return Objects.equals(this.action, paymentResponse.action) &&
        Objects.equals(this.additionalData, paymentResponse.additionalData) &&
        Objects.equals(this.amount, paymentResponse.amount) &&
        Objects.equals(this.donationToken, paymentResponse.donationToken) &&
        Objects.equals(this.fraudResult, paymentResponse.fraudResult) &&
        Objects.equals(this.merchantReference, paymentResponse.merchantReference) &&
        Objects.equals(this.order, paymentResponse.order) &&
        Objects.equals(this.paymentMethod, paymentResponse.paymentMethod) &&
        Objects.equals(this.pspReference, paymentResponse.pspReference) &&
        Objects.equals(this.refusalReason, paymentResponse.refusalReason) &&
        Objects.equals(this.refusalReasonCode, paymentResponse.refusalReasonCode) &&
        Objects.equals(this.resultCode, paymentResponse.resultCode) &&
        Objects.equals(this.threeDS2ResponseData, paymentResponse.threeDS2ResponseData) &&
        Objects.equals(this.threeDS2Result, paymentResponse.threeDS2Result) &&
        Objects.equals(this.threeDSPaymentData, paymentResponse.threeDSPaymentData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, additionalData, amount, donationToken, fraudResult, merchantReference, order, paymentMethod, pspReference, refusalReason, refusalReasonCode, resultCode, threeDS2ResponseData, threeDS2Result, threeDSPaymentData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentResponse {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    donationToken: ").append(toIndentedString(donationToken)).append("\n");
    sb.append("    fraudResult: ").append(toIndentedString(fraudResult)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
    sb.append("    refusalReason: ").append(toIndentedString(refusalReason)).append("\n");
    sb.append("    refusalReasonCode: ").append(toIndentedString(refusalReasonCode)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    threeDS2ResponseData: ").append(toIndentedString(threeDS2ResponseData)).append("\n");
    sb.append("    threeDS2Result: ").append(toIndentedString(threeDS2Result)).append("\n");
    sb.append("    threeDSPaymentData: ").append(toIndentedString(threeDSPaymentData)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("action");
    openapiFields.add("additionalData");
    openapiFields.add("amount");
    openapiFields.add("donationToken");
    openapiFields.add("fraudResult");
    openapiFields.add("merchantReference");
    openapiFields.add("order");
    openapiFields.add("paymentMethod");
    openapiFields.add("pspReference");
    openapiFields.add("refusalReason");
    openapiFields.add("refusalReasonCode");
    openapiFields.add("resultCode");
    openapiFields.add("threeDS2ResponseData");
    openapiFields.add("threeDS2Result");
    openapiFields.add("threeDSPaymentData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentResponse is not found in the empty JSON string", PaymentResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `action`
      if (jsonObj.getAsJsonObject("action") != null) {
        PaymentResponseAction.validateJsonObject(jsonObj.getAsJsonObject("action"));
      }
      // validate the optional field `amount`
      if (jsonObj.getAsJsonObject("amount") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("amount"));
      }
      if (jsonObj.get("donationToken") != null && !jsonObj.get("donationToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `donationToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("donationToken").toString()));
      }
      // validate the optional field `fraudResult`
      if (jsonObj.getAsJsonObject("fraudResult") != null) {
        FraudResult.validateJsonObject(jsonObj.getAsJsonObject("fraudResult"));
      }
      if (jsonObj.get("merchantReference") != null && !jsonObj.get("merchantReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantReference").toString()));
      }
      // validate the optional field `order`
      if (jsonObj.getAsJsonObject("order") != null) {
        CheckoutOrderResponse.validateJsonObject(jsonObj.getAsJsonObject("order"));
      }
      // validate the optional field `paymentMethod`
      if (jsonObj.getAsJsonObject("paymentMethod") != null) {
        ResponsePaymentMethod.validateJsonObject(jsonObj.getAsJsonObject("paymentMethod"));
      }
      if (jsonObj.get("pspReference") != null && !jsonObj.get("pspReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pspReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pspReference").toString()));
      }
      if (jsonObj.get("refusalReason") != null && !jsonObj.get("refusalReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refusalReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refusalReason").toString()));
      }
      if (jsonObj.get("refusalReasonCode") != null && !jsonObj.get("refusalReasonCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refusalReasonCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refusalReasonCode").toString()));
      }
      if (jsonObj.get("resultCode") != null && !jsonObj.get("resultCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resultCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resultCode").toString()));
      }
      // validate the optional field `threeDS2ResponseData`
      if (jsonObj.getAsJsonObject("threeDS2ResponseData") != null) {
        ThreeDS2ResponseData.validateJsonObject(jsonObj.getAsJsonObject("threeDS2ResponseData"));
      }
      // validate the optional field `threeDS2Result`
      if (jsonObj.getAsJsonObject("threeDS2Result") != null) {
        ThreeDS2Result.validateJsonObject(jsonObj.getAsJsonObject("threeDS2Result"));
      }
      if (jsonObj.get("threeDSPaymentData") != null && !jsonObj.get("threeDSPaymentData").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `threeDSPaymentData` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threeDSPaymentData").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentResponse>() {
           @Override
           public void write(JsonWriter out, PaymentResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

}

