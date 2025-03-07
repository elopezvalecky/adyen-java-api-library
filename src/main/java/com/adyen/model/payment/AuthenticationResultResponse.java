/*
 * Adyen Payment API
 * A set of API endpoints that allow you to initiate, settle, and modify payments on the Adyen payments platform. You can use the API to accept card payments (including One-Click and 3D Secure), bank transfers, ewallets, and many other payment methods.  To learn more about the API, visit [Classic integration](https://docs.adyen.com/classic-integration).  ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning Payments API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/Payment/v68/authorise ```  ## Going live  To authenticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/Payment/v68/authorise ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payment;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.payment.ThreeDS1Result;
import com.adyen.model.payment.ThreeDS2Result;
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
 * AuthenticationResultResponse
 */
@JsonPropertyOrder({
  AuthenticationResultResponse.JSON_PROPERTY_THREE_D_S1_RESULT,
  AuthenticationResultResponse.JSON_PROPERTY_THREE_D_S2_RESULT
})

public class AuthenticationResultResponse {
  public static final String JSON_PROPERTY_THREE_D_S1_RESULT = "threeDS1Result";
  private ThreeDS1Result threeDS1Result;

  public static final String JSON_PROPERTY_THREE_D_S2_RESULT = "threeDS2Result";
  private ThreeDS2Result threeDS2Result;

  public AuthenticationResultResponse() { 
  }

  public AuthenticationResultResponse threeDS1Result(ThreeDS1Result threeDS1Result) {
    this.threeDS1Result = threeDS1Result;
    return this;
  }

   /**
   * Get threeDS1Result
   * @return threeDS1Result
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THREE_D_S1_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ThreeDS1Result getThreeDS1Result() {
    return threeDS1Result;
  }


  @JsonProperty(JSON_PROPERTY_THREE_D_S1_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeDS1Result(ThreeDS1Result threeDS1Result) {
    this.threeDS1Result = threeDS1Result;
  }


  public AuthenticationResultResponse threeDS2Result(ThreeDS2Result threeDS2Result) {
    this.threeDS2Result = threeDS2Result;
    return this;
  }

   /**
   * Get threeDS2Result
   * @return threeDS2Result
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THREE_D_S2_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ThreeDS2Result getThreeDS2Result() {
    return threeDS2Result;
  }


  @JsonProperty(JSON_PROPERTY_THREE_D_S2_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeDS2Result(ThreeDS2Result threeDS2Result) {
    this.threeDS2Result = threeDS2Result;
  }


  /**
   * Return true if this AuthenticationResultResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationResultResponse authenticationResultResponse = (AuthenticationResultResponse) o;
    return Objects.equals(this.threeDS1Result, authenticationResultResponse.threeDS1Result) &&
        Objects.equals(this.threeDS2Result, authenticationResultResponse.threeDS2Result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threeDS1Result, threeDS2Result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationResultResponse {\n");
    sb.append("    threeDS1Result: ").append(toIndentedString(threeDS1Result)).append("\n");
    sb.append("    threeDS2Result: ").append(toIndentedString(threeDS2Result)).append("\n");
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
   * Create an instance of AuthenticationResultResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AuthenticationResultResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to AuthenticationResultResponse
   */
  public static AuthenticationResultResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AuthenticationResultResponse.class);
  }
/**
  * Convert an instance of AuthenticationResultResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

