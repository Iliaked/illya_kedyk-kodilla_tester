package com.kodilla.rest.controller;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class UpdatePostTest {
    @Test
    void shouldUpdatePost() {
        Map<String, Object> updatedPostData = new HashMap<>();
        updatedPostData.put("id", 1);
        updatedPostData.put("title", "Updated title");
        updatedPostData.put("body", "Updated body");
        updatedPostData.put("userId", 1);

        given()
                .contentType(ContentType.JSON)
                .body(updatedPostData)
                .when()
                .put("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                .assertThat()
                .statusCode(200)
                .body("title", equalTo("Updated title"))
                .body("body", equalTo("Updated body"));
    }
}
