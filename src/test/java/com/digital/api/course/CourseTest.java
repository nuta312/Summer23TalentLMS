package com.digital.api.course;

import com.digital.api.BaseApiTest;
import com.digital.api.controllers.CourseController;
import com.digital.asserts.ApiAssert;
import com.digital.config.ConfigReader;
import com.digital.enums.StatusCodes;
import com.digital.models.BaseEntity;
import com.digital.models.Course;
import com.digital.utils.EntityManager;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CourseTest extends BaseApiTest {
    @BeforeClass
    public void beforeClass() {
        courseController = new CourseController(ConfigReader.getProperty("url"));

    }

    @Test
    public void createCourse() {
        Course course = courseController.createCourse(EntityManager.generateCourse());
        Assert.assertNotNull(course.getId());
    }

    @Test
    public void deleteCourse() {
        courseController.deleteCourse("113");
        Assert.assertEquals(courseController.getResponse().getStatusCode(), 200);
    }

    @Test
    public void createCourseTest(){
        Course expectedCourse = EntityManager.generateCourse();
        Course actualCourse = courseController.createCourse(expectedCourse);
        ApiAssert.assertThat(courseController.getResponse()).isCorrectStatusCode(StatusCodes.HTTP_OK)
                .assertCourse(actualCourse).isEquals(expectedCourse);


    }}
