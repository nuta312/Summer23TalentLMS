package com.digital.controllers;

import com.digital.api.ApiRequest;
import com.digital.models.User;

import java.util.HashMap;
import java.util.Map;

import static com.digital.controllers.TalentLMSBaseEndpoint.*;


public class UserController extends ApiRequest {


    public UserController(String url) {
        super(url);
    }

    public User[] getUsers() {
        this.response = super.get(getEndpoint(API, V1, USERS));
        return this.response.as(User[].class);
    }

    public User receiveUser(By key, String value) {
        HashMap<String, String> map = new HashMap<>() {{
            put(key.nameOfKey, value);
        }};
        return super.get(getEndpoint(API, V1, USERS, formatParameter(map)))
                .as(User.class);
    }

    public User createUser(User user) {
        this.response = super.post(getEndpoint(API, V1, USERS, USER_SIGNUP), user.toJson());
        return this.response.as(User.class);
    }


    public enum By {
        USERNAME("username"),
        ID("id"),
        EMAIL("email");

        public final String nameOfKey;

        By(String nameOfKey) {
            this.nameOfKey = nameOfKey;
        }
    }


};





