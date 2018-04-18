package com.twqa.demo.wiremock.api;

import com.github.tomakehurst.wiremock.WireMockServer;
import io.restassured.http.ContentType;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class MockIntegrationTest {
    private static WireMockServer wireMockServer = new WireMockServer(wireMockConfig().port(3000).usingFilesUnderDirectory("mock/mock-data"));

    @BeforeClass
    public static void setup() {
        wireMockServer.start();
    }

    @AfterClass
    public static void teardown() {
        wireMockServer.shutdown();
    }

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
