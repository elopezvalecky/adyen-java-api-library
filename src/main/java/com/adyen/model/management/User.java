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
import com.adyen.model.management.Links;
import com.adyen.model.management.Name;
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
 * User
 */
@JsonPropertyOrder({
  User.JSON_PROPERTY_LINKS,
  User.JSON_PROPERTY_ACCOUNT_GROUPS,
  User.JSON_PROPERTY_ACTIVE,
  User.JSON_PROPERTY_APPS,
  User.JSON_PROPERTY_EMAIL,
  User.JSON_PROPERTY_ID,
  User.JSON_PROPERTY_NAME,
  User.JSON_PROPERTY_ROLES,
  User.JSON_PROPERTY_TIME_ZONE_CODE,
  User.JSON_PROPERTY_USERNAME
})

public class User {
  public static final String JSON_PROPERTY_LINKS = "_links";
  private Links links;

  public static final String JSON_PROPERTY_ACCOUNT_GROUPS = "accountGroups";
  private List<String> accountGroups = null;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_APPS = "apps";
  private List<String> apps = null;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private Name name;

  public static final String JSON_PROPERTY_ROLES = "roles";
  private List<String> roles = new ArrayList<>();

  public static final String JSON_PROPERTY_TIME_ZONE_CODE = "timeZoneCode";
  private String timeZoneCode;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public User() { 
  }

  public User links(Links links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Links getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(Links links) {
    this.links = links;
  }


  public User accountGroups(List<String> accountGroups) {
    this.accountGroups = accountGroups;
    return this;
  }

  public User addAccountGroupsItem(String accountGroupsItem) {
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


  public User active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Indicates whether this user is active.
   * @return active
  **/
  @ApiModelProperty(value = "Indicates whether this user is active.")
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


  public User apps(List<String> apps) {
    this.apps = apps;
    return this;
  }

  public User addAppsItem(String appsItem) {
    if (this.apps == null) {
      this.apps = new ArrayList<>();
    }
    this.apps.add(appsItem);
    return this;
  }

   /**
   * Set of apps available to this user
   * @return apps
  **/
  @ApiModelProperty(value = "Set of apps available to this user")
  @JsonProperty(JSON_PROPERTY_APPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getApps() {
    return apps;
  }


  @JsonProperty(JSON_PROPERTY_APPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApps(List<String> apps) {
    this.apps = apps;
  }


  public User email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address of the user.
   * @return email
  **/
  @ApiModelProperty(required = true, value = "The email address of the user.")
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


  public User id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the user.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the user.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public User name(Name name) {
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

  public Name getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(Name name) {
    this.name = name;
  }


  public User roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public User addRolesItem(String rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * The list of [roles](https://docs.adyen.com/account/user-roles) for this user.
   * @return roles
  **/
  @ApiModelProperty(required = true, value = "The list of [roles](https://docs.adyen.com/account/user-roles) for this user.")
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


  public User timeZoneCode(String timeZoneCode) {
    this.timeZoneCode = timeZoneCode;
    return this;
  }

   /**
   * The [tz database name](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) of the time zone of the user. For example, **Europe/Amsterdam**.
   * @return timeZoneCode
  **/
  @ApiModelProperty(required = true, value = "The [tz database name](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) of the time zone of the user. For example, **Europe/Amsterdam**.")
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


  public User username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The username for this user.
   * @return username
  **/
  @ApiModelProperty(required = true, value = "The username for this user.")
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(String username) {
    this.username = username;
  }


  /**
   * Return true if this User object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.links, user.links) &&
        Objects.equals(this.accountGroups, user.accountGroups) &&
        Objects.equals(this.active, user.active) &&
        Objects.equals(this.apps, user.apps) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.id, user.id) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.roles, user.roles) &&
        Objects.equals(this.timeZoneCode, user.timeZoneCode) &&
        Objects.equals(this.username, user.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, accountGroups, active, apps, email, id, name, roles, timeZoneCode, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    accountGroups: ").append(toIndentedString(accountGroups)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    timeZoneCode: ").append(toIndentedString(timeZoneCode)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
   * Create an instance of User given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of User
   * @throws JsonProcessingException if the JSON string is invalid with respect to User
   */
  public static User fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, User.class);
  }
/**
  * Convert an instance of User to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

