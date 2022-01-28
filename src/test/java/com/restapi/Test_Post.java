package com.restapi;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Test_Post {
	@Test
	private void test1() {
	
	JSONObject request=new JSONObject();
	
	request.put("name","ravi");
	request.put("job","teacher");
	
	System.out.println(request);
	
	System.out.println(request.toJSONString());
	
	given()
		.header("content-type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString()).
	when()
		//.post("https://reqres.in/api/users").
		//.put("https://reqres.in/api/users/2").
		.patch("https://reqres.in/api/users/2").
	then().
		statusCode(200)
		.log().all();
	}

}
