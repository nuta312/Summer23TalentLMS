package com.digital.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User extends BaseEntity {
    String id;
    @JsonProperty(value = "login")
    String userUsername;
    @JsonProperty(value = "first_name")
    String userFirstName;
    @JsonProperty(value = "last_name")
    String userLastName;
    @JsonProperty(value = "email")
    String userEmail;
    @JsonProperty(value = "bio")
    String userBio;
    @JsonProperty(value = "password")
    String userPass;

}
