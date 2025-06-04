package com.api.tests;

import org.testng.annotations.Test;

import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserManagmentProfileResponse;
import com.ui.base.AuthService;
import com.ui.base.UserManagementService;

import io.restassured.response.Response;

public class GetProfileRequestTest {

	@Test
	public void getProfileInfoTest() {
		//This is the First API call doing Athuentication
		AuthService authService = new AuthService();
		Response response = authService.login(new LoginRequest("Sai kiran", "Kir@n123456"));
		LoginResponse loginResponse = response.as(LoginResponse.class);// deserilaization
		System.out.println(loginResponse.getToken());

		//Here I am getting the user details
		UserManagementService managementService = new UserManagementService();
		response = managementService.getProfile(loginResponse.getToken());
		UserManagmentProfileResponse managmentProfileResponse = response.as(UserManagmentProfileResponse.class);
		System.out.println(managmentProfileResponse.getUsername());
	}
}
