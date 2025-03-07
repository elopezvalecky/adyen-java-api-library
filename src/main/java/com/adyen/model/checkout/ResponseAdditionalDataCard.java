/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 71
 * 
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
 * ResponseAdditionalDataCard
 */
@JsonPropertyOrder({
  ResponseAdditionalDataCard.JSON_PROPERTY_CARD_BIN,
  ResponseAdditionalDataCard.JSON_PROPERTY_CARD_HOLDER_NAME,
  ResponseAdditionalDataCard.JSON_PROPERTY_CARD_ISSUING_BANK,
  ResponseAdditionalDataCard.JSON_PROPERTY_CARD_ISSUING_COUNTRY,
  ResponseAdditionalDataCard.JSON_PROPERTY_CARD_ISSUING_CURRENCY,
  ResponseAdditionalDataCard.JSON_PROPERTY_CARD_PAYMENT_METHOD,
  ResponseAdditionalDataCard.JSON_PROPERTY_CARD_SUMMARY,
  ResponseAdditionalDataCard.JSON_PROPERTY_ISSUER_BIN
})

public class ResponseAdditionalDataCard {
  public static final String JSON_PROPERTY_CARD_BIN = "cardBin";
  private String cardBin;

  public static final String JSON_PROPERTY_CARD_HOLDER_NAME = "cardHolderName";
  private String cardHolderName;

  public static final String JSON_PROPERTY_CARD_ISSUING_BANK = "cardIssuingBank";
  private String cardIssuingBank;

  public static final String JSON_PROPERTY_CARD_ISSUING_COUNTRY = "cardIssuingCountry";
  private String cardIssuingCountry;

  public static final String JSON_PROPERTY_CARD_ISSUING_CURRENCY = "cardIssuingCurrency";
  private String cardIssuingCurrency;

  public static final String JSON_PROPERTY_CARD_PAYMENT_METHOD = "cardPaymentMethod";
  private String cardPaymentMethod;

  public static final String JSON_PROPERTY_CARD_SUMMARY = "cardSummary";
  private String cardSummary;

  public static final String JSON_PROPERTY_ISSUER_BIN = "issuerBin";
  private String issuerBin;

  public ResponseAdditionalDataCard() { 
  }

  public ResponseAdditionalDataCard cardBin(String cardBin) {
    this.cardBin = cardBin;
    return this;
  }

