/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
import java.util.logging.Level;
import java.util.logging.Logger;

import com.adyen.model.checkout.JSON;

/**
 * AdditionalDataRiskStandalone
 */

public class AdditionalDataRiskStandalone {
  public static final String SERIALIZED_NAME_PAY_PAL_COUNTRY_CODE = "PayPal.CountryCode";
  @SerializedName(SERIALIZED_NAME_PAY_PAL_COUNTRY_CODE)
  private String payPalCountryCode;

  public static final String SERIALIZED_NAME_PAY_PAL_EMAIL_ID = "PayPal.EmailId";
  @SerializedName(SERIALIZED_NAME_PAY_PAL_EMAIL_ID)
  private String payPalEmailId;

  public static final String SERIALIZED_NAME_PAY_PAL_FIRST_NAME = "PayPal.FirstName";
  @SerializedName(SERIALIZED_NAME_PAY_PAL_FIRST_NAME)
  private String payPalFirstName;

  public static final String SERIALIZED_NAME_PAY_PAL_LAST_NAME = "PayPal.LastName";
  @SerializedName(SERIALIZED_NAME_PAY_PAL_LAST_NAME)
  private String payPalLastName;

  public static final String SERIALIZED_NAME_PAY_PAL_PAYER_ID = "PayPal.PayerId";
  @SerializedName(SERIALIZED_NAME_PAY_PAL_PAYER_ID)
  private String payPalPayerId;

  public static final String SERIALIZED_NAME_PAY_PAL_PHONE = "PayPal.Phone";
  @SerializedName(SERIALIZED_NAME_PAY_PAL_PHONE)
  private String payPalPhone;

  public static final String SERIALIZED_NAME_PAY_PAL_PROTECTION_ELIGIBILITY = "PayPal.ProtectionEligibility";
  @SerializedName(SERIALIZED_NAME_PAY_PAL_PROTECTION_ELIGIBILITY)
  private String payPalProtectionEligibility;

  public static final String SERIALIZED_NAME_PAY_PAL_TRANSACTION_ID = "PayPal.TransactionId";
  @SerializedName(SERIALIZED_NAME_PAY_PAL_TRANSACTION_ID)
  private String payPalTransactionId;

  public static final String SERIALIZED_NAME_AVS_RESULT_RAW = "avsResultRaw";
  @SerializedName(SERIALIZED_NAME_AVS_RESULT_RAW)
  private String avsResultRaw;

  public static final String SERIALIZED_NAME_BIN = "bin";
  @SerializedName(SERIALIZED_NAME_BIN)
  private String bin;

  public static final String SERIALIZED_NAME_CVC_RESULT_RAW = "cvcResultRaw";
  @SerializedName(SERIALIZED_NAME_CVC_RESULT_RAW)
  private String cvcResultRaw;

  public static final String SERIALIZED_NAME_RISK_TOKEN = "riskToken";
  @SerializedName(SERIALIZED_NAME_RISK_TOKEN)
  private String riskToken;

  public static final String SERIALIZED_NAME_THREE_D_AUTHENTICATED = "threeDAuthenticated";
  @SerializedName(SERIALIZED_NAME_THREE_D_AUTHENTICATED)
  private String threeDAuthenticated;

  public static final String SERIALIZED_NAME_THREE_D_OFFERED = "threeDOffered";
  @SerializedName(SERIALIZED_NAME_THREE_D_OFFERED)
  private String threeDOffered;

  public static final String SERIALIZED_NAME_TOKEN_DATA_TYPE = "tokenDataType";
  @SerializedName(SERIALIZED_NAME_TOKEN_DATA_TYPE)
  private String tokenDataType;

  public AdditionalDataRiskStandalone() { 
  }

  public AdditionalDataRiskStandalone payPalCountryCode(String payPalCountryCode) {
    
    this.payPalCountryCode = payPalCountryCode;
    return this;
  }

   /**
   * Shopper&#39;s country of residence in the form of ISO standard 3166 2-character country codes.
   * @return payPalCountryCode
  **/
  @ApiModelProperty(value = "Shopper's country of residence in the form of ISO standard 3166 2-character country codes.")

  public String getPayPalCountryCode() {
    return payPalCountryCode;
  }


