package com.twqa.demo.wiremock.api;

import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class StandaloneTest {

    @Test
    public void testWithStandalone() {
        String query = "Python";
        Integer count = 3;

        String url = String.format("http://localhost:8080/douban/book/search?query=%s&count=%s", query, count);
        given()
        .when()
                .get(url)
        .then()
                .log().all()
                .contentType(ContentType.JSON)
                .assertThat()
                .statusCode(200)
                .body("count", equalTo(count))
                .body("books[0].title", containsString(query));
    }
}
