package com.thetestingacademy.samplecheck;

import io.restassured.RestAssured;

public class APItest002 {
    public static void main(String[] args) {
        RestAssured
                .given()
                .baseUri("https://rstful-booker.herokuapp.com")
                .basePath("/booking/1")
                .when()
                .get()
                .then()
                .statusCode(200);
    }
}