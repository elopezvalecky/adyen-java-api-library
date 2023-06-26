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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * PayUUpiDetails
 */
@JsonPropertyOrder({
  PayUUpiDetails.JSON_PROPERTY_CHECKOUT_ATTEMPT_ID,
  PayUUpiDetails.JSON_PROPERTY_RECURRING_DETAIL_REFERENCE,
  PayUUpiDetails.JSON_PROPERTY_SHOPPER_NOTIFICATION_REFERENCE,
  PayUUpiDetails.JSON_PROPERTY_STORED_PAYMENT_METHOD_ID,
  PayUUpiDetails.JSON_PROPERTY_TYPE,
  PayUUpiDetails.JSON_PROPERTY_VIRTUAL_PAYMENT_ADDRESS
})

public class PayUUpiDetails {
  public static final String JSON_PROPERTY_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  private String checkoutAttemptId;

  public static final String JSON_PROPERTY_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  private String recurringDetailReference;

  public static final String JSON_PROPERTY_SHOPPER_NOTIFICATION_REFERENCE = "shopperNotificationReference";
  private String shopperNotificationReference;

  public static final String JSON_PROPERTY_STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
  private String storedPaymentMethodId;

  /**
   * **payu_IN_upi**
   */
  public enum TypeEnum {
    PAYU_IN_UPI("payu_IN_upi");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type = TypeEnum.PAYU_IN_UPI;

  public static final String JSON_PROPERTY_VIRTUAL_PAYMENT_ADDRESS = "virtualPaymentAddress";
  private String virtualPaymentAddress;

  public PayUUpiDetails() { 
  }

  public PayUUpiDetails checkoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
    return this;
  }

   /**
   * The checkout attempt identifier.
   * @return checkoutAttemptId
  **/
  @ApiModelProperty(value = "The checkout attempt identifier.")
  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCheckoutAttemptId() {
    return checkoutAttemptId;
  }


  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
  }


  public PayUUpiDetails recurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
    return this;
  }

   /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   * @return recurringDetailReference
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "This is the `recurringDetailReference` returned in the response when you created the token.")
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecurringDetailReference() {
    return recurringDetailReference;
  }


  @Deprecated
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
  }


  public PayUUpiDetails shopperNotificationReference(String shopperNotificationReference) {
    this.shopperNotificationReference = shopperNotificationReference;
    return this;
  }

   /**
   * The &#x60;shopperNotificationReference&#x60; returned in the response when you requested to notify the shopper. Used for recurring payment only.
   * @return shopperNotificationReference
  **/
  @ApiModelProperty(value = "The `shopperNotificationReference` returned in the response when you requested to notify the shopper. Used for recurring payment only.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_NOTIFICATION_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShopperNotificationReference() {
    return shopperNotificationReference;
  }


  @JsonProperty(JSON_PROPERTY_SHOPPER_NOTIFICATION_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperNotificationReference(String shopperNotificationReference) {
    this.shopperNotificationReference = shopperNotificationReference;
  }


  public PayUUpiDetails storedPaymentMethodId(String storedPaymentMethodId) {
    this.storedPaymentMethodId = storedPaymentMethodId;
    return this;
  }

   /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   * @return storedPaymentMethodId
  **/
  @ApiModelProperty(value = "This is the `recurringDetailReference` returned in the response when you created the token.")
  @JsonProperty(JSON_PROPERTY_STORED_PAYMENT_METHOD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStoredPaymentMethodId() {
    return storedPaymentMethodId;
  }


  @JsonProperty(JSON_PROPERTY_STORED_PAYMENT_METHOD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoredPaymentMethodId(String storedPaymentMethodId) {
    this.storedPaymentMethodId = storedPaymentMethodId;
  }


  public PayUUpiDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **payu_IN_upi**
   * @return type
  **/
  @ApiModelProperty(required = true, value = "**payu_IN_upi**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public PayUUpiDetails virtualPaymentAddress(String virtualPaymentAddress) {
    this.virtualPaymentAddress = virtualPaymentAddress;
    return this;
  }

   /**
   * The virtual payment address for UPI.
   * @return virtualPaymentAddress
  **/
  @ApiModelProperty(value = "The virtual payment address for UPI.")
  @JsonProperty(JSON_PROPERTY_VIRTUAL_PAYMENT_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVirtualPaymentAddress() {
    return virtualPaymentAddress;
  }


  @JsonProperty(JSON_PROPERTY_VIRTUAL_PAYMENT_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVirtualPaymentAddress(String virtualPaymentAddress) {
    this.virtualPaymentAddress = virtualPaymentAddress;
  }


  /**
   * Return true if this PayUUpiDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayUUpiDetails payUUpiDetails = (PayUUpiDetails) o;
    return Objects.equals(this.checkoutAttemptId, payUUpiDetails.checkoutAttemptId) &&
        Objects.equals(this.recurringDetailReference, payUUpiDetails.recurringDetailReference) &&
        Objects.equals(this.shopperNotificationReference, payUUpiDetails.shopperNotificationReference) &&
        Objects.equals(this.storedPaymentMethodId, payUUpiDetails.storedPaymentMethodId) &&
        Objects.equals(this.type, payUUpiDetails.type) &&
        Objects.equals(this.virtualPaymentAddress, payUUpiDetails.virtualPaymentAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutAttemptId, recurringDetailReference, shopperNotificationReference, storedPaymentMethodId, type, virtualPaymentAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayUUpiDetails {\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
    sb.append("    recurringDetailReference: ").append(toIndentedString(recurringDetailReference)).append("\n");
    sb.append("    shopperNotificationReference: ").append(toIndentedString(shopperNotificationReference)).append("\n");
    sb.append("    storedPaymentMethodId: ").append(toIndentedString(storedPaymentMethodId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    virtualPaymentAddress: ").append(toIndentedString(virtualPaymentAddress)).append("\n");
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

/**
   * Create an instance of PayUUpiDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PayUUpiDetails
   * @throws JsonProcessingException if the JSON string is invalid with respect to PayUUpiDetails
   */
  public static PayUUpiDetails fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PayUUpiDetails.class);
  }
/**
  * Convert an instance of PayUUpiDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

