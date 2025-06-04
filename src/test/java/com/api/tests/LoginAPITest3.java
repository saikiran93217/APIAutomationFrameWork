package com.api.tests;

import org.apache.http.auth.AuthScheme;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.ui.base.AuthService;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;


@Listeners(com.api.listeners.TestListners.class)
public class LoginAPITest3 {

//	Q) WHy do you write the static in imports
//	A). Improve Readability without class name
	@Test(description = "Verify if login API is working......")
	public void loginTest() {

		LoginRequest loginRequest = new LoginRequest("Sai kiran", "Kir@n123456");
		AuthService authService = new AuthService();
		Response response = authService.login(loginRequest);
		
		LoginResponse loginResponse = response.as(LoginResponse.class);//"as"will covert Json object(LoginResponse.class) into java object and return object into the particular class
	//	When we  are working with Jaskon we need to create a default consturter
		
		System.out.println(response.asPrettyString());
		System.out.println(loginResponse.getToken());
		System.out.println(loginResponse.getEmail());
		System.out.println(loginResponse.getId());
		
		Assert.assertTrue(loginResponse.getToken()!=null);
//		Assert.assertEquals(loginResponse.getEmail(), "kiransai08921@gmail.com");
//		Assert.assertEquals(loginResponse.getId(),3);
	}
}