  public void setPayPalCountryCode(String payPalCountryCode) {
    this.payPalCountryCode = payPalCountryCode;
  }


  public AdditionalDataRiskStandalone payPalEmailId(String payPalEmailId) {
    
    this.payPalEmailId = payPalEmailId;
    return this;
  }

   /**
   * Shopper&#39;s email.
   * @return payPalEmailId
  **/
  @ApiModelProperty(value = "Shopper's email.")

  public String getPayPalEmailId() {
    return payPalEmailId;
  }


  public void setPayPalEmailId(String payPalEmailId) {
    this.payPalEmailId = payPalEmailId;
  }


  public AdditionalDataRiskStandalone payPalFirstName(String payPalFirstName) {
    
    this.payPalFirstName = payPalFirstName;
    return this;
  }

   /**
   * Shopper&#39;s first name.
   * @return payPalFirstName
  **/
  @ApiModelProperty(value = "Shopper's first name.")

  public String getPayPalFirstName() {
    return payPalFirstName;
  }


  public void setPayPalFirstName(String payPalFirstName) {
    this.payPalFirstName = payPalFirstName;
  }


  public AdditionalDataRiskStandalone payPalLastName(String payPalLastName) {
    
    this.payPalLastName = payPalLastName;
    return this;
  }

   /**
   * Shopper&#39;s last name.
   * @return payPalLastName
  **/
  @ApiModelProperty(value = "Shopper's last name.")

  public String getPayPalLastName() {
    return payPalLastName;
  }


  public void setPayPalLastName(String payPalLastName) {
    this.payPalLastName = payPalLastName;
  }


  public AdditionalDataRiskStandalone payPalPayerId(String payPalPayerId) {
    
    this.payPalPayerId = payPalPayerId;
    return this;
  }

   /**
   * Unique PayPal Customer Account identification number. Character length and limitations: 13 single-byte alphanumeric characters.
   * @return payPalPayerId
  **/
  @ApiModelProperty(value = "Unique PayPal Customer Account identification number. Character length and limitations: 13 single-byte alphanumeric characters.")

  public String getPayPalPayerId() {
    return payPalPayerId;
  }


  public void setPayPalPayerId(String payPalPayerId) {
    this.payPalPayerId = payPalPayerId;
  }


  public AdditionalDataRiskStandalone payPalPhone(String payPalPhone) {
    
    this.payPalPhone = payPalPhone;
    return this;
  }

   /**
   * Shopper&#39;s phone number.
   * @return payPalPhone
  **/
  @ApiModelProperty(value = "Shopper's phone number.")

  public String getPayPalPhone() {
    return payPalPhone;
  }


  public void setPayPalPhone(String payPalPhone) {
    this.payPalPhone = payPalPhone;
  }


  public AdditionalDataRiskStandalone payPalProtectionEligibility(String payPalProtectionEligibility) {
    
    this.payPalProtectionEligibility = payPalProtectionEligibility;
    return this;
  }

   /**
   * Allowed values: * **Eligible** — Merchant is protected by PayPal&#39;s Seller Protection Policy for Unauthorized Payments and Item Not Received.  * **PartiallyEligible** — Merchant is protected by PayPal&#39;s Seller Protection Policy for Item Not Received.  * **Ineligible** — Merchant is not protected under the Seller Protection Policy.
   * @return payPalProtectionEligibility
  **/
  @ApiModelProperty(value = "Allowed values: * **Eligible** — Merchant is protected by PayPal's Seller Protection Policy for Unauthorized Payments and Item Not Received.  * **PartiallyEligible** — Merchant is protected by PayPal's Seller Protection Policy for Item Not Received.  * **Ineligible** — Merchant is not protected under the Seller Protection Policy.")

  public String getPayPalProtectionEligibility() {
    return payPalProtectionEligibility;
  }


  public void setPayPalProtectionEligibility(String payPalProtectionEligibility) {
    this.payPalProtectionEligibility = payPalProtectionEligibility;
  }


  public AdditionalDataRiskStandalone payPalTransactionId(String payPalTransactionId) {
    
    this.payPalTransactionId = payPalTransactionId;
    return this;
  }

   /**
   * Unique transaction ID of the payment.
   * @return payPalTransactionId
  **/
  @ApiModelProperty(value = "Unique transaction ID of the payment.")

