package com.digital.api;

import com.digital.config.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

@Slf4j
@Data
public abstract class ApiRequest {
    protected String url;
    protected Response response;
    protected RequestSpecification requestSpecification;
    private static final String SLASH = "/";

    public ApiRequest(String url) {
        this.url = url;
        this.requestSpecification = given()
                .baseUri(this.url)
                .auth()
                .basic(ConfigReader.getProperty("apiKey"), "");
    }

    private void logResponse() {
        log.warn("Response is \n{}", getResponse().getBody().asPrettyString());
        log.warn("Status code is {}", getResponse().getStatusCode());
    }

    public Response get(String endPoint) {
        log.info("performed GET {}", endPoint);
        this.response = given()
                .spec(requestSpecification)
                .get(endPoint);
        logResponse();
        return this.response;
    }

    public Response post(String endPoint, String body) {
        log.info("performed POST {}", endPoint);
        log.info("Body is {}", body);
        this.response = given()
                .spec(requestSpecification)
                .body(body)
                .post(endPoint);
        logResponse();
        return this.response;
    }

    public String getEndpoint(String... endpoints) {
        StringBuilder endpoint = new StringBuilder();
        for (String end : endpoints) {
            endpoint.append(end).append(SLASH);
        }
        return endpoint.substring(0, endpoint.length() - 1);
    }

    public static String formatParameters(HashMap<String, String> parameters) {
        StringBuilder query = new StringBuilder("?");
        for (Map.Entry<String, String> entry : parameters.entrySet()) {
            query.append(entry.getKey() + "=" + entry.getValue() + "&");
        }
        return query.deleteCharAt(query.length() - 1).toString();
    }
}
