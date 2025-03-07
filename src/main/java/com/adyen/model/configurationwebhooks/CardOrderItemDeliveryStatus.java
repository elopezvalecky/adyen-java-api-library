/*
 * Configuration webhooks
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.configurationwebhooks;

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
 * CardOrderItemDeliveryStatus
 */
@JsonPropertyOrder({
  CardOrderItemDeliveryStatus.JSON_PROPERTY_ERROR_MESSAGE,
  CardOrderItemDeliveryStatus.JSON_PROPERTY_STATUS,
  CardOrderItemDeliveryStatus.JSON_PROPERTY_TRACKING_NUMBER
})

public class CardOrderItemDeliveryStatus {
  public static final String JSON_PROPERTY_ERROR_MESSAGE = "errorMessage";
  private String errorMessage;

  /**
   * Status of the delivery.
   */
  public enum StatusEnum {
    CREATED("created"),
    
    DELIVERED("delivered"),
    
    NOTAPPLICABLE("notApplicable"),
    
    PROCESSING("processing"),
    
    PRODUCED("produced"),
    
    REJECTED("rejected"),
    
    SHIPPED("shipped"),
    
    UNKNOWN("unknown");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_TRACKING_NUMBER = "trackingNumber";
  private String trackingNumber;

  public CardOrderItemDeliveryStatus() { 
  }

  public CardOrderItemDeliveryStatus errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Error message.
   * @return errorMessage
  **/
  @ApiModelProperty(value = "Error message.")
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorMessage() {
    return errorMessage;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public CardOrderItemDeliveryStatus status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the delivery.
   * @return status
  **/
  @ApiModelProperty(value = "Status of the delivery.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public CardOrderItemDeliveryStatus trackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

   /**
   * Tracking number of the delivery.
   * @return trackingNumber
  **/
  @ApiModelProperty(value = "Tracking number of the delivery.")
  @JsonProperty(JSON_PROPERTY_TRACKING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTrackingNumber() {
    return trackingNumber;
  }


  @JsonProperty(JSON_PROPERTY_TRACKING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }


  /**
   * Return true if this CardOrderItemDeliveryStatus object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardOrderItemDeliveryStatus cardOrderItemDeliveryStatus = (CardOrderItemDeliveryStatus) o;
    return Objects.equals(this.errorMessage, cardOrderItemDeliveryStatus.errorMessage) &&
        Objects.equals(this.status, cardOrderItemDeliveryStatus.status) &&
        Objects.equals(this.trackingNumber, cardOrderItemDeliveryStatus.trackingNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, status, trackingNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardOrderItemDeliveryStatus {\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
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
   * Create an instance of CardOrderItemDeliveryStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CardOrderItemDeliveryStatus
   * @throws JsonProcessingException if the JSON string is invalid with respect to CardOrderItemDeliveryStatus
   */
  public static CardOrderItemDeliveryStatus fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CardOrderItemDeliveryStatus.class);
  }
/**
  * Convert an instance of CardOrderItemDeliveryStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

