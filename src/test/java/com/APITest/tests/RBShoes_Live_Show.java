package com.APITest.tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.APITest.testbase.APITestBase;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RBShoes_Live_Show extends APITestBase {
		
	public String lastposition = "/live/lastposition";
	public String history = "/live/history";
	public String liveAuthSettings = "/live/auth/settings";
	public String liveClientDevices = "/live/client/devices";
		
	/*
	 *    /live/lastposition/1
	 */
	
	@Test
	public void s200_Get_Device_Positions() throws IOException, InterruptedException {
		
			
		Response response = 
				given()
				.param("deviceid", "calamp-4843003474")
				.header("Authorization",authorization)
				.then().expect().statusCode(200)
				.and().time(lessThan(12000L))
				.when()
				.get(baseURL + lastposition)
				.then()
				.body(containsString("true"))
				.body(containsString("positions"))
				.body("positions[0].deviceId", equalTo("calamp-4843003474"))
				.body("positions[0].deviceId", is("calamp-4843003474"))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The total response time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");
		
		int countInt = response.body().path("count");
		int comparePositionsCount = response.body().path("positions.size()");
		
		Assert.assertEquals(countInt, comparePositionsCount, "The total number of positions does not match count.  Assertion Failed");
		System.out.println("Total number of positions matches count.  Assertion passed");
	}

}
