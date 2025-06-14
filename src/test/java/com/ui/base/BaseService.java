package com.ui.base;

import static io.restassured.RestAssured.given;

import com.api.filters.LoggingFilter;
import com.api.models.request.LoginRequest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {

	// Base URI
	// Creating the request
	// Handling the Response

	private static final String BASE_URL = "http://64.227.160.186:8080";

	private RequestSpecification requestSpecification;

	static {
		RestAssured.filters(new LoggingFilter());
	}
	//Its kind of a BrowserUtility in selenium framework
	public BaseService() {
		requestSpecification = given().baseUri(BASE_URL);
	}
	
	
	

	protected Response postRequest(Object payload, String endpoint)
	// here we used object because Object is the parent for the loginRequest it
	// gives by java so it will be loose coupling or polymorphism
	{
		return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
	}
	protected Response getResponse(String endpoint)
	
	{
		return requestSpecification.get(endpoint);
	}
	protected Response postRequest(String baseUrl, Object payload, String endpoint)
	// here we used object because Object is the parent for the loginRequest it
	// gives by java so it will be loose coupling or polymorphism
	{
		return requestSpecification.baseUri(baseUrl).contentType(ContentType.JSON).body(payload).post(endpoint);
	}
	
	//This will get the token
	protected void setAuthToken(String token) {
		requestSpecification.header("Authorization", "Bearer"+token);
	}
	protected Response putRequest(Object payload, String endpoint)
	
	{
		return requestSpecification.contentType(ContentType.JSON).body(payload).put(endpoint);
	}
}
