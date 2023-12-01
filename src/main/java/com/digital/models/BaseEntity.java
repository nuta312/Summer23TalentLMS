package com.digital.models;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
@Slf4j

public abstract class BaseEntity {
    public  String toJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean isEquals (BaseEntity expectedEntity) {
        try {
            Assertions.assertThat(this)
                    .usingRecursiveComparison()
                    .ignoringExpectedNullFields()
                    .isEqualTo(expectedEntity);
            return true;
        }catch (AssertionError e){
            log.error("Object is not equals {}", e.getMessage());
            return false;
        }
    }
}
