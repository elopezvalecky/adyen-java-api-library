/*
 * Management API
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.management.Name2;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * UpdateMerchantUserRequest
 */
@JsonPropertyOrder({
  UpdateMerchantUserRequest.JSON_PROPERTY_ACCOUNT_GROUPS,
  UpdateMerchantUserRequest.JSON_PROPERTY_ACTIVE,
  UpdateMerchantUserRequest.JSON_PROPERTY_EMAIL,
  UpdateMerchantUserRequest.JSON_PROPERTY_NAME,
  UpdateMerchantUserRequest.JSON_PROPERTY_ROLES,
  UpdateMerchantUserRequest.JSON_PROPERTY_TIME_ZONE_CODE
})

public class UpdateMerchantUserRequest {
  public static final String JSON_PROPERTY_ACCOUNT_GROUPS = "accountGroups";
  private List<String> accountGroups = null;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_NAME = "name";
  private Name2 name;

  public static final String JSON_PROPERTY_ROLES = "roles";
  private List<String> roles = null;

  public static final String JSON_PROPERTY_TIME_ZONE_CODE = "timeZoneCode";
  private String timeZoneCode;

  public UpdateMerchantUserRequest() { 
  }

  public UpdateMerchantUserRequest accountGroups(List<String> accountGroups) {
    this.accountGroups = accountGroups;
    return this;
  }

  public UpdateMerchantUserRequest addAccountGroupsItem(String accountGroupsItem) {
    if (this.accountGroups == null) {
      this.accountGroups = new ArrayList<>();
    }
    this.accountGroups.add(accountGroupsItem);
    return this;
  }

   /**
   * The list of [account groups](https://docs.adyen.com/account/account-structure#account-groups) associated with this user.
   * @return accountGroups
  **/
  @ApiModelProperty(value = "The list of [account groups](https://docs.adyen.com/account/account-structure#account-groups) associated with this user.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAccountGroups() {
    return accountGroups;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountGroups(List<String> accountGroups) {
    this.accountGroups = accountGroups;
  }


  public UpdateMerchantUserRequest active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Sets the status of the user to active (**true**) or inactive (**false**).
   * @return active
  **/
  @ApiModelProperty(value = "Sets the status of the user to active (**true**) or inactive (**false**).")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public UpdateMerchantUserRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address of the user.
   * @return email
  **/
  @ApiModelProperty(value = "The email address of the user.")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public UpdateMerchantUserRequest name(Name2 name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Name2 getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(Name2 name) {
    this.name = name;
  }


  public UpdateMerchantUserRequest roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public UpdateMerchantUserRequest addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * The list of [roles](https://docs.adyen.com/account/user-roles) for this user.
   * @return roles
  **/
  @ApiModelProperty(value = "The list of [roles](https://docs.adyen.com/account/user-roles) for this user.")
  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRoles() {
    return roles;
  }


  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoles(List<String> roles) {
    this.roles = roles;
  }


  public UpdateMerchantUserRequest timeZoneCode(String timeZoneCode) {
    this.timeZoneCode = timeZoneCode;
    return this;
  }

   /**
   * The [tz database name](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) of the time zone of the user. For example, **Europe/Amsterdam**.
   * @return timeZoneCode
  **/
  @ApiModelProperty(value = "The [tz database name](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) of the time zone of the user. For example, **Europe/Amsterdam**.")
  @JsonProperty(JSON_PROPERTY_TIME_ZONE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeZoneCode() {
    return timeZoneCode;
  }


  @JsonProperty(JSON_PROPERTY_TIME_ZONE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeZoneCode(String timeZoneCode) {
    this.timeZoneCode = timeZoneCode;
  }


  /**
   * Return true if this UpdateMerchantUserRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMerchantUserRequest updateMerchantUserRequest = (UpdateMerchantUserRequest) o;
    return Objects.equals(this.accountGroups, updateMerchantUserRequest.accountGroups) &&
        Objects.equals(this.active, updateMerchantUserRequest.active) &&
        Objects.equals(this.email, updateMerchantUserRequest.email) &&
        Objects.equals(this.name, updateMerchantUserRequest.name) &&
        Objects.equals(this.roles, updateMerchantUserRequest.roles) &&
        Objects.equals(this.timeZoneCode, updateMerchantUserRequest.timeZoneCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountGroups, active, email, name, roles, timeZoneCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMerchantUserRequest {\n");
    sb.append("    accountGroups: ").append(toIndentedString(accountGroups)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    timeZoneCode: ").append(toIndentedString(timeZoneCode)).append("\n");
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
   * Create an instance of UpdateMerchantUserRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateMerchantUserRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to UpdateMerchantUserRequest
   */
  public static UpdateMerchantUserRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, UpdateMerchantUserRequest.class);
  }
/**
  * Convert an instance of UpdateMerchantUserRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

