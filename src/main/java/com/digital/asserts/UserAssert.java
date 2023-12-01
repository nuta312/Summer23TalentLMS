package com.digital.asserts;

import com.digital.models.BaseEntity;
import com.digital.models.User;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
@Slf4j

public class UserAssert extends EntityAssert {

    public UserAssert(BaseEntity entity) {
        super(entity);
    }
    public static UserAssert assertThat (BaseEntity entity){
        return new UserAssert(entity );
    }


}
