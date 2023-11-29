package com.digital.api.controllers;

import com.digital.api.ApiRequest;
import com.digital.api.TalentLMSBaseEndpoints;
import com.digital.models.User;
import io.restassured.response.Response;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

import static com.digital.api.TalentLMSBaseEndpoints.*;

@Slf4j
public class UserController extends ApiRequest {
    public UserController(String url){
        super(url);
    }

//    public Response getUsers(){
//        this.response = super.get("api/v1/users");
//        return this.response.as(User[].class);
//    }
//
//    public static void main(String[] args){
//        UserController userController = new UserController("https://kanzada.talentlms.com");
//        User[] users = userController.getUsers();
//        Arrays.stream(users).forEach(u -> System.out.println(u.getUserFirstName()));
//    }

    public User[] getUsers(){
        this.response = super.get(getEndpoint(API, V1, USERS));
        return this.response.as(User[].class);
    }

    public User receiveUser(By key, String value){
        HashMap<String, String> map = new HashMap<>(){{
            put(key.nameOfKey, value);
        }};
        return super.get(getEndpoint(API, V1, USERS, formatParameter(map))).as(User.class);
    }

    public  User createUser(User user){
        this.response = super.post(getEndpoint(API, V1, USER_SIGNUP), user.toJson());
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


}
