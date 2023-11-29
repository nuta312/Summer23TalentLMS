package com.digital.api.controllers;

import com.digital.models.User;

import java.util.HashMap;

public class UserController {
    public UserController (String url){
        super();
    }
    public User[] getUsers(){


        return new User[0];
    }
    public User receiveUser(String key, String value){
        HashMap<String, String> map= new HashMap<>(){{
        put(key, value);
        }};
        return super.get (getEndpoint(API, V1, USERS ))


    }
}
