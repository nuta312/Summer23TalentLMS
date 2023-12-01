package com.digital.asserts;

import com.digital.models.BaseEntity;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
@Slf4j

public class EntityAssert{
    protected BaseEntity entity;

    public EntityAssert(BaseEntity entity){
        this.entity=entity;
    }
    public void isEquals(BaseEntity expectedEntity){
        Assertions.assertThat(this.entity.isEquals(expectedEntity))
                .withFailMessage("Objects is not equals, paramters is not match %s", this.entity.getClass().getName())
                .isTrue();
        log.info("Object is correct with type{}, Actual {}, Expected {}", expectedEntity.getClass().getName(), this.entity, expectedEntity);
    }
}
