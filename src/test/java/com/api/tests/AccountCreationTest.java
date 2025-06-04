package com.api.tests;

import org.testng.annotations.Test;

import com.api.models.request.SignUpRequest;
import com.ui.base.AuthService;

import io.restassured.response.Response;
import junit.framework.Assert;

public class AccountCreationTest {

	@Test(description = "Verify if Login API is working......")

	public void createAccountTest() {

		SignUpRequest signUpRequest = new SignUpRequest.Builder().userName("Disha").email("disha@yahoo.com")
				.firstName("Disha").password("disha123").lastName("Bhatt").mobileNumber("5352647139").build();
		AuthService authService = new AuthService();
		Response response=authService.signUp(signUpRequest);
		Assert.assertEquals(response.asPrettyString(), "User registered successfully");
Assert.assertEquals(response.statusCode(), 200);
	}

}
