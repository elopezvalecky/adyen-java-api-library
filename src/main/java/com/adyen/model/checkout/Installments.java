/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

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
 * Installments
 */
@JsonPropertyOrder({
  Installments.JSON_PROPERTY_PLAN,
  Installments.JSON_PROPERTY_VALUE
})

public class Installments {
  /**
   * The installment plan, used for [card installments in Japan](https://docs.adyen.com/payment-methods/cards/credit-card-installments#make-a-payment-japan). By default, this is set to **regular**. Possible values: * **regular** * **revolving** 
   */
  public enum PlanEnum {
    REGULAR("regular"),
    
    REVOLVING("revolving");

    private String value;

    PlanEnum(String value) {
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
    public static PlanEnum fromValue(String value) {
      for (PlanEnum b : PlanEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PLAN = "plan";
  private PlanEnum plan;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Integer value;

  public Installments() { 
  }

  public Installments plan(PlanEnum plan) {
    this.plan = plan;
    return this;
  }

   /**
   * The installment plan, used for [card installments in Japan](https://docs.adyen.com/payment-methods/cards/credit-card-installments#make-a-payment-japan). By default, this is set to **regular**. Possible values: * **regular** * **revolving** 
   * @return plan
  **/
  @ApiModelProperty(value = "The installment plan, used for [card installments in Japan](https://docs.adyen.com/payment-methods/cards/credit-card-installments#make-a-payment-japan). By default, this is set to **regular**. Possible values: * **regular** * **revolving** ")
  @JsonProperty(JSON_PROPERTY_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PlanEnum getPlan() {
    return plan;
  }


  @JsonProperty(JSON_PROPERTY_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlan(PlanEnum plan) {
    this.plan = plan;
  }


  public Installments value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * Defines the number of installments. Its value needs to be greater than zero.  Usually, the maximum allowed number of installments is capped. For example, it may not be possible to split a payment in more than 24 installments. The acquirer sets this upper limit, so its value may vary.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Defines the number of installments. Its value needs to be greater than zero.  Usually, the maximum allowed number of installments is capped. For example, it may not be possible to split a payment in more than 24 installments. The acquirer sets this upper limit, so its value may vary.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(Integer value) {
    this.value = value;
  }


  /**
   * Return true if this Installments object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Installments installments = (Installments) o;
    return Objects.equals(this.plan, installments.plan) &&
        Objects.equals(this.value, installments.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plan, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Installments {\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
   * Create an instance of Installments given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Installments
   * @throws JsonProcessingException if the JSON string is invalid with respect to Installments
   */
  public static Installments fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Installments.class);
  }
/**
  * Convert an instance of Installments to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

