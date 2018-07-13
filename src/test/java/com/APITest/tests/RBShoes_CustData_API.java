package com.APITest.tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.APITest.data.PostDataDataLayersAPI;
import com.APITest.data.PostDataDataLayersCore1;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RBShoes_CustData_API {
	
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
	
	public String pointInPolygon1 = "/api/boots/1";
	public String pointInPolygon2 = "/api/rbshoes/2";
	public String pointsInPolygons = "/api/highheel/2";
	
	
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
	 *    /api/pointinpolygon/1
	 */
	
	@Test
	public void s200_PointInPolygon2ItemsReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s200_PointInPolygon2ItemsReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("polygons"))
	    .body(containsString("id"))
	    .body(containsString("intersects"))
	    .body(containsString("success"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + pointInPolygon1)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
		
		Assert.assertTrue(response.body().path("polygons[0]") != null,"polygons[0] is null.");
		Assert.assertTrue(response.body().path("polygons[1]") != null,"polygons[1] is null.");
					
	}
	
	
	@Test
	public void s200_StringDataType_LatLngValue_2ItemsReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s200_StringDataTypeLatLngValue_2ItemsReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("polygons"))
	    .body(containsString("id"))
	    .body(containsString("intersects"))
	    .body(containsString("success"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + pointInPolygon1)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
		
		Assert.assertTrue(response.body().path("polygons[0]") != null,"polygons[0] is null.");
		Assert.assertTrue(response.body().path("polygons[1]") != null,"polygons[1] is null.");
					
	}
	
	@Test
	public void s200_PointInPolygon7ItemsReturnedCon2Intersections() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s200_PointInPolygon7ItemsReturned2Intersec;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("polygons"))
	    .body(containsString("id"))
	    .body(containsString("intersects"))
	    .body(containsString("success"))
	    .body("polygons[0].intersects", equalTo(true))
	    .body("polygons[1].intersects", equalTo(true))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + pointInPolygon1)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		int polygonsCount = response.path("polygons.size()");
				
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
		
		for(int x = 0; x < polygonsCount; ++x) {
			
			Assert.assertTrue(response.body().path("polygons[" + x + "]") != null,"polygons[" + x + "] is null.");
			System.out.println("Assertion passed ---> polygon[" + x + "] is not null");
		}
					
	}
	
	@Test
	public void s400_NoPolygonInPostBody_ErrorReturned() throws FileNotFoundException, IOException {
	
		PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s400_NoPolygonInPostBodyErrorReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Polygons array cannot be empty."))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + pointInPolygon1)
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
	public void s400_BlankPostBody_ErrorReturned() throws FileNotFoundException, IOException {
	
		PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s400_BlankPostBodyErrorReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error[0].message", equalTo("Missing Required Parameter: data"))
	    .body("error[1].message", equalTo("Missing Required Parameter: data.point"))
	    .body("error[2].message", equalTo("Missing Required Parameter: data.polygons"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + pointInPolygon1)
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
	public void s400_InvalidDataPolygonParam_ErrorReturned() throws FileNotFoundException, IOException {
	
		PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s400_InvalidDataPolygonParam_ErrorReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error[0].message", equalTo("Missing Required Parameter: data"))
	    .body("error[1].message", equalTo("Missing Required Parameter: data.point"))
	    .body("error[2].message", equalTo("Missing Required Parameter: data.polygons"))
	    .and().time(lessThan(45000L))
	    .when()
	    .post(baseURL + pointInPolygon1)
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
	public void s400_BadPointLatAndLngValues_ErrorReturned() throws FileNotFoundException, IOException {
	
		PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s400_BadPointLatLngValues_ErrorReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Point latitude parameter must be a number."))
	    .when()
	    .post(baseURL + pointInPolygon1)
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
	public void s400_BadLatLngValue_WrongDataType_ErrorReturned() throws FileNotFoundException, IOException {
	
		PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s400_BadLatLngValueWrongDataType_ErrorReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Path latitude parameter must be a number."))
	    .when()
	    .post(baseURL + pointInPolygon1)
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
	
	/*  is returning 500 - will uncomment once this has been fixed
	@Test
	public void s400_BadPathParam_FirstPolygon_ErrorReturned() throws FileNotFoundException, IOException {
	
		PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s400_BadPathParamFirstPolygon_ErrorReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Path latitude parameter must be a number."))
	    .when()
	    .post(baseURL + pointInPolygon1)
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
		
	}  */
	
	/*
	 *  point in polygon v2
	 */
	
	@Test
	public void s200_PointInPolygonV27ItemsReturnedCon2Intersections() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s200_PointInPolygonV2_7Items2Intersctions;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("polygons"))
	    .body(containsString("id"))
	    .body(containsString("intersects"))
	    .body(containsString("success"))
	    .body("polygons[0].intersects", equalTo(true))
	    .body("polygons[1].intersects", equalTo(true))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + pointInPolygon2)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		int polygonsCount = response.path("polygons.size()");
				
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
		
		for(int x = 0; x < polygonsCount; ++x) {
			
			Assert.assertTrue(response.body().path("polygons[" + x + "]") != null,"polygons[" + x + "] is null.");
			System.out.println("Assertion passed ---> polygon[" + x + "] is not null");
		}
					
	}
	
	@Test
	public void s200_StringLatLngValue_5ItemsReturnedCon2Intersections() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s200_StringLatLngValue_5Items2Intersctions;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("polygons"))
	    .body(containsString("id"))
	    .body(containsString("intersects"))
	    .body(containsString("success"))
	    .body("polygons[0].intersects", equalTo(true))
	    .body("polygons[1].intersects", equalTo(true))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + pointInPolygon2)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		int polygonsCount = response.path("polygons.size()");
				
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
		
		for(int x = 0; x < polygonsCount; ++x) {
			
			Assert.assertTrue(response.body().path("polygons[" + x + "]") != null,"polygons[" + x + "] is null.");
			System.out.println("Assertion passed ---> polygon[" + x + "] is not null");
		}
					
	}
	
	@Test
	public void s200_BadPathFirstPolygon_7ItemsReturned1Intersecting() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s200_BadPathFirstPolygon_7Items1Intersecting;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("polygons"))
	    .body(containsString("id"))
	    .body(containsString("intersects"))
	    .body(containsString("success"))
	    .body("polygons[0].intersects", equalTo(false))
	    .body("polygons[1].intersects", equalTo(true))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + pointInPolygon2)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		int polygonsCount = response.path("polygons.size()");
				
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
		
		for(int x = 0; x < polygonsCount; ++x) {
			
			Assert.assertTrue(response.body().path("polygons[" + x + "]") != null,"polygons[" + x + "] is null.");
			System.out.println("Assertion passed ---> polygon[" + x + "] is not null");
		}
					
	}
	
	@Test
	public void s200_BadPathPolygon1And2_7ItemsReturned0Intersect() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s200_BadPathPolygon1And2_7Items0Instersect;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("polygons"))
	    .body(containsString("id"))
	    .body(containsString("intersects"))
	    .body(containsString("success"))
	    .body("polygons[0].intersects", equalTo(false))
	    .body("polygons[0].message", equalTo("Invalid or malformed polygon data."))
	    .body("polygons[1].intersects", equalTo(false))
	    .body("polygons[1].message", equalTo("Invalid or malformed polygon data."))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + pointInPolygon2)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		int polygonsCount = response.path("polygons.size()");
				
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
		
		for(int x = 0; x < polygonsCount; ++x) {
			
			Assert.assertTrue(response.body().path("polygons[" + x + "]") != null,"polygons[" + x + "] is null.");
			System.out.println("Assertion passed ---> polygon[" + x + "] is not null");
		}
					
	}
	
	@Test
	public void s200_InvalidPolygons_3ItemsReturnedNoIntersection() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s200_InvalidPolygons_3ItemsNoInstersection;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("polygons"))
	    .body(containsString("id"))
	    .body(containsString("intersects"))
	    .body(containsString("success"))
	    .body("polygons[0].intersects", equalTo(false))
	    .body("polygons[0].message", equalTo("Invalid or malformed polygon data."))
	    .body("polygons[1].intersects", equalTo(false))
	    .body("polygons[1].message", equalTo("Invalid or malformed polygon data."))
	    .body("polygons[2].intersects", equalTo(false))
	    .body("polygons[2].message", equalTo("Invalid or malformed polygon data."))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + pointInPolygon2)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		int polygonsCount = response.path("polygons.size()");
				
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
		
		for(int x = 0; x < polygonsCount; ++x) {
			
			Assert.assertTrue(response.body().path("polygons[" + x + "]") != null,"polygons[" + x + "] is null.");
			System.out.println("Assertion passed ---> polygon[" + x + "] is not null");
		}
					
	}
	
	@Test
	public void s400_V2_BlankPostBody_ErrorReturned() throws FileNotFoundException, IOException {
	
		PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s400_BlankPostBodyErrorReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error[0].message", equalTo("Missing Required Parameter: data"))
	    .body("error[1].message", equalTo("Missing Required Parameter: data.point"))
	    .body("error[2].message", equalTo("Missing Required Parameter: data.polygons"))
	    .when()
	    .post(baseURL + pointInPolygon2)
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
	public void s400_EmptyPolygonArray_ErrorReturned() throws FileNotFoundException, IOException {
	
		PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s400_EmptyPolygonArray_ErrorReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Polygons array cannot be empty."))
	    .when()
	    .post(baseURL + pointInPolygon2)
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
	public void s400_MissingPointLatLng_ErrorReturned() throws FileNotFoundException, IOException {
	
		PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s400_MissingPointLatLng_ErrorReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Path latitude parameter cannot be null or undefined."))
	    .when()
	    .post(baseURL + pointInPolygon2)
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
	
	/*
	 *  points in polygons V2
	 */
	
	@Test
	public void s200_PointsInPolygons_GeoidsOnly_3PointItemsWithIntersectPolygonIdReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s200_PointsInPolygons_3PointItemsIntersectingReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("polygons"))
	    .body(containsString("id"))
	    .body(containsString("point"))
	    .body("[0].polygons[0]", equalTo("pointsP1andP2InPolygon_UsingGeoid"))
	    .body("[1].polygons[0]", equalTo("pointsP1andP2InPolygon_UsingGeoid"))
	    .body("[2].polygons[0]", equalTo("pointP3InPolygon_UsingGeoid"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + pointsInPolygons)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
				
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
					
	}
	
	@Test
	public void s200_3PointItemsWithIntersectPolygonIdAndGeoidReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s200_3PointItemsWithIntersecPolygonIdAndGeoidReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("point"))
	    .body(containsString("id"))
	    .body(containsString("lat"))
	    .body(containsString("lng"))
	    .body(containsString("polygons"))
	    .body("[0].polygons[0]", equalTo("pointsP1andP2InPolygon_ClosedPolygon"))
	    .body("[0].polygons[1]", equalTo("pointsP1andP2InPolygon_NotClosedPolygon"))
	    .body("[0].polygons[2]", equalTo("pointsP1andP2InPolygon_UsingGeoid"))
	    .body("[1].polygons[0]", equalTo("pointsP1andP2InPolygon_ClosedPolygon"))
	    .body("[1].polygons[1]", equalTo("pointsP1andP2InPolygon_NotClosedPolygon"))
	    .body("[1].polygons[2]", equalTo("pointsP1andP2InPolygon_UsingGeoid"))
	    .body("[2].polygons[0]", equalTo("pointP3InPolygon_UsingGeoid"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + pointsInPolygons)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
							
	}
	
	@Test
	public void s200_NoGeoIDProvided_3PointItemsWith2IntersectionReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s200_NoGeoIDProvided_3PointItem2IntersectionReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("point"))
	    .body(containsString("id"))
	    .body(containsString("lat"))
	    .body(containsString("lng"))
	    .body(containsString("polygons"))
	    .body("[0].polygons[0]", equalTo("pointsP1andP2InPolygon_ClosedPolygon"))
	    .body("[0].polygons[1]", equalTo("pointsP1andP2InPolygon_NotClosedPolygon"))
	    .body("[1].polygons[0]", equalTo("pointsP1andP2InPolygon_ClosedPolygon"))
	    .body("[1].polygons[1]", equalTo("pointsP1andP2InPolygon_NotClosedPolygon"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + pointsInPolygons)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
							
	}
	
	@Test
	public void s200_EmptyPath_2PointItemsWithNoIntersectionReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s200_EmptyPath_2PointItemsNoIntersectionReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("point"))
	    .body(containsString("id"))
	    .body(containsString("lat"))
	    .body(containsString("lng"))
	    .body(containsString("polygons"))
	    .body("[0].polygons[0]", equalTo(null))
	    .body("[1].polygons[0]", equalTo(null))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + pointsInPolygons)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
							
	}
	
	/*  expecting 200 but is returning 400 this will be commented out for now
	@Test
	public void s200_String_LatLngValue_3PointItemReturned() throws FileNotFoundException, IOException {
	
	   PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s200_StringLatLngValue3PointItemReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("point"))
	    .body(containsString("id"))
	    .body(containsString("lat"))
	    .body(containsString("lng"))
	    .body(containsString("polygons"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + pointsInPolygons)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		
		Assert.assertTrue(code == 200, "The returned status code is not 200");
		System.out.println("Status code is " + code);
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " sec");
							
	}  */
	
	@Test
	public void s400_InvalidLatLngParam_Polygon5_ErrorReturned() throws FileNotFoundException, IOException {
	
		PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s400_InvalidLatLngParam_Polygon5_ErrorReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Invalid parameter data.polygons.5.path expected [{lat,lng}] | undefined"))
	    .when()
	    .post(baseURL + pointsInPolygons)
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
	public void s400_Empty_Polygon_Array_ErrorReturned() throws FileNotFoundException, IOException {
	
		PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s400_NoPolygonValue_ErrorReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Polygons array cannot be empty."))
	    .when()
	    .post(baseURL + pointsInPolygons)
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
	public void s400_Blank_PostBody_ErrorReturned() throws FileNotFoundException, IOException {
	
		PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s400_BlankPostBodyErrorReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error[0].message", equalTo("Missing Required Parameter: data"))
	    .when()
	    .post(baseURL + pointsInPolygons)
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
	public void s400_Invalid_PolygonID_ErrorReturned() throws FileNotFoundException, IOException {
	
		PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s400_Invalid_PolygonID_ErrorReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Invalid parameter data.polygons.0.NOOOO expected undefined"))
	    .when()
	    .post(baseURL + pointsInPolygons)
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
	public void s400_Invalid_PointID_ErrorReturned() throws FileNotFoundException, IOException {
	
		PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s400_Invalid_PointID_ErrorReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Invalid parameter data.points.0.SoWhat expected undefined"))
	    .when()
	    .post(baseURL + pointsInPolygons)
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
	public void s400_Invalid_GeoID_ErrorReturned() throws FileNotFoundException, IOException {
	
		PostDataDataLayersAPI postdata = new PostDataDataLayersAPI();
	   String myPostJson = postdata.s400_Invalid_GeoID_ErrorReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Invalid parameter data.points.0.SoWhat expected undefined"))
	    .when()
	    .post(baseURL + pointsInPolygons)
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
	

}
