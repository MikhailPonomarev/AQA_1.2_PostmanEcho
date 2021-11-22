package ru.netology.rest;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class PostmanEchoTest {

    @Test
    public void PostRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .body("test request")

                .when()
                .post("/post")

                .then()
                .statusCode(500)
                .contentType(ContentType.JSON)
                .body("data", equalTo("test request"))
        ;
    }
}
