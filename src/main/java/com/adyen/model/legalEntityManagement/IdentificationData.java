/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalEntityManagement;

import java.util.Objects;
import java.util.Arrays;
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

import com.adyen.model.legalEntityManagement.JSON;

/**
 * IdentificationData
 */

public class IdentificationData {
  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiryDate";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private String expiryDate;

  public static final String SERIALIZED_NAME_ISSUER_COUNTRY = "issuerCountry";
  @SerializedName(SERIALIZED_NAME_ISSUER_COUNTRY)
  private String issuerCountry;

  public static final String SERIALIZED_NAME_ISSUER_STATE = "issuerState";
  @SerializedName(SERIALIZED_NAME_ISSUER_STATE)
  private String issuerState;

  public static final String SERIALIZED_NAME_NATIONAL_ID_EXEMPT = "nationalIdExempt";
  @SerializedName(SERIALIZED_NAME_NATIONAL_ID_EXEMPT)
  private Boolean nationalIdExempt;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  /**
   * Type of document, used when providing an ID number or uploading a document. The possible values depend on the legal entity type.  When providing ID numbers: * For **individual**, the &#x60;type&#x60; values can be **driversLicense**, **identityCard**, **nationalIdNumber**, or **passport**.  When uploading documents: * For **organization**, the &#x60;type&#x60; values can be **proofOfAddress**, **registrationDocument**, **vatDocument**, **proofOfOrganizationTaxInfo**, or **proofOfIndustry**.   * For **individual**, the &#x60;type&#x60; values can be **identityCard**, **driversLicense**, **passport**, **proofOfNationalIdNumber**, **proofOfResidency**, **proofOfIndustry**, or **proofOfIndividualTaxId**.  * For **soleProprietorship**, the &#x60;type&#x60; values can be **constitutionalDocument**, **proofOfAddress**, or **proofOfIndustry**.  * Use **bankStatement** to upload documents for a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id).
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BANKSTATEMENT("bankStatement"),
    
    DRIVERSLICENSE("driversLicense"),
    
    IDENTITYCARD("identityCard"),
    
    NATIONALIDNUMBER("nationalIdNumber"),
    
    PASSPORT("passport"),
    
    PROOFOFADDRESS("proofOfAddress"),
    
    PROOFOFNATIONALIDNUMBER("proofOfNationalIdNumber"),
    
    PROOFOFRESIDENCY("proofOfResidency"),
    
    REGISTRATIONDOCUMENT("registrationDocument"),
    
    VATDOCUMENT("vatDocument"),
    
    PROOFOFORGANIZATIONTAXINFO("proofOfOrganizationTaxInfo"),
    
    PROOFOFINDUSTRY("proofOfIndustry"),
    
    CONSTITUTIONALDOCUMENT("constitutionalDocument");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public IdentificationData() { 
  }

  public IdentificationData expiryDate(String expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * The expiry date of the document, in YYYY-MM-DD format.
   * @return expiryDate
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The expiry date of the document, in YYYY-MM-DD format.")

  public String getExpiryDate() {
    return expiryDate;
  }


  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }


  public IdentificationData issuerCountry(String issuerCountry) {
    
    this.issuerCountry = issuerCountry;
    return this;
  }

   /**
   * The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code where the document was issued. For example, **US**.
   * @return issuerCountry
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code where the document was issued. For example, **US**.")

  public String getIssuerCountry() {
    return issuerCountry;
  }


  public void setIssuerCountry(String issuerCountry) {
    this.issuerCountry = issuerCountry;
  }


  public IdentificationData issuerState(String issuerState) {
    
    this.issuerState = issuerState;
    return this;
  }

   /**
   * The state or province where the document was issued (AU only).
   * @return issuerState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state or province where the document was issued (AU only).")

  public String getIssuerState() {
    return issuerState;
  }


  public void setIssuerState(String issuerState) {
    this.issuerState = issuerState;
  }


  public IdentificationData nationalIdExempt(Boolean nationalIdExempt) {
    
    this.nationalIdExempt = nationalIdExempt;
    return this;
  }

   /**
   * Applies only to individuals in the US. Set to **true** if the individual does not have an SSN. To verify their identity, Adyen will require them to upload an ID document.
   * @return nationalIdExempt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Applies only to individuals in the US. Set to **true** if the individual does not have an SSN. To verify their identity, Adyen will require them to upload an ID document.")

  public Boolean getNationalIdExempt() {
    return nationalIdExempt;
  }


  public void setNationalIdExempt(Boolean nationalIdExempt) {
    this.nationalIdExempt = nationalIdExempt;
  }


  public IdentificationData number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * The number in the document.
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number in the document.")

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }


  public IdentificationData type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of document, used when providing an ID number or uploading a document. The possible values depend on the legal entity type.  When providing ID numbers: * For **individual**, the &#x60;type&#x60; values can be **driversLicense**, **identityCard**, **nationalIdNumber**, or **passport**.  When uploading documents: * For **organization**, the &#x60;type&#x60; values can be **proofOfAddress**, **registrationDocument**, **vatDocument**, **proofOfOrganizationTaxInfo**, or **proofOfIndustry**.   * For **individual**, the &#x60;type&#x60; values can be **identityCard**, **driversLicense**, **passport**, **proofOfNationalIdNumber**, **proofOfResidency**, **proofOfIndustry**, or **proofOfIndividualTaxId**.  * For **soleProprietorship**, the &#x60;type&#x60; values can be **constitutionalDocument**, **proofOfAddress**, or **proofOfIndustry**.  * Use **bankStatement** to upload documents for a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id).
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Type of document, used when providing an ID number or uploading a document. The possible values depend on the legal entity type.  When providing ID numbers: * For **individual**, the `type` values can be **driversLicense**, **identityCard**, **nationalIdNumber**, or **passport**.  When uploading documents: * For **organization**, the `type` values can be **proofOfAddress**, **registrationDocument**, **vatDocument**, **proofOfOrganizationTaxInfo**, or **proofOfIndustry**.   * For **individual**, the `type` values can be **identityCard**, **driversLicense**, **passport**, **proofOfNationalIdNumber**, **proofOfResidency**, **proofOfIndustry**, or **proofOfIndividualTaxId**.  * For **soleProprietorship**, the `type` values can be **constitutionalDocument**, **proofOfAddress**, or **proofOfIndustry**.  * Use **bankStatement** to upload documents for a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id).")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentificationData identificationData = (IdentificationData) o;
    return Objects.equals(this.expiryDate, identificationData.expiryDate) &&
        Objects.equals(this.issuerCountry, identificationData.issuerCountry) &&
        Objects.equals(this.issuerState, identificationData.issuerState) &&
        Objects.equals(this.nationalIdExempt, identificationData.nationalIdExempt) &&
        Objects.equals(this.number, identificationData.number) &&
        Objects.equals(this.type, identificationData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiryDate, issuerCountry, issuerState, nationalIdExempt, number, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificationData {\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    issuerCountry: ").append(toIndentedString(issuerCountry)).append("\n");
    sb.append("    issuerState: ").append(toIndentedString(issuerState)).append("\n");
    sb.append("    nationalIdExempt: ").append(toIndentedString(nationalIdExempt)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("expiryDate");
    openapiFields.add("issuerCountry");
    openapiFields.add("issuerState");
    openapiFields.add("nationalIdExempt");
    openapiFields.add("number");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IdentificationData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IdentificationData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IdentificationData is not found in the empty JSON string", IdentificationData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IdentificationData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IdentificationData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IdentificationData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field expiryDate
      if (jsonObj.get("expiryDate") != null && !jsonObj.get("expiryDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiryDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiryDate").toString()));
      }
      // validate the optional field issuerCountry
      if (jsonObj.get("issuerCountry") != null && !jsonObj.get("issuerCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerCountry").toString()));
      }
      // validate the optional field issuerState
      if (jsonObj.get("issuerState") != null && !jsonObj.get("issuerState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerState").toString()));
      }
      // validate the optional field number
      if (jsonObj.get("number") != null && !jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
      }
      // ensure the field type can be parsed to an enum value
      if (jsonObj.get("type") != null) {
        if(!jsonObj.get("type").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
        }
        TypeEnum.fromValue(jsonObj.get("type").getAsString());
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IdentificationData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IdentificationData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IdentificationData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IdentificationData.class));

       return (TypeAdapter<T>) new TypeAdapter<IdentificationData>() {
           @Override
           public void write(JsonWriter out, IdentificationData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IdentificationData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IdentificationData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IdentificationData
  * @throws IOException if the JSON string is invalid with respect to IdentificationData
  */
  public static IdentificationData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IdentificationData.class);
  }

 /**
  * Convert an instance of IdentificationData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

