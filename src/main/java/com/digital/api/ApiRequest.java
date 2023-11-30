package com.digital.api;

import com.digital.config.ConfigReader;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;

@Data
@Slf4j
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


    public Response get(String endPoint) {
        log.info("performed GET {}", endPoint);
        this.response = given()
                .spec(requestSpecification)
                .get(endPoint);
        logResponse();
        return this.response;
    }

    ;


    private void logResponse(){
        log.warn("Response is \n{}", getResponse().getBody().asPrettyString());
    }


    public Response post(String endPoint, String body) {
        log.info("performed POST {}", endPoint);
        log.info(("body is {}"), body);
        this.response = given()
                .spec(requestSpecification)
                .body(body)
                .post(endPoint);
        logResponse();
        return this.response;
    }


    public static String getEndpoint(String... endpoints) {
        StringBuilder endPoint = new StringBuilder();
        for (String arg : endpoints) {
            endPoint.append(arg).append(SLASH);
        }
        return endPoint.substring(0, endPoint.length() - 1);
    }

    public Response post(String endpoint, Map<String, String> map) {
        log.info("performed POST {}", endpoint);
        log.info("FORM PARAMS IS {}", map);
        this.response = given()
                .spec(requestSpecification)
                .formParams(map)
                .post(endpoint);
        logResponse();
        return this.response;
    }


    public String formatParameter(HashMap<String, String> parameters) {
        StringBuilder query = new StringBuilder("?");
        for (Map.Entry<String, String> entry : parameters.entrySet()) {
            query.append(entry.getKey() + "=" + entry.getValue() + "&");
        }
        return query.deleteCharAt(query.length() - 1).toString();
    }
}