   /**
   * The first six digits of the card number.  This is the [Bank Identification Number (BIN)](https://docs.adyen.com/get-started-with-adyen/payment-glossary#bank-identification-number-bin) for card numbers with a six-digit BIN.  Example: 521234
   * @return cardBin
  **/
  @ApiModelProperty(value = "The first six digits of the card number.  This is the [Bank Identification Number (BIN)](https://docs.adyen.com/get-started-with-adyen/payment-glossary#bank-identification-number-bin) for card numbers with a six-digit BIN.  Example: 521234")
  @JsonProperty(JSON_PROPERTY_CARD_BIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardBin() {
    return cardBin;
  }


  @JsonProperty(JSON_PROPERTY_CARD_BIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardBin(String cardBin) {
    this.cardBin = cardBin;
  }


  public ResponseAdditionalDataCard cardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
    return this;
  }

   /**
   * The cardholder name passed in the payment request.
   * @return cardHolderName
  **/
  @ApiModelProperty(value = "The cardholder name passed in the payment request.")
  @JsonProperty(JSON_PROPERTY_CARD_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardHolderName() {
    return cardHolderName;
  }


  @JsonProperty(JSON_PROPERTY_CARD_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
  }


  public ResponseAdditionalDataCard cardIssuingBank(String cardIssuingBank) {
    this.cardIssuingBank = cardIssuingBank;
    return this;
  }

   /**
   * The bank or the financial institution granting lines of credit through card association branded payment cards. This information can be included when available.
   * @return cardIssuingBank
  **/
  @ApiModelProperty(value = "The bank or the financial institution granting lines of credit through card association branded payment cards. This information can be included when available.")
  @JsonProperty(JSON_PROPERTY_CARD_ISSUING_BANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardIssuingBank() {
    return cardIssuingBank;
  }


  @JsonProperty(JSON_PROPERTY_CARD_ISSUING_BANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardIssuingBank(String cardIssuingBank) {
    this.cardIssuingBank = cardIssuingBank;
  }


  public ResponseAdditionalDataCard cardIssuingCountry(String cardIssuingCountry) {
    this.cardIssuingCountry = cardIssuingCountry;
    return this;
  }

   /**
   * The country where the card was issued.  Example: US
   * @return cardIssuingCountry
  **/
  @ApiModelProperty(value = "The country where the card was issued.  Example: US")
  @JsonProperty(JSON_PROPERTY_CARD_ISSUING_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardIssuingCountry() {
    return cardIssuingCountry;
  }


  @JsonProperty(JSON_PROPERTY_CARD_ISSUING_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardIssuingCountry(String cardIssuingCountry) {
    this.cardIssuingCountry = cardIssuingCountry;
  }


  public ResponseAdditionalDataCard cardIssuingCurrency(String cardIssuingCurrency) {
    this.cardIssuingCurrency = cardIssuingCurrency;
    return this;
  }

   /**
   * The currency in which the card is issued, if this information is available. Provided as the currency code or currency number from the ISO-4217 standard.   Example: USD
   * @return cardIssuingCurrency
  **/
  @ApiModelProperty(value = "The currency in which the card is issued, if this information is available. Provided as the currency code or currency number from the ISO-4217 standard.   Example: USD")
  @JsonProperty(JSON_PROPERTY_CARD_ISSUING_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardIssuingCurrency() {
    return cardIssuingCurrency;
  }


  @JsonProperty(JSON_PROPERTY_CARD_ISSUING_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardIssuingCurrency(String cardIssuingCurrency) {
    this.cardIssuingCurrency = cardIssuingCurrency;
  }


  public ResponseAdditionalDataCard cardPaymentMethod(String cardPaymentMethod) {
    this.cardPaymentMethod = cardPaymentMethod;
    return this;
  }

   /**
   * The card payment method used for the transaction.  Example: amex
   * @return cardPaymentMethod
  **/
  @ApiModelProperty(value = "The card payment method used for the transaction.  Example: amex")
  @JsonProperty(JSON_PROPERTY_CARD_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardPaymentMethod() {
    return cardPaymentMethod;
  }


  @JsonProperty(JSON_PROPERTY_CARD_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardPaymentMethod(String cardPaymentMethod) {
    this.cardPaymentMethod = cardPaymentMethod;
  }


  public ResponseAdditionalDataCard cardSummary(String cardSummary) {
    this.cardSummary = cardSummary;
    return this;
  }

   /**
   * The last four digits of a card number.  &gt; Returned only in case of a card payment.
   * @return cardSummary
  **/
  @ApiModelProperty(value = "The last four digits of a card number.  > Returned only in case of a card payment.")
  @JsonProperty(JSON_PROPERTY_CARD_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardSummary() {
    return cardSummary;
  }


  @JsonProperty(JSON_PROPERTY_CARD_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardSummary(String cardSummary) {
    this.cardSummary = cardSummary;
  }


  public ResponseAdditionalDataCard issuerBin(String issuerBin) {
    this.issuerBin = issuerBin;
    return this;
  }

   /**
   * The first eight digits of the card number. Only returned if the card number is 16 digits or more.  This is the [Bank Identification Number (BIN)](https://docs.adyen.com/get-started-with-adyen/payment-glossary#bank-identification-number-bin) for card numbers with an eight-digit BIN.  Example: 52123423
   * @return issuerBin
  **/
  @ApiModelProperty(value = "The first eight digits of the card number. Only returned if the card number is 16 digits or more.  This is the [Bank Identification Number (BIN)](https://docs.adyen.com/get-started-with-adyen/payment-glossary#bank-identification-number-bin) for card numbers with an eight-digit BIN.  Example: 52123423")
  @JsonProperty(JSON_PROPERTY_ISSUER_BIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssuerBin() {
    return issuerBin;
  }


  @JsonProperty(JSON_PROPERTY_ISSUER_BIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuerBin(String issuerBin) {
    this.issuerBin = issuerBin;
  }


  /**
   * Return true if this ResponseAdditionalDataCard object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseAdditionalDataCard responseAdditionalDataCard = (ResponseAdditionalDataCard) o;
    return Objects.equals(this.cardBin, responseAdditionalDataCard.cardBin) &&
        Objects.equals(this.cardHolderName, responseAdditionalDataCard.cardHolderName) &&
        Objects.equals(this.cardIssuingBank, responseAdditionalDataCard.cardIssuingBank) &&
        Objects.equals(this.cardIssuingCountry, responseAdditionalDataCard.cardIssuingCountry) &&
        Objects.equals(this.cardIssuingCurrency, responseAdditionalDataCard.cardIssuingCurrency) &&
        Objects.equals(this.cardPaymentMethod, responseAdditionalDataCard.cardPaymentMethod) &&
        Objects.equals(this.cardSummary, responseAdditionalDataCard.cardSummary) &&
        Objects.equals(this.issuerBin, responseAdditionalDataCard.issuerBin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardBin, cardHolderName, cardIssuingBank, cardIssuingCountry, cardIssuingCurrency, cardPaymentMethod, cardSummary, issuerBin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseAdditionalDataCard {\n");
    sb.append("    cardBin: ").append(toIndentedString(cardBin)).append("\n");
    sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
    sb.append("    cardIssuingBank: ").append(toIndentedString(cardIssuingBank)).append("\n");
    sb.append("    cardIssuingCountry: ").append(toIndentedString(cardIssuingCountry)).append("\n");
    sb.append("    cardIssuingCurrency: ").append(toIndentedString(cardIssuingCurrency)).append("\n");
    sb.append("    cardPaymentMethod: ").append(toIndentedString(cardPaymentMethod)).append("\n");
    sb.append("    cardSummary: ").append(toIndentedString(cardSummary)).append("\n");
    sb.append("    issuerBin: ").append(toIndentedString(issuerBin)).append("\n");
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
   * Create an instance of ResponseAdditionalDataCard given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ResponseAdditionalDataCard
   * @throws JsonProcessingException if the JSON string is invalid with respect to ResponseAdditionalDataCard
   */
  public static ResponseAdditionalDataCard fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ResponseAdditionalDataCard.class);
  }
/**
  * Convert an instance of ResponseAdditionalDataCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

