package com.gp.restclients;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class RestAssuredRestClient {

    private RequestSpecification requestSpecification;

    public RestAssuredRestClient() {
        requestSpecification = RestAssured.given()
                .log()
                .all()
                .baseUri("https://rahulshettyacademy.com");
    }

    public Response post(String basePath, Map<String, String> headers, Map<String, Object> queryParams,
                         Map<String, Object> pathParams, Object body) {
        addHeaders(headers);
        addBasePath(basePath);
        addPathParams(pathParams);
        addQueryParams(queryParams);
        addBody(body);
        return requestSpecification.when().post();
    }

    private void addBody(Object body) {
        if(Objects.nonNull(body)) {
            requestSpecification.body(body);
        }
    }

    private void addQueryParams(Map<String, Object> queryParams) {
        if(Objects.nonNull(queryParams)) {
            requestSpecification.queryParams(queryParams);
        }
    }

    private void addBasePath(String basePath) {
        if(Objects.nonNull(basePath)) {
            requestSpecification.basePath(basePath);
        }
    }

    private void addPathParams(Map<String, Object> pathParam) {
        if(Objects.nonNull(pathParam)) {
            requestSpecification.pathParams(pathParam);
        }
    }

    private void addHeaders(Map<String, String> headers) {
        if(Objects.nonNull(headers)) {
            requestSpecification.headers(headers);
        }
    }
}
