package com.api.tests;

import org.testng.annotations.Test;

import com.api.models.request.LoginRequest;
import com.api.models.request.ProfileRequestPojo;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserManagmentProfileResponse;
import com.ui.base.AuthService;
import com.ui.base.UserManagementService;

import io.restassured.response.Response;
import junit.framework.Assert;

public class UpdateProfileTest {

	@Test
	public void UdateProfileTest() {

		AuthService authService = new AuthService();
		Response response = authService.login(new LoginRequest("sai kiran", "Kir@n123456"));
		LoginResponse loginResponse = response.as(LoginResponse.class);// deserilaization
		System.out.println(response.asPrettyString());

		System.out.println("--------------------------------------------");

		UserManagementService managementService = new UserManagementService();
		response = managementService.getProfile(loginResponse.getToken());
		System.out.println(response.asPrettyString());
		UserManagmentProfileResponse managmentProfileResponse = response.as(UserManagmentProfileResponse.class);
		Assert.assertEquals(managmentProfileResponse.getUsername(), "sai kiran");

		System.out.println("--------------------------------------------");

		ProfileRequestPojo profilerequest = new ProfileRequestPojo.Builder().firstName("Disha").lastName("Bhat")
				.email("disha1234@gmail.com").mobileNumber("7647264529").build();

		response=	managementService.updateProfile(loginResponse.getToken(),profilerequest);
	System.out.println(response.asPrettyString());
	}
}
