package com.APITest.tests;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.*;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.APITest.data.PostData;
import com.APITest.data.PostDataDataLayersCore1;
import com.APITest.data.PostDataShapesBoundary1;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class RBShoes_DataLayers_Core {
	
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
	
	public String coreRouting1 = "/core/routing/1";
	public String coreRouting2 = "/core/routing/2";
	public String coreIsoline1 = "/core/isoline/1";
	public String coreBatchGeocode1 = "/core/batchgeocode/1";
	public String coreGeocoding1 = "/core/geocoding/1";
	
	
	public void getRestCallConfig() throws FileNotFoundException, IOException {
		
		restCallConfig = new Properties();
		restCallConfig.load(new FileInputStream("APITestConfig.properties"));
		
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
	 *    /core/routing/1
	 */
	
	@Test
	public void s200_TileVersOfRoutingTrafficDisabled_URL_DirReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.tileVersionOfRoutingTrafficDisabled;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("url"))
	    .body(containsString("instructions"))
	    .body(containsString("summary"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + coreRouting1)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
		
		String compareUrlStr = response.body().path("url");
		System.out.println("URL value is " + compareUrlStr);
		
		Assert.assertTrue(compareUrlStr != null,"url is null.");
		Assert.assertTrue(response.body().path("instructions[0].directions") != null,"directions is null.");
		Assert.assertTrue(response.body().path("summary") != null,"summary is null.");
					
	}
	
	@Test
	public void s200_TileVersOfRoutingTrafficEnabled_URL_DirReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.tileVersionOfRoutingTrafficEnabled;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("url"))
	    .body(containsString("instructions"))
	    .body(containsString("summary"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + coreRouting1)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
		
		String compareUrlStr = response.body().path("url");
		System.out.println("URL value is " + compareUrlStr);
		
		Assert.assertTrue(compareUrlStr != null,"url is null.");
		Assert.assertTrue(response.body().path("instructions[0].directions") != null,"directions is null.");
		Assert.assertTrue(response.body().path("summary") != null,"summary is null.");
					
	}
	
	
	@Test
	public void s200_OtimizeWaypoints_PrintDirect_Polyline_URL_DirReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.optimizeWaypoints_PrintDirectionsPolyline;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("url"))
	    .body(containsString("instructions"))
	    .body(containsString("summary"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + coreRouting1)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
		
		String compareUrlStr = response.body().path("url");
		System.out.println("URL value is " + compareUrlStr);
		
		Assert.assertTrue(compareUrlStr != null,"url is null.");
		Assert.assertTrue(response.body().path("instructions[0].directions") != null,"directions is null.");
		Assert.assertTrue(response.body().path("summary") != null,"summary is null.");
					
	}
	
	@Test
	public void s200_Multiple_Waypoints8_URL_DirReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.multipleWaypoints8;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("url"))
	    .body(containsString("instructions"))
	    .body(containsString("summary"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + coreRouting1)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
		
		String compareUrlStr = response.body().path("url");
		System.out.println("URL value is " + compareUrlStr);
		
		Assert.assertTrue(compareUrlStr != null,"url is null.");
		Assert.assertTrue(response.body().path("instructions[0].directions") != null,"directions is null.");
		Assert.assertTrue(response.body().path("summary") != null,"summary is null.");
					
	}
	
	@Test
	public void s200_ImperialUnitSystem_URL_DirReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.imperialUnitSystem;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("url"))
	    .body(containsString("instructions"))
	    .body(containsString("summary"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + coreRouting1)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
		
		String compareUrlStr = response.body().path("url");
		System.out.println("URL value is " + compareUrlStr);
		
		Assert.assertTrue(compareUrlStr != null,"url is null.");
		Assert.assertTrue(response.body().path("instructions[0].directions") != null,"directions is null.");
		Assert.assertTrue(response.body().path("summary") != null,"summary is null.");
		
		int instructionsCount = response.path("instructions.size()");
		
		Assert.assertTrue(instructionsCount > 0, "instructions count is not greater than 0.");
		
		for(int x=0; x<instructionsCount; x++) {
			
			Assert.assertTrue(response.body().path("instructions[" + x + "].directions") != null,"directions is null.");
			
		}
					
	}
	
	@Test
	public void s200_EightyOne_WayPoints_URL_DirReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.eightyOne_WayPoints;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("url"))
	    .body(containsString("instructions"))
	    .body(containsString("summary"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting1)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
		
		String compareUrlStr = response.body().path("url");
		System.out.println("URL value is " + compareUrlStr);
		
		Assert.assertTrue(compareUrlStr != null,"url is null.");
		Assert.assertTrue(response.body().path("instructions[0].directions") != null,"directions is null.");
		Assert.assertTrue(response.body().path("summary") != null,"summary is null.");
		
		int instructionsCount = response.path("instructions.size()");
		
		Assert.assertTrue(instructionsCount > 0, "instructions count is not greater than 0.");
		
		for(int x=0; x<instructionsCount; x++) {
			
			Assert.assertTrue(response.body().path("instructions[" + x + "].directions") != null,"directions is null.");
			
		}
					
	}
	
	@Test
	public void s400_151_WayPoints_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.oneFiftyOne_WayPointsReturn400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Too many waypoints to process in a single request. Please remove at least 1 waypoint."))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting1)
	    .then()
		.log().all()
		.contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 400, "The returned status code is not 400");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
		
		
	}
	
	
	@Test
	public void s400_Missing_WayPoint0_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.missingWayPoint0_Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Input parameter validation failed. waypoint0 is missing (waypoint0)."))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting1)
	    .then()
		.log().all()
		.contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 400, "The returned status code is not 400");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
		
		
	}
	
	
	@Test
	public void s400_OnlyOne_WayPoint_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.onlyOne_WayPoint_Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Must have at least two waypoints."))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting1)
	    .then()
		.log().all()
		.contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 400, "The returned status code is not 400");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
		
		
	}
	
	
	@Test
	public void s400_MissingRequiredParam_MetricSys_Waypoints_Mode_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.missingRequiredParam_MetricSystem_WayPoints_Mode_Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Missing Required Parameter: metricsystem"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting1)
	    .then()
		.log().all()
		.contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 400, "The returned status code is not 400");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
		
		
	}
	
	
	@Test
	public void s400_Only_WayPoints_Provided_PostBody_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.only_WayPoints_Provided_Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Missing Required Parameter: displaytiles"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting1)
	    .then()
		.log().all()
		.contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 400, "The returned status code is not 400");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
		
		
	}
	
	
	@Test
	public void s400_MissingParams_Directions_Displaytile_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.missingParams_Directions_Displaytiles_Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Missing Required Parameter: displaytiles"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting1)
	    .then()
		.log().all()
		.contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 400, "The returned status code is not 400");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
		
		
	}
	
	
	@Test
	public void s400_InvalidParams_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.invalidParams_Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Missing Required Parameter: displaytiles"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting1)
	    .then()
		.log().all()
		.contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 400, "The returned status code is not 400");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
		
		
	}
	
	
	@Test
	public void s400_WrongDataType_AllBody_Param_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.wrongDataType_AllBody_Param_Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Waypoints undefined."))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting1)
	    .then()
		.log().all()
		.contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 400, "The returned status code is not 400");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
				
	}
	
	
	@Test
	public void s400_BlankPostBody_ErrorsReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.blankPostBody_Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Missing Required Parameter: displaytiles"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting1)
	    .then()
		.log().all()
		.contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 400, "The returned status code is not 400");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
		
		
	}
	
	
	@Test
	public void s400_MissingWayPoint2_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.missingWayPoint2_Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Input parameter validation failed. waypoint2 is missing (waypoint2)."))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting1)
	    .then()
		.log().all()
		.contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 400, "The returned status code is not 400");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
		
		
	}
	
	
	@Test
	public void s200_TileVersionRouting_Truck_TrafficDisabled_URL_DirReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.tileVersionRouting_Truck_Traff_Disabled;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("url"))
	    .body(containsString("instructions"))
	    .body(containsString("summary"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting1)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
		
			String compareUrlStr = response.body().path("url");
			System.out.println("URL value is " + compareUrlStr);
			
			Assert.assertTrue(compareUrlStr != null,"url is null.");
			Assert.assertTrue(response.body().path("instructions[0].directions") != null,"directions is null.");
			Assert.assertTrue(response.body().path("summary") != null,"summary is null.");
			
			int instructionsCount = response.path("instructions.size()");
			
			Assert.assertTrue(instructionsCount > 0, "instructions count is not greater than 0.");
			
			for(int x=0; x<instructionsCount; x++) {
				
				Assert.assertTrue(response.body().path("instructions[" + x + "].directions") != null,"directions is null.");
				
			}
					
	}
	
	
	@Test
	public void s200_TileVersionRouting_Truck_TrafficEnabled_URL_DirReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.tileVersionRouting_Truck_Traff_Enabled;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("url"))
	    .body(containsString("instructions"))
	    .body(containsString("summary"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting1)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
		
			String compareUrlStr = response.body().path("url");
			System.out.println("URL value is " + compareUrlStr);
			
			Assert.assertTrue(compareUrlStr != null,"url is null.");
			Assert.assertTrue(response.body().path("instructions[0].directions") != null,"directions is null.");
			Assert.assertTrue(response.body().path("summary") != null,"summary is null.");
			
			int instructionsCount = response.path("instructions.size()");
			
			Assert.assertTrue(instructionsCount > 0, "instructions count is not greater than 0.");
			
			for(int x=0; x<instructionsCount; x++) {
				
				Assert.assertTrue(response.body().path("instructions[" + x + "].directions") != null,"directions is null.");
				
			}
					
	}
	
	/*
	 *    Routing verstion 2
	 */
	
	@Test
	public void s200_profile_Car_URL_And_Directions_Returned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.routingV2Car_Directions_Returned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("success"))
	    .body(containsString("url"))
	    .body(containsString("waypoints"))
	    .body(containsString("summary"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		int totDist = 0;
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");

		int wayPointsCount = response.path("waypoints.size()");
		
		Assert.assertTrue(wayPointsCount > 0, "Waypoints count is not greater than 0.");
		
		for(int x=0; x<wayPointsCount; x++) {
			
			Assert.assertTrue(response.body().path("waypoints[" + x + "].maneuvers.maneuver") != null,"Directions is null.");
			int waypointDist = response.path("waypoints[" + x + "].distance");
			if(waypointDist > 0) {
		         totDist += waypointDist;				 
		     }
		}
		     
		System.out.println("the value of totDist is now " + totDist);
		System.out.println("the value of summary.distance is " +  response.path("summary.distance"));
		int summaryDist = response.path("summary.distance");
		Assert.assertTrue(totDist == summaryDist, "Total waypoint distance does not equal summary distance value.");					
	}
	
	@Test
	public void s200_profile_Bicycle_URL_And_Directions_Returned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.routingV2Bicycle_Directions_Returned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("success"))
	    .body(containsString("url"))
	    .body(containsString("waypoints"))
	    .body(containsString("summary"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		int totDist = 0;
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");

		int wayPointsCount = response.path("waypoints.size()");
		
		Assert.assertTrue(wayPointsCount > 0, "Waypoints count is not greater than 0.");
		
		for(int x=0; x<wayPointsCount; x++) {
			
			Assert.assertTrue(response.body().path("waypoints[" + x + "].maneuvers.maneuver") != null,"Directions is null.");
			int waypointDist = response.path("waypoints[" + x + "].distance");
			if(waypointDist > 0) {
		         totDist += waypointDist;				 
		     }
		}
		     
		System.out.println("the value of totDist is now " + totDist);
		System.out.println("the value of summary.distance is " +  response.path("summary.distance"));
		int summaryDist = response.path("summary.distance");
		Assert.assertTrue(totDist == summaryDist, "Total waypoint distance does not equal summary distance value.");					
	}
	
	@Test
	public void s200_profile_Custom_URL_And_Directions_Returned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.routingV2Custom_Directions_Returned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("success"))
	    .body(containsString("url"))
	    .body(containsString("waypoints"))
	    .body(containsString("summary"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		int totDist = 0;
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");

		int wayPointsCount = response.path("waypoints.size()");
		
		Assert.assertTrue(wayPointsCount > 0, "Waypoints count is not greater than 0.");
		
		for(int x=0; x<wayPointsCount; x++) {
			
			Assert.assertTrue(response.body().path("waypoints[" + x + "].maneuvers.maneuver") != null,"Directions is null.");
			int waypointDist = response.path("waypoints[" + x + "].distance");
			if(waypointDist > 0) {
		         totDist += waypointDist;				 
		     }
		}
		     
		System.out.println("the value of totDist is now " + totDist);
		System.out.println("the value of summary.distance is " +  response.path("summary.distance"));
		int summaryDist = response.path("summary.distance");
		Assert.assertTrue(totDist == summaryDist, "Total waypoint distance does not equal summary distance value.");					
	}
	
	@Test
	public void s200_profile_TruckWithCustomProfileParams_URL_And_Directions_Returned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.routingV2TruckWithCustomProfileParams_Directions_Returned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("success"))
	    .body(containsString("url"))
	    .body(containsString("boundingbox"))
	    .body(containsString("waypoints"))
	    .body(containsString("summary"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		int totDist = 0;
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");

		int wayPointsCount = response.path("waypoints.size()");
		
		Assert.assertTrue(wayPointsCount > 0, "Waypoints count is not greater than 0.");
		
		for(int x=0; x<wayPointsCount; x++) {
			
			Assert.assertTrue(response.body().path("waypoints[" + x + "].maneuvers.maneuver") != null,"Directions is null.");
			int waypointDist = response.path("waypoints[" + x + "].distance");
			if(waypointDist > 0) {
		         totDist += waypointDist;				 
		     }
		}
		     
		System.out.println("the value of totDist is now " + totDist);
		System.out.println("the value of summary.distance is " +  response.path("summary.distance"));
		int summaryDist = response.path("summary.distance");
		Assert.assertTrue(totDist == summaryDist, "Total waypoint distance does not equal summary distance value.");					
	}
	

	@Test
	public void s200_Pedestrian_URL_And_Directions_Returned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.routingV2Profile_Pedestrian_URL_Directions_Returned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("success"))
	    .body(containsString("url"))
	    .body(containsString("waypoints"))
	    .body(containsString("summary"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		int totDist = 0;
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");

		int wayPointsCount = response.path("waypoints.size()");
		
		Assert.assertTrue(wayPointsCount > 0, "Waypoints count is not greater than 0.");
		
		for(int x=0; x<wayPointsCount; x++) {
			
			Assert.assertTrue(response.body().path("waypoints[" + x + "].maneuvers.maneuver") != null,"Directions is null.");
			int waypointDist = response.path("waypoints[" + x + "].distance");
			if(waypointDist > 0) {
		         totDist += waypointDist;				 
		     }
		}
		     
		System.out.println("the value of totDist is now " + totDist);
		System.out.println("the value of summary.distance is " +  response.path("summary.distance"));
		int summaryDist = response.path("summary.distance");
		Assert.assertTrue(totDist == summaryDist, "Total waypoint distance does not equal summary distance value.");					
	}
	
	@Test
	public void s200_TimeBasedLegacyTrue_URL_And_Directions_Returned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.timeBasedLegacyTrue_URL_Directions_Returned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("success"))
	    .body(containsString("url"))
	    .body(containsString("waypoints"))
	    .body(containsString("summary"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		int totDist = 0;
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");

		int wayPointsCount = response.path("waypoints.size()");
		
		Assert.assertTrue(wayPointsCount > 0, "Waypoints count is not greater than 0.");
		
		for(int x=0; x<wayPointsCount; x++) {
			
			Assert.assertTrue(response.body().path("waypoints[" + x + "].maneuvers.maneuver") != null,"Directions is null.");
			int waypointDist = response.path("waypoints[" + x + "].distance");
			if(waypointDist > 0) {
		         totDist += waypointDist;				 
		     }
		}
		     
		System.out.println("the value of totDist is now " + totDist);
		System.out.println("the value of summary.distance is " +  response.path("summary.distance"));
		int summaryDist = response.path("summary.distance");
		Assert.assertTrue(totDist == summaryDist, "Total waypoint distance does not equal summary distance value.");					
	}
	
	@Test
	public void s200_Bicycle_AllFlexibleParamFalse_URL_And_Directions_Returned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.routingV2Profile_Bicycle_AllFlexibleParamFalse_URL_Directions_Returned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("success"))
	    .body(containsString("url"))
	    .body(containsString("waypoints"))
	    .body(containsString("summary"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		int totDist = 0;
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");

		int wayPointsCount = response.path("waypoints.size()");
		
		Assert.assertTrue(wayPointsCount > 0, "Waypoints count is not greater than 0.");
		
		for(int x=0; x<wayPointsCount; x++) {
			
			Assert.assertTrue(response.body().path("waypoints[" + x + "].maneuvers.maneuver") != null,"Directions is null.");
			int waypointDist = response.path("waypoints[" + x + "].distance");
			if(waypointDist > 0) {
		         totDist += waypointDist;				 
		     }
		}
		     
		System.out.println("the value of totDist is now " + totDist);
		System.out.println("the value of summary.distance is " +  response.path("summary.distance"));
		int summaryDist = response.path("summary.distance");
		Assert.assertTrue(totDist == summaryDist, "Total waypoint distance does not equal summary distance value.");					
	}
	
	@Test
	public void s200_Pedestrian_AllFlexibleParamTrue_URL_And_Directions_Returned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.routingV2Profile_Pedestrian_AllFlexibleParamTrue_URL_Directions_Returned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("success"))
	    .body(containsString("url"))
	    .body(containsString("waypoints"))
	    .body(containsString("summary"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		int totDist = 0;
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");

		int wayPointsCount = response.path("waypoints.size()");
		
		Assert.assertTrue(wayPointsCount > 0, "Waypoints count is not greater than 0.");
		
		for(int x=0; x<wayPointsCount; x++) {
			
			int waypointDist = response.path("waypoints[" + x + "].distance");
			if(waypointDist > 0) {
		         totDist += waypointDist;				 
		     }
		}
		     
		System.out.println("the value of totDist is now " + totDist);
		System.out.println("the value of summary.distance is " +  response.path("summary.distance"));
		int summaryDist = response.path("summary.distance");
		Assert.assertTrue(totDist == summaryDist, "Total waypoint distance does not equal summary distance value.");					
	}
	
	@Test
	public void s200_BlockedTime_Profile_Bicycle_URL_And_Directions_Returned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.routingV2BlockedTime_ProfileBicycle_URL_Directions_Returned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("success"))
	    .body(containsString("url"))
	    .body(containsString("waypoints"))
	    .body(containsString("summary"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		int totDist = 0;
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");

		int wayPointsCount = response.path("waypoints.size()");
		
		Assert.assertTrue(wayPointsCount > 0, "Waypoints count is not greater than 0.");
		
		for(int x=0; x<wayPointsCount; x++) {
			
			int waypointDist = response.path("waypoints[" + x + "].distance");
			if(waypointDist > 0) {
		         totDist += waypointDist;				 
		     }
		}
		     
		System.out.println("the value of totDist is now " + totDist);
		System.out.println("the value of summary.distance is " +  response.path("summary.distance"));
		int summaryDist = response.path("summary.distance");
		Assert.assertTrue(totDist == summaryDist, "Total waypoint distance does not equal summary distance value.");					
	}
	
	@Test
	public void s200_Pedestrian_25WayPoints_URL_And_Directions_Returned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.routingV2Profile_Pedestrian_25WayPoints_URL_Directions_Returned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("success"))
	    .body(containsString("url"))
	    .body(containsString("waypoints"))
	    .body(containsString("summary"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		int totDist = 0;
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");

		int wayPointsCount = response.path("waypoints.size()");
		
		Assert.assertTrue(wayPointsCount > 0, "Waypoints count is not greater than 0.");
		
		for(int x=0; x<wayPointsCount; x++) {
			
			int waypointDist = response.path("waypoints[" + x + "].distance");
			if(waypointDist > 0) {
		         totDist += waypointDist;				 
		     }
		}
		     
		System.out.println("the value of totDist is now " + totDist);
		System.out.println("the value of summary.distance is " +  response.path("summary.distance"));
		int summaryDist = response.path("summary.distance");
		Assert.assertTrue(totDist == summaryDist, "Total waypoint distance does not equal summary distance value.");					
	}
	
	
	@Test
	public void s200_Car_27WayPoints_URL_And_Directions_Returned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.routingV2Profile_Car_27WayPoints_URL_Directions_Returned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("success"))
	    .body(containsString("url"))
	    .body(containsString("waypoints"))
	    .body(containsString("summary"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		int totDist = 0;
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");

		int wayPointsCount = response.path("waypoints.size()");
		
		Assert.assertTrue(wayPointsCount > 0, "Waypoints count is not greater than 0.");
		
		for(int x=0; x<wayPointsCount; x++) {
			
			int waypointDist = response.path("waypoints[" + x + "].distance");
			if(waypointDist > 0) {
		         totDist += waypointDist;				 
		     }
		}
		     
		System.out.println("the value of totDist is now " + totDist);
		System.out.println("the value of summary.distance is " +  response.path("summary.distance"));
		int summaryDist = response.path("summary.distance");
		Assert.assertTrue(totDist == summaryDist, "Total waypoint distance does not equal summary distance value.");					
	}
	
	
	@Test
	public void s200_Car_65WayPoints_URL_And_Directions_Returned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.routingV2Profile_Car_65WayPoints_URL_Directions_Returned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("success"))
	    .body(containsString("url"))
	    .body(containsString("waypoints"))
	    .body(containsString("summary"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		int totDist = 0;
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");

		int wayPointsCount = response.path("waypoints.size()");
		
		Assert.assertTrue(wayPointsCount > 0, "Waypoints count is not greater than 0.");
		
		for(int x=0; x<wayPointsCount; x++) {
			
			int waypointDist = response.path("waypoints[" + x + "].distance");
			if(waypointDist > 0) {
		         totDist += waypointDist;				 
		     }
		}
		     
		System.out.println("the value of totDist is now " + totDist);
		System.out.println("the value of summary.distance is " +  response.path("summary.distance"));
		int summaryDist = response.path("summary.distance");
		Assert.assertTrue(totDist == summaryDist, "Total waypoint distance does not equal summary distance value.");					
	}
	
		
	@Test
	public void s200_RoutingV2_120WayPoints_Car_URL_DirReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.routingV2_120WayPointsCar_DirReturned200;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("success"))
	    .body("success",equalTo(true))
	    .body(containsString("url"))
	    .body(containsString("maneuvers"))
	    .body(containsString("summary"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		int totDist = 0;
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");
		
			String compareUrlStr = response.body().path("url");
			System.out.println("URL value is " + compareUrlStr);
			assertThat(compareUrlStr).isNotEmpty();
			Assert.assertTrue(response.body().path("summary") != null,"summary is null.");
						
			int wayPointsCount = response.path("waypoints.size()");	
			Assert.assertTrue(wayPointsCount > 0, "Waypoints count is not greater than 0.");
			
			for(int x=0; x<wayPointsCount; x++) {
				
				int waypointDist = response.path("waypoints[" + x + "].distance");
				if(waypointDist > 0) {
			         totDist += waypointDist;				 
			     }
			}
			     
			System.out.println("the value of totDist is now " + totDist);
			System.out.println("the value of summary.distance is " +  response.path("summary.distance"));
			int summaryDist = response.path("summary.distance");
			Assert.assertTrue(totDist == summaryDist, "Total waypoint distance does not equal summary distance value.");
					
	}
	
	@Test
	public void s400RoutingV2_152WayPoints_Car_Error_Returned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.routingV2_152WayPointsCar_ErrorReturned400;
	   getRestCallConfig();
		
	   Response response = 	   
			     given()
			    .header("Authorization",authorization)
			    .body(myPostJson).with().contentType("application/json")
			    .then().expect().statusCode(400)
			    .body(containsString("error"))
			    .body("error.message", equalTo("Too many waypoints to process in a single request."))
			    .and().time(lessThan(45000L))
			    .when()
			    .post(baseURL + coreRouting2)
			    .then()
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
				
				int code = response.getStatusCode();
				Assert.assertTrue(code == 400, "The returned status code is not 400");
				System.out.println("Status code is " + code);
				
				Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
				System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
					
	}
	
	
	@Test
	public void s400_RepeatWayPointID_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.coreRoutingV2_RepeatWayPointID_Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Duplicate waypoint, 55Arbutus"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then()
		.log().all()
		.contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 400, "The returned status code is not 400");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");
		
		
	}
		
	@Test
	public void s200_MissingLastParam_URL_Directions_Returned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.missingLastParam_Return200;
	   getRestCallConfig();
		
	   Response response = 	   
			     given()
			    .header("Authorization",authorization)
			    .body(myPostJson).with().contentType("application/json")
			    .then().expect().statusCode(200)
			    .body(containsString("success"))
			    .body("success",equalTo(true))
			    .body(containsString("url"))
			    .body(containsString("maneuvers"))
			    .body(containsString("summary"))
			    .and().time(lessThan(45000L))
			    .when()
			    .post(baseURL + coreRouting2)
			    .then().log().all()
			    .contentType(ContentType.JSON)
				.extract()
		        .response();
				
				int code = response.getStatusCode();
				int totDist = 0;
				Assert.assertTrue(code == 200, "The returned status code is not 200");
				System.out.println("Status code is " + code);
				
				Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
				System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");
				
					String compareUrlStr = response.body().path("url");
					System.out.println("URL value is " + compareUrlStr);
					assertThat(compareUrlStr).isNotEmpty();
					Assert.assertTrue(response.body().path("summary") != null,"summary is null.");
								
					int wayPointsCount = response.path("waypoints.size()");	
					Assert.assertTrue(wayPointsCount > 0, "Waypoints count is not greater than 0.");
					
					for(int x=0; x<wayPointsCount; x++) {
						
						int waypointDist = response.path("waypoints[" + x + "].distance");
						if(waypointDist > 0) {
					         totDist += waypointDist;				 
					     }
					}
					     
					System.out.println("the value of totDist is now " + totDist);
					System.out.println("the value of summary.distance is " +  response.path("summary.distance"));
					int summaryDist = response.path("summary.distance");
					Assert.assertTrue(totDist == summaryDist, "Total waypoint distance does not equal summary distance value.");
				
	}
	
	@Test
	public void s200_MissingFirst_And_LastParam_Dir_URL_Returned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.missingFirstAndLastParam_Return200;
	   getRestCallConfig();
		
	   Response response = 	   
			     given()
			    .header("Authorization",authorization)
			    .body(myPostJson).with().contentType("application/json")
			    .then().expect().statusCode(200)
			    .body(containsString("success"))
			    .body("success",equalTo(true))
			    .body(containsString("url"))
			    .body(containsString("maneuvers"))
			    .body(containsString("summary"))
			    .and().time(lessThan(45000L))
			    .when()
			    .post(baseURL + coreRouting2)
			    .then().log().all()
			    .contentType(ContentType.JSON)
				.extract()
		        .response();
				
				int code = response.getStatusCode();
				int totDist = 0;
				Assert.assertTrue(code == 200, "The returned status code is not 200");
				System.out.println("Status code is " + code);
				
				Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
				System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+" sec");
				
					String compareUrlStr = response.body().path("url");
					System.out.println("URL value is " + compareUrlStr);
					assertThat(compareUrlStr).isNotEmpty();
					Assert.assertTrue(response.body().path("summary") != null,"summary is null.");
								
					int wayPointsCount = response.path("waypoints.size()");	
					Assert.assertTrue(wayPointsCount > 0, "Waypoints count is not greater than 0.");
					
					for(int x=0; x<wayPointsCount; x++) {
						
						int waypointDist = response.path("waypoints[" + x + "].distance");
						if(waypointDist > 0) {
					         totDist += waypointDist;				 
					     }
					}
					     
					System.out.println("the value of totDist is now " + totDist);
					System.out.println("the value of summary.distance is " +  response.path("summary.distance"));
					int summaryDist = response.path("summary.distance");
					Assert.assertTrue(totDist == summaryDist, "Total waypoint distance does not equal summary distance value.");
				
	}
	
	@Test
	public void s200_NotEnoughtimeForAllWayPoints_Queue_Returned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.notEnoughTimeForAllWayPointsQueueReturned200;
	   getRestCallConfig();
		
	   Response response = 	   
			     given()
			    .header("Authorization",authorization)
			    .body(myPostJson).with().contentType("application/json")
			    .then().expect().statusCode(200)
			    .body(containsString("success"))
			    .body("success",equalTo(true))
			    .body(containsString("url"))
			    .body(containsString("maneuvers"))
			    .body(containsString("summary"))
			    .and().time(lessThan(45000L))
			    .when()
			    .post(baseURL + coreRouting2)
			    .then().log().all()
			    .contentType(ContentType.JSON)
				.extract()
		        .response();
				
				int code = response.getStatusCode();
				int totDist = 0;
				Assert.assertTrue(code == 200, "The returned status code is not 200");
				System.out.println("Status code is " + code);
				
				Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
				System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) +" sec");
				
					String compareUrlStr = response.body().path("url");
					System.out.println("URL value is " + compareUrlStr);
					assertThat(compareUrlStr).isNotEmpty();
					Assert.assertTrue(response.body().path("summary") != null,"summary is null.");
								
					int wayPointsCount = response.path("waypoints.size()");	
					Assert.assertTrue(wayPointsCount > 0, "Waypoints count is not greater than 0.");
					int queueCount = response.path("queue.size()");
					Assert.assertTrue(queueCount == 23, "The expected queue count was not returned.");
					for(int x=0; x<wayPointsCount; x++) {
						
						int waypointDist = response.path("waypoints[" + x + "].distance");
						if(waypointDist > 0) {
					         totDist += waypointDist;				 
					     }
					}
					     
					System.out.println("the value of totDist is now " + totDist);
					System.out.println("the value of summary.distance is " +  response.path("summary.distance"));
					int summaryDist = response.path("summary.distance");
					Assert.assertTrue(totDist == summaryDist, "Total waypoint distance does not equal summary distance value.");
				
	}
	
	@Test
	public void s400_BadWayPoint_LatValueSetTo0_UnableToConnectWaypoint_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.badWayPointLatSetTo0400Returned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("No route found."))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then()
		.log().all()
		.contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 400, "The returned status code is not 400");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");
				
	}
	
	@Test
	public void s400_NoStartTime_FlexibleTrue_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.noStartTimeWithFlexibleTrue_400Returned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Invalid start time for the first waypoint. No other inflexible waypoints can start before."))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then()
		.log().all()
		.contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 400, "The returned status code is not 400");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");
				
	}
	
	
	@Test
	public void s400_RouteStartAndRouteEndTimeBeforeWayPointStartTime_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.routeStartAndRouteEndTimeIsBeforeWayPointStartTime_400Returned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Waypoint is not in available time."))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then()
		.log().all()
		.contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 400, "The returned status code is not 400");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");
				
	}
	
	@Test
	public void s400_BadLastStartTime_NotEnoughTime_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.badLastStartTimeNotEnoughTime_400Returned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Unable to build route."))
	    .body("error.details[1].errormessage", equalTo("Unreachable"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then()
		.log().all()
		.contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 400, "The returned status code is not 400");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");
				
	}
	
	@Test
	public void s400_BlockTimeUsesUpAvailTime_FlexFalse_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.blockTimeUeseUpAvailTime_FlexFalse_400Returned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Invalid block time. No block time values may exceed the routes end time."))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then()
		.log().all()
		.contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 400, "The returned status code is not 400");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");
				
	}
	
	@Test
	public void s400_MissingParam_Profile_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.missingParam_Profile_400Returned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Missing/Invalid Required Parameter: profile.type"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then()
		.log().all()
		.contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 400, "The returned status code is not 400");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");
				
	}
	
	@Test
	public void s400_WrongDatType_FirstParam_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.wrongDataTypeFirstParam_400Returned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Waypoint missing id."))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then()
		.log().all()
		.contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 400, "The returned status code is not 400");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");
				
	}
	
	
	@Test
	public void s400_WrongDataType_WayPointStartTime_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.wrongDataTypeWayPointStartTime_400Returned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Waypoint, 66Hawley, missing valid start or flexible flag."))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then()
		.log().all()
		.contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 400, "The returned status code is not 400");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");
				
	}
	
	@Test
	public void s400_BlankPostbody_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.blankPostBody_400Returned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Missing/Invalid Required Parameter: profile.type"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then()
		.log().all()
		.contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 400, "The returned status code is not 400");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");
				
	}
	
	@Test
	public void s400_TruckTooTall_Hight150_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.Truck_TooTall_Height150_400Returned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Invalid Parameter expected height to between [0,50] received 150"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then()
		.log().all()
		.contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 400, "The returned status code is not 400");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");
				
	}
	
	@Test
	public void s400_TruckTooLong_Length400_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.Truck_TooLong_Length400_400Returned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Invalid Parameter expected length to between [0,300] received 400"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then()
		.log().all()
		.contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 400, "The returned status code is not 400");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");
				
	}
	
	
	@Test
	public void s400_TruckTooWide_Width150_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.Truck_TooWide_Width150_400Returned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Invalid Parameter expected width to between [0,50] received 150"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then()
		.log().all()
		.contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 400, "The returned status code is not 400");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");
				
	}
	
	@Test
	public void s400_TruckTooManyTrailers_5Trailers_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.Truck_TooManyTrailers_5Trailers_400Returned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Invalid Parameter expected trailers to between [0,4] received 5"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then()
		.log().all()
		.contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 400, "The returned status code is not 400");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");
				
	}
	
	@Test
	public void s400_TimeBasedLegacyTrue_InvalidStartTime_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.timeBasedLegacyTrue_InvalidStartTime_400Returned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Invalid start time for route. Waypoint starts before."))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then()
		.log().all()
		.contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 400, "The returned status code is not 400");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");
				
	}
	
	
	/*
	 *   Additional Routing V2 tests
	 */
	
	@Test
	public void s200_RoutingV2_3WayPointsBike_Dir_False_EmptyDir_URLReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.coreRoutingV2_3WayPointsTileTrue200;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("success"))
	    .body(containsString("url"))
	    .body(containsString("maneuvers"))
	    .body(containsString("summary"))
	    .body("success",equalTo(true))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + "sec");
		
			String compareUrlStr = response.body().path("url");
			System.out.println("URL value is " + compareUrlStr);
			
			Assert.assertTrue(compareUrlStr != null,"url is null.");
			Assert.assertTrue(response.body().path("summary") != null,"summary is null.");
			
			int wayPointsCount = response.path("waypoints.size()");
			
			Assert.assertTrue(wayPointsCount > 0, "Waypoints count is not greater than 0.");
			
			for(int x=0; x<wayPointsCount; x++) {
				
				int maneuversCompare = response.body().path("waypoints[" + x + "].maneuvers.size()");
				Assert.assertTrue(maneuversCompare == 0,"Maneuvers is not empty.");
				
			}
					
	}
	
	
	@Test
	public void s200_RoutingV2_3WayPointsBike_AllOptions_False_EmptyDir_NoURLReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.coreRoutingV2_3WayPointsAllOptFalse200;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(not(containsString("error")))
	    .body(containsString("success"))
	    .body(containsString("geojson"))
	    .body(not(containsString("url")))
	    .body(containsString("maneuvers"))
	    .body(containsString("summary"))
	    .body("success",equalTo(true))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");
		
			Assert.assertTrue(response.body().path("summary") != null,"summary is null.");
			
			int wayPointsCount = response.path("waypoints.size()");
			
			Assert.assertTrue(wayPointsCount > 0, "Waypoints count is not greater than 0.");
			
			for(int x=0; x<wayPointsCount; x++) {
				
				int maneuversCompare = response.body().path("waypoints[" + x + "].maneuvers.size()");
				Assert.assertTrue(maneuversCompare == 0,"Maneuvers is not empty.");
				
			}
					
	}
		
	
	
	
	
	@Test
	public void s200_RoutingV2_6WayPointsNearBy_Pedestrian_OptimizedFalse_URL_DirReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.routingV2_6WayPointsNearBy_Esri200;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("success"))
	    .body("success",equalTo(true))
	    .body(containsString("url"))
	    .body(containsString("maneuvers"))
	    .body(containsString("summary"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");
		
			String compareUrlStr = response.body().path("url");
			System.out.println("URL value is " + compareUrlStr);
			assertThat(compareUrlStr).isNotEmpty();
			Assert.assertTrue(response.body().path("summary") != null,"summary is null.");
						
			int wayPointsCount = response.path("waypoints.size()");	
			Assert.assertTrue(wayPointsCount > 0, "Waypoints count is not greater than 0.");
			
			for(int x=0; x<wayPointsCount; x++) {
				
				Assert.assertTrue(response.body().path("waypoints[" + x + "].maneuvers") != null,"maneuvers is null.");
				
			}
					
	}
	
	
	@Test
	public void s200_RoutingV2_25WayPoints_Bicycle_URL_DirReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.routingV2_25WayPointsBicycle_DirReturned200;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("success"))
	    .body("success",equalTo(true))
	    .body(containsString("url"))
	    .body(containsString("maneuvers"))
	    .body(containsString("summary"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");
		
			String compareUrlStr = response.body().path("url");
			System.out.println("URL value is " + compareUrlStr);
			assertThat(compareUrlStr).isNotEmpty();
			Assert.assertTrue(response.body().path("summary") != null,"summary is null.");
						
			int wayPointsCount = response.path("waypoints.size()");	
			Assert.assertTrue(wayPointsCount > 0, "Waypoints count is not greater than 0.");
			
			for(int x=0; x<wayPointsCount; x++) {
				
				Assert.assertTrue(response.body().path("waypoints[" + x + "].maneuvers") != null,"maneuvers is null.");
				
			}
					
	}
	

	@Test
	public void s400_WrongDataType_First_Param_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.wrongDataType_First_Param_Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Waypoint missing id."))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then()
		.log().all()
		.contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");
				
	}
	
	@Test
	public void s400_WrongDataType_StartTime_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.wrongDataType_StartTime_Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Waypoint, 66Hawley, missing valid start or flexible flag."))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreRouting2)
	    .then()
		.log().all()
		.contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " sec");
				
	}

	/*
	 *    isoline/1
	 */
	
	@Test
	public void s200_GetRoutingIsolineSingleRange_IsolineReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("mode", "shortest;car;traffic:enabled")
				.param("start", "geo!52.51578,13.37749")
				.param("range", "2000")
				.param("rangetype", "time")
				.header("authorization","MapAnythingTestKey")
				.then().expect().statusCode(200)
				.and().time(lessThan(12000L))
				.when().get(baseURL + coreIsoline1)
				.then()
				.body(containsString("response"))
				.body(containsString("metaInfo"))
				.body(containsString("center"))
				.body(containsString("isoline"))
				.body(containsString("start"))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");	
	}
	
	
	@Test
	public void s200_BadInputParamValues_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("mode", "bad;bad;bad:bad")
				.param("start", "geo!BAD")
				.param("range", "BAD")
				.param("rangetype", "BAD")
				.header("authorization","MapAnythingTestKey")
				.then().expect().statusCode(200)
				.and().time(lessThan(12000L))
				.when().get(baseURL + coreIsoline1)
				.then()
				.body(containsString("type"))
				.body(containsString("subtype"))
				.body(containsString("details"))
				.body(containsString("metaInfo"))
				.body("type", equalTo("ApplicationError"))
				.body("details", equalTo("Invalid input parameter value"))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
		
	}
	
	@Test
	public void s400_InvalidRequestParam_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("modeBad", "shortest;car;traffic:enabled")
				.param("startBad", "geo!52.51578,13.37749")
				.param("rangeBad", "2000")
				.param("rangetypeBad", "time")
				.header("authorization","MapAnythingTestKey")
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + coreIsoline1)
				.then()
				.body(containsString("error"))
				.body("error[0].message", equalTo("Missing Required Parameter: range"))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
				
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
		
	}
	
	@Test
	public void s400_NoRequestParam_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("modeBad", "shortest;car;traffic:enabled")
				.param("startBad", "geo!52.51578,13.37749")
				.param("rangeBad", "2000")
				.param("rangetypeBad", "time")
				.header("authorization","MapAnythingTestKey")
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + coreIsoline1)
				.then()
				.body(containsString("error"))
				.body("error[0].message", equalTo("Missing Required Parameter: range"))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
				
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
		
	}
	
	@Test
	public void s200_RoutingIsoline_MultiRange_ResponseReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("mode", "shortest;car;traffic:enabled")
				.param("start", "geo!52.51578,13.37749")
				.param("range", "2000,4000,6000")
				.param("rangetype", "time")
				.header("authorization","MapAnythingTestKey")
				.then().expect().statusCode(200)
				.and().time(lessThan(12000L))
				.when().get(baseURL + coreIsoline1)
				.then()
				.body(containsString("response"))
				.body(containsString("metaInfo"))
				.body(containsString("center"))
				.body(containsString("isoline"))
				.body(containsString("start"))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
		
	}
	
	@Test
	public void s400_NegativeRangeParam_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("mode", "shortest;car;traffic:enabled")
				.param("start", "geo!52.51578,13.37749")
				.param("range", "-5000")
				.param("rangetype", "time")
				.header("authorization","MapAnythingTestKey")
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + coreIsoline1)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("Range values cannot be negative."))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
				
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
		
	}
	
	@Test
	public void s400_NoModeRequestParam_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("start", "geo!52.51578,13.37749")
				.param("range", "2000")
				.param("rangetype", "time")
				.header("authorization","MapAnythingTestKey")
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + coreIsoline1)
				.then()
				.body(containsString("error"))
				.body("error[0].message", equalTo("Missing Required Parameter: mode"))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
				
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
		
	}
	
	@Test
	public void s200_MissingStartParam_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("mode", "shortest;car;traffic:enabled")
				.param("range", "2000")
				.param("rangetype", "time")
				.header("authorization","MapAnythingTestKey")
				.then().expect().statusCode(200)
				.and().time(lessThan(12000L))
				.when().get(baseURL + coreIsoline1)
				.then()
				.body(containsString("type"))
				.body(containsString("subtype"))
				.body(containsString("details"))
				.body(containsString("additionalData"))
				.body(containsString("metaInfo"))
				.body("details", equalTo("Input parameter validation failed. Must specify a start position"))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
				
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
		
	}
	
	@Test
	public void s400_MissingRangeParam_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("start", "geo!52.51578,13.37749")
				.param("mode", "shortest;car;traffic:enabled")
				.param("rangetype", "time")
				.header("authorization","MapAnythingTestKey")
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + coreIsoline1)
				.then()
				.body(containsString("error"))
				.body("error[0].message", equalTo("Missing Required Parameter: range"))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
				
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
		
	}
	
	@Test
	public void s400_MissingRangeTypeParam_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("start", "geo!52.51578,13.37749")
				.param("mode", "shortest;car;traffic:enabled")
				.param("range", "5000")
				.header("authorization","MapAnythingTestKey")
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + coreIsoline1)
				.then()
				.body(containsString("error"))
				.body("error[0].message", equalTo("Missing Required Parameter: rangetype"))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
				
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
		
	}
	
	@Test
	public void s200_RoutingIsoline_ModeShortestCarTrafficEnabled_ResponseReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("mode", "shortest;car;traffic:enabled")
				.param("start", "geo!52.51578,13.37749")
				.param("range", "4000")
				.param("rangetype", "time")
				.header("authorization","MapAnythingTestKey")
				.then().expect().statusCode(200)
				.and().time(lessThan(12000L))
				.when().get(baseURL + coreIsoline1)
				.then()
				.body(containsString("response"))
				.body(containsString("metaInfo"))
				.body(containsString("center"))
				.body(containsString("isoline"))
				.body(containsString("start"))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
		
	}
	
	@Test
	public void s200_RoutingIsoline_ModeShortestCarTrafficDisabled_ResponseReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("mode", "shortest;car;traffic:disabled")
				.param("start", "geo!52.51578,13.37749")
				.param("range", "4000")
				.param("rangetype", "time")
				.header("authorization","MapAnythingTestKey")
				.then().expect().statusCode(200)
				.and().time(lessThan(12000L))
				.when().get(baseURL + coreIsoline1)
				.then()
				.body(containsString("response"))
				.body(containsString("metaInfo"))
				.body(containsString("center"))
				.body(containsString("isoline"))
				.body(containsString("start"))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
		
	}
	
	@Test
	public void s200_RoutingIsoline_FastestPedestrian_ResponseReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("mode", "fastest;pedestrian;traffic:disabled")
				.param("start", "geo!52.51578,13.37749")
				.param("range", "200")
				.param("rangetype", "distance")
				.header("authorization","MapAnythingTestKey")
				.then().expect().statusCode(200)
				.and().time(lessThan(12000L))
				.when().get(baseURL + coreIsoline1)
				.then()
				.body(containsString("response"))
				.body(containsString("metaInfo"))
				.body(containsString("center"))
				.body(containsString("isoline"))
				.body(containsString("start"))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
		
	}
	
	@Test
	public void s200_RoutingIsoline_ShortestPedestrian_ResponseReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("mode", "shortest;pedestrian;traffic:disabled")
				.param("start", "geo!52.51578,13.37749")
				.param("range", "200")
				.param("rangetype", "distance")
				.header("authorization","MapAnythingTestKey")
				.then().expect().statusCode(200)
				.and().time(lessThan(12000L))
				.when().get(baseURL + coreIsoline1)
				.then()
				.body(containsString("response"))
				.body(containsString("metaInfo"))
				.body(containsString("center"))
				.body(containsString("isoline"))
				.body(containsString("start"))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
		
	}
	
	/*
	 *    /batchgeocode/1
	 */
	
	@Test
	public void s200_BatchGeocode_GeocodeArrayReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.s200_BatchGeocode_GeoCodeArrayReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("success"))
	    .body(containsString("array"))
	    .body(containsString("geocodeArray"))
	    .body("array[0].geocodeArray[0].success", equalTo(true))
	    .body("array[1].geocodeArray[0].success", equalTo(true))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreBatchGeocode1)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		int totDist = 0;
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
					
	}
	
	@Test
	public void s200_MultipleAddresses_GeocodeArrayDataSetReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.s200_MultipleAddresses_LatLngReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("success"))
	    .body(containsString("array"))
	    .body(containsString("geocodeArray"))
	    .body(containsString("lat"))
	    .body(containsString("lng"))
	    .body("array[0].geocodeArray[0].success", equalTo(true))
	    .body("array[0].geocodeArray[0].data.position.lat", not(empty()))
	    .body("array[0].geocodeArray[0].data.position.lng", not(empty()))
	    .body("array[1].geocodeArray[0].success", equalTo(true))
	    .body("array[1].geocodeArray[0].data.position.lat", not(empty()))
	    .body("array[1].geocodeArray[0].data.position.lng", not(empty()))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreBatchGeocode1)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		int totDist = 0;
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
		
		int arrayCount = response.path("array.size()");	
		Assert.assertTrue(arrayCount > 0, "Array count is not greater than 0.");
		
		for(int x=0; x<arrayCount; x++) {
			
			Assert.assertTrue(response.body().path("array[" + x + "].geocodeArray[0].data.position.lat") != null,"lat is null.");
			Assert.assertTrue(response.body().path("array[" + x + "].geocodeArray[0].data.position.lng") != null,"lng is null.");
			
		}
					
	}
	
	@Test
	public void s200_OnlyCityProvided_LatLngReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.s200_OnlyCityProvided_LatLngReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("success"))
	    .body(containsString("array"))
	    .body(containsString("geocodeArray"))
	    .body(containsString("lat"))
	    .body(containsString("lng"))
	    .body("array[0].geocodeArray[0].success", equalTo(true))
	    .body("array[0].geocodeArray[0].data.position.lat", not(empty()))
	    .body("array[0].geocodeArray[0].data.position.lng", not(empty()))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreBatchGeocode1)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		int totDist = 0;
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
		
		int arrayCount = response.path("array.size()");	
		Assert.assertTrue(arrayCount > 0, "Array count is not greater than 0.");
		
		for(int x=0; x<arrayCount; x++) {
			
			Assert.assertTrue(response.body().path("array[" + x + "].geocodeArray[0].data.position.lat") != null,"lat is null.");
			Assert.assertTrue(response.body().path("array[" + x + "].geocodeArray[0].data.position.lng") != null,"lng is null.");
			
		}
					
	}
	
	@Test
	public void s200_OnlyCountryProvided_LatLngReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.s200_OnlyCountryProvided_LatLngReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("success"))
	    .body(containsString("array"))
	    .body(containsString("geocodeArray"))
	    .body(containsString("lat"))
	    .body(containsString("lng"))
	    .body("array[0].geocodeArray[0].success", equalTo(true))
	    .body("array[0].geocodeArray[0].data.position.lat", not(empty()))
	    .body("array[0].geocodeArray[0].data.position.lng", not(empty()))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreBatchGeocode1)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		int totDist = 0;
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
		
		int arrayCount = response.path("array.size()");	
		Assert.assertTrue(arrayCount > 0, "Array count is not greater than 0.");
		
		for(int x=0; x<arrayCount; x++) {
			
			Assert.assertTrue(response.body().path("array[" + x + "].geocodeArray[0].data.position.lat") != null,"lat is null.");
			Assert.assertTrue(response.body().path("array[" + x + "].geocodeArray[0].data.position.lng") != null,"lng is null.");
			
		}
					
	}
	
	@Test
	public void s200_OnlyPostalProvided_LatLngReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.s200_OnlyPostalProvided_LatLngReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("success"))
	    .body(containsString("array"))
	    .body(containsString("geocodeArray"))
	    .body(containsString("lat"))
	    .body(containsString("lng"))
	    .body("array[0].geocodeArray[0].success", equalTo(true))
	    .body("array[0].geocodeArray[0].data.position.lat", not(empty()))
	    .body("array[0].geocodeArray[0].data.position.lng", not(empty()))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreBatchGeocode1)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		int totDist = 0;
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
		
		int arrayCount = response.path("array.size()");	
		Assert.assertTrue(arrayCount > 0, "Array count is not greater than 0.");
		
		for(int x=0; x<arrayCount; x++) {
			
			Assert.assertTrue(response.body().path("array[" + x + "].geocodeArray[0].data.position.lat") != null,"lat is null.");
			Assert.assertTrue(response.body().path("array[" + x + "].geocodeArray[0].data.position.lng") != null,"lng is null.");
			
		}
					
	}
	
	@Test
	public void s200_OnlyStreetValueProvided_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.s200_OnlyStreetValueProvided_ErrorReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("success"))
	    .body(containsString("array"))
	    .body("array[0].success", equalTo(false))
	    .body("array[0].message", equalTo("No results for that particular address."))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreBatchGeocode1)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
							
	}
	
	@Test
	public void s200_BatchGeocodeLithonia_LatLngReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.s200_BatchGeocodeLithonia_LatLngReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("success"))
	    .body(containsString("array"))
	    .body(containsString("geocodeArray"))
	    .body(containsString("lat"))
	    .body(containsString("lng"))
	    .body("array[0].geocodeArray[0].success", equalTo(true))
	    .body("array[0].geocodeArray[0].data.position.lat", not(empty()))
	    .body("array[0].geocodeArray[0].data.position.lng", not(empty()))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreBatchGeocode1)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		int totDist = 0;
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
		
		int arrayCount = response.path("array.size()");	
		Assert.assertTrue(arrayCount > 0, "Array count is not greater than 0.");
		
		for(int x=0; x<arrayCount; x++) {
			
			Assert.assertTrue(response.body().path("array[" + x + "].geocodeArray[0].data.position.lat") != null,"lat is null.");
			Assert.assertTrue(response.body().path("array[" + x + "].geocodeArray[0].data.position.lng") != null,"lng is null.");
			
		}
					
	}
	
	@Test
	public void s200_FirstAddressValueInvalid_GeoCodeDataReturnedForSecAdd_LatLngReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.s200_FirstAddressValueInvalid_GeocodeDataReturnedSecAdd;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("success"))
	    .body(containsString("array"))
	    .body(containsString("geocodeArray"))
	    .body(containsString("lat"))
	    .body(containsString("lng"))
	    .body("array[0].success", equalTo(false))
	    .body("array[0].message", equalTo("No results for that particular address."))
	    .body("array[1].geocodeArray[0].success", equalTo(true))
	    .body("array[1].geocodeArray[0].data.position.lat", not(empty()))
	    .body("array[1].geocodeArray[0].data.position.lng", not(empty()))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreBatchGeocode1)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		int totDist = 0;
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
		
		int arrayCount = response.path("array.size()");	
		Assert.assertTrue(arrayCount > 0, "Array count is not greater than 0.");
		
		for(int x=1; x<arrayCount; x++) {
			
			Assert.assertTrue(response.body().path("array[" + x + "].geocodeArray[0].data.position.lat") != null,"lat is null.");
			Assert.assertTrue(response.body().path("array[" + x + "].geocodeArray[0].data.position.lng") != null,"lng is null.");
			
		}
					
	}
	
	@Test
	public void s200_InvalidAddressValue_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.s200_InvalidAddressValue_ErrorReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("success"))
	    .body(containsString("array"))
	    .body("array[0].success", equalTo(false))
	    .body("array[0].message", equalTo("No results for that particular address."))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreBatchGeocode1)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
							
	}
	
	@Test
	public void s200_Expecting400_MisMatchedBodyParam_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.s200_MisMatchingBodyParam_ErrorReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("success"))
	    .body(containsString("array"))
	    .body("array[0].success", equalTo(false))
	    .body("array[0].message", equalTo("No results for that particular address."))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreBatchGeocode1)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
							
	}
	
	@Test
	public void s500_Expecting400_InvalidParam_WrongDataType_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersCore1 postdata = new PostDataDataLayersCore1();
	   String myPostJson = postdata.s500_InvalidParam_WrongDataType_ErrorReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(500)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Internal Server Error: Please contact support."))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + coreBatchGeocode1)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		
		Assert.assertTrue(code == 500, "The returned status code is not 500");
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==500,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
							
	}
	
	/*
	 *     /core/geocoding/1
	 */
	
	@Test
	public void s200_GeoCoder_LatLngReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("address", "3481 Lakeside DR Atlanta GA USA")
				.header("authorization","MapAnythingTestKey")
				.then().expect().statusCode(200)
				.and()
				.time(lessThan(12000L))
				.when()
				.get(baseURL + coreGeocoding1)
				.then()
				.body("geocodeArray[0].success", equalTo(true))
				.body(containsString("geocodeArray"))
				.body(containsString("success"))
				.body(containsString("lat"))
				.body(containsString("lng"))
				.body("geocodeArray[0].data.position.lat", not(empty()))
			    .body("geocodeArray[0].data.position.lng", not(empty()))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");	
	}
	
	@Test
	public void s400_MisMatchingRequestParam_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("country", "GA")
				.param("city", "30305")
				.param("street", false)
				.param("postal", "Atlanta")
				.param("state", "USA")
				.header("authorization","MapAnythingTestKey")
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + coreGeocoding1)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("No results for that particular address."))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
				
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
		
	}
	
	@Test
	public void s400_BadParam_Address_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("address", "000")
				.header("authorization","MapAnythingTestKey")
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + coreGeocoding1)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("No results for that particular address."))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
				
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
		
	}
	
	@Test
	public void s200_GeoCoder_ATL_LatLngReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("country", "USA")
				.param("city", "Atlanta")
				.param("street", "North Ave NW")
				.param("postal", "30332")
				.param("state", "GA")
				.header("authorization","MapAnythingTestKey")
				.then().expect().statusCode(200)
				.and()
				.time(lessThan(12000L))
				.when()
				.get(baseURL + coreGeocoding1)
				.then()
				.body("geocodeArray[0].success", equalTo(true))
				.body(containsString("geocodeArray"))
				.body(containsString("success"))
				.body(containsString("lat"))
				.body(containsString("lng"))
				.body("geocodeArray[0].data.position.lat", not(empty()))
			    .body("geocodeArray[0].data.position.lng", not(empty()))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");	
	}
	
	@Test
	public void s200_GeoCoder_AddressParam_InvalidCountry_LatLngReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("address", "3481 Lakeside Dr Atlanta GA 1")
				.header("authorization","MapAnythingTestKey")
				.then().expect().statusCode(200)
				.and()
				.time(lessThan(12000L))
				.when()
				.get(baseURL + coreGeocoding1)
				.then()
				.body("geocodeArray[0].success", equalTo(true))
				.body(containsString("geocodeArray"))
				.body(containsString("success"))
				.body(containsString("lat"))
				.body(containsString("lng"))
				.body("geocodeArray[0].data.position.lat", not(empty()))
			    .body("geocodeArray[0].data.position.lng", not(empty()))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
		
	}
	
	@Test
	public void s400_GeoCoder_InvalidCityStateAndCountry_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("address", "3481 Lakeside Dr 1234 0 1")
				.header("authorization","MapAnythingTestKey")
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + coreGeocoding1)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("No results for that particular address."))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
				
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
		
	}
	
	@Test
	public void s200_MultipleAddress_LatLngReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("country", "USA")
				.param("city", "Dunwoody")
				.param("street", "10 Glenlake Pkwy")
				.param("postal", "30328")
				.param("state", "GA")
				.param("country", "USA")
				.param("city", "Atlanta")
				.param("street", "North Ave NW")
				.param("postal", "30332")
				.param("state", "GA")
				.header("authorization","MapAnythingTestKey")
				.then().expect().statusCode(200)
				.and()
				.time(lessThan(12000L))
				.when()
				.get(baseURL + coreGeocoding1)
				.then()
				.body("geocodeArray[0].success", equalTo(true))
				.body(containsString("geocodeArray"))
				.body(containsString("success"))
				.body(containsString("lat"))
				.body(containsString("lng"))
				.body("geocodeArray[0].data.position.lat", not(empty()))
			    .body("geocodeArray[0].data.position.lng", not(empty()))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)  + " sec");
		
	}
	
	
}	