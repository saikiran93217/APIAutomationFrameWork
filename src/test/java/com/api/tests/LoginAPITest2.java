package com.api.tests;

import org.apache.http.auth.AuthScheme;
import org.testng.annotations.Test;

import com.ui.base.AuthService;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import junit.framework.Assert;

public class LoginAPITest2 {

//	Q) WHy do you write the static in imports
//	A). Improve Readability without class name
	@Test(description = "Verify if login API is working......")
	public void loginTest() {
		// Here RestAssured is static in nature and we can'nt create object of it
		// because it has methods in it to use..
		// RequestSpecification: it allows you to specify how the request will look like
		Response response = given().baseUri("http://64.227.160.186:8080").header("Content-Type", "application/json")
				.body("{\"username\": \"sai kiran\",\"password\": \"Kir@n123456\"}").post("/api/auth/login");
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.getStatusCode(), 200);

		
	}
}
