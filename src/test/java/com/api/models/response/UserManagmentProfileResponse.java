package com.api.models.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserManagmentProfileResponse {

	private int id;
	private String username;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String timeStamp;

	public UserManagmentProfileResponse() {

	}

	@Override
	public String toString() {
		return "UserManagmentProfileResponse [id=" + id + ", username=" + username + ", password=" + password
				+ ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber="
				+ mobileNumber + "]";
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public UserManagmentProfileResponse(int id, String username, String password, String email, String firstName,
			String lastName, String mobileNumber, String timeStamp) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.timeStamp = timeStamp;

	}

}
