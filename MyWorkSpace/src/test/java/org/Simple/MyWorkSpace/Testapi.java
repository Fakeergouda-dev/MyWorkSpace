package org.Simple.MyWorkSpace;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsEqual.*;
import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;
import org.testng.Assert;

public class Testapi {
	
	@Test
	public void getUser()
	{
		
		List<String> lst = when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.extract()
		.jsonPath()
		.getList("data.email");
		/*.then()
		.assertThat()
		.statusCode(200)
		.body("data.email",hasItemInArray("michael.lawson@reqres.in"))
		.log().all();*/
		
		Assert.assertTrue(lst.contains("michael.lawson@reqres.in"), "Matched");
	}
	
	//@Test
	public void createUser()
	{
		HashMap<String, String> hmp=new HashMap<String, String>();
		hmp.put("name", "Jane");
		hmp.put("job", "Teacher");
		
		given()
		.header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
		.body(hmp)
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201)
		.log().all();
		
	}

}