  public String getPayPalTransactionId() {
    return payPalTransactionId;
  }


  public void setPayPalTransactionId(String payPalTransactionId) {
    this.payPalTransactionId = payPalTransactionId;
  }


  public AdditionalDataRiskStandalone avsResultRaw(String avsResultRaw) {
    
    this.avsResultRaw = avsResultRaw;
    return this;
  }

   /**
   * Raw AVS result received from the acquirer, where available. Example: D
   * @return avsResultRaw
  **/
  @ApiModelProperty(value = "Raw AVS result received from the acquirer, where available. Example: D")

  public String getAvsResultRaw() {
    return avsResultRaw;
  }


  public void setAvsResultRaw(String avsResultRaw) {
    this.avsResultRaw = avsResultRaw;
  }


  public AdditionalDataRiskStandalone bin(String bin) {
    
    this.bin = bin;
    return this;
  }

   /**
   * The Bank Identification Number of a credit card, which is the first six digits of a card number. Required for [tokenized card request](https://docs.adyen.com/risk-management/standalone-risk#tokenised-pan-request).
   * @return bin
  **/
  @ApiModelProperty(value = "The Bank Identification Number of a credit card, which is the first six digits of a card number. Required for [tokenized card request](https://docs.adyen.com/risk-management/standalone-risk#tokenised-pan-request).")

  public String getBin() {
    return bin;
  }


  public void setBin(String bin) {
    this.bin = bin;
  }


  public AdditionalDataRiskStandalone cvcResultRaw(String cvcResultRaw) {
    
    this.cvcResultRaw = cvcResultRaw;
    return this;
  }

   /**
   * Raw CVC result received from the acquirer, where available. Example: 1
   * @return cvcResultRaw
  **/
  @ApiModelProperty(value = "Raw CVC result received from the acquirer, where available. Example: 1")

  public String getCvcResultRaw() {
    return cvcResultRaw;
  }


  public void setCvcResultRaw(String cvcResultRaw) {
    this.cvcResultRaw = cvcResultRaw;
  }


  public AdditionalDataRiskStandalone riskToken(String riskToken) {
    
    this.riskToken = riskToken;
    return this;
  }

   /**
   * Unique identifier or token for the shopper&#39;s card details.
   * @return riskToken
  **/
  @ApiModelProperty(value = "Unique identifier or token for the shopper's card details.")

  public String getRiskToken() {
    return riskToken;
  }


  public void setRiskToken(String riskToken) {
    this.riskToken = riskToken;
  }


  public AdditionalDataRiskStandalone threeDAuthenticated(String threeDAuthenticated) {
    
    this.threeDAuthenticated = threeDAuthenticated;
    return this;
  }

   /**
   * A Boolean value indicating whether 3DS authentication was completed on this payment. Example: true
   * @return threeDAuthenticated
  **/
  @ApiModelProperty(value = "A Boolean value indicating whether 3DS authentication was completed on this payment. Example: true")

  public String getThreeDAuthenticated() {
    return threeDAuthenticated;
  }


  public void setThreeDAuthenticated(String threeDAuthenticated) {
    this.threeDAuthenticated = threeDAuthenticated;
  }


  public AdditionalDataRiskStandalone threeDOffered(String threeDOffered) {
    
    this.threeDOffered = threeDOffered;
    return this;
  }

   /**
   * A Boolean value indicating whether 3DS was offered for this payment. Example: true
   * @return threeDOffered
  **/
  @ApiModelProperty(value = "A Boolean value indicating whether 3DS was offered for this payment. Example: true")

  public String getThreeDOffered() {
    return threeDOffered;
  }


  public void setThreeDOffered(String threeDOffered) {
    this.threeDOffered = threeDOffered;
  }


  public AdditionalDataRiskStandalone tokenDataType(String tokenDataType) {
    
    this.tokenDataType = tokenDataType;
    return this;
  }

   /**
   * Required for PayPal payments only. The only supported value is: **paypal**.
   * @return tokenDataType
  **/
  @ApiModelProperty(value = "Required for PayPal payments only. The only supported value is: **paypal**.")

  public String getTokenDataType() {
    return tokenDataType;
  }


