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
 * ThreeDSRequestorPriorAuthenticationInfo
 */
@JsonPropertyOrder({
  ThreeDSRequestorPriorAuthenticationInfo.JSON_PROPERTY_THREE_D_S_REQ_PRIOR_AUTH_DATA,
  ThreeDSRequestorPriorAuthenticationInfo.JSON_PROPERTY_THREE_D_S_REQ_PRIOR_AUTH_METHOD,
  ThreeDSRequestorPriorAuthenticationInfo.JSON_PROPERTY_THREE_D_S_REQ_PRIOR_AUTH_TIMESTAMP,
  ThreeDSRequestorPriorAuthenticationInfo.JSON_PROPERTY_THREE_D_S_REQ_PRIOR_REF
})

public class ThreeDSRequestorPriorAuthenticationInfo {
  public static final String JSON_PROPERTY_THREE_D_S_REQ_PRIOR_AUTH_DATA = "threeDSReqPriorAuthData";
  private String threeDSReqPriorAuthData;

  /**
   * Mechanism used by the Cardholder to previously authenticate to the 3DS Requestor. Allowed values: * **01** — Frictionless authentication occurred by ACS. * **02** — Cardholder challenge occurred by ACS. * **03** — AVS verified. * **04** — Other issuer methods.
   */
  public enum ThreeDSReqPriorAuthMethodEnum {
    _01("01"),
    
    _02("02"),
    
    _03("03"),
    
    _04("04");

    private String value;

