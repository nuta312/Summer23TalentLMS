package com.digital.api.controllers;

import com.digital.api.ApiRequest;
import com.digital.models.Course;
import com.digital.models.User;
import org.checkerframework.checker.units.qual.A;

import static com.digital.api.controllers.TalentLMSBaseEndPoint.*;

public class CourseController extends ApiRequest {
    public CourseController(String url) {
        super(url);
    }
    public Course [] getCourses() {
        this.response = super.get(getEndpoint(API, V1, COURSES));
        return this.response.as(Course[].class);
    }

    public Course createCourse(Course body){
        this.response= super.post(getEndpoint(API, V1, CREATE_COURSE), body.toJson());
        return this.response.as(Course.class);
    }
}
