/*
 * Transfers API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transfers;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.transfers.BankAccountV3;
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
 * CounterpartyInfoV3
 */
@JsonPropertyOrder({
  CounterpartyInfoV3.JSON_PROPERTY_BALANCE_ACCOUNT_ID,
  CounterpartyInfoV3.JSON_PROPERTY_BANK_ACCOUNT,
  CounterpartyInfoV3.JSON_PROPERTY_TRANSFER_INSTRUMENT_ID
})

public class CounterpartyInfoV3 {
  public static final String JSON_PROPERTY_BALANCE_ACCOUNT_ID = "balanceAccountId";
  private String balanceAccountId;

  public static final String JSON_PROPERTY_BANK_ACCOUNT = "bankAccount";
  private BankAccountV3 bankAccount;

  public static final String JSON_PROPERTY_TRANSFER_INSTRUMENT_ID = "transferInstrumentId";
  private String transferInstrumentId;

  public CounterpartyInfoV3() { 
  }

  public CounterpartyInfoV3 balanceAccountId(String balanceAccountId) {
    this.balanceAccountId = balanceAccountId;
    return this;
  }

   /**
   * Unique identifier of the [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id).
   * @return balanceAccountId
  **/
  @ApiModelProperty(value = "Unique identifier of the [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/balanceAccounts__resParam_id).")
  @JsonProperty(JSON_PROPERTY_BALANCE_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBalanceAccountId() {
    return balanceAccountId;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceAccountId(String balanceAccountId) {
    this.balanceAccountId = balanceAccountId;
  }


  public CounterpartyInfoV3 bankAccount(BankAccountV3 bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BankAccountV3 getBankAccount() {
    return bankAccount;
  }


  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankAccount(BankAccountV3 bankAccount) {
    this.bankAccount = bankAccount;
  }


  public CounterpartyInfoV3 transferInstrumentId(String transferInstrumentId) {
    this.transferInstrumentId = transferInstrumentId;
    return this;
  }

   /**
   * Unique identifier of the [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id).
   * @return transferInstrumentId
  **/
  @ApiModelProperty(value = "Unique identifier of the [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id).")
  @JsonProperty(JSON_PROPERTY_TRANSFER_INSTRUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTransferInstrumentId() {
    return transferInstrumentId;
  }


  @JsonProperty(JSON_PROPERTY_TRANSFER_INSTRUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransferInstrumentId(String transferInstrumentId) {
    this.transferInstrumentId = transferInstrumentId;
  }


  /**
   * Return true if this CounterpartyInfoV3 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CounterpartyInfoV3 counterpartyInfoV3 = (CounterpartyInfoV3) o;
    return Objects.equals(this.balanceAccountId, counterpartyInfoV3.balanceAccountId) &&
        Objects.equals(this.bankAccount, counterpartyInfoV3.bankAccount) &&
        Objects.equals(this.transferInstrumentId, counterpartyInfoV3.transferInstrumentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceAccountId, bankAccount, transferInstrumentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CounterpartyInfoV3 {\n");
    sb.append("    balanceAccountId: ").append(toIndentedString(balanceAccountId)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    transferInstrumentId: ").append(toIndentedString(transferInstrumentId)).append("\n");
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
   * Create an instance of CounterpartyInfoV3 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CounterpartyInfoV3
   * @throws JsonProcessingException if the JSON string is invalid with respect to CounterpartyInfoV3
   */
  public static CounterpartyInfoV3 fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CounterpartyInfoV3.class);
  }
/**
  * Convert an instance of CounterpartyInfoV3 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

