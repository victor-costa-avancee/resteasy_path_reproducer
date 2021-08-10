package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
class RestEasyPathTests {

    @Test
    void findEndpoint1() {
        given()
                .when()
                .contentType(ContentType.JSON)
                .body(new Object(), ObjectMapperType.JSONB)
                .post("/device-features/123/permissions")
                .then()
                .statusCode(200);
    }

    @Test
    void findEndpoint2() {
        given()
                .when()
                .contentType(ContentType.JSON)
                .body(new Object(), ObjectMapperType.JSONB)
                .post("/device-features/123/actions")
                .then()
                .statusCode(200);
    }

    @Test
    void avoid500onEmptyBody() {
        given()
                .when()
                .contentType(ContentType.JSON)
                .post("/device-features/123/permissions")
                .then()
                .statusCode(400);
    }

}