    ThreeDSReqPriorAuthMethodEnum(String value) {
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
    public static ThreeDSReqPriorAuthMethodEnum fromValue(String value) {
      for (ThreeDSReqPriorAuthMethodEnum b : ThreeDSReqPriorAuthMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_THREE_D_S_REQ_PRIOR_AUTH_METHOD = "threeDSReqPriorAuthMethod";
  private ThreeDSReqPriorAuthMethodEnum threeDSReqPriorAuthMethod;

  public static final String JSON_PROPERTY_THREE_D_S_REQ_PRIOR_AUTH_TIMESTAMP = "threeDSReqPriorAuthTimestamp";
  private String threeDSReqPriorAuthTimestamp;

  public static final String JSON_PROPERTY_THREE_D_S_REQ_PRIOR_REF = "threeDSReqPriorRef";
  private String threeDSReqPriorRef;

  public ThreeDSRequestorPriorAuthenticationInfo() { 
  }

  public ThreeDSRequestorPriorAuthenticationInfo threeDSReqPriorAuthData(String threeDSReqPriorAuthData) {
    this.threeDSReqPriorAuthData = threeDSReqPriorAuthData;
    return this;
  }

   /**
   * Data that documents and supports a specific authentication process. Maximum length: 2048 bytes.
   * @return threeDSReqPriorAuthData
  **/
  @ApiModelProperty(value = "Data that documents and supports a specific authentication process. Maximum length: 2048 bytes.")
  @JsonProperty(JSON_PROPERTY_THREE_D_S_REQ_PRIOR_AUTH_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThreeDSReqPriorAuthData() {
    return threeDSReqPriorAuthData;
  }


  @JsonProperty(JSON_PROPERTY_THREE_D_S_REQ_PRIOR_AUTH_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeDSReqPriorAuthData(String threeDSReqPriorAuthData) {
    this.threeDSReqPriorAuthData = threeDSReqPriorAuthData;
  }


  public ThreeDSRequestorPriorAuthenticationInfo threeDSReqPriorAuthMethod(ThreeDSReqPriorAuthMethodEnum threeDSReqPriorAuthMethod) {
    this.threeDSReqPriorAuthMethod = threeDSReqPriorAuthMethod;
    return this;
  }

   /**
   * Mechanism used by the Cardholder to previously authenticate to the 3DS Requestor. Allowed values: * **01** — Frictionless authentication occurred by ACS. * **02** — Cardholder challenge occurred by ACS. * **03** — AVS verified. * **04** — Other issuer methods.
   * @return threeDSReqPriorAuthMethod
  **/
  @ApiModelProperty(value = "Mechanism used by the Cardholder to previously authenticate to the 3DS Requestor. Allowed values: * **01** — Frictionless authentication occurred by ACS. * **02** — Cardholder challenge occurred by ACS. * **03** — AVS verified. * **04** — Other issuer methods.")
  @JsonProperty(JSON_PROPERTY_THREE_D_S_REQ_PRIOR_AUTH_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ThreeDSReqPriorAuthMethodEnum getThreeDSReqPriorAuthMethod() {
    return threeDSReqPriorAuthMethod;
  }


  @JsonProperty(JSON_PROPERTY_THREE_D_S_REQ_PRIOR_AUTH_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeDSReqPriorAuthMethod(ThreeDSReqPriorAuthMethodEnum threeDSReqPriorAuthMethod) {
    this.threeDSReqPriorAuthMethod = threeDSReqPriorAuthMethod;
  }


  public ThreeDSRequestorPriorAuthenticationInfo threeDSReqPriorAuthTimestamp(String threeDSReqPriorAuthTimestamp) {
    this.threeDSReqPriorAuthTimestamp = threeDSReqPriorAuthTimestamp;
    return this;
  }

   /**
   * Date and time in UTC of the prior cardholder authentication. Format: YYYYMMDDHHMM
   * @return threeDSReqPriorAuthTimestamp
  **/
  @ApiModelProperty(value = "Date and time in UTC of the prior cardholder authentication. Format: YYYYMMDDHHMM")
  @JsonProperty(JSON_PROPERTY_THREE_D_S_REQ_PRIOR_AUTH_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThreeDSReqPriorAuthTimestamp() {
    return threeDSReqPriorAuthTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_THREE_D_S_REQ_PRIOR_AUTH_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeDSReqPriorAuthTimestamp(String threeDSReqPriorAuthTimestamp) {
    this.threeDSReqPriorAuthTimestamp = threeDSReqPriorAuthTimestamp;
  }


  public ThreeDSRequestorPriorAuthenticationInfo threeDSReqPriorRef(String threeDSReqPriorRef) {
    this.threeDSReqPriorRef = threeDSReqPriorRef;
    return this;
  }

   /**
   * This data element provides additional information to the ACS to determine the best approach for handing a request. This data element contains an ACS Transaction ID for a prior authenticated transaction. For example, the first recurring transaction that was authenticated with the cardholder. Length: 30 characters.
   * @return threeDSReqPriorRef
  **/
  @ApiModelProperty(value = "This data element provides additional information to the ACS to determine the best approach for handing a request. This data element contains an ACS Transaction ID for a prior authenticated transaction. For example, the first recurring transaction that was authenticated with the cardholder. Length: 30 characters.")
  @JsonProperty(JSON_PROPERTY_THREE_D_S_REQ_PRIOR_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThreeDSReqPriorRef() {
    return threeDSReqPriorRef;
  }


  @JsonProperty(JSON_PROPERTY_THREE_D_S_REQ_PRIOR_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeDSReqPriorRef(String threeDSReqPriorRef) {
    this.threeDSReqPriorRef = threeDSReqPriorRef;
  }


  /**
   * Return true if this ThreeDSRequestorPriorAuthenticationInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDSRequestorPriorAuthenticationInfo threeDSRequestorPriorAuthenticationInfo = (ThreeDSRequestorPriorAuthenticationInfo) o;
    return Objects.equals(this.threeDSReqPriorAuthData, threeDSRequestorPriorAuthenticationInfo.threeDSReqPriorAuthData) &&
        Objects.equals(this.threeDSReqPriorAuthMethod, threeDSRequestorPriorAuthenticationInfo.threeDSReqPriorAuthMethod) &&
        Objects.equals(this.threeDSReqPriorAuthTimestamp, threeDSRequestorPriorAuthenticationInfo.threeDSReqPriorAuthTimestamp) &&
        Objects.equals(this.threeDSReqPriorRef, threeDSRequestorPriorAuthenticationInfo.threeDSReqPriorRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threeDSReqPriorAuthData, threeDSReqPriorAuthMethod, threeDSReqPriorAuthTimestamp, threeDSReqPriorRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDSRequestorPriorAuthenticationInfo {\n");
    sb.append("    threeDSReqPriorAuthData: ").append(toIndentedString(threeDSReqPriorAuthData)).append("\n");
    sb.append("    threeDSReqPriorAuthMethod: ").append(toIndentedString(threeDSReqPriorAuthMethod)).append("\n");
    sb.append("    threeDSReqPriorAuthTimestamp: ").append(toIndentedString(threeDSReqPriorAuthTimestamp)).append("\n");
    sb.append("    threeDSReqPriorRef: ").append(toIndentedString(threeDSReqPriorRef)).append("\n");
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
   * Create an instance of ThreeDSRequestorPriorAuthenticationInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ThreeDSRequestorPriorAuthenticationInfo
   * @throws JsonProcessingException if the JSON string is invalid with respect to ThreeDSRequestorPriorAuthenticationInfo
   */
  public static ThreeDSRequestorPriorAuthenticationInfo fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ThreeDSRequestorPriorAuthenticationInfo.class);
  }
/**
  * Convert an instance of ThreeDSRequestorPriorAuthenticationInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

