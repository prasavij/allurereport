package com.example;

import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllureTest {

    @Test
    public void getExampleTest() {
        Response response = sendGetRequest("https://jsonplaceholder.typicode.com/posts/1");
        Assert.assertEquals(response.getStatusCode(), 200, "Status code should be 200");
        Assert.assertEquals(response.jsonPath().getString("id"), "1", "ID should be 1");
    }

    @Step("Send GET request to {url}")
    public Response sendGetRequest(String url) {
        return RestAssured.given().when().get(url).then().extract().response();
    }
}