  public void setTokenDataType(String tokenDataType) {
    this.tokenDataType = tokenDataType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalDataRiskStandalone additionalDataRiskStandalone = (AdditionalDataRiskStandalone) o;
    return Objects.equals(this.payPalCountryCode, additionalDataRiskStandalone.payPalCountryCode) &&
        Objects.equals(this.payPalEmailId, additionalDataRiskStandalone.payPalEmailId) &&
        Objects.equals(this.payPalFirstName, additionalDataRiskStandalone.payPalFirstName) &&
        Objects.equals(this.payPalLastName, additionalDataRiskStandalone.payPalLastName) &&
        Objects.equals(this.payPalPayerId, additionalDataRiskStandalone.payPalPayerId) &&
        Objects.equals(this.payPalPhone, additionalDataRiskStandalone.payPalPhone) &&
        Objects.equals(this.payPalProtectionEligibility, additionalDataRiskStandalone.payPalProtectionEligibility) &&
        Objects.equals(this.payPalTransactionId, additionalDataRiskStandalone.payPalTransactionId) &&
        Objects.equals(this.avsResultRaw, additionalDataRiskStandalone.avsResultRaw) &&
        Objects.equals(this.bin, additionalDataRiskStandalone.bin) &&
        Objects.equals(this.cvcResultRaw, additionalDataRiskStandalone.cvcResultRaw) &&
        Objects.equals(this.riskToken, additionalDataRiskStandalone.riskToken) &&
        Objects.equals(this.threeDAuthenticated, additionalDataRiskStandalone.threeDAuthenticated) &&
        Objects.equals(this.threeDOffered, additionalDataRiskStandalone.threeDOffered) &&
        Objects.equals(this.tokenDataType, additionalDataRiskStandalone.tokenDataType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payPalCountryCode, payPalEmailId, payPalFirstName, payPalLastName, payPalPayerId, payPalPhone, payPalProtectionEligibility, payPalTransactionId, avsResultRaw, bin, cvcResultRaw, riskToken, threeDAuthenticated, threeDOffered, tokenDataType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalDataRiskStandalone {\n");
    sb.append("    payPalCountryCode: ").append(toIndentedString(payPalCountryCode)).append("\n");
    sb.append("    payPalEmailId: ").append(toIndentedString(payPalEmailId)).append("\n");
    sb.append("    payPalFirstName: ").append(toIndentedString(payPalFirstName)).append("\n");
    sb.append("    payPalLastName: ").append(toIndentedString(payPalLastName)).append("\n");
    sb.append("    payPalPayerId: ").append(toIndentedString(payPalPayerId)).append("\n");
    sb.append("    payPalPhone: ").append(toIndentedString(payPalPhone)).append("\n");
    sb.append("    payPalProtectionEligibility: ").append(toIndentedString(payPalProtectionEligibility)).append("\n");
    sb.append("    payPalTransactionId: ").append(toIndentedString(payPalTransactionId)).append("\n");
    sb.append("    avsResultRaw: ").append(toIndentedString(avsResultRaw)).append("\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    cvcResultRaw: ").append(toIndentedString(cvcResultRaw)).append("\n");
    sb.append("    riskToken: ").append(toIndentedString(riskToken)).append("\n");
    sb.append("    threeDAuthenticated: ").append(toIndentedString(threeDAuthenticated)).append("\n");
    sb.append("    threeDOffered: ").append(toIndentedString(threeDOffered)).append("\n");
    sb.append("    tokenDataType: ").append(toIndentedString(tokenDataType)).append("\n");
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
    openapiFields.add("PayPal.CountryCode");
    openapiFields.add("PayPal.EmailId");
    openapiFields.add("PayPal.FirstName");
    openapiFields.add("PayPal.LastName");
    openapiFields.add("PayPal.PayerId");
    openapiFields.add("PayPal.Phone");
    openapiFields.add("PayPal.ProtectionEligibility");
    openapiFields.add("PayPal.TransactionId");
    openapiFields.add("avsResultRaw");
    openapiFields.add("bin");
    openapiFields.add("cvcResultRaw");
    openapiFields.add("riskToken");
    openapiFields.add("threeDAuthenticated");
    openapiFields.add("threeDOffered");
    openapiFields.add("tokenDataType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(AdditionalDataRiskStandalone.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdditionalDataRiskStandalone
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AdditionalDataRiskStandalone.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdditionalDataRiskStandalone is not found in the empty JSON string", AdditionalDataRiskStandalone.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AdditionalDataRiskStandalone.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `AdditionalDataRiskStandalone` properties.", entry.getKey()));
        }
      }
      // validate the optional field PayPal.CountryCode
      if (jsonObj.get("PayPal.CountryCode") != null && !jsonObj.get("PayPal.CountryCode").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `PayPal.CountryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PayPal.CountryCode").toString()));
      }
      // validate the optional field PayPal.EmailId
      if (jsonObj.get("PayPal.EmailId") != null && !jsonObj.get("PayPal.EmailId").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `PayPal.EmailId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PayPal.EmailId").toString()));
      }
      // validate the optional field PayPal.FirstName
      if (jsonObj.get("PayPal.FirstName") != null && !jsonObj.get("PayPal.FirstName").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `PayPal.FirstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PayPal.FirstName").toString()));
      }
      // validate the optional field PayPal.LastName
      if (jsonObj.get("PayPal.LastName") != null && !jsonObj.get("PayPal.LastName").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `PayPal.LastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PayPal.LastName").toString()));
      }
      // validate the optional field PayPal.PayerId
      if (jsonObj.get("PayPal.PayerId") != null && !jsonObj.get("PayPal.PayerId").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `PayPal.PayerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PayPal.PayerId").toString()));
      }
      // validate the optional field PayPal.Phone
      if (jsonObj.get("PayPal.Phone") != null && !jsonObj.get("PayPal.Phone").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `PayPal.Phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PayPal.Phone").toString()));
      }
      // validate the optional field PayPal.ProtectionEligibility
      if (jsonObj.get("PayPal.ProtectionEligibility") != null && !jsonObj.get("PayPal.ProtectionEligibility").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `PayPal.ProtectionEligibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PayPal.ProtectionEligibility").toString()));
      }
      // validate the optional field PayPal.TransactionId
      if (jsonObj.get("PayPal.TransactionId") != null && !jsonObj.get("PayPal.TransactionId").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `PayPal.TransactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PayPal.TransactionId").toString()));
      }
      // validate the optional field avsResultRaw
      if (jsonObj.get("avsResultRaw") != null && !jsonObj.get("avsResultRaw").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `avsResultRaw` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avsResultRaw").toString()));
      }
      // validate the optional field bin
      if (jsonObj.get("bin") != null && !jsonObj.get("bin").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `bin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bin").toString()));
      }
      // validate the optional field cvcResultRaw
      if (jsonObj.get("cvcResultRaw") != null && !jsonObj.get("cvcResultRaw").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `cvcResultRaw` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cvcResultRaw").toString()));
      }
      // validate the optional field riskToken
      if (jsonObj.get("riskToken") != null && !jsonObj.get("riskToken").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `riskToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("riskToken").toString()));
      }
      // validate the optional field threeDAuthenticated
      if (jsonObj.get("threeDAuthenticated") != null && !jsonObj.get("threeDAuthenticated").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `threeDAuthenticated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threeDAuthenticated").toString()));
      }
      // validate the optional field threeDOffered
      if (jsonObj.get("threeDOffered") != null && !jsonObj.get("threeDOffered").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `threeDOffered` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threeDOffered").toString()));
      }
      // validate the optional field tokenDataType
      if (jsonObj.get("tokenDataType") != null && !jsonObj.get("tokenDataType").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `tokenDataType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tokenDataType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdditionalDataRiskStandalone.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdditionalDataRiskStandalone' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdditionalDataRiskStandalone> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdditionalDataRiskStandalone.class));

       return (TypeAdapter<T>) new TypeAdapter<AdditionalDataRiskStandalone>() {
           @Override
           public void write(JsonWriter out, AdditionalDataRiskStandalone value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdditionalDataRiskStandalone read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdditionalDataRiskStandalone given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdditionalDataRiskStandalone
  * @throws IOException if the JSON string is invalid with respect to AdditionalDataRiskStandalone
  */
  public static AdditionalDataRiskStandalone fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdditionalDataRiskStandalone.class);
  }

 /**
  * Convert an instance of AdditionalDataRiskStandalone to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
