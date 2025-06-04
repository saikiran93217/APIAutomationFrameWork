package com.api.tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class LoginAPITest {

	@Test(description = "Verify if login API is working......")
	public void loginTest() {
		// Here RestAssured is static in nature and we can'nt create object of it
		// because it has methods in it to use..
		RestAssured.baseURI = "http://64.227.160.186:8080";
		// RequestSpecification: it allows you to specify how the request will look like
		RequestSpecification x = RestAssured.given();
		RequestSpecification y = x.header("Content-Type", "application/json");
		RequestSpecification z = y.body("{\"username\": \"sai kiran\",\"password\": \"Kir@n123456\"}");
		Response response = z.post("/api/auth/login");
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);
	}
}
