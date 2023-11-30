package com.digital.api;

import com.digital.api.controllers.CourseController;
import com.digital.config.ConfigReader;
import com.digital.models.BaseEntity;
import com.digital.models.Course;
import com.digital.utils.EntityManager;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CourseTest extends BaseApiTest {
  @BeforeClass
    public void beforeClass(){
      courseController= new CourseController(ConfigReader.getProperty("url"));

  }
  @Test
  public void createCourse(){
    Course course= courseController.createCourse(EntityManager.generateCourse());
    Assert.assertNotNull(course.getId());
  }
}
