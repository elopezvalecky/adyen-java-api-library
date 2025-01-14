/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.balanceplatform.PlatformPaymentConfiguration;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * BalanceAccountInfo
 */
@JsonPropertyOrder({
  BalanceAccountInfo.JSON_PROPERTY_ACCOUNT_HOLDER_ID,
  BalanceAccountInfo.JSON_PROPERTY_DEFAULT_CURRENCY_CODE,
  BalanceAccountInfo.JSON_PROPERTY_DESCRIPTION,
  BalanceAccountInfo.JSON_PROPERTY_METADATA,
  BalanceAccountInfo.JSON_PROPERTY_MIGRATED_ACCOUNT_CODE,
  BalanceAccountInfo.JSON_PROPERTY_PLATFORM_PAYMENT_CONFIGURATION,
  BalanceAccountInfo.JSON_PROPERTY_REFERENCE,
  BalanceAccountInfo.JSON_PROPERTY_TIME_ZONE
})

public class BalanceAccountInfo {
  public static final String JSON_PROPERTY_ACCOUNT_HOLDER_ID = "accountHolderId";
  private String accountHolderId;

  public static final String JSON_PROPERTY_DEFAULT_CURRENCY_CODE = "defaultCurrencyCode";
  private String defaultCurrencyCode;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;

  public static final String JSON_PROPERTY_MIGRATED_ACCOUNT_CODE = "migratedAccountCode";
  private String migratedAccountCode;

  public static final String JSON_PROPERTY_PLATFORM_PAYMENT_CONFIGURATION = "platformPaymentConfiguration";
  private PlatformPaymentConfiguration platformPaymentConfiguration;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  private String timeZone;

  public BalanceAccountInfo() { 
  }

  public BalanceAccountInfo accountHolderId(String accountHolderId) {
    this.accountHolderId = accountHolderId;
    return this;
  }

   /**
   * The unique identifier of the [account holder](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/accountHolders__resParam_id) associated with the balance account.
   * @return accountHolderId
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the [account holder](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/post/accountHolders__resParam_id) associated with the balance account.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountHolderId() {
    return accountHolderId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountHolderId(String accountHolderId) {
    this.accountHolderId = accountHolderId;
  }


  public BalanceAccountInfo defaultCurrencyCode(String defaultCurrencyCode) {
    this.defaultCurrencyCode = defaultCurrencyCode;
    return this;
  }

   /**
   * The default three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) of the balance account. The default value is **EUR**. &gt; After a balance account is created, you cannot change its default currency.
   * @return defaultCurrencyCode
  **/
  @ApiModelProperty(value = "The default three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes) of the balance account. The default value is **EUR**. > After a balance account is created, you cannot change its default currency.")
  @JsonProperty(JSON_PROPERTY_DEFAULT_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultCurrencyCode() {
    return defaultCurrencyCode;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultCurrencyCode(String defaultCurrencyCode) {
    this.defaultCurrencyCode = defaultCurrencyCode;
  }


  public BalanceAccountInfo description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A human-readable description of the balance account, maximum 300 characters. You can use this parameter to distinguish between multiple balance accounts under an account holder.
   * @return description
  **/
  @ApiModelProperty(value = "A human-readable description of the balance account, maximum 300 characters. You can use this parameter to distinguish between multiple balance accounts under an account holder.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public BalanceAccountInfo metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public BalanceAccountInfo putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * A set of key and value pairs for general use. The keys do not have specific names and may be used for storing miscellaneous data as desired. &gt; Note that during an update of metadata, the omission of existing key-value pairs will result in the deletion of those key-value pairs.
   * @return metadata
  **/
  @ApiModelProperty(value = "A set of key and value pairs for general use. The keys do not have specific names and may be used for storing miscellaneous data as desired. > Note that during an update of metadata, the omission of existing key-value pairs will result in the deletion of those key-value pairs.")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public BalanceAccountInfo migratedAccountCode(String migratedAccountCode) {
    this.migratedAccountCode = migratedAccountCode;
    return this;
  }

   /**
   * The unique identifier of the account of the migrated account holder in the classic integration.
   * @return migratedAccountCode
  **/
  @ApiModelProperty(value = "The unique identifier of the account of the migrated account holder in the classic integration.")
  @JsonProperty(JSON_PROPERTY_MIGRATED_ACCOUNT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMigratedAccountCode() {
    return migratedAccountCode;
  }


  @JsonProperty(JSON_PROPERTY_MIGRATED_ACCOUNT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMigratedAccountCode(String migratedAccountCode) {
    this.migratedAccountCode = migratedAccountCode;
  }


  public BalanceAccountInfo platformPaymentConfiguration(PlatformPaymentConfiguration platformPaymentConfiguration) {
    this.platformPaymentConfiguration = platformPaymentConfiguration;
    return this;
  }

   /**
   * Get platformPaymentConfiguration
   * @return platformPaymentConfiguration
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLATFORM_PAYMENT_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PlatformPaymentConfiguration getPlatformPaymentConfiguration() {
    return platformPaymentConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM_PAYMENT_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatformPaymentConfiguration(PlatformPaymentConfiguration platformPaymentConfiguration) {
    this.platformPaymentConfiguration = platformPaymentConfiguration;
  }


  public BalanceAccountInfo reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the balance account, maximum 150 characters.
   * @return reference
  **/
  @ApiModelProperty(value = "Your reference for the balance account, maximum 150 characters.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }


  public BalanceAccountInfo timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * The time zone of the balance account. For example, **Europe/Amsterdam**. Defaults to the time zone of the account holder if no time zone is set. For possible values, see the [list of time zone codes](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).
   * @return timeZone
  **/
  @ApiModelProperty(value = "The time zone of the balance account. For example, **Europe/Amsterdam**. Defaults to the time zone of the account holder if no time zone is set. For possible values, see the [list of time zone codes](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones).")
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeZone() {
    return timeZone;
  }


  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  /**
   * Return true if this BalanceAccountInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceAccountInfo balanceAccountInfo = (BalanceAccountInfo) o;
    return Objects.equals(this.accountHolderId, balanceAccountInfo.accountHolderId) &&
        Objects.equals(this.defaultCurrencyCode, balanceAccountInfo.defaultCurrencyCode) &&
        Objects.equals(this.description, balanceAccountInfo.description) &&
        Objects.equals(this.metadata, balanceAccountInfo.metadata) &&
        Objects.equals(this.migratedAccountCode, balanceAccountInfo.migratedAccountCode) &&
        Objects.equals(this.platformPaymentConfiguration, balanceAccountInfo.platformPaymentConfiguration) &&
        Objects.equals(this.reference, balanceAccountInfo.reference) &&
        Objects.equals(this.timeZone, balanceAccountInfo.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolderId, defaultCurrencyCode, description, metadata, migratedAccountCode, platformPaymentConfiguration, reference, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceAccountInfo {\n");
    sb.append("    accountHolderId: ").append(toIndentedString(accountHolderId)).append("\n");
    sb.append("    defaultCurrencyCode: ").append(toIndentedString(defaultCurrencyCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    migratedAccountCode: ").append(toIndentedString(migratedAccountCode)).append("\n");
    sb.append("    platformPaymentConfiguration: ").append(toIndentedString(platformPaymentConfiguration)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
   * Create an instance of BalanceAccountInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BalanceAccountInfo
   * @throws JsonProcessingException if the JSON string is invalid with respect to BalanceAccountInfo
   */
  public static BalanceAccountInfo fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, BalanceAccountInfo.class);
  }
/**
  * Convert an instance of BalanceAccountInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

