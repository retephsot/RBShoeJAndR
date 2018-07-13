package com.APITest.tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RBShoes_Live_Show {
	
	protected static Properties restCallConfig;
	public String baseURLStaging;
	public String baseURLProd;
	public String baseURL;
	public String timeLimit;
	public String timeLimitLStr;
	public int timeLimitInt;
	public String tileKey1Prod;
	public String tileKey2Prod;
	public String authorization;
	public String xAPIKey;
	
	public String lastposition = "/live/lastposition";
	public String history = "/live/history";
	public String liveAuthSettings = "/live/auth/settings";
	public String liveClientDevices = "/live/client/devices";
	
	
	public void getRestCallConfig() throws FileNotFoundException, IOException {
		
		restCallConfig = new Properties();
		restCallConfig.load(new FileInputStream("RestCallConfig.properties"));
		
		baseURLStaging = restCallConfig.getProperty("baseURLStaging");
		baseURLProd = restCallConfig.getProperty("baseURLProd");
		baseURL = restCallConfig.getProperty("baseURLStaging");
		timeLimit = restCallConfig.getProperty("timeLimit");
		timeLimitLStr = restCallConfig.getProperty("timeLimitL");
		tileKey1Prod = restCallConfig.getProperty("tileKey1Prod");
		tileKey2Prod = restCallConfig.getProperty("tileKey2Prod");
		authorization = restCallConfig.getProperty("authorization");
		xAPIKey = restCallConfig.getProperty("xAPIKey");
		
		timeLimitInt = Integer.parseInt(timeLimit);
		
	}
	
	/*
	 *    /live/lastposition/1
	 */
	
	@Test
	public void s200_Get_Device_Positions() throws IOException, InterruptedException {
		
		getRestCallConfig();
		
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
