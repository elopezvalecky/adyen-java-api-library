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
import com.adyen.model.balanceplatform.CapitalBalance;
import com.adyen.model.balanceplatform.GrantLimit;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

import com.adyen.model.balanceplatform.JSON;

/**
 * CapitalGrantAccount
 */

public class CapitalGrantAccount {
  public static final String SERIALIZED_NAME_BALANCES = "balances";
  @SerializedName(SERIALIZED_NAME_BALANCES)
  private List<CapitalBalance> balances = null;

  public static final String SERIALIZED_NAME_FUNDING_BALANCE_ACCOUNT_ID = "fundingBalanceAccountId";
  @SerializedName(SERIALIZED_NAME_FUNDING_BALANCE_ACCOUNT_ID)
  private String fundingBalanceAccountId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LIMITS = "limits";
  @SerializedName(SERIALIZED_NAME_LIMITS)
  private List<GrantLimit> limits = null;

  public CapitalGrantAccount() { 
  }

  public CapitalGrantAccount balances(List<CapitalBalance> balances) {
    
    this.balances = balances;
    return this;
  }

  public CapitalGrantAccount addBalancesItem(CapitalBalance balancesItem) {
    if (this.balances == null) {
      this.balances = new ArrayList<>();
    }
    this.balances.add(balancesItem);
    return this;
  }

   /**
   * The balances of the grant account.
   * @return balances
  **/
  @ApiModelProperty(value = "The balances of the grant account.")

  public List<CapitalBalance> getBalances() {
    return balances;
  }


  public void setBalances(List<CapitalBalance> balances) {
    this.balances = balances;
  }


  public CapitalGrantAccount fundingBalanceAccountId(String fundingBalanceAccountId) {
    
    this.fundingBalanceAccountId = fundingBalanceAccountId;
    return this;
  }

   /**
   * The unique identifier of the balance account used to fund the grant.
   * @return fundingBalanceAccountId
  **/
  @ApiModelProperty(value = "The unique identifier of the balance account used to fund the grant.")

  public String getFundingBalanceAccountId() {
    return fundingBalanceAccountId;
  }


  public void setFundingBalanceAccountId(String fundingBalanceAccountId) {
    this.fundingBalanceAccountId = fundingBalanceAccountId;
  }


  public CapitalGrantAccount id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The identifier of the grant account.
   * @return id
  **/
  @ApiModelProperty(value = "The identifier of the grant account.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CapitalGrantAccount limits(List<GrantLimit> limits) {
    
    this.limits = limits;
    return this;
  }

  public CapitalGrantAccount addLimitsItem(GrantLimit limitsItem) {
    if (this.limits == null) {
      this.limits = new ArrayList<>();
    }
    this.limits.add(limitsItem);
    return this;
  }

   /**
   * The limits of the grant account.
   * @return limits
  **/
  @ApiModelProperty(value = "The limits of the grant account.")

  public List<GrantLimit> getLimits() {
    return limits;
  }


  public void setLimits(List<GrantLimit> limits) {
    this.limits = limits;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapitalGrantAccount capitalGrantAccount = (CapitalGrantAccount) o;
    return Objects.equals(this.balances, capitalGrantAccount.balances) &&
        Objects.equals(this.fundingBalanceAccountId, capitalGrantAccount.fundingBalanceAccountId) &&
        Objects.equals(this.id, capitalGrantAccount.id) &&
        Objects.equals(this.limits, capitalGrantAccount.limits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balances, fundingBalanceAccountId, id, limits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapitalGrantAccount {\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    fundingBalanceAccountId: ").append(toIndentedString(fundingBalanceAccountId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
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
    openapiFields.add("balances");
    openapiFields.add("fundingBalanceAccountId");
    openapiFields.add("id");
    openapiFields.add("limits");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    validateJsonObject(jsonObj, false);
  }
 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @param strictValidation reject (new) fields missing from the specifications
  * @throws IOException if the JSON Object is invalid with respect to CapitalGrantAccount
  */
  public static void validateJsonObject(JsonObject jsonObj, boolean strictValidation) throws IOException {
      if (jsonObj == null) {
        if (CapitalGrantAccount.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CapitalGrantAccount is not found in the empty JSON string", CapitalGrantAccount.openapiRequiredFields.toString()));
        }
      }
      if (strictValidation) {
          Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
          // check to see if the JSON string contains additional fields
          for (Entry<String, JsonElement> entry : entries) {
            if (!CapitalGrantAccount.openapiFields.contains(entry.getKey())) {
              throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CapitalGrantAccount` properties.", entry.getKey()));
            }
          }
      }
      JsonArray jsonArraybalances = jsonObj.getAsJsonArray("balances");
      if (jsonArraybalances != null) {
        // ensure the json data is an array
        if (!jsonObj.get("balances").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `balances` to be an array in the JSON string but got `%s`", jsonObj.get("balances").toString()));
        }

        // validate the optional field `balances` (array)
        for (int i = 0; i < jsonArraybalances.size(); i++) {
          CapitalBalance.validateJsonObject(jsonArraybalances.get(i).getAsJsonObject());
        }
      }
      // validate the optional field fundingBalanceAccountId
      if (jsonObj.get("fundingBalanceAccountId") != null && !jsonObj.get("fundingBalanceAccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fundingBalanceAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fundingBalanceAccountId").toString()));
      }
      // validate the optional field id
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      JsonArray jsonArraylimits = jsonObj.getAsJsonArray("limits");
      if (jsonArraylimits != null) {
        // ensure the json data is an array
        if (!jsonObj.get("limits").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `limits` to be an array in the JSON string but got `%s`", jsonObj.get("limits").toString()));
        }

        // validate the optional field `limits` (array)
        for (int i = 0; i < jsonArraylimits.size(); i++) {
          GrantLimit.validateJsonObject(jsonArraylimits.get(i).getAsJsonObject());
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CapitalGrantAccount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CapitalGrantAccount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CapitalGrantAccount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CapitalGrantAccount.class));

       return (TypeAdapter<T>) new TypeAdapter<CapitalGrantAccount>() {
           @Override
           public void write(JsonWriter out, CapitalGrantAccount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CapitalGrantAccount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CapitalGrantAccount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CapitalGrantAccount
  * @throws IOException if the JSON string is invalid with respect to CapitalGrantAccount
  */
  public static CapitalGrantAccount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CapitalGrantAccount.class);
  }

 /**
  * Convert an instance of CapitalGrantAccount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
