package com.APITest.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.APITest.data.PostDataRV3Schedule;
import com.APITest.testbase.APITestBase;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostV3 extends APITestBase {
	
public String coreRouting3 = "/core/routing/3";
	
	/*
	 *    /staging/routing/3
	 */
	
	@Test
	public void s200_RoutingV3Scheduling() throws FileNotFoundException, IOException {
	
		PostDataRV3Schedule postdata = new PostDataRV3Schedule();
		String myPostJson = postdata.schedulingRV3DirFalse;
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("url"))
	    .body(containsString("boundingbox"))
	    .body(containsString("summary"))
	    .body(containsString("waypoints"))
	    .and().time(lessThan(7000L))
	    .when()
	    .post(baseURLStaging + coreRouting3)
	    .then()
	    .log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		int wayPointDist = 0;
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
		
		String compareUrlStr = response.body().path("url");
		System.out.println("URL value is " + compareUrlStr);
		
		Assert.assertTrue(compareUrlStr != null,"url is null.");
		Assert.assertTrue(response.body().path("summary") != null,"summary is null.");
		
		int wyPtsCount = response.path("waypoints.size()");
				
		for(int x = 0; x < wyPtsCount; ++x) {
			
			Assert.assertTrue(response.body().path("waypoints[" + x + "].distance") != null,"waypoints[" + x + "].distance is null.");
			System.out.println("Assertion passed ---> waypoints[" + x + "].distance is not null : the value is " + response.body().path("waypoints[" + x + "].distance"));
			wayPointDist += Integer.parseInt(response.body().path("waypoints[" + x + "].distance").toString());
		}
		System.out.println("The value of wayPointDist is " + wayPointDist + " the summary dist value:" + response.body().path("summary.distance").toString());
		Assert.assertTrue(response.body().path("summary.distance").toString().contains(String.valueOf(wayPointDist)));
		System.out.println("The value of wayPointDist is " + wayPointDist);
					
	}

}
