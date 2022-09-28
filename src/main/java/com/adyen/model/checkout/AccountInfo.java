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
import java.util.Date;

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
 * AccountInfo
 */

public class AccountInfo {
  /**
   * Indicator for the length of time since this shopper account was created in the merchant&#39;s environment. Allowed values: * notApplicable * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days
   */
  @JsonAdapter(AccountAgeIndicatorEnum.Adapter.class)
  public enum AccountAgeIndicatorEnum {
    NOTAPPLICABLE("notApplicable"),
    
    THISTRANSACTION("thisTransaction"),
    
    LESSTHAN30DAYS("lessThan30Days"),
    
    FROM30TO60DAYS("from30To60Days"),
    
    MORETHAN60DAYS("moreThan60Days");

    private String value;

    AccountAgeIndicatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountAgeIndicatorEnum fromValue(String value) {
      for (AccountAgeIndicatorEnum b : AccountAgeIndicatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccountAgeIndicatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountAgeIndicatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountAgeIndicatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccountAgeIndicatorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCOUNT_AGE_INDICATOR = "accountAgeIndicator";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_AGE_INDICATOR)
  private AccountAgeIndicatorEnum accountAgeIndicator;

  public static final String SERIALIZED_NAME_ACCOUNT_CHANGE_DATE = "accountChangeDate";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_CHANGE_DATE)
  private Date accountChangeDate;

  /**
   * Indicator for the length of time since the shopper&#39;s account was last updated. Allowed values: * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days
   */
  @JsonAdapter(AccountChangeIndicatorEnum.Adapter.class)
  public enum AccountChangeIndicatorEnum {
    THISTRANSACTION("thisTransaction"),
    
    LESSTHAN30DAYS("lessThan30Days"),
    
    FROM30TO60DAYS("from30To60Days"),
    
    MORETHAN60DAYS("moreThan60Days");

    private String value;

    AccountChangeIndicatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountChangeIndicatorEnum fromValue(String value) {
      for (AccountChangeIndicatorEnum b : AccountChangeIndicatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccountChangeIndicatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountChangeIndicatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountChangeIndicatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccountChangeIndicatorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCOUNT_CHANGE_INDICATOR = "accountChangeIndicator";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_CHANGE_INDICATOR)
  private AccountChangeIndicatorEnum accountChangeIndicator;

  public static final String SERIALIZED_NAME_ACCOUNT_CREATION_DATE = "accountCreationDate";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_CREATION_DATE)
  private Date accountCreationDate;

  /**
   * Indicates the type of account. For example, for a multi-account card product. Allowed values: * notApplicable * credit * debit
   */
  @JsonAdapter(AccountTypeEnum.Adapter.class)
  public enum AccountTypeEnum {
    NOTAPPLICABLE("notApplicable"),
    
    CREDIT("credit"),
    
    DEBIT("debit");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountTypeEnum fromValue(String value) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccountTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "accountType";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private AccountTypeEnum accountType;

  public static final String SERIALIZED_NAME_ADD_CARD_ATTEMPTS_DAY = "addCardAttemptsDay";
  @SerializedName(SERIALIZED_NAME_ADD_CARD_ATTEMPTS_DAY)
  private Integer addCardAttemptsDay;

  public static final String SERIALIZED_NAME_DELIVERY_ADDRESS_USAGE_DATE = "deliveryAddressUsageDate";
  @SerializedName(SERIALIZED_NAME_DELIVERY_ADDRESS_USAGE_DATE)
  private Date deliveryAddressUsageDate;

  /**
   * Indicator for the length of time since this delivery address was first used. Allowed values: * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days
   */
  @JsonAdapter(DeliveryAddressUsageIndicatorEnum.Adapter.class)
  public enum DeliveryAddressUsageIndicatorEnum {
    THISTRANSACTION("thisTransaction"),
    
    LESSTHAN30DAYS("lessThan30Days"),
    
    FROM30TO60DAYS("from30To60Days"),
    
    MORETHAN60DAYS("moreThan60Days");

    private String value;

    DeliveryAddressUsageIndicatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeliveryAddressUsageIndicatorEnum fromValue(String value) {
      for (DeliveryAddressUsageIndicatorEnum b : DeliveryAddressUsageIndicatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DeliveryAddressUsageIndicatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeliveryAddressUsageIndicatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeliveryAddressUsageIndicatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DeliveryAddressUsageIndicatorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DELIVERY_ADDRESS_USAGE_INDICATOR = "deliveryAddressUsageIndicator";
  @SerializedName(SERIALIZED_NAME_DELIVERY_ADDRESS_USAGE_INDICATOR)
  private DeliveryAddressUsageIndicatorEnum deliveryAddressUsageIndicator;

  public static final String SERIALIZED_NAME_HOME_PHONE = "homePhone";
  @SerializedName(SERIALIZED_NAME_HOME_PHONE)
  private String homePhone;

  public static final String SERIALIZED_NAME_MOBILE_PHONE = "mobilePhone";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE)
  private String mobilePhone;

  public static final String SERIALIZED_NAME_PASSWORD_CHANGE_DATE = "passwordChangeDate";
  @SerializedName(SERIALIZED_NAME_PASSWORD_CHANGE_DATE)
  private Date passwordChangeDate;

  /**
   * Indicator when the shopper has changed their password. Allowed values: * notApplicable * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days
   */
  @JsonAdapter(PasswordChangeIndicatorEnum.Adapter.class)
  public enum PasswordChangeIndicatorEnum {
    NOTAPPLICABLE("notApplicable"),
    
    THISTRANSACTION("thisTransaction"),
    
    LESSTHAN30DAYS("lessThan30Days"),
    
    FROM30TO60DAYS("from30To60Days"),
    
    MORETHAN60DAYS("moreThan60Days");

    private String value;

    PasswordChangeIndicatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PasswordChangeIndicatorEnum fromValue(String value) {
      for (PasswordChangeIndicatorEnum b : PasswordChangeIndicatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PasswordChangeIndicatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PasswordChangeIndicatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PasswordChangeIndicatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PasswordChangeIndicatorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PASSWORD_CHANGE_INDICATOR = "passwordChangeIndicator";
  @SerializedName(SERIALIZED_NAME_PASSWORD_CHANGE_INDICATOR)
  private PasswordChangeIndicatorEnum passwordChangeIndicator;

  public static final String SERIALIZED_NAME_PAST_TRANSACTIONS_DAY = "pastTransactionsDay";
  @SerializedName(SERIALIZED_NAME_PAST_TRANSACTIONS_DAY)
  private Integer pastTransactionsDay;

  public static final String SERIALIZED_NAME_PAST_TRANSACTIONS_YEAR = "pastTransactionsYear";
  @SerializedName(SERIALIZED_NAME_PAST_TRANSACTIONS_YEAR)
  private Integer pastTransactionsYear;

  public static final String SERIALIZED_NAME_PAYMENT_ACCOUNT_AGE = "paymentAccountAge";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ACCOUNT_AGE)
  private Date paymentAccountAge;

  /**
   * Indicator for the length of time since this payment method was added to this shopper&#39;s account. Allowed values: * notApplicable * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days
   */
  @JsonAdapter(PaymentAccountIndicatorEnum.Adapter.class)
  public enum PaymentAccountIndicatorEnum {
    NOTAPPLICABLE("notApplicable"),
    
    THISTRANSACTION("thisTransaction"),
    
    LESSTHAN30DAYS("lessThan30Days"),
    
    FROM30TO60DAYS("from30To60Days"),
    
    MORETHAN60DAYS("moreThan60Days");

    private String value;

    PaymentAccountIndicatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentAccountIndicatorEnum fromValue(String value) {
      for (PaymentAccountIndicatorEnum b : PaymentAccountIndicatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PaymentAccountIndicatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentAccountIndicatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentAccountIndicatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PaymentAccountIndicatorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYMENT_ACCOUNT_INDICATOR = "paymentAccountIndicator";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ACCOUNT_INDICATOR)
  private PaymentAccountIndicatorEnum paymentAccountIndicator;

  public static final String SERIALIZED_NAME_PURCHASES_LAST6_MONTHS = "purchasesLast6Months";
  @SerializedName(SERIALIZED_NAME_PURCHASES_LAST6_MONTHS)
  private Integer purchasesLast6Months;

  public static final String SERIALIZED_NAME_SUSPICIOUS_ACTIVITY = "suspiciousActivity";
  @SerializedName(SERIALIZED_NAME_SUSPICIOUS_ACTIVITY)
  private Boolean suspiciousActivity;

  public static final String SERIALIZED_NAME_WORK_PHONE = "workPhone";
  @SerializedName(SERIALIZED_NAME_WORK_PHONE)
  private String workPhone;

  public AccountInfo() { 
  }

  public AccountInfo accountAgeIndicator(AccountAgeIndicatorEnum accountAgeIndicator) {
    
    this.accountAgeIndicator = accountAgeIndicator;
    return this;
  }

   /**
   * Indicator for the length of time since this shopper account was created in the merchant&#39;s environment. Allowed values: * notApplicable * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days
   * @return accountAgeIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator for the length of time since this shopper account was created in the merchant's environment. Allowed values: * notApplicable * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days")

  public AccountAgeIndicatorEnum getAccountAgeIndicator() {
    return accountAgeIndicator;
  }


  public void setAccountAgeIndicator(AccountAgeIndicatorEnum accountAgeIndicator) {
    this.accountAgeIndicator = accountAgeIndicator;
  }


  public AccountInfo accountChangeDate(Date accountChangeDate) {
    
    this.accountChangeDate = accountChangeDate;
    return this;
  }

   /**
   * Date when the shopper&#39;s account was last changed.
   * @return accountChangeDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date when the shopper's account was last changed.")

  public Date getAccountChangeDate() {
    return accountChangeDate;
  }


  public void setAccountChangeDate(Date accountChangeDate) {
    this.accountChangeDate = accountChangeDate;
  }


  public AccountInfo accountChangeIndicator(AccountChangeIndicatorEnum accountChangeIndicator) {
    
    this.accountChangeIndicator = accountChangeIndicator;
    return this;
  }

   /**
   * Indicator for the length of time since the shopper&#39;s account was last updated. Allowed values: * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days
   * @return accountChangeIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator for the length of time since the shopper's account was last updated. Allowed values: * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days")

  public AccountChangeIndicatorEnum getAccountChangeIndicator() {
    return accountChangeIndicator;
  }


  public void setAccountChangeIndicator(AccountChangeIndicatorEnum accountChangeIndicator) {
    this.accountChangeIndicator = accountChangeIndicator;
  }


  public AccountInfo accountCreationDate(Date accountCreationDate) {
    
    this.accountCreationDate = accountCreationDate;
    return this;
  }

   /**
   * Date when the shopper&#39;s account was created.
   * @return accountCreationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date when the shopper's account was created.")

  public Date getAccountCreationDate() {
    return accountCreationDate;
  }


  public void setAccountCreationDate(Date accountCreationDate) {
    this.accountCreationDate = accountCreationDate;
  }


  public AccountInfo accountType(AccountTypeEnum accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Indicates the type of account. For example, for a multi-account card product. Allowed values: * notApplicable * credit * debit
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates the type of account. For example, for a multi-account card product. Allowed values: * notApplicable * credit * debit")

  public AccountTypeEnum getAccountType() {
    return accountType;
  }


  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }


  public AccountInfo addCardAttemptsDay(Integer addCardAttemptsDay) {
    
    this.addCardAttemptsDay = addCardAttemptsDay;
    return this;
  }

   /**
   * Number of attempts the shopper tried to add a card to their account in the last day.
   * @return addCardAttemptsDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of attempts the shopper tried to add a card to their account in the last day.")

  public Integer getAddCardAttemptsDay() {
    return addCardAttemptsDay;
  }


  public void setAddCardAttemptsDay(Integer addCardAttemptsDay) {
    this.addCardAttemptsDay = addCardAttemptsDay;
  }


  public AccountInfo deliveryAddressUsageDate(Date deliveryAddressUsageDate) {
    
    this.deliveryAddressUsageDate = deliveryAddressUsageDate;
    return this;
  }

   /**
   * Date the selected delivery address was first used.
   * @return deliveryAddressUsageDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date the selected delivery address was first used.")

  public Date getDeliveryAddressUsageDate() {
    return deliveryAddressUsageDate;
  }


  public void setDeliveryAddressUsageDate(Date deliveryAddressUsageDate) {
    this.deliveryAddressUsageDate = deliveryAddressUsageDate;
  }


  public AccountInfo deliveryAddressUsageIndicator(DeliveryAddressUsageIndicatorEnum deliveryAddressUsageIndicator) {
    
    this.deliveryAddressUsageIndicator = deliveryAddressUsageIndicator;
    return this;
  }

   /**
   * Indicator for the length of time since this delivery address was first used. Allowed values: * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days
   * @return deliveryAddressUsageIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator for the length of time since this delivery address was first used. Allowed values: * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days")

  public DeliveryAddressUsageIndicatorEnum getDeliveryAddressUsageIndicator() {
    return deliveryAddressUsageIndicator;
  }


  public void setDeliveryAddressUsageIndicator(DeliveryAddressUsageIndicatorEnum deliveryAddressUsageIndicator) {
    this.deliveryAddressUsageIndicator = deliveryAddressUsageIndicator;
  }


  public AccountInfo homePhone(String homePhone) {
    
    this.homePhone = homePhone;
    return this;
  }

   /**
   * Shopper&#39;s home phone number (including the country code).
   * @return homePhone
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shopper's home phone number (including the country code).")

  public String getHomePhone() {
    return homePhone;
  }


  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }


  public AccountInfo mobilePhone(String mobilePhone) {
    
    this.mobilePhone = mobilePhone;
    return this;
  }

   /**
   * Shopper&#39;s mobile phone number (including the country code).
   * @return mobilePhone
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shopper's mobile phone number (including the country code).")

  public String getMobilePhone() {
    return mobilePhone;
  }


  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }


  public AccountInfo passwordChangeDate(Date passwordChangeDate) {
    
    this.passwordChangeDate = passwordChangeDate;
    return this;
  }

   /**
   * Date when the shopper last changed their password.
   * @return passwordChangeDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date when the shopper last changed their password.")

  public Date getPasswordChangeDate() {
    return passwordChangeDate;
  }


  public void setPasswordChangeDate(Date passwordChangeDate) {
    this.passwordChangeDate = passwordChangeDate;
  }


  public AccountInfo passwordChangeIndicator(PasswordChangeIndicatorEnum passwordChangeIndicator) {
    
    this.passwordChangeIndicator = passwordChangeIndicator;
    return this;
  }

   /**
   * Indicator when the shopper has changed their password. Allowed values: * notApplicable * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days
   * @return passwordChangeIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator when the shopper has changed their password. Allowed values: * notApplicable * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days")

  public PasswordChangeIndicatorEnum getPasswordChangeIndicator() {
    return passwordChangeIndicator;
  }


  public void setPasswordChangeIndicator(PasswordChangeIndicatorEnum passwordChangeIndicator) {
    this.passwordChangeIndicator = passwordChangeIndicator;
  }


  public AccountInfo pastTransactionsDay(Integer pastTransactionsDay) {
    
    this.pastTransactionsDay = pastTransactionsDay;
    return this;
  }

   /**
   * Number of all transactions (successful and abandoned) from this shopper in the past 24 hours.
   * @return pastTransactionsDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of all transactions (successful and abandoned) from this shopper in the past 24 hours.")

  public Integer getPastTransactionsDay() {
    return pastTransactionsDay;
  }


  public void setPastTransactionsDay(Integer pastTransactionsDay) {
    this.pastTransactionsDay = pastTransactionsDay;
  }


  public AccountInfo pastTransactionsYear(Integer pastTransactionsYear) {
    
    this.pastTransactionsYear = pastTransactionsYear;
    return this;
  }

   /**
   * Number of all transactions (successful and abandoned) from this shopper in the past year.
   * @return pastTransactionsYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of all transactions (successful and abandoned) from this shopper in the past year.")

  public Integer getPastTransactionsYear() {
    return pastTransactionsYear;
  }


  public void setPastTransactionsYear(Integer pastTransactionsYear) {
    this.pastTransactionsYear = pastTransactionsYear;
  }


  public AccountInfo paymentAccountAge(Date paymentAccountAge) {
    
    this.paymentAccountAge = paymentAccountAge;
    return this;
  }

   /**
   * Date this payment method was added to the shopper&#39;s account.
   * @return paymentAccountAge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date this payment method was added to the shopper's account.")

  public Date getPaymentAccountAge() {
    return paymentAccountAge;
  }


  public void setPaymentAccountAge(Date paymentAccountAge) {
    this.paymentAccountAge = paymentAccountAge;
  }


  public AccountInfo paymentAccountIndicator(PaymentAccountIndicatorEnum paymentAccountIndicator) {
    
    this.paymentAccountIndicator = paymentAccountIndicator;
    return this;
  }

   /**
   * Indicator for the length of time since this payment method was added to this shopper&#39;s account. Allowed values: * notApplicable * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days
   * @return paymentAccountIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator for the length of time since this payment method was added to this shopper's account. Allowed values: * notApplicable * thisTransaction * lessThan30Days * from30To60Days * moreThan60Days")

  public PaymentAccountIndicatorEnum getPaymentAccountIndicator() {
    return paymentAccountIndicator;
  }


  public void setPaymentAccountIndicator(PaymentAccountIndicatorEnum paymentAccountIndicator) {
    this.paymentAccountIndicator = paymentAccountIndicator;
  }


  public AccountInfo purchasesLast6Months(Integer purchasesLast6Months) {
    
    this.purchasesLast6Months = purchasesLast6Months;
    return this;
  }

   /**
   * Number of successful purchases in the last six months.
   * @return purchasesLast6Months
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of successful purchases in the last six months.")

  public Integer getPurchasesLast6Months() {
    return purchasesLast6Months;
  }


  public void setPurchasesLast6Months(Integer purchasesLast6Months) {
    this.purchasesLast6Months = purchasesLast6Months;
  }


  public AccountInfo suspiciousActivity(Boolean suspiciousActivity) {
    
    this.suspiciousActivity = suspiciousActivity;
    return this;
  }

   /**
   * Whether suspicious activity was recorded on this account.
   * @return suspiciousActivity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether suspicious activity was recorded on this account.")

  public Boolean getSuspiciousActivity() {
    return suspiciousActivity;
  }


  public void setSuspiciousActivity(Boolean suspiciousActivity) {
    this.suspiciousActivity = suspiciousActivity;
  }


  public AccountInfo workPhone(String workPhone) {
    
    this.workPhone = workPhone;
    return this;
  }

   /**
   * Shopper&#39;s work phone number (including the country code).
   * @return workPhone
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shopper's work phone number (including the country code).")

  public String getWorkPhone() {
    return workPhone;
  }


  public void setWorkPhone(String workPhone) {
    this.workPhone = workPhone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountInfo accountInfo = (AccountInfo) o;
    return Objects.equals(this.accountAgeIndicator, accountInfo.accountAgeIndicator) &&
        Objects.equals(this.accountChangeDate, accountInfo.accountChangeDate) &&
        Objects.equals(this.accountChangeIndicator, accountInfo.accountChangeIndicator) &&
        Objects.equals(this.accountCreationDate, accountInfo.accountCreationDate) &&
        Objects.equals(this.accountType, accountInfo.accountType) &&
        Objects.equals(this.addCardAttemptsDay, accountInfo.addCardAttemptsDay) &&
        Objects.equals(this.deliveryAddressUsageDate, accountInfo.deliveryAddressUsageDate) &&
        Objects.equals(this.deliveryAddressUsageIndicator, accountInfo.deliveryAddressUsageIndicator) &&
        Objects.equals(this.homePhone, accountInfo.homePhone) &&
        Objects.equals(this.mobilePhone, accountInfo.mobilePhone) &&
        Objects.equals(this.passwordChangeDate, accountInfo.passwordChangeDate) &&
        Objects.equals(this.passwordChangeIndicator, accountInfo.passwordChangeIndicator) &&
        Objects.equals(this.pastTransactionsDay, accountInfo.pastTransactionsDay) &&
        Objects.equals(this.pastTransactionsYear, accountInfo.pastTransactionsYear) &&
        Objects.equals(this.paymentAccountAge, accountInfo.paymentAccountAge) &&
        Objects.equals(this.paymentAccountIndicator, accountInfo.paymentAccountIndicator) &&
        Objects.equals(this.purchasesLast6Months, accountInfo.purchasesLast6Months) &&
        Objects.equals(this.suspiciousActivity, accountInfo.suspiciousActivity) &&
        Objects.equals(this.workPhone, accountInfo.workPhone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountAgeIndicator, accountChangeDate, accountChangeIndicator, accountCreationDate, accountType, addCardAttemptsDay, deliveryAddressUsageDate, deliveryAddressUsageIndicator, homePhone, mobilePhone, passwordChangeDate, passwordChangeIndicator, pastTransactionsDay, pastTransactionsYear, paymentAccountAge, paymentAccountIndicator, purchasesLast6Months, suspiciousActivity, workPhone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountInfo {\n");
    sb.append("    accountAgeIndicator: ").append(toIndentedString(accountAgeIndicator)).append("\n");
    sb.append("    accountChangeDate: ").append(toIndentedString(accountChangeDate)).append("\n");
    sb.append("    accountChangeIndicator: ").append(toIndentedString(accountChangeIndicator)).append("\n");
    sb.append("    accountCreationDate: ").append(toIndentedString(accountCreationDate)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    addCardAttemptsDay: ").append(toIndentedString(addCardAttemptsDay)).append("\n");
    sb.append("    deliveryAddressUsageDate: ").append(toIndentedString(deliveryAddressUsageDate)).append("\n");
    sb.append("    deliveryAddressUsageIndicator: ").append(toIndentedString(deliveryAddressUsageIndicator)).append("\n");
    sb.append("    homePhone: ").append(toIndentedString(homePhone)).append("\n");
    sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
    sb.append("    passwordChangeDate: ").append(toIndentedString(passwordChangeDate)).append("\n");
    sb.append("    passwordChangeIndicator: ").append(toIndentedString(passwordChangeIndicator)).append("\n");
    sb.append("    pastTransactionsDay: ").append(toIndentedString(pastTransactionsDay)).append("\n");
    sb.append("    pastTransactionsYear: ").append(toIndentedString(pastTransactionsYear)).append("\n");
    sb.append("    paymentAccountAge: ").append(toIndentedString(paymentAccountAge)).append("\n");
    sb.append("    paymentAccountIndicator: ").append(toIndentedString(paymentAccountIndicator)).append("\n");
    sb.append("    purchasesLast6Months: ").append(toIndentedString(purchasesLast6Months)).append("\n");
    sb.append("    suspiciousActivity: ").append(toIndentedString(suspiciousActivity)).append("\n");
    sb.append("    workPhone: ").append(toIndentedString(workPhone)).append("\n");
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
    openapiFields.add("accountAgeIndicator");
    openapiFields.add("accountChangeDate");
    openapiFields.add("accountChangeIndicator");
    openapiFields.add("accountCreationDate");
    openapiFields.add("accountType");
    openapiFields.add("addCardAttemptsDay");
    openapiFields.add("deliveryAddressUsageDate");
    openapiFields.add("deliveryAddressUsageIndicator");
    openapiFields.add("homePhone");
    openapiFields.add("mobilePhone");
    openapiFields.add("passwordChangeDate");
    openapiFields.add("passwordChangeIndicator");
    openapiFields.add("pastTransactionsDay");
    openapiFields.add("pastTransactionsYear");
    openapiFields.add("paymentAccountAge");
    openapiFields.add("paymentAccountIndicator");
    openapiFields.add("purchasesLast6Months");
    openapiFields.add("suspiciousActivity");
    openapiFields.add("workPhone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccountInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AccountInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountInfo is not found in the empty JSON string", AccountInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AccountInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("accountAgeIndicator") != null && !jsonObj.get("accountAgeIndicator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountAgeIndicator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountAgeIndicator").toString()));
      }
      if (jsonObj.get("accountChangeIndicator") != null && !jsonObj.get("accountChangeIndicator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountChangeIndicator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountChangeIndicator").toString()));
      }
      if (jsonObj.get("accountType") != null && !jsonObj.get("accountType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountType").toString()));
      }
      if (jsonObj.get("deliveryAddressUsageIndicator") != null && !jsonObj.get("deliveryAddressUsageIndicator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliveryAddressUsageIndicator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliveryAddressUsageIndicator").toString()));
      }
      if (jsonObj.get("homePhone") != null && !jsonObj.get("homePhone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `homePhone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("homePhone").toString()));
      }
      if (jsonObj.get("mobilePhone") != null && !jsonObj.get("mobilePhone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobilePhone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobilePhone").toString()));
      }
      if (jsonObj.get("passwordChangeIndicator") != null && !jsonObj.get("passwordChangeIndicator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passwordChangeIndicator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passwordChangeIndicator").toString()));
      }
      if (jsonObj.get("paymentAccountIndicator") != null && !jsonObj.get("paymentAccountIndicator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentAccountIndicator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentAccountIndicator").toString()));
      }
      if (jsonObj.get("workPhone") != null && !jsonObj.get("workPhone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workPhone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workPhone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountInfo>() {
           @Override
           public void write(JsonWriter out, AccountInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

}

