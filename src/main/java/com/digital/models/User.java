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
@JsonIgnoreProperties(ignoreUnknown = true) //анотация джексона, которая игнорирует поля которые нет у нас в классе
@JsonInclude(JsonInclude.Include.NON_NULL) // нулевые данные не вывводит
@Builder
public class User extends BaseEntity {
    @JsonProperty(value = "id")
    private String userId;
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

    @Override
    public Object receiveName() {
        return getUserFirstName();
    }
}
