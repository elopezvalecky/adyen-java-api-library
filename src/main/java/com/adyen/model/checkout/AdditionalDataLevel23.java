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
 * AdditionalDataLevel23
 */

public class AdditionalDataLevel23 {
  public static final String SERIALIZED_NAME_ENHANCED_SCHEME_DATA_CUSTOMER_REFERENCE = "enhancedSchemeData.customerReference";
  @SerializedName(SERIALIZED_NAME_ENHANCED_SCHEME_DATA_CUSTOMER_REFERENCE)
  private String enhancedSchemeDataCustomerReference;

  public static final String SERIALIZED_NAME_ENHANCED_SCHEME_DATA_DESTINATION_COUNTRY_CODE = "enhancedSchemeData.destinationCountryCode";
  @SerializedName(SERIALIZED_NAME_ENHANCED_SCHEME_DATA_DESTINATION_COUNTRY_CODE)
  private String enhancedSchemeDataDestinationCountryCode;

  public static final String SERIALIZED_NAME_ENHANCED_SCHEME_DATA_DESTINATION_POSTAL_CODE = "enhancedSchemeData.destinationPostalCode";
  @SerializedName(SERIALIZED_NAME_ENHANCED_SCHEME_DATA_DESTINATION_POSTAL_CODE)
  private String enhancedSchemeDataDestinationPostalCode;

  public static final String SERIALIZED_NAME_ENHANCED_SCHEME_DATA_DESTINATION_STATE_PROVINCE_CODE = "enhancedSchemeData.destinationStateProvinceCode";
  @SerializedName(SERIALIZED_NAME_ENHANCED_SCHEME_DATA_DESTINATION_STATE_PROVINCE_CODE)
  private String enhancedSchemeDataDestinationStateProvinceCode;

  public static final String SERIALIZED_NAME_ENHANCED_SCHEME_DATA_DUTY_AMOUNT = "enhancedSchemeData.dutyAmount";
  @SerializedName(SERIALIZED_NAME_ENHANCED_SCHEME_DATA_DUTY_AMOUNT)
  private String enhancedSchemeDataDutyAmount;

  public static final String SERIALIZED_NAME_ENHANCED_SCHEME_DATA_FREIGHT_AMOUNT = "enhancedSchemeData.freightAmount";
  @SerializedName(SERIALIZED_NAME_ENHANCED_SCHEME_DATA_FREIGHT_AMOUNT)
  private String enhancedSchemeDataFreightAmount;

  public static final String SERIALIZED_NAME_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_COMMODITY_CODE = "enhancedSchemeData.itemDetailLine[itemNr].commodityCode";
  @SerializedName(SERIALIZED_NAME_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_COMMODITY_CODE)
  private String enhancedSchemeDataItemDetailLineItemNrCommodityCode;

  public static final String SERIALIZED_NAME_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_DESCRIPTION = "enhancedSchemeData.itemDetailLine[itemNr].description";
  @SerializedName(SERIALIZED_NAME_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_DESCRIPTION)
  private String enhancedSchemeDataItemDetailLineItemNrDescription;

  public static final String SERIALIZED_NAME_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_DISCOUNT_AMOUNT = "enhancedSchemeData.itemDetailLine[itemNr].discountAmount";
  @SerializedName(SERIALIZED_NAME_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_DISCOUNT_AMOUNT)
  private String enhancedSchemeDataItemDetailLineItemNrDiscountAmount;

  public static final String SERIALIZED_NAME_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_PRODUCT_CODE = "enhancedSchemeData.itemDetailLine[itemNr].productCode";
  @SerializedName(SERIALIZED_NAME_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_PRODUCT_CODE)
  private String enhancedSchemeDataItemDetailLineItemNrProductCode;

  public static final String SERIALIZED_NAME_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_QUANTITY = "enhancedSchemeData.itemDetailLine[itemNr].quantity";
  @SerializedName(SERIALIZED_NAME_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_QUANTITY)
  private String enhancedSchemeDataItemDetailLineItemNrQuantity;

  public static final String SERIALIZED_NAME_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_TOTAL_AMOUNT = "enhancedSchemeData.itemDetailLine[itemNr].totalAmount";
  @SerializedName(SERIALIZED_NAME_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_TOTAL_AMOUNT)
  private String enhancedSchemeDataItemDetailLineItemNrTotalAmount;

  public static final String SERIALIZED_NAME_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_UNIT_OF_MEASURE = "enhancedSchemeData.itemDetailLine[itemNr].unitOfMeasure";
  @SerializedName(SERIALIZED_NAME_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_UNIT_OF_MEASURE)
  private String enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure;

