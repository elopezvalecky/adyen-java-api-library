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
import com.adyen.model.checkout.Amount;
import com.adyen.model.checkout.CheckoutAwaitAction;
import com.adyen.model.checkout.CheckoutNativeRedirectAction;
import com.adyen.model.checkout.CheckoutQrCodeAction;
import com.adyen.model.checkout.CheckoutRedirectAction;
import com.adyen.model.checkout.CheckoutSDKAction;
import com.adyen.model.checkout.CheckoutThreeDS2Action;
import com.adyen.model.checkout.CheckoutVoucherAction;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import com.adyen.model.checkout.JSON;


public class PaymentResponseAction extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(PaymentResponseAction.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PaymentResponseAction.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PaymentResponseAction' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CheckoutAwaitAction> adapterCheckoutAwaitAction = gson.getDelegateAdapter(this, TypeToken.get(CheckoutAwaitAction.class));
            final TypeAdapter<CheckoutNativeRedirectAction> adapterCheckoutNativeRedirectAction = gson.getDelegateAdapter(this, TypeToken.get(CheckoutNativeRedirectAction.class));
            final TypeAdapter<CheckoutQrCodeAction> adapterCheckoutQrCodeAction = gson.getDelegateAdapter(this, TypeToken.get(CheckoutQrCodeAction.class));
            final TypeAdapter<CheckoutRedirectAction> adapterCheckoutRedirectAction = gson.getDelegateAdapter(this, TypeToken.get(CheckoutRedirectAction.class));
            final TypeAdapter<CheckoutSDKAction> adapterCheckoutSDKAction = gson.getDelegateAdapter(this, TypeToken.get(CheckoutSDKAction.class));
            final TypeAdapter<CheckoutThreeDS2Action> adapterCheckoutThreeDS2Action = gson.getDelegateAdapter(this, TypeToken.get(CheckoutThreeDS2Action.class));
            final TypeAdapter<CheckoutVoucherAction> adapterCheckoutVoucherAction = gson.getDelegateAdapter(this, TypeToken.get(CheckoutVoucherAction.class));

            return (TypeAdapter<T>) new TypeAdapter<PaymentResponseAction>() {
                @Override
                public void write(JsonWriter out, PaymentResponseAction value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CheckoutAwaitAction`
                    if (value.getActualInstance() instanceof CheckoutAwaitAction) {
                        JsonObject obj = adapterCheckoutAwaitAction.toJsonTree((CheckoutAwaitAction)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `CheckoutNativeRedirectAction`
                    if (value.getActualInstance() instanceof CheckoutNativeRedirectAction) {
                        JsonObject obj = adapterCheckoutNativeRedirectAction.toJsonTree((CheckoutNativeRedirectAction)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `CheckoutQrCodeAction`
                    if (value.getActualInstance() instanceof CheckoutQrCodeAction) {
                        JsonObject obj = adapterCheckoutQrCodeAction.toJsonTree((CheckoutQrCodeAction)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `CheckoutRedirectAction`
                    if (value.getActualInstance() instanceof CheckoutRedirectAction) {
                        JsonObject obj = adapterCheckoutRedirectAction.toJsonTree((CheckoutRedirectAction)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `CheckoutSDKAction`
                    if (value.getActualInstance() instanceof CheckoutSDKAction) {
                        JsonObject obj = adapterCheckoutSDKAction.toJsonTree((CheckoutSDKAction)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `CheckoutThreeDS2Action`
                    if (value.getActualInstance() instanceof CheckoutThreeDS2Action) {
                        JsonObject obj = adapterCheckoutThreeDS2Action.toJsonTree((CheckoutThreeDS2Action)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `CheckoutVoucherAction`
                    if (value.getActualInstance() instanceof CheckoutVoucherAction) {
                        JsonObject obj = adapterCheckoutVoucherAction.toJsonTree((CheckoutVoucherAction)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CheckoutAwaitAction, CheckoutNativeRedirectAction, CheckoutQrCodeAction, CheckoutRedirectAction, CheckoutSDKAction, CheckoutThreeDS2Action, CheckoutVoucherAction");
                }

                @Override
                public PaymentResponseAction read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CheckoutAwaitAction
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CheckoutAwaitAction.validateJsonObject(jsonObject);
                        actualAdapter = adapterCheckoutAwaitAction;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CheckoutAwaitAction'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CheckoutAwaitAction failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CheckoutAwaitAction'", e);
                    }

                    // deserialize CheckoutNativeRedirectAction
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CheckoutNativeRedirectAction.validateJsonObject(jsonObject);
                        actualAdapter = adapterCheckoutNativeRedirectAction;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CheckoutNativeRedirectAction'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CheckoutNativeRedirectAction failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CheckoutNativeRedirectAction'", e);
                    }

                    // deserialize CheckoutQrCodeAction
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CheckoutQrCodeAction.validateJsonObject(jsonObject);
                        actualAdapter = adapterCheckoutQrCodeAction;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CheckoutQrCodeAction'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CheckoutQrCodeAction failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CheckoutQrCodeAction'", e);
                    }

                    // deserialize CheckoutRedirectAction
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CheckoutRedirectAction.validateJsonObject(jsonObject);
                        actualAdapter = adapterCheckoutRedirectAction;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CheckoutRedirectAction'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CheckoutRedirectAction failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CheckoutRedirectAction'", e);
                    }

                    // deserialize CheckoutSDKAction
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CheckoutSDKAction.validateJsonObject(jsonObject);
                        actualAdapter = adapterCheckoutSDKAction;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CheckoutSDKAction'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CheckoutSDKAction failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CheckoutSDKAction'", e);
                    }

                    // deserialize CheckoutThreeDS2Action
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CheckoutThreeDS2Action.validateJsonObject(jsonObject);
                        actualAdapter = adapterCheckoutThreeDS2Action;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CheckoutThreeDS2Action'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CheckoutThreeDS2Action failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CheckoutThreeDS2Action'", e);
                    }

                    // deserialize CheckoutVoucherAction
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CheckoutVoucherAction.validateJsonObject(jsonObject);
                        actualAdapter = adapterCheckoutVoucherAction;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CheckoutVoucherAction'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CheckoutVoucherAction failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CheckoutVoucherAction'", e);
                    }

                    if (match == 1) {
                        PaymentResponseAction ret = new PaymentResponseAction();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for PaymentResponseAction: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public PaymentResponseAction() {
        super("oneOf", Boolean.FALSE);
    }

    public PaymentResponseAction(CheckoutAwaitAction o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PaymentResponseAction(CheckoutNativeRedirectAction o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PaymentResponseAction(CheckoutQrCodeAction o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PaymentResponseAction(CheckoutRedirectAction o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PaymentResponseAction(CheckoutSDKAction o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PaymentResponseAction(CheckoutThreeDS2Action o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PaymentResponseAction(CheckoutVoucherAction o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CheckoutAwaitAction", new GenericType<CheckoutAwaitAction>() {
        });
        schemas.put("CheckoutNativeRedirectAction", new GenericType<CheckoutNativeRedirectAction>() {
        });
        schemas.put("CheckoutQrCodeAction", new GenericType<CheckoutQrCodeAction>() {
        });
        schemas.put("CheckoutRedirectAction", new GenericType<CheckoutRedirectAction>() {
        });
        schemas.put("CheckoutSDKAction", new GenericType<CheckoutSDKAction>() {
        });
        schemas.put("CheckoutThreeDS2Action", new GenericType<CheckoutThreeDS2Action>() {
        });
        schemas.put("CheckoutVoucherAction", new GenericType<CheckoutVoucherAction>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return PaymentResponseAction.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CheckoutAwaitAction, CheckoutNativeRedirectAction, CheckoutQrCodeAction, CheckoutRedirectAction, CheckoutSDKAction, CheckoutThreeDS2Action, CheckoutVoucherAction
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CheckoutAwaitAction) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CheckoutNativeRedirectAction) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CheckoutQrCodeAction) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CheckoutRedirectAction) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CheckoutSDKAction) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CheckoutThreeDS2Action) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CheckoutVoucherAction) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CheckoutAwaitAction, CheckoutNativeRedirectAction, CheckoutQrCodeAction, CheckoutRedirectAction, CheckoutSDKAction, CheckoutThreeDS2Action, CheckoutVoucherAction");
    }

    /**
     * Get the actual instance, which can be the following:
     * CheckoutAwaitAction, CheckoutNativeRedirectAction, CheckoutQrCodeAction, CheckoutRedirectAction, CheckoutSDKAction, CheckoutThreeDS2Action, CheckoutVoucherAction
     *
     * @return The actual instance (CheckoutAwaitAction, CheckoutNativeRedirectAction, CheckoutQrCodeAction, CheckoutRedirectAction, CheckoutSDKAction, CheckoutThreeDS2Action, CheckoutVoucherAction)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CheckoutAwaitAction`. If the actual instance is not `CheckoutAwaitAction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CheckoutAwaitAction`
     * @throws ClassCastException if the instance is not `CheckoutAwaitAction`
     */
    public CheckoutAwaitAction getCheckoutAwaitAction() throws ClassCastException {
        return (CheckoutAwaitAction)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CheckoutNativeRedirectAction`. If the actual instance is not `CheckoutNativeRedirectAction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CheckoutNativeRedirectAction`
     * @throws ClassCastException if the instance is not `CheckoutNativeRedirectAction`
     */
    public CheckoutNativeRedirectAction getCheckoutNativeRedirectAction() throws ClassCastException {
        return (CheckoutNativeRedirectAction)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CheckoutQrCodeAction`. If the actual instance is not `CheckoutQrCodeAction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CheckoutQrCodeAction`
     * @throws ClassCastException if the instance is not `CheckoutQrCodeAction`
     */
    public CheckoutQrCodeAction getCheckoutQrCodeAction() throws ClassCastException {
        return (CheckoutQrCodeAction)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CheckoutRedirectAction`. If the actual instance is not `CheckoutRedirectAction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CheckoutRedirectAction`
     * @throws ClassCastException if the instance is not `CheckoutRedirectAction`
     */
    public CheckoutRedirectAction getCheckoutRedirectAction() throws ClassCastException {
        return (CheckoutRedirectAction)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CheckoutSDKAction`. If the actual instance is not `CheckoutSDKAction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CheckoutSDKAction`
     * @throws ClassCastException if the instance is not `CheckoutSDKAction`
     */
    public CheckoutSDKAction getCheckoutSDKAction() throws ClassCastException {
        return (CheckoutSDKAction)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CheckoutThreeDS2Action`. If the actual instance is not `CheckoutThreeDS2Action`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CheckoutThreeDS2Action`
     * @throws ClassCastException if the instance is not `CheckoutThreeDS2Action`
     */
    public CheckoutThreeDS2Action getCheckoutThreeDS2Action() throws ClassCastException {
        return (CheckoutThreeDS2Action)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CheckoutVoucherAction`. If the actual instance is not `CheckoutVoucherAction`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CheckoutVoucherAction`
     * @throws ClassCastException if the instance is not `CheckoutVoucherAction`
     */
    public CheckoutVoucherAction getCheckoutVoucherAction() throws ClassCastException {
        return (CheckoutVoucherAction)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentResponseAction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with CheckoutAwaitAction
    try {
      Logger.getLogger(CheckoutAwaitAction.class.getName()).setLevel(Level.OFF);
      CheckoutAwaitAction.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CheckoutAwaitAction failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CheckoutNativeRedirectAction
    try {
      Logger.getLogger(CheckoutNativeRedirectAction.class.getName()).setLevel(Level.OFF);
      CheckoutNativeRedirectAction.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CheckoutNativeRedirectAction failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CheckoutQrCodeAction
    try {
      Logger.getLogger(CheckoutQrCodeAction.class.getName()).setLevel(Level.OFF);
      CheckoutQrCodeAction.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CheckoutQrCodeAction failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CheckoutRedirectAction
    try {
      Logger.getLogger(CheckoutRedirectAction.class.getName()).setLevel(Level.OFF);
      CheckoutRedirectAction.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CheckoutRedirectAction failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CheckoutSDKAction
    try {
      Logger.getLogger(CheckoutSDKAction.class.getName()).setLevel(Level.OFF);
      CheckoutSDKAction.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CheckoutSDKAction failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CheckoutThreeDS2Action
    try {
      Logger.getLogger(CheckoutThreeDS2Action.class.getName()).setLevel(Level.OFF);
      CheckoutThreeDS2Action.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CheckoutThreeDS2Action failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CheckoutVoucherAction
    try {
      Logger.getLogger(CheckoutVoucherAction.class.getName()).setLevel(Level.OFF);
      CheckoutVoucherAction.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CheckoutVoucherAction failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for PaymentResponseAction with oneOf schemas: CheckoutAwaitAction, CheckoutNativeRedirectAction, CheckoutQrCodeAction, CheckoutRedirectAction, CheckoutSDKAction, CheckoutThreeDS2Action, CheckoutVoucherAction. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of PaymentResponseAction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentResponseAction
  * @throws IOException if the JSON string is invalid with respect to PaymentResponseAction
  */
  public static PaymentResponseAction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentResponseAction.class);
  }

 /**
  * Convert an instance of PaymentResponseAction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
