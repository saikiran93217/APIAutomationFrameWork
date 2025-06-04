package com.ui.base;

import com.api.models.request.ProfileRequestPojo;

import io.restassured.response.Response;

public class UserManagementService extends BaseService {
	
	private static final String BASE_PATH = "/api/users";
	
	public Response getProfile(String token) {
		setAuthToken(token);
		return getResponse(BASE_PATH+"/profile");
		
	}
	
	public Response updateProfile(String token, ProfileRequestPojo payload) {
		setAuthToken(token);
		return getResponse(payload+BASE_PATH+"/profile");
		
	}

}
