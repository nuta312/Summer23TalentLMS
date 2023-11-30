package com.digital.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
public class User extends BaseEntity {
    @JsonProperty(value = "id")
    private String userid;
    @JsonProperty(value = "first_name")
    private String userFirstName;
    @JsonProperty(value = "last_name")
    private String userLastName;
    @JsonProperty(value = "email")
    private String userEmail;
    @JsonProperty(value = "login")
    private String userUsername;
    @JsonProperty(value = "password")
    private String userPass;
    @JsonProperty(value = "bio")
    private String userBio;


}

