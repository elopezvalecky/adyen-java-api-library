/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 71
 * 
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
 * SamsungPayDetails
 */
@JsonPropertyOrder({
  SamsungPayDetails.JSON_PROPERTY_CHECKOUT_ATTEMPT_ID,
  SamsungPayDetails.JSON_PROPERTY_FUNDING_SOURCE,
  SamsungPayDetails.JSON_PROPERTY_RECURRING_DETAIL_REFERENCE,
  SamsungPayDetails.JSON_PROPERTY_SAMSUNG_PAY_TOKEN,
  SamsungPayDetails.JSON_PROPERTY_STORED_PAYMENT_METHOD_ID,
  SamsungPayDetails.JSON_PROPERTY_TYPE
})

public class SamsungPayDetails {
  public static final String JSON_PROPERTY_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  private String checkoutAttemptId;

  /**
   * The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**.
   */
  public enum FundingSourceEnum {
    DEBIT("debit");

    private String value;

    FundingSourceEnum(String value) {
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
    public static FundingSourceEnum fromValue(String value) {
      for (FundingSourceEnum b : FundingSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FUNDING_SOURCE = "fundingSource";
  private FundingSourceEnum fundingSource;

  public static final String JSON_PROPERTY_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  private String recurringDetailReference;

  public static final String JSON_PROPERTY_SAMSUNG_PAY_TOKEN = "samsungPayToken";
  private String samsungPayToken;

  public static final String JSON_PROPERTY_STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
  private String storedPaymentMethodId;

  /**
   * **samsungpay**
   */
  public enum TypeEnum {
    SAMSUNGPAY("samsungpay");

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
  private TypeEnum type = TypeEnum.SAMSUNGPAY;

  public SamsungPayDetails() { 
  }

  public SamsungPayDetails checkoutAttemptId(String checkoutAttemptId) {
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


  public SamsungPayDetails fundingSource(FundingSourceEnum fundingSource) {
    this.fundingSource = fundingSource;
    return this;
  }

   /**
   * The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**.
   * @return fundingSource
  **/
  @ApiModelProperty(value = "The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**.")
  @JsonProperty(JSON_PROPERTY_FUNDING_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FundingSourceEnum getFundingSource() {
    return fundingSource;
  }


  @JsonProperty(JSON_PROPERTY_FUNDING_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFundingSource(FundingSourceEnum fundingSource) {
    this.fundingSource = fundingSource;
  }


  public SamsungPayDetails recurringDetailReference(String recurringDetailReference) {
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


  public SamsungPayDetails samsungPayToken(String samsungPayToken) {
    this.samsungPayToken = samsungPayToken;
    return this;
  }

   /**
   * The payload you received from the Samsung Pay SDK response.
   * @return samsungPayToken
  **/
  @ApiModelProperty(required = true, value = "The payload you received from the Samsung Pay SDK response.")
  @JsonProperty(JSON_PROPERTY_SAMSUNG_PAY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSamsungPayToken() {
    return samsungPayToken;
  }


  @JsonProperty(JSON_PROPERTY_SAMSUNG_PAY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSamsungPayToken(String samsungPayToken) {
    this.samsungPayToken = samsungPayToken;
  }


  public SamsungPayDetails storedPaymentMethodId(String storedPaymentMethodId) {
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


  public SamsungPayDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **samsungpay**
   * @return type
  **/
  @ApiModelProperty(value = "**samsungpay**")
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


  /**
   * Return true if this SamsungPayDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamsungPayDetails samsungPayDetails = (SamsungPayDetails) o;
    return Objects.equals(this.checkoutAttemptId, samsungPayDetails.checkoutAttemptId) &&
        Objects.equals(this.fundingSource, samsungPayDetails.fundingSource) &&
        Objects.equals(this.recurringDetailReference, samsungPayDetails.recurringDetailReference) &&
        Objects.equals(this.samsungPayToken, samsungPayDetails.samsungPayToken) &&
        Objects.equals(this.storedPaymentMethodId, samsungPayDetails.storedPaymentMethodId) &&
        Objects.equals(this.type, samsungPayDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutAttemptId, fundingSource, recurringDetailReference, samsungPayToken, storedPaymentMethodId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamsungPayDetails {\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
    sb.append("    fundingSource: ").append(toIndentedString(fundingSource)).append("\n");
    sb.append("    recurringDetailReference: ").append(toIndentedString(recurringDetailReference)).append("\n");
    sb.append("    samsungPayToken: ").append(toIndentedString(samsungPayToken)).append("\n");
    sb.append("    storedPaymentMethodId: ").append(toIndentedString(storedPaymentMethodId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
   * Create an instance of SamsungPayDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SamsungPayDetails
   * @throws JsonProcessingException if the JSON string is invalid with respect to SamsungPayDetails
   */
  public static SamsungPayDetails fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, SamsungPayDetails.class);
  }
/**
  * Convert an instance of SamsungPayDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