  public static final String SERIALIZED_NAME_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_UNIT_PRICE = "enhancedSchemeData.itemDetailLine[itemNr].unitPrice";
  @SerializedName(SERIALIZED_NAME_ENHANCED_SCHEME_DATA_ITEM_DETAIL_LINE_ITEM_NR_UNIT_PRICE)
  private String enhancedSchemeDataItemDetailLineItemNrUnitPrice;

  public static final String SERIALIZED_NAME_ENHANCED_SCHEME_DATA_ORDER_DATE = "enhancedSchemeData.orderDate";
  @SerializedName(SERIALIZED_NAME_ENHANCED_SCHEME_DATA_ORDER_DATE)
  private String enhancedSchemeDataOrderDate;

  public static final String SERIALIZED_NAME_ENHANCED_SCHEME_DATA_SHIP_FROM_POSTAL_CODE = "enhancedSchemeData.shipFromPostalCode";
  @SerializedName(SERIALIZED_NAME_ENHANCED_SCHEME_DATA_SHIP_FROM_POSTAL_CODE)
  private String enhancedSchemeDataShipFromPostalCode;

  public static final String SERIALIZED_NAME_ENHANCED_SCHEME_DATA_TOTAL_TAX_AMOUNT = "enhancedSchemeData.totalTaxAmount";
  @SerializedName(SERIALIZED_NAME_ENHANCED_SCHEME_DATA_TOTAL_TAX_AMOUNT)
  private String enhancedSchemeDataTotalTaxAmount;

  public AdditionalDataLevel23() { 
  }

  public AdditionalDataLevel23 enhancedSchemeDataCustomerReference(String enhancedSchemeDataCustomerReference) {
    
    this.enhancedSchemeDataCustomerReference = enhancedSchemeDataCustomerReference;
    return this;
  }

