package com.digital.asserts;

import com.digital.models.BaseEntity;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
@Slf4j

public class CourseAssert extends EntityAssert{
    public CourseAssert(BaseEntity entity) {

        super(entity);
    }



    public static CourseAssert assertThat(BaseEntity entity) {
        return new CourseAssert(entity);}

        @Override
        public void isEquals(BaseEntity expectedEntity) {
            Assertions.assertThat(super.entity)
                    .usingRecursiveComparison().ignoringFields("price", "description")
                    .ignoringExpectedNullFields()
                    .isEqualTo(expectedEntity);
            log.info("Course is correct, expected {}, actual {}", expectedEntity, super.entity);

    }
}
