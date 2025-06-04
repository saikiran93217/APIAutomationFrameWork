package com.api.tests;

import org.testng.annotations.Test;

import com.api.models.request.SignUpRequest;
import com.ui.base.AuthService;

import io.restassured.response.Response;
import junit.framework.Assert;

public class ForgotPasswordTest {

	@Test(description = "Verify if Login API is working......")

	public void forgotPasswordTest() {

		AuthService authService = new AuthService();
        Response response=authService.forgotPassword("kiransai08921@gmail.com");
		System.out.println(response.asPrettyString());
	}

}