   /**
   * Customer code, if supplied by a customer.  Encoding: ASCII.  Max length: 25 characters.  &gt; Required for Level 2 and Level 3 data.
   * @return enhancedSchemeDataCustomerReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Customer code, if supplied by a customer.  Encoding: ASCII.  Max length: 25 characters.  > Required for Level 2 and Level 3 data.")

  public String getEnhancedSchemeDataCustomerReference() {
    return enhancedSchemeDataCustomerReference;
  }


  public void setEnhancedSchemeDataCustomerReference(String enhancedSchemeDataCustomerReference) {
    this.enhancedSchemeDataCustomerReference = enhancedSchemeDataCustomerReference;
  }


  public AdditionalDataLevel23 enhancedSchemeDataDestinationCountryCode(String enhancedSchemeDataDestinationCountryCode) {
    
    this.enhancedSchemeDataDestinationCountryCode = enhancedSchemeDataDestinationCountryCode;
    return this;
  }

   /**
   * Destination country code.  Encoding: ASCII.  Max length: 3 characters.
   * @return enhancedSchemeDataDestinationCountryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Destination country code.  Encoding: ASCII.  Max length: 3 characters.")

  public String getEnhancedSchemeDataDestinationCountryCode() {
    return enhancedSchemeDataDestinationCountryCode;
  }


  public void setEnhancedSchemeDataDestinationCountryCode(String enhancedSchemeDataDestinationCountryCode) {
    this.enhancedSchemeDataDestinationCountryCode = enhancedSchemeDataDestinationCountryCode;
  }


  public AdditionalDataLevel23 enhancedSchemeDataDestinationPostalCode(String enhancedSchemeDataDestinationPostalCode) {
    
    this.enhancedSchemeDataDestinationPostalCode = enhancedSchemeDataDestinationPostalCode;
    return this;
  }

   /**
   * The postal code of a destination address.  Encoding: ASCII.  Max length: 10 characters.  &gt; Required for American Express.
   * @return enhancedSchemeDataDestinationPostalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The postal code of a destination address.  Encoding: ASCII.  Max length: 10 characters.  > Required for American Express.")

  public String getEnhancedSchemeDataDestinationPostalCode() {
    return enhancedSchemeDataDestinationPostalCode;
  }


  public void setEnhancedSchemeDataDestinationPostalCode(String enhancedSchemeDataDestinationPostalCode) {
    this.enhancedSchemeDataDestinationPostalCode = enhancedSchemeDataDestinationPostalCode;
  }


  public AdditionalDataLevel23 enhancedSchemeDataDestinationStateProvinceCode(String enhancedSchemeDataDestinationStateProvinceCode) {
    
    this.enhancedSchemeDataDestinationStateProvinceCode = enhancedSchemeDataDestinationStateProvinceCode;
    return this;
  }

   /**
   * Destination state or province code.  Encoding: ASCII.Max length: 3 characters.
   * @return enhancedSchemeDataDestinationStateProvinceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Destination state or province code.  Encoding: ASCII.Max length: 3 characters.")

  public String getEnhancedSchemeDataDestinationStateProvinceCode() {
    return enhancedSchemeDataDestinationStateProvinceCode;
  }


  public void setEnhancedSchemeDataDestinationStateProvinceCode(String enhancedSchemeDataDestinationStateProvinceCode) {
    this.enhancedSchemeDataDestinationStateProvinceCode = enhancedSchemeDataDestinationStateProvinceCode;
  }


  public AdditionalDataLevel23 enhancedSchemeDataDutyAmount(String enhancedSchemeDataDutyAmount) {
    
    this.enhancedSchemeDataDutyAmount = enhancedSchemeDataDutyAmount;
    return this;
  }

   /**
   * Duty amount, in minor units.  For example, 2000 means USD 20.00.  Max length: 12 characters.
   * @return enhancedSchemeDataDutyAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Duty amount, in minor units.  For example, 2000 means USD 20.00.  Max length: 12 characters.")

  public String getEnhancedSchemeDataDutyAmount() {
    return enhancedSchemeDataDutyAmount;
  }


  public void setEnhancedSchemeDataDutyAmount(String enhancedSchemeDataDutyAmount) {
    this.enhancedSchemeDataDutyAmount = enhancedSchemeDataDutyAmount;
  }


  public AdditionalDataLevel23 enhancedSchemeDataFreightAmount(String enhancedSchemeDataFreightAmount) {
    
    this.enhancedSchemeDataFreightAmount = enhancedSchemeDataFreightAmount;
    return this;
  }

   /**
   * Shipping amount, in minor units.  For example, 2000 means USD 20.00.  Max length: 12 characters.
   * @return enhancedSchemeDataFreightAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shipping amount, in minor units.  For example, 2000 means USD 20.00.  Max length: 12 characters.")

  public String getEnhancedSchemeDataFreightAmount() {
    return enhancedSchemeDataFreightAmount;
  }


  public void setEnhancedSchemeDataFreightAmount(String enhancedSchemeDataFreightAmount) {
    this.enhancedSchemeDataFreightAmount = enhancedSchemeDataFreightAmount;
  }


  public AdditionalDataLevel23 enhancedSchemeDataItemDetailLineItemNrCommodityCode(String enhancedSchemeDataItemDetailLineItemNrCommodityCode) {
    
    this.enhancedSchemeDataItemDetailLineItemNrCommodityCode = enhancedSchemeDataItemDetailLineItemNrCommodityCode;
    return this;
  }

   /**
   * Item commodity code.  Encoding: ASCII.  Max length: 12 characters.
   * @return enhancedSchemeDataItemDetailLineItemNrCommodityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Item commodity code.  Encoding: ASCII.  Max length: 12 characters.")

  public String getEnhancedSchemeDataItemDetailLineItemNrCommodityCode() {
    return enhancedSchemeDataItemDetailLineItemNrCommodityCode;
  }


  public void setEnhancedSchemeDataItemDetailLineItemNrCommodityCode(String enhancedSchemeDataItemDetailLineItemNrCommodityCode) {
    this.enhancedSchemeDataItemDetailLineItemNrCommodityCode = enhancedSchemeDataItemDetailLineItemNrCommodityCode;
  }


  public AdditionalDataLevel23 enhancedSchemeDataItemDetailLineItemNrDescription(String enhancedSchemeDataItemDetailLineItemNrDescription) {
    
    this.enhancedSchemeDataItemDetailLineItemNrDescription = enhancedSchemeDataItemDetailLineItemNrDescription;
    return this;
  }

   /**
   * Item description.  Encoding: ASCII.  Max length: 26 characters.
   * @return enhancedSchemeDataItemDetailLineItemNrDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Item description.  Encoding: ASCII.  Max length: 26 characters.")

  public String getEnhancedSchemeDataItemDetailLineItemNrDescription() {
    return enhancedSchemeDataItemDetailLineItemNrDescription;
  }


  public void setEnhancedSchemeDataItemDetailLineItemNrDescription(String enhancedSchemeDataItemDetailLineItemNrDescription) {
    this.enhancedSchemeDataItemDetailLineItemNrDescription = enhancedSchemeDataItemDetailLineItemNrDescription;
  }


  public AdditionalDataLevel23 enhancedSchemeDataItemDetailLineItemNrDiscountAmount(String enhancedSchemeDataItemDetailLineItemNrDiscountAmount) {
    
    this.enhancedSchemeDataItemDetailLineItemNrDiscountAmount = enhancedSchemeDataItemDetailLineItemNrDiscountAmount;
    return this;
  }

   /**
   * Discount amount, in minor units.  For example, 2000 means USD 20.00.  Max length: 12 characters.
   * @return enhancedSchemeDataItemDetailLineItemNrDiscountAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Discount amount, in minor units.  For example, 2000 means USD 20.00.  Max length: 12 characters.")

  public String getEnhancedSchemeDataItemDetailLineItemNrDiscountAmount() {
    return enhancedSchemeDataItemDetailLineItemNrDiscountAmount;
  }


  public void setEnhancedSchemeDataItemDetailLineItemNrDiscountAmount(String enhancedSchemeDataItemDetailLineItemNrDiscountAmount) {
    this.enhancedSchemeDataItemDetailLineItemNrDiscountAmount = enhancedSchemeDataItemDetailLineItemNrDiscountAmount;
  }


  public AdditionalDataLevel23 enhancedSchemeDataItemDetailLineItemNrProductCode(String enhancedSchemeDataItemDetailLineItemNrProductCode) {
    
    this.enhancedSchemeDataItemDetailLineItemNrProductCode = enhancedSchemeDataItemDetailLineItemNrProductCode;
    return this;
  }

   /**
   * Product code.  Encoding: ASCII.  Max length: 12 characters.
   * @return enhancedSchemeDataItemDetailLineItemNrProductCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Product code.  Encoding: ASCII.  Max length: 12 characters.")

  public String getEnhancedSchemeDataItemDetailLineItemNrProductCode() {
    return enhancedSchemeDataItemDetailLineItemNrProductCode;
  }


  public void setEnhancedSchemeDataItemDetailLineItemNrProductCode(String enhancedSchemeDataItemDetailLineItemNrProductCode) {
    this.enhancedSchemeDataItemDetailLineItemNrProductCode = enhancedSchemeDataItemDetailLineItemNrProductCode;
  }


  public AdditionalDataLevel23 enhancedSchemeDataItemDetailLineItemNrQuantity(String enhancedSchemeDataItemDetailLineItemNrQuantity) {
    
    this.enhancedSchemeDataItemDetailLineItemNrQuantity = enhancedSchemeDataItemDetailLineItemNrQuantity;
    return this;
  }

   /**
   * Quantity, specified as an integer value.  Value must be greater than 0.  Max length: 12 characters.
   * @return enhancedSchemeDataItemDetailLineItemNrQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Quantity, specified as an integer value.  Value must be greater than 0.  Max length: 12 characters.")

  public String getEnhancedSchemeDataItemDetailLineItemNrQuantity() {
    return enhancedSchemeDataItemDetailLineItemNrQuantity;
  }


  public void setEnhancedSchemeDataItemDetailLineItemNrQuantity(String enhancedSchemeDataItemDetailLineItemNrQuantity) {
    this.enhancedSchemeDataItemDetailLineItemNrQuantity = enhancedSchemeDataItemDetailLineItemNrQuantity;
  }


  public AdditionalDataLevel23 enhancedSchemeDataItemDetailLineItemNrTotalAmount(String enhancedSchemeDataItemDetailLineItemNrTotalAmount) {
    
    this.enhancedSchemeDataItemDetailLineItemNrTotalAmount = enhancedSchemeDataItemDetailLineItemNrTotalAmount;
    return this;
  }

   /**
   * Total amount, in minor units.  For example, 2000 means USD 20.00.  Max length: 12 characters.
   * @return enhancedSchemeDataItemDetailLineItemNrTotalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total amount, in minor units.  For example, 2000 means USD 20.00.  Max length: 12 characters.")

  public String getEnhancedSchemeDataItemDetailLineItemNrTotalAmount() {
    return enhancedSchemeDataItemDetailLineItemNrTotalAmount;
  }


  public void setEnhancedSchemeDataItemDetailLineItemNrTotalAmount(String enhancedSchemeDataItemDetailLineItemNrTotalAmount) {
    this.enhancedSchemeDataItemDetailLineItemNrTotalAmount = enhancedSchemeDataItemDetailLineItemNrTotalAmount;
  }


  public AdditionalDataLevel23 enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure(String enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure) {
    
    this.enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure = enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure;
    return this;
  }

   /**
   * Item unit of measurement.  Encoding: ASCII.  Max length: 3 characters.
   * @return enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Item unit of measurement.  Encoding: ASCII.  Max length: 3 characters.")

  public String getEnhancedSchemeDataItemDetailLineItemNrUnitOfMeasure() {
    return enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure;
  }


  public void setEnhancedSchemeDataItemDetailLineItemNrUnitOfMeasure(String enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure) {
    this.enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure = enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure;
  }


  public AdditionalDataLevel23 enhancedSchemeDataItemDetailLineItemNrUnitPrice(String enhancedSchemeDataItemDetailLineItemNrUnitPrice) {
    
    this.enhancedSchemeDataItemDetailLineItemNrUnitPrice = enhancedSchemeDataItemDetailLineItemNrUnitPrice;
    return this;
  }

   /**
   * Unit price, specified in [minor units](https://docs.adyen.com/development-resources/currency-codes).  Max length: 12 characters.
   * @return enhancedSchemeDataItemDetailLineItemNrUnitPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unit price, specified in [minor units](https://docs.adyen.com/development-resources/currency-codes).  Max length: 12 characters.")

  public String getEnhancedSchemeDataItemDetailLineItemNrUnitPrice() {
    return enhancedSchemeDataItemDetailLineItemNrUnitPrice;
  }


  public void setEnhancedSchemeDataItemDetailLineItemNrUnitPrice(String enhancedSchemeDataItemDetailLineItemNrUnitPrice) {
    this.enhancedSchemeDataItemDetailLineItemNrUnitPrice = enhancedSchemeDataItemDetailLineItemNrUnitPrice;
  }


  public AdditionalDataLevel23 enhancedSchemeDataOrderDate(String enhancedSchemeDataOrderDate) {
    
    this.enhancedSchemeDataOrderDate = enhancedSchemeDataOrderDate;
    return this;
  }

   /**
   * Order date. * Format: &#x60;ddMMyy&#x60;  Encoding: ASCII.  Max length: 6 characters.
   * @return enhancedSchemeDataOrderDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Order date. * Format: `ddMMyy`  Encoding: ASCII.  Max length: 6 characters.")

  public String getEnhancedSchemeDataOrderDate() {
    return enhancedSchemeDataOrderDate;
  }


  public void setEnhancedSchemeDataOrderDate(String enhancedSchemeDataOrderDate) {
    this.enhancedSchemeDataOrderDate = enhancedSchemeDataOrderDate;
  }


  public AdditionalDataLevel23 enhancedSchemeDataShipFromPostalCode(String enhancedSchemeDataShipFromPostalCode) {
    
    this.enhancedSchemeDataShipFromPostalCode = enhancedSchemeDataShipFromPostalCode;
    return this;
  }

   /**
   * The postal code of a \&quot;ship-from\&quot; address.  Encoding: ASCII.  Max length: 10 characters.
   * @return enhancedSchemeDataShipFromPostalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The postal code of a \"ship-from\" address.  Encoding: ASCII.  Max length: 10 characters.")

  public String getEnhancedSchemeDataShipFromPostalCode() {
    return enhancedSchemeDataShipFromPostalCode;
  }


  public void setEnhancedSchemeDataShipFromPostalCode(String enhancedSchemeDataShipFromPostalCode) {
    this.enhancedSchemeDataShipFromPostalCode = enhancedSchemeDataShipFromPostalCode;
  }


  public AdditionalDataLevel23 enhancedSchemeDataTotalTaxAmount(String enhancedSchemeDataTotalTaxAmount) {
    
    this.enhancedSchemeDataTotalTaxAmount = enhancedSchemeDataTotalTaxAmount;
    return this;
  }

   /**
   * Total tax amount, in minor units.  For example, 2000 means USD 20.00.  Max length: 12 characters.  &gt; Required for Level 2 and Level 3 data.
   * @return enhancedSchemeDataTotalTaxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total tax amount, in minor units.  For example, 2000 means USD 20.00.  Max length: 12 characters.  > Required for Level 2 and Level 3 data.")

  public String getEnhancedSchemeDataTotalTaxAmount() {
    return enhancedSchemeDataTotalTaxAmount;
  }


  public void setEnhancedSchemeDataTotalTaxAmount(String enhancedSchemeDataTotalTaxAmount) {
    this.enhancedSchemeDataTotalTaxAmount = enhancedSchemeDataTotalTaxAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalDataLevel23 additionalDataLevel23 = (AdditionalDataLevel23) o;
    return Objects.equals(this.enhancedSchemeDataCustomerReference, additionalDataLevel23.enhancedSchemeDataCustomerReference) &&
        Objects.equals(this.enhancedSchemeDataDestinationCountryCode, additionalDataLevel23.enhancedSchemeDataDestinationCountryCode) &&
        Objects.equals(this.enhancedSchemeDataDestinationPostalCode, additionalDataLevel23.enhancedSchemeDataDestinationPostalCode) &&
        Objects.equals(this.enhancedSchemeDataDestinationStateProvinceCode, additionalDataLevel23.enhancedSchemeDataDestinationStateProvinceCode) &&
        Objects.equals(this.enhancedSchemeDataDutyAmount, additionalDataLevel23.enhancedSchemeDataDutyAmount) &&
        Objects.equals(this.enhancedSchemeDataFreightAmount, additionalDataLevel23.enhancedSchemeDataFreightAmount) &&
        Objects.equals(this.enhancedSchemeDataItemDetailLineItemNrCommodityCode, additionalDataLevel23.enhancedSchemeDataItemDetailLineItemNrCommodityCode) &&
        Objects.equals(this.enhancedSchemeDataItemDetailLineItemNrDescription, additionalDataLevel23.enhancedSchemeDataItemDetailLineItemNrDescription) &&
        Objects.equals(this.enhancedSchemeDataItemDetailLineItemNrDiscountAmount, additionalDataLevel23.enhancedSchemeDataItemDetailLineItemNrDiscountAmount) &&
        Objects.equals(this.enhancedSchemeDataItemDetailLineItemNrProductCode, additionalDataLevel23.enhancedSchemeDataItemDetailLineItemNrProductCode) &&
        Objects.equals(this.enhancedSchemeDataItemDetailLineItemNrQuantity, additionalDataLevel23.enhancedSchemeDataItemDetailLineItemNrQuantity) &&
        Objects.equals(this.enhancedSchemeDataItemDetailLineItemNrTotalAmount, additionalDataLevel23.enhancedSchemeDataItemDetailLineItemNrTotalAmount) &&
        Objects.equals(this.enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure, additionalDataLevel23.enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure) &&
        Objects.equals(this.enhancedSchemeDataItemDetailLineItemNrUnitPrice, additionalDataLevel23.enhancedSchemeDataItemDetailLineItemNrUnitPrice) &&
        Objects.equals(this.enhancedSchemeDataOrderDate, additionalDataLevel23.enhancedSchemeDataOrderDate) &&
        Objects.equals(this.enhancedSchemeDataShipFromPostalCode, additionalDataLevel23.enhancedSchemeDataShipFromPostalCode) &&
        Objects.equals(this.enhancedSchemeDataTotalTaxAmount, additionalDataLevel23.enhancedSchemeDataTotalTaxAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enhancedSchemeDataCustomerReference, enhancedSchemeDataDestinationCountryCode, enhancedSchemeDataDestinationPostalCode, enhancedSchemeDataDestinationStateProvinceCode, enhancedSchemeDataDutyAmount, enhancedSchemeDataFreightAmount, enhancedSchemeDataItemDetailLineItemNrCommodityCode, enhancedSchemeDataItemDetailLineItemNrDescription, enhancedSchemeDataItemDetailLineItemNrDiscountAmount, enhancedSchemeDataItemDetailLineItemNrProductCode, enhancedSchemeDataItemDetailLineItemNrQuantity, enhancedSchemeDataItemDetailLineItemNrTotalAmount, enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure, enhancedSchemeDataItemDetailLineItemNrUnitPrice, enhancedSchemeDataOrderDate, enhancedSchemeDataShipFromPostalCode, enhancedSchemeDataTotalTaxAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalDataLevel23 {\n");
    sb.append("    enhancedSchemeDataCustomerReference: ").append(toIndentedString(enhancedSchemeDataCustomerReference)).append("\n");
    sb.append("    enhancedSchemeDataDestinationCountryCode: ").append(toIndentedString(enhancedSchemeDataDestinationCountryCode)).append("\n");
    sb.append("    enhancedSchemeDataDestinationPostalCode: ").append(toIndentedString(enhancedSchemeDataDestinationPostalCode)).append("\n");
    sb.append("    enhancedSchemeDataDestinationStateProvinceCode: ").append(toIndentedString(enhancedSchemeDataDestinationStateProvinceCode)).append("\n");
    sb.append("    enhancedSchemeDataDutyAmount: ").append(toIndentedString(enhancedSchemeDataDutyAmount)).append("\n");
    sb.append("    enhancedSchemeDataFreightAmount: ").append(toIndentedString(enhancedSchemeDataFreightAmount)).append("\n");
    sb.append("    enhancedSchemeDataItemDetailLineItemNrCommodityCode: ").append(toIndentedString(enhancedSchemeDataItemDetailLineItemNrCommodityCode)).append("\n");
    sb.append("    enhancedSchemeDataItemDetailLineItemNrDescription: ").append(toIndentedString(enhancedSchemeDataItemDetailLineItemNrDescription)).append("\n");
    sb.append("    enhancedSchemeDataItemDetailLineItemNrDiscountAmount: ").append(toIndentedString(enhancedSchemeDataItemDetailLineItemNrDiscountAmount)).append("\n");
    sb.append("    enhancedSchemeDataItemDetailLineItemNrProductCode: ").append(toIndentedString(enhancedSchemeDataItemDetailLineItemNrProductCode)).append("\n");
    sb.append("    enhancedSchemeDataItemDetailLineItemNrQuantity: ").append(toIndentedString(enhancedSchemeDataItemDetailLineItemNrQuantity)).append("\n");
    sb.append("    enhancedSchemeDataItemDetailLineItemNrTotalAmount: ").append(toIndentedString(enhancedSchemeDataItemDetailLineItemNrTotalAmount)).append("\n");
    sb.append("    enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure: ").append(toIndentedString(enhancedSchemeDataItemDetailLineItemNrUnitOfMeasure)).append("\n");
    sb.append("    enhancedSchemeDataItemDetailLineItemNrUnitPrice: ").append(toIndentedString(enhancedSchemeDataItemDetailLineItemNrUnitPrice)).append("\n");
    sb.append("    enhancedSchemeDataOrderDate: ").append(toIndentedString(enhancedSchemeDataOrderDate)).append("\n");
    sb.append("    enhancedSchemeDataShipFromPostalCode: ").append(toIndentedString(enhancedSchemeDataShipFromPostalCode)).append("\n");
    sb.append("    enhancedSchemeDataTotalTaxAmount: ").append(toIndentedString(enhancedSchemeDataTotalTaxAmount)).append("\n");
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
    openapiFields.add("enhancedSchemeData.customerReference");
    openapiFields.add("enhancedSchemeData.destinationCountryCode");
    openapiFields.add("enhancedSchemeData.destinationPostalCode");
    openapiFields.add("enhancedSchemeData.destinationStateProvinceCode");
    openapiFields.add("enhancedSchemeData.dutyAmount");
    openapiFields.add("enhancedSchemeData.freightAmount");
    openapiFields.add("enhancedSchemeData.itemDetailLine[itemNr].commodityCode");
    openapiFields.add("enhancedSchemeData.itemDetailLine[itemNr].description");
    openapiFields.add("enhancedSchemeData.itemDetailLine[itemNr].discountAmount");
    openapiFields.add("enhancedSchemeData.itemDetailLine[itemNr].productCode");
    openapiFields.add("enhancedSchemeData.itemDetailLine[itemNr].quantity");
    openapiFields.add("enhancedSchemeData.itemDetailLine[itemNr].totalAmount");
    openapiFields.add("enhancedSchemeData.itemDetailLine[itemNr].unitOfMeasure");
    openapiFields.add("enhancedSchemeData.itemDetailLine[itemNr].unitPrice");
    openapiFields.add("enhancedSchemeData.orderDate");
    openapiFields.add("enhancedSchemeData.shipFromPostalCode");
    openapiFields.add("enhancedSchemeData.totalTaxAmount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdditionalDataLevel23
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AdditionalDataLevel23.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdditionalDataLevel23 is not found in the empty JSON string", AdditionalDataLevel23.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AdditionalDataLevel23.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdditionalDataLevel23` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("enhancedSchemeData.customerReference") != null && !jsonObj.get("enhancedSchemeData.customerReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enhancedSchemeData.customerReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enhancedSchemeData.customerReference").toString()));
      }
      if (jsonObj.get("enhancedSchemeData.destinationCountryCode") != null && !jsonObj.get("enhancedSchemeData.destinationCountryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enhancedSchemeData.destinationCountryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enhancedSchemeData.destinationCountryCode").toString()));
      }
      if (jsonObj.get("enhancedSchemeData.destinationPostalCode") != null && !jsonObj.get("enhancedSchemeData.destinationPostalCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enhancedSchemeData.destinationPostalCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enhancedSchemeData.destinationPostalCode").toString()));
      }
      if (jsonObj.get("enhancedSchemeData.destinationStateProvinceCode") != null && !jsonObj.get("enhancedSchemeData.destinationStateProvinceCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enhancedSchemeData.destinationStateProvinceCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enhancedSchemeData.destinationStateProvinceCode").toString()));
      }
      if (jsonObj.get("enhancedSchemeData.dutyAmount") != null && !jsonObj.get("enhancedSchemeData.dutyAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enhancedSchemeData.dutyAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enhancedSchemeData.dutyAmount").toString()));
      }
      if (jsonObj.get("enhancedSchemeData.freightAmount") != null && !jsonObj.get("enhancedSchemeData.freightAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enhancedSchemeData.freightAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enhancedSchemeData.freightAmount").toString()));
      }
      if (jsonObj.get("enhancedSchemeData.itemDetailLine[itemNr].commodityCode") != null && !jsonObj.get("enhancedSchemeData.itemDetailLine[itemNr].commodityCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enhancedSchemeData.itemDetailLine[itemNr].commodityCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enhancedSchemeData.itemDetailLine[itemNr].commodityCode").toString()));
      }
      if (jsonObj.get("enhancedSchemeData.itemDetailLine[itemNr].description") != null && !jsonObj.get("enhancedSchemeData.itemDetailLine[itemNr].description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enhancedSchemeData.itemDetailLine[itemNr].description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enhancedSchemeData.itemDetailLine[itemNr].description").toString()));
      }
      if (jsonObj.get("enhancedSchemeData.itemDetailLine[itemNr].discountAmount") != null && !jsonObj.get("enhancedSchemeData.itemDetailLine[itemNr].discountAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enhancedSchemeData.itemDetailLine[itemNr].discountAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enhancedSchemeData.itemDetailLine[itemNr].discountAmount").toString()));
      }
      if (jsonObj.get("enhancedSchemeData.itemDetailLine[itemNr].productCode") != null && !jsonObj.get("enhancedSchemeData.itemDetailLine[itemNr].productCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enhancedSchemeData.itemDetailLine[itemNr].productCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enhancedSchemeData.itemDetailLine[itemNr].productCode").toString()));
      }
      if (jsonObj.get("enhancedSchemeData.itemDetailLine[itemNr].quantity") != null && !jsonObj.get("enhancedSchemeData.itemDetailLine[itemNr].quantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enhancedSchemeData.itemDetailLine[itemNr].quantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enhancedSchemeData.itemDetailLine[itemNr].quantity").toString()));
      }
      if (jsonObj.get("enhancedSchemeData.itemDetailLine[itemNr].totalAmount") != null && !jsonObj.get("enhancedSchemeData.itemDetailLine[itemNr].totalAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enhancedSchemeData.itemDetailLine[itemNr].totalAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enhancedSchemeData.itemDetailLine[itemNr].totalAmount").toString()));
      }
      if (jsonObj.get("enhancedSchemeData.itemDetailLine[itemNr].unitOfMeasure") != null && !jsonObj.get("enhancedSchemeData.itemDetailLine[itemNr].unitOfMeasure").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enhancedSchemeData.itemDetailLine[itemNr].unitOfMeasure` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enhancedSchemeData.itemDetailLine[itemNr].unitOfMeasure").toString()));
      }
      if (jsonObj.get("enhancedSchemeData.itemDetailLine[itemNr].unitPrice") != null && !jsonObj.get("enhancedSchemeData.itemDetailLine[itemNr].unitPrice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enhancedSchemeData.itemDetailLine[itemNr].unitPrice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enhancedSchemeData.itemDetailLine[itemNr].unitPrice").toString()));
      }
      if (jsonObj.get("enhancedSchemeData.orderDate") != null && !jsonObj.get("enhancedSchemeData.orderDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enhancedSchemeData.orderDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enhancedSchemeData.orderDate").toString()));
      }
      if (jsonObj.get("enhancedSchemeData.shipFromPostalCode") != null && !jsonObj.get("enhancedSchemeData.shipFromPostalCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enhancedSchemeData.shipFromPostalCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enhancedSchemeData.shipFromPostalCode").toString()));
      }
      if (jsonObj.get("enhancedSchemeData.totalTaxAmount") != null && !jsonObj.get("enhancedSchemeData.totalTaxAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enhancedSchemeData.totalTaxAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enhancedSchemeData.totalTaxAmount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdditionalDataLevel23.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdditionalDataLevel23' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdditionalDataLevel23> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdditionalDataLevel23.class));

       return (TypeAdapter<T>) new TypeAdapter<AdditionalDataLevel23>() {
           @Override
           public void write(JsonWriter out, AdditionalDataLevel23 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdditionalDataLevel23 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

}

