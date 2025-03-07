/*
 * Disputes API
 * You can use the [Disputes API](https://docs.adyen.com/risk-management/disputes-api) to automate the dispute handling process so that you can respond to disputes and chargebacks as soon as they are initiated. The Disputes API lets you retrieve defense reasons, supply and delete defense documents, and accept or defend disputes.  ## Authentication Each request to the Disputes API must be signed with an API key. For this, obtain an API Key from your Customer Area, as described in [How to get the API key](https://docs.adyen.com/development-resources/api-credentials#generate-api-key). Then set this key to the `X-API-Key` header value, for example:  ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: Your_API_key\" \\ ... ``` Note that when going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning Disputes API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://ca-test.adyen.com/ca/services/DisputeService/v30/defendDispute ```
 *
 * The version of the OpenAPI document: 30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.disputes;

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
 * AcceptDisputeRequest
 */
@JsonPropertyOrder({
  AcceptDisputeRequest.JSON_PROPERTY_DISPUTE_PSP_REFERENCE,
  AcceptDisputeRequest.JSON_PROPERTY_MERCHANT_ACCOUNT_CODE
})

public class AcceptDisputeRequest {
  public static final String JSON_PROPERTY_DISPUTE_PSP_REFERENCE = "disputePspReference";
  private String disputePspReference;

  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT_CODE = "merchantAccountCode";
  private String merchantAccountCode;

  public AcceptDisputeRequest() { 
  }

  public AcceptDisputeRequest disputePspReference(String disputePspReference) {
    this.disputePspReference = disputePspReference;
    return this;
  }

   /**
   * The PSP reference assigned to the dispute.
   * @return disputePspReference
  **/
  @ApiModelProperty(required = true, value = "The PSP reference assigned to the dispute.")
  @JsonProperty(JSON_PROPERTY_DISPUTE_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisputePspReference() {
    return disputePspReference;
  }


  @JsonProperty(JSON_PROPERTY_DISPUTE_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisputePspReference(String disputePspReference) {
    this.disputePspReference = disputePspReference;
  }


  public AcceptDisputeRequest merchantAccountCode(String merchantAccountCode) {
    this.merchantAccountCode = merchantAccountCode;
    return this;
  }

   /**
   * The merchant account identifier, for which you want to process the dispute transaction.
   * @return merchantAccountCode
  **/
  @ApiModelProperty(required = true, value = "The merchant account identifier, for which you want to process the dispute transaction.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantAccountCode() {
    return merchantAccountCode;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAccountCode(String merchantAccountCode) {
    this.merchantAccountCode = merchantAccountCode;
  }


  /**
   * Return true if this AcceptDisputeRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcceptDisputeRequest acceptDisputeRequest = (AcceptDisputeRequest) o;
    return Objects.equals(this.disputePspReference, acceptDisputeRequest.disputePspReference) &&
        Objects.equals(this.merchantAccountCode, acceptDisputeRequest.merchantAccountCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disputePspReference, merchantAccountCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcceptDisputeRequest {\n");
    sb.append("    disputePspReference: ").append(toIndentedString(disputePspReference)).append("\n");
    sb.append("    merchantAccountCode: ").append(toIndentedString(merchantAccountCode)).append("\n");
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
   * Create an instance of AcceptDisputeRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AcceptDisputeRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to AcceptDisputeRequest
   */
  public static AcceptDisputeRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AcceptDisputeRequest.class);
  }
/**
  * Convert an instance of AcceptDisputeRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

