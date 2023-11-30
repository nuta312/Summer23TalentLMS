package com.digital.api.controllers;

import com.digital.api.ApiRequest;
import com.digital.models.Course;
import com.digital.models.User;
import io.restassured.response.Response;
import org.checkerframework.checker.units.qual.A;

import java.util.HashMap;

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
    public Response deleteCourse(String id1) {
        HashMap<String, String> map = new HashMap<>() {{
            put("course_id", id1);
            put("deleted_by_user_id", "1");
        }};

        this.response = super.post(getEndpoint(API, V1, DELETE_COURSE) , map);
        return response;
    }
}
