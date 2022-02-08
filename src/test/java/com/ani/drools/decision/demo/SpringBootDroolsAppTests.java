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

public class SpringBootDroolsAppTests {
	
	

	@SuppressWarnings("unchecked")
	@Test
	public void testBookInput() {
		RestAssured.baseURI = "http://localhost:9999";
		RequestSpecification request = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		request.contentType(ContentType.JSON);
		requestParams.put("paymentType", "BOOK");
		request.body(requestParams.toJSONString());
		Response response = request.post("/get-output");
		ResponseBody<?> body = response.getBody();
		System.out.println(response.getStatusLine());
		System.out.println(body.asString());
		assertThat(response.getStatusCode()).isEqualTo(200);
	}

	/*
	 * @Test public void test1() {
	 * 
	 * RequestSpecification request = RestAssured.given();
	 * request.contentType(ContentType.JSON); // Setting Base URI
	 * request.baseUri("http://localhost:9999/get-output"); Response response =
	 * request.post();
	 * 
	 * System.out.println(response.getStatusCode());
	 * 
	 * /*RequestSpecification httpRequest = RestAssured.given(); Response response =
	 * httpRequest.request(Method.POST);
	 * System.out.println(response.getStatusCode()); }
	 * 
	 * /*@Test public void test2() {
	 * 
	 * JSONObject request = new JSONObject(); request.put("paymentType", "BOOK");
	 * //request.put("job", "BA");
	 * 
	 * System.out.println(request); System.out.println(request.toString());
	 * 
	 * given(). body(request.toJSONString()). when().
	 * post("http://localhost:9999/get-output"). then().statusCode(200);
	 * 
	 * }
	 */

}
