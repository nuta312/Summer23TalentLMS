package com.digital.models;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class BaseEntity {
    public String toJson(){
        ObjectMapper objectMapper= new ObjectMapper();
       try {
           objectMapper.writeValueAsString(this);
       } catch (JsonProcessingException e) {
           throw new RuntimeException(e);
       }
        return null;
    }
}
