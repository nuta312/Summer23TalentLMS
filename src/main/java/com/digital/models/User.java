package com.digital.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties
public class User {
    String id;
    @JsonProperty (value = "login")
    String userUsername;
    @JsonProperty (value = "first_name")
    String userName;
    @JsonProperty (value = "last_name")
    private String userLastName;
    private String userEmail;

    private String userPass;
    private String userBio;

    public User(String userName, String userLastName, String userEmail, String userUsername, String userPass, String userBio) {
        this.userName = userName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        this.userUsername = userUsername;
        this.userPass = userPass;
        this.userBio = userBio;
    }

    public User() {

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserBio() {
        return userBio;
    }

    public void setUserBio(String userBio) {
        this.userBio = userBio;
    }
}
