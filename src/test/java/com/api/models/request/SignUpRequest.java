package com.api.models.request;

public class SignUpRequest {
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String mobileNumber;

	@Override
	public String toString() {
		return "SignUpRequest [username=" + username + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + "]";
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

	public SignUpRequest(String username, String password, String firstName, String lastName, String mobileNumber) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
	}

	//--------------------------------Inner class-----------------------
	public static class Builder {// it does'nt have any constructor
		private String username;
		private String password;
		private String firstName;
		private String lastName;
		private String mobileNumber;
		private String email;
		

		// One Method
		public Builder userName(String username) {
			this.username = username;//set the instant variable
			Builder x = new Builder();
			return x;//return current value
		}

		// Anethor method to write this
		public Builder password(String password) {
			this.password = password;
			return this;
		}
		public Builder email(String email) {
			this.email = email;
			return this;
		}
		public Builder firstName(String firstName) {
			this.firstName = firstName;
			Builder x = new Builder();
			return x;
		}

		public Builder lastName(String lastName) {
			this.lastName = lastName;
			Builder x = new Builder();
			return x;
		}

		public Builder mobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
			Builder x = new Builder();
			return x;
		}
		
		public SignUpRequest build() {
			SignUpRequest signUpRequest = new SignUpRequest(username, password, firstName, lastName, mobileNumber);
		  return signUpRequest;
		}

	}

}
