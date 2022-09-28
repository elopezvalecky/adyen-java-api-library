/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 69
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.checkout.ThreeDSRequestData;
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

/**
 * AuthenticationData
 */

public class AuthenticationData {
  /**
   * Indicates when 3D Secure authentication should be attempted. This overrides all other rules, including [Dynamic 3D Secure settings](https://docs.adyen.com/risk-management/dynamic-3d-secure).  Possible values:  * **always**: Perform 3D Secure authentication. * **never**: Don&#39;t perform 3D Secure authentication. If PSD2 SCA or other national regulations require authentication, the transaction gets declined. * **preferNo**: Do not perform 3D Secure authentication if not required by PSD2 SCA or other national regulations.
   */
  @JsonAdapter(AttemptAuthenticationEnum.Adapter.class)
  public enum AttemptAuthenticationEnum {
    ALWAYS("always"),
    
    NEVER("never"),
    
    PREFERNO("preferNo");

    private String value;

    AttemptAuthenticationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AttemptAuthenticationEnum fromValue(String value) {
      for (AttemptAuthenticationEnum b : AttemptAuthenticationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AttemptAuthenticationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AttemptAuthenticationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AttemptAuthenticationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AttemptAuthenticationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ATTEMPT_AUTHENTICATION = "attemptAuthentication";
  @SerializedName(SERIALIZED_NAME_ATTEMPT_AUTHENTICATION)
  private AttemptAuthenticationEnum attemptAuthentication;

  public static final String SERIALIZED_NAME_AUTHENTICATION_ONLY = "authenticationOnly";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_ONLY)
  private Boolean authenticationOnly = false;

  public static final String SERIALIZED_NAME_THREE_D_S_REQUEST_DATA = "threeDSRequestData";
  @SerializedName(SERIALIZED_NAME_THREE_D_S_REQUEST_DATA)
  private ThreeDSRequestData threeDSRequestData;

  public AuthenticationData() { 
  }

  public AuthenticationData attemptAuthentication(AttemptAuthenticationEnum attemptAuthentication) {
    
    this.attemptAuthentication = attemptAuthentication;
    return this;
  }

   /**
   * Indicates when 3D Secure authentication should be attempted. This overrides all other rules, including [Dynamic 3D Secure settings](https://docs.adyen.com/risk-management/dynamic-3d-secure).  Possible values:  * **always**: Perform 3D Secure authentication. * **never**: Don&#39;t perform 3D Secure authentication. If PSD2 SCA or other national regulations require authentication, the transaction gets declined. * **preferNo**: Do not perform 3D Secure authentication if not required by PSD2 SCA or other national regulations.
   * @return attemptAuthentication
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates when 3D Secure authentication should be attempted. This overrides all other rules, including [Dynamic 3D Secure settings](https://docs.adyen.com/risk-management/dynamic-3d-secure).  Possible values:  * **always**: Perform 3D Secure authentication. * **never**: Don't perform 3D Secure authentication. If PSD2 SCA or other national regulations require authentication, the transaction gets declined. * **preferNo**: Do not perform 3D Secure authentication if not required by PSD2 SCA or other national regulations.")

  public AttemptAuthenticationEnum getAttemptAuthentication() {
    return attemptAuthentication;
  }


  public void setAttemptAuthentication(AttemptAuthenticationEnum attemptAuthentication) {
    this.attemptAuthentication = attemptAuthentication;
  }


  public AuthenticationData authenticationOnly(Boolean authenticationOnly) {
    
    this.authenticationOnly = authenticationOnly;
    return this;
  }

   /**
   * If set to true, you will only perform the [3D Secure 2 authentication](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only), and not the payment authorisation. Default: *false**.
   * @return authenticationOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set to true, you will only perform the [3D Secure 2 authentication](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only), and not the payment authorisation. Default: *false**.")

  public Boolean getAuthenticationOnly() {
    return authenticationOnly;
  }


  public void setAuthenticationOnly(Boolean authenticationOnly) {
    this.authenticationOnly = authenticationOnly;
  }


  public AuthenticationData threeDSRequestData(ThreeDSRequestData threeDSRequestData) {
    
    this.threeDSRequestData = threeDSRequestData;
    return this;
  }

   /**
   * Get threeDSRequestData
   * @return threeDSRequestData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ThreeDSRequestData getThreeDSRequestData() {
    return threeDSRequestData;
  }


  public void setThreeDSRequestData(ThreeDSRequestData threeDSRequestData) {
    this.threeDSRequestData = threeDSRequestData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationData authenticationData = (AuthenticationData) o;
    return Objects.equals(this.attemptAuthentication, authenticationData.attemptAuthentication) &&
        Objects.equals(this.authenticationOnly, authenticationData.authenticationOnly) &&
        Objects.equals(this.threeDSRequestData, authenticationData.threeDSRequestData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attemptAuthentication, authenticationOnly, threeDSRequestData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationData {\n");
    sb.append("    attemptAuthentication: ").append(toIndentedString(attemptAuthentication)).append("\n");
    sb.append("    authenticationOnly: ").append(toIndentedString(authenticationOnly)).append("\n");
    sb.append("    threeDSRequestData: ").append(toIndentedString(threeDSRequestData)).append("\n");
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
    openapiFields.add("attemptAuthentication");
    openapiFields.add("authenticationOnly");
    openapiFields.add("threeDSRequestData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthenticationData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuthenticationData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthenticationData is not found in the empty JSON string", AuthenticationData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AuthenticationData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthenticationData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("attemptAuthentication") != null && !jsonObj.get("attemptAuthentication").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attemptAuthentication` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attemptAuthentication").toString()));
      }
      // validate the optional field `threeDSRequestData`
      if (jsonObj.getAsJsonObject("threeDSRequestData") != null) {
        ThreeDSRequestData.validateJsonObject(jsonObj.getAsJsonObject("threeDSRequestData"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthenticationData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthenticationData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthenticationData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthenticationData.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthenticationData>() {
           @Override
           public void write(JsonWriter out, AuthenticationData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthenticationData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

}

