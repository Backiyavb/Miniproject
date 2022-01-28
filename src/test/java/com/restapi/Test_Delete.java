package com.restapi;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Test_Delete {
	@Test
	private void test() {
		
		when()
			.delete("https://reqres.in/api/users/2").
		then()
			.statusCode(204)
			.log().all();

	}
	

}
