package com.ani.drools.decision.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

@SpringBootTest(classes = SpringBootDroolsAppTests.class)


/**
 * 
 * @author Ani
 * Test suite for business rules assignment
 * These are RESTassured based unit test cases reason for this implementation is its easy/fast to implement basic test cases
 *
 */
public class SpringBootDroolsAppTests {
	
	private final String baseUri =  "http://localhost:9999";
	private final String postMethod =  "/get-output";
	
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void testPhysicalProduct() {
		RestAssured.baseURI = baseUri;
		RequestSpecification request = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		request.contentType(ContentType.JSON);
		requestParams.put("paymentType", "PHYPRD");
		request.body(requestParams.toJSONString());
		Response response = request.post(postMethod);
		ResponseBody<?> body = response.getBody();
		System.out.println(response.getStatusLine());
		System.out.println(body.asString());
		assertThat(response.getStatusCode()).isEqualTo(200);
	}


	@SuppressWarnings("unchecked")
	@Test
	public void testBookInput() {
		RestAssured.baseURI = baseUri;
		RequestSpecification request = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		request.contentType(ContentType.JSON);
		requestParams.put("paymentType", "BOOK");
		request.body(requestParams.toJSONString());
		Response response = request.post(postMethod);
		ResponseBody<?> body = response.getBody();
		System.out.println(response.getStatusLine());
		System.out.println(body.asString());
		assertThat(response.getStatusCode()).isEqualTo(200);
	}
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void testMembershipInput() {
		RestAssured.baseURI = baseUri;
		RequestSpecification request = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		request.contentType(ContentType.JSON);
		requestParams.put("paymentType", "MEMBERSHIP");
		request.body(requestParams.toJSONString());
		Response response = request.post(postMethod);
		ResponseBody<?> body = response.getBody();
		System.out.println(response.getStatusLine());
		System.out.println(body.asString());
		assertThat(response.getStatusCode()).isEqualTo(200);
	}
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void testUpgradeMembershipInput() {
		RestAssured.baseURI = baseUri;
		RequestSpecification request = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		request.contentType(ContentType.JSON);
		requestParams.put("paymentType", "UPG_MEMBERSHIP");
		request.body(requestParams.toJSONString());
		Response response = request.post(postMethod);
		ResponseBody<?> body = response.getBody();
		System.out.println(response.getStatusLine());
		System.out.println(body.asString());
		assertThat(response.getStatusCode()).isEqualTo(200);
	}
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void testVideoInput() {
		RestAssured.baseURI = baseUri;
		RequestSpecification request = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		request.contentType(ContentType.JSON);
		requestParams.put("paymentType", "VIDEO");
		request.body(requestParams.toJSONString());
		Response response = request.post(postMethod);
		ResponseBody<?> body = response.getBody();
		System.out.println(response.getStatusLine());
		System.out.println(body.asString());
		assertThat(response.getStatusCode()).isEqualTo(200);
	}
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void testVideoInputWithVideoName() {
		RestAssured.baseURI = baseUri;
		RequestSpecification request = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		request.contentType(ContentType.JSON);
		requestParams.put("paymentType", "VIDEO");
		requestParams.put("attrName", "LEARNING_TO_SKI");
		request.body(requestParams.toJSONString());
		Response response = request.post(postMethod);
		ResponseBody<?> body = response.getBody();
		System.out.println(response.getStatusLine());
		System.out.println(body.asString());
		assertThat(response.getStatusCode()).isEqualTo(200);
	}

	
	
	

}
