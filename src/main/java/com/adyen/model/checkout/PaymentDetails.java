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
 * PaymentDetails
 */

public class PaymentDetails {
  /**
   * The payment method type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ALIPAY("alipay"),
    
    MULTIBANCO("multibanco"),
    
    BANKTRANSFER_IBAN("bankTransfer_IBAN"),
    
    PAYBRIGHT("paybright"),
    
    PAYNOW("paynow"),
    
    AFFIRM("affirm"),
    
    AFFIRM_POS("affirm_pos"),
    
    TRUSTLYVECTOR("trustlyvector"),
    
    ONEY("oney"),
    
    FACILYPAY("facilypay"),
    
    FACILYPAY_3X("facilypay_3x"),
    
    FACILYPAY_4X("facilypay_4x"),
    
    FACILYPAY_6X("facilypay_6x"),
    
    FACILYPAY_10X("facilypay_10x"),
    
    FACILYPAY_12X("facilypay_12x"),
    
    UNIONPAY("unionpay"),
    
    KCP_BANKTRANSFER("kcp_banktransfer"),
    
    KCP_PAYCO("kcp_payco"),
    
    KCP_CREDITCARD("kcp_creditcard"),
    
    WECHATPAYSDK("wechatpaySDK"),
    
    WECHATPAYQR("wechatpayQR"),
    
    WECHATPAYWEB("wechatpayWeb"),
    
    MOLPAY_BOOST("molpay_boost"),
    
    WALLET_IN("wallet_IN"),
    
    PAYU_IN_CASHCARD("payu_IN_cashcard"),
    
    PAYU_IN_NB("payu_IN_nb"),
    
    UPI_QR("upi_qr"),
    
    PAYTM("paytm"),
    
    MOLPAY_EBANKING_VN("molpay_ebanking_VN"),
    
    ONLINEBANKING_PL("onlineBanking_PL"),
    
    OPENBANKING_UK("openbanking_UK"),
    
    PAYBYBANK("paybybank"),
    
    EBANKING_FI("ebanking_FI"),
    
    MOLPAY_EBANKING_MY("molpay_ebanking_MY"),
    
    MOLPAY_EBANKING_DIRECT_MY("molpay_ebanking_direct_MY"),
    
    SWISH("swish"),
    
    TWINT("twint"),
    
    PIX("pix"),
    
    WALLEY("walley"),
    
    WALLEY_B2B("walley_b2b"),
    
    ALMA("alma"),
    
    MOLPAY_FPX("molpay_fpx"),
    
    KONBINI("konbini"),
    
    DIRECTEBANKING("directEbanking"),
    
    BOLETOBANCARIO("boletobancario"),
    
    NETELLER("neteller"),
    
    DANA("dana"),
    
    PAYSAFECARD("paysafecard"),
    
    CASHTICKET("cashticket"),
    
    ISRACARD("isracard"),
    
    IKANO("ikano"),
    
    KARENMILLEN("karenmillen"),
    
    OASIS("oasis"),
    
    WAREHOUSE("warehouse"),
    
    PRIMEIROPAY_BOLETO("primeiropay_boleto"),
    
    MADA("mada"),
    
    BENEFIT("benefit"),
    
    KNET("knet"),
    
    OMANNET("omannet"),
    
    GOPAY_WALLET("gopay_wallet"),
    
    POLI("poli"),
    
    KCP_NAVERPAY("kcp_naverpay"),
    
    ONLINEBANKING_IN("onlinebanking_IN"),
    
    FAWRY("fawry"),
    
    ATOME("atome"),
    
    MONEYBOOKERS("moneybookers"),
    
    NAPS("naps"),
    
    NORDEA("nordea"),
    
    BOLETOBANCARIO_BRADESCO("boletobancario_bradesco"),
    
    BOLETOBANCARIO_ITAU("boletobancario_itau"),
    
    BOLETOBANCARIO_SANTANDER("boletobancario_santander"),
    
    BOLETOBANCARIO_BANCODOBRASIL("boletobancario_bancodobrasil"),
    
    BOLETOBANCARIO_HSBC("boletobancario_hsbc"),
    
    MOLPAY_MAYBANK2U("molpay_maybank2u"),
    
    MOLPAY_CIMB("molpay_cimb"),
    
    MOLPAY_RHB("molpay_rhb"),
    
    MOLPAY_AMB("molpay_amb"),
    
    MOLPAY_HLB("molpay_hlb"),
    
    MOLPAY_AFFIN_EPG("molpay_affin_epg"),
    
    MOLPAY_BANKISLAM("molpay_bankislam"),
    
    MOLPAY_PUBLICBANK("molpay_publicbank"),
    
    FPX_AGROBANK("fpx_agrobank"),
    
    TOUCHNGO("touchngo"),
    
    MAYBANK2U_MAE("maybank2u_mae"),
    
    DUITNOW("duitnow"),
    
    PROMPTPAY("promptpay"),
    
    TWINT_POS("twint_pos"),
    
    ALIPAY_HK("alipay_hk"),
    
    ALIPAY_HK_WEB("alipay_hk_web"),
    
    ALIPAY_HK_WAP("alipay_hk_wap"),
    
    ALIPAY_WAP("alipay_wap"),
    
    BALANCEPLATFORM("balanceplatform");

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

  public PaymentDetails() { 
  }

  public PaymentDetails type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The payment method type.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The payment method type.")

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
    PaymentDetails paymentDetails = (PaymentDetails) o;
    return Objects.equals(this.type, paymentDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDetails {\n");
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
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentDetails is not found in the empty JSON string", PaymentDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentDetails>() {
           @Override
           public void write(JsonWriter out, PaymentDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

}

