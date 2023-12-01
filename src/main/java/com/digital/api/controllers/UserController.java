package com.digital.api.controllers;

import com.digital.api.ApiRequest;
import com.digital.models.User;
import io.restassured.response.Response;

import java.util.HashMap;

import static com.digital.api.TalentLMSBaseEndpoint.*;


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
        this.response = super.post(getEndpoint(API, V1, USER_SIGNUP), user.toJson());
        return this.response.as(User.class);
    }
    public Response deleteUser(String id1) {
        HashMap<String, String> map = new HashMap<>() {{
            put("user_id", id1);
            put("deleted_by_user_id", "1");
        }};

        this.response = super.post(getEndpoint(API, V1, DELETE_USER) , map);
        return response;
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

    public boolean isMaxUsers(){
        User[] users = getUsers();
        int count = 0;
        for (User user : users){
            if (user.getUserId() != null){
                count ++;
            }
        }return count >=5;
    }


};




//    public boolean isMaxUsers() {
//        User[] users = getUsers();
//        int count = 0;
//        for (User user : users) {
//            if (user.getUserid() != null) {
//                count++;
//            }
//        }
//        return count >= 5;
//    }

