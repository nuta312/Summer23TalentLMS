package com.digital.api;

import groovy.util.logging.Slf4j;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.remote.Response;

import static io.restassured.RestAssured.given;
@Slf4j
public abstract class ApiRequest {
    protected String url;
    protected Response response;
    protected RequestSpecification requestSpecification;

    public ApiRequest(String url){
        this.url = url;
        this.requestSpecification = given()
                .baseUri(this.url);
    }
    public Response get(String endPoint){
        log.info("performed Get {}", endPoint);
        this.response = given()
                .spec(requestSpecification)
                .get(endPoint);
        return this.response;
    }

}
