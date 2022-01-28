package com.restapi;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.*;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Test_Get {
	
	
//	@Test
//	public void test_get() {
//		
//		Response response =get("https://reqres.in/api/users?page=2");
//		System.out.println(response.getStatusCode());
//		System.out.println(response.getBody().asString());
//		System.out.println(response.asString());
//		System.out.println(response.getStatusLine());
//		System.out.println(response.getHeader("content-type"));
//		System.out.println(response.getTime());
//		
//		int statuscode=response.getStatusCode();
//		Assert.assertEquals(statuscode, 200);
//	}
	
	
	
//	@Test
//	public void test2() {
//		given()
//			.get("https://reqres.in/api/users?page=2").
//		then()
//			.statusCode(200)
//			.body("data.id[0]",equalTo(7));
//
//	}

	@Test
	public void test3() {
		given()
			//.header("content_type","application/json")
			//.param(parameterName, parameterValues)
			.get("https://reqres.in/api/users?page=2").
		then()
			.statusCode(200)
			.body("data.id[0]",equalTo(7))
			.body("data.first_name", hasItems("Lindsay","Tobias"));
			//.log().all();
	}
}
