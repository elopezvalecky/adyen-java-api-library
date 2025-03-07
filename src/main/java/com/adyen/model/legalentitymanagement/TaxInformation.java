/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

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
 * TaxInformation
 */
@JsonPropertyOrder({
  TaxInformation.JSON_PROPERTY_COUNTRY,
  TaxInformation.JSON_PROPERTY_NUMBER,
  TaxInformation.JSON_PROPERTY_TYPE
})

public class TaxInformation {
  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_NUMBER = "number";
  private String number;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public TaxInformation() { 
  }

  public TaxInformation country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The two-letter [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code.
   * @return country
  **/
  @ApiModelProperty(value = "The two-letter [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code.")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(String country) {
    this.country = country;
  }


  public TaxInformation number(String number) {
    this.number = number;
    return this;
  }

   /**
   * The tax ID number (TIN) of the organization or individual.
   * @return number
  **/
  @ApiModelProperty(value = "The tax ID number (TIN) of the organization or individual.")
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNumber() {
    return number;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumber(String number) {
    this.number = number;
  }


  public TaxInformation type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The TIN type depending on the country where it was issued. Provide only for countries that have multiple tax IDs, such as Sweden, the UK, or the US. For example, provide **SSN**, **EIN**, or **ITIN** for the US.
   * @return type
  **/
  @ApiModelProperty(value = "The TIN type depending on the country where it was issued. Provide only for countries that have multiple tax IDs, such as Sweden, the UK, or the US. For example, provide **SSN**, **EIN**, or **ITIN** for the US.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Return true if this TaxInformation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxInformation taxInformation = (TaxInformation) o;
    return Objects.equals(this.country, taxInformation.country) &&
        Objects.equals(this.number, taxInformation.number) &&
        Objects.equals(this.type, taxInformation.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, number, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxInformation {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

/**
   * Create an instance of TaxInformation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TaxInformation
   * @throws JsonProcessingException if the JSON string is invalid with respect to TaxInformation
   */
  public static TaxInformation fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TaxInformation.class);
  }
/**
  * Convert an instance of TaxInformation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

