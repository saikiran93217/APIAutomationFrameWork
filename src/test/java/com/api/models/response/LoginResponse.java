package com.api.models.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginResponse {

	public String getLoginResponse() {
		return LoginResponse;
	}
	
	public LoginResponse() {
		
	}

	public void setLoginResponse(String loginResponse) {
		LoginResponse = loginResponse;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "LoginResponse [LoginResponse=" + LoginResponse + ", token=" + token + ", type=" + type + ", id=" + id
				+ ", username=" + username + ", email=" + email + ", roles=" + roles + "]";
	}

	public LoginResponse(String loginResponse, String token, String type, int id, String username, String email,
			List<String> roles) {
		super();
		LoginResponse = loginResponse;
		this.token = token;
		this.type = type;
		this.id = id;
		this.username = username;
		this.email = email;
		this.roles = roles;
	}

	private String LoginResponse;
	private String token;
	private String type;
	private int id;
	private String username;
	private String email;
	private List<String> roles;
}
