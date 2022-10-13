package com.rahset.maps.testcases;

import com.gp.restclients.RestAssuredRestClient;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public final class TestMapFeatureScenario {

    RestAssuredRestClient restClient;

    @BeforeMethod
    public void initializeClient(){
        restClient = new RestAssuredRestClient();
    }

    @Test
    public void testShouldBeAbleToAddPlaceWhenValidRequestProvided() {
        String basePath = "/maps/api/place/add/json";
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");

        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("key", "qaclick123");

        String body = "{\n" +
                "  \"location\": {\n" +
                "    \"lat\": -38.383494,\n" +
                "    \"lng\": 33.427362\n" +
                "  },\n" +
                "  \"accuracy\": 50,\n" +
                "  \"name\": \"Frontline house\",\n" +
                "  \"phone_number\": \"(+91) 983 893 3937\",\n" +
                "  \"address\": \"29, side layout, cohen 09\",\n" +
                "  \"types\": [\n" +
                "    \"shoe park\",\n" +
                "    \"shop\"\n" +
                "  ],\n" +
                "  \"website\": \"http://google.com\",\n" +
                "  \"language\": \"French-IN\"\n" +
                "}";

        restClient.post(basePath, headers, queryParams, null, body)
                .then().log().all().statusCode(200);

    }
}
