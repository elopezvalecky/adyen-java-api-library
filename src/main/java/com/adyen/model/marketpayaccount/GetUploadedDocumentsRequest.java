/*
 * Account API
 * This API is used for the classic integration. If you are just starting your implementation, refer to our [new integration guide](https://docs.adyen.com/marketplaces-and-platforms) instead.  The Account API provides endpoints for managing account-related entities on your platform. These related entities include account holders, accounts, bank accounts, shareholders, and verification-related documents. The management operations include actions such as creation, retrieval, updating, and deletion of them.  For more information, refer to our [documentation](https://docs.adyen.com/marketplaces-and-platforms/classic). ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -U \"ws@MarketPlace.YOUR_PLATFORM_ACCOUNT\":\"YOUR_WS_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ``` When going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning The Account API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://cal-test.adyen.com/cal/services/Account/v6/createAccountHolder ```
 *
 * The version of the OpenAPI document: 6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.marketpayaccount;

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
 * GetUploadedDocumentsRequest
 */
@JsonPropertyOrder({
  GetUploadedDocumentsRequest.JSON_PROPERTY_ACCOUNT_HOLDER_CODE,
  GetUploadedDocumentsRequest.JSON_PROPERTY_BANK_ACCOUNT_U_U_I_D,
  GetUploadedDocumentsRequest.JSON_PROPERTY_SHAREHOLDER_CODE
})

public class GetUploadedDocumentsRequest {
  public static final String JSON_PROPERTY_ACCOUNT_HOLDER_CODE = "accountHolderCode";
  private String accountHolderCode;

  public static final String JSON_PROPERTY_BANK_ACCOUNT_U_U_I_D = "bankAccountUUID";
  private String bankAccountUUID;

  public static final String JSON_PROPERTY_SHAREHOLDER_CODE = "shareholderCode";
  private String shareholderCode;

  public GetUploadedDocumentsRequest() { 
  }

  public GetUploadedDocumentsRequest accountHolderCode(String accountHolderCode) {
    this.accountHolderCode = accountHolderCode;
    return this;
  }

   /**
   * The code of the Account Holder for which to retrieve the documents.
   * @return accountHolderCode
  **/
  @ApiModelProperty(required = true, value = "The code of the Account Holder for which to retrieve the documents.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountHolderCode() {
    return accountHolderCode;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountHolderCode(String accountHolderCode) {
    this.accountHolderCode = accountHolderCode;
  }


  public GetUploadedDocumentsRequest bankAccountUUID(String bankAccountUUID) {
    this.bankAccountUUID = bankAccountUUID;
    return this;
  }

   /**
   * The code of the Bank Account for which to retrieve the documents.
   * @return bankAccountUUID
  **/
  @ApiModelProperty(value = "The code of the Bank Account for which to retrieve the documents.")
  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_U_U_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBankAccountUUID() {
    return bankAccountUUID;
  }


  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_U_U_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankAccountUUID(String bankAccountUUID) {
    this.bankAccountUUID = bankAccountUUID;
  }


  public GetUploadedDocumentsRequest shareholderCode(String shareholderCode) {
    this.shareholderCode = shareholderCode;
    return this;
  }

   /**
   * The code of the Shareholder for which to retrieve the documents.
   * @return shareholderCode
  **/
  @ApiModelProperty(value = "The code of the Shareholder for which to retrieve the documents.")
  @JsonProperty(JSON_PROPERTY_SHAREHOLDER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShareholderCode() {
    return shareholderCode;
  }


  @JsonProperty(JSON_PROPERTY_SHAREHOLDER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShareholderCode(String shareholderCode) {
    this.shareholderCode = shareholderCode;
  }


  /**
   * Return true if this GetUploadedDocumentsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUploadedDocumentsRequest getUploadedDocumentsRequest = (GetUploadedDocumentsRequest) o;
    return Objects.equals(this.accountHolderCode, getUploadedDocumentsRequest.accountHolderCode) &&
        Objects.equals(this.bankAccountUUID, getUploadedDocumentsRequest.bankAccountUUID) &&
        Objects.equals(this.shareholderCode, getUploadedDocumentsRequest.shareholderCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolderCode, bankAccountUUID, shareholderCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUploadedDocumentsRequest {\n");
    sb.append("    accountHolderCode: ").append(toIndentedString(accountHolderCode)).append("\n");
    sb.append("    bankAccountUUID: ").append(toIndentedString(bankAccountUUID)).append("\n");
    sb.append("    shareholderCode: ").append(toIndentedString(shareholderCode)).append("\n");
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
   * Create an instance of GetUploadedDocumentsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetUploadedDocumentsRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to GetUploadedDocumentsRequest
   */
  public static GetUploadedDocumentsRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, GetUploadedDocumentsRequest.class);
  }
/**
  * Convert an instance of GetUploadedDocumentsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
