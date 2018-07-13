package com.APITest.tests;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.APITest.data.PostData;
import com.APITest.data.PostDataDataLayersAPI;
import com.APITest.data.PostDataShapesBoundary1;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class RBShoe_Shapes_boundary {
	
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
	
	public String dataSourcesPath = "/data/sources/1";
	public String boundaryOverLays = "/boundary/overlays/1";
	public String boundaryAutoComplete = "/boundary/autocomplete/1";
	public String boundarySearch = "/boundary/search/1";
	public String boundaryTile = "/boundary/tile/1";
	public String zipImport = "/boundary/zipimport/1";
	
	
	public void getRestCallConfig() throws FileNotFoundException, IOException {
		
		restCallConfig = new Properties();
		restCallConfig.load(new FileInputStream("RestCallConfig.properties"));
		
		baseURLStaging = restCallConfig.getProperty("baseURLStaging");
		baseURLProd = restCallConfig.getProperty("baseURLProd");
		baseURL = restCallConfig.getProperty("baseURLProd");
		timeLimit = restCallConfig.getProperty("timeLimit");
		timeLimitLStr = restCallConfig.getProperty("timeLimitL");
		tileKey1Prod = restCallConfig.getProperty("tileKey1Prod");
		tileKey2Prod = restCallConfig.getProperty("tileKey2Prod");
		authorization = restCallConfig.getProperty("authorization");
		xAPIKey = restCallConfig.getProperty("xAPIKey");
		
		timeLimitInt = Integer.parseInt(timeLimit);
		
	}
			
	/*
	 *    /boundary/overlays/1
	 */
	
	@Test
	public void s200_ReturnArrayOfAllOverLay() throws IOException, InterruptedException {
		
		getRestCallConfig();
		
		Response response = 
				given()
				.header("Authorization",authorization)
				.then().expect().statusCode(200)
				.and().time(lessThan(12000L))
				.when()
				.get(baseURL + boundaryOverLays)
				.then()
				.body(containsString("count"))
				.body(containsString("overlays"))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The total response time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		int countInt = response.body().path("count");
		int compareOverLaysIntValue = response.body().path("overlays.size()");
		
		Assert.assertEquals(countInt, compareOverLaysIntValue, "The total number of overlays does not match count.  Assertion Failed");
		System.out.println("Total number of overlays matches count.  Assertion passed");
	}
	
	
	@Test
	public void s200_AllParamsAvailable_ReturnOverLayArray() throws IOException, InterruptedException {
		
		getRestCallConfig();
		
		Response response = 
				given()
				.param("level", "2")
				.param("field", true)
				.param("overlay", "USA")
				.header("Authorization",authorization)
				.then().expect().statusCode(200)
				.and().time(lessThan(12000L))
				.when()
				.get(baseURL + boundaryOverLays)
				.then()
				.body(containsString("count"))
				.body(containsString("overlays"))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The total response time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		int countInt = response.body().path("count");
		int compareOverLaysIntValue = response.body().path("overlays.size()");
		
		Assert.assertEquals(countInt, compareOverLaysIntValue, "The total number of overlays does not match count.  Assertion Failed");
		System.out.println("Total number of overlays matches count.  Assertion passed");
	}
	
	
	@Test
	public void s200OverlayUSA_LevelsReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("overlay", "USA")
				.header("Authorization",authorization)
				.then().expect().statusCode(200)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryOverLays)
				.then()
				.body(containsString("count"))
				.body(containsString("overlays"))
				.body(containsString("levels"))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		int countInt = response.body().path("count");
		int compareOverLaysIntValue = response.body().path("overlays.size()");	
		int levelsCount = response.body().path("overlays[0].levels.size()");
		Assert.assertEquals(countInt, compareOverLaysIntValue);
		System.out.println("Count value equals number of overlays");
		
		Assert.assertTrue(levelsCount > 0, "level count is not greater than 0.");
		System.out.println("The levels count is " + levelsCount);
	}
	
	
	@Test
	public void s400BadOverLayParam_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("overlay", "BadOverlayName")
				.header("Authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryOverLays)
				.then()
				.body(containsString("error"))
				.body("error.errorCode", equalTo("Bad Request"))
				.body("error.message",equalTo("Bad overlay or overlay/level combination."))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	
	@Test
	public void s400BadOverLay_0_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("overlay", "0")
				.header("authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryOverLays)
				.then()
				.body(containsString("error"))
				.body("error.errorCode", equalTo("Bad Request"))
				.body("error.message",equalTo("Bad overlay or overlay/level combination."))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	
	@Test
	public void s200_FieldsTrue_ReturnArrayOfFields() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("overlay", "USA")
				.param("fields", "true")
				.header("authorization", authorization)
				.then().expect().statusCode(200)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryOverLays)
				.then()
				.body(containsString("count"))
				.body(containsString("overlays"))
				.body(containsString("fields"))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		int countInt = response.body().path("count");
		int compareOverLaysIntValue = response.body().path("overlays.size()");	
		int fieldsCount = response.body().path("overlays[0].levels.size()");
		Assert.assertEquals(countInt, compareOverLaysIntValue);
		System.out.println("Count value equals number of overlays");
		
		//to assert fields array are not empty for each levels object
		for(int x=0; x<fieldsCount; x++) {
			
			int totalFields = response.body().path("overlays[0].levels[" + x + "].fields.size()");
			System.out.println("The fields count for overlays[0].levels[" + x + "] is " + totalFields);
			Assert.assertTrue(totalFields > 0, "Fields array is missing.");
			
		}
		
	}
	
	@Test
	public void s200_FieldsParam_0_EmptyArrayOfFieldsReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("overlay", "USA")
				.param("fields", "0")
				.header("authorization", authorization)
				.then().expect().statusCode(200)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryOverLays)
				.then()
				.body(containsString("count"))
				.body(containsString("overlays"))
				.body(containsString("fields"))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		int countInt = response.body().path("count");
		int compareOverLaysIntValue = response.body().path("overlays.size()");	
		int fieldsCount = response.body().path("overlays[0].levels.size()");
		Assert.assertEquals(countInt, compareOverLaysIntValue);
		System.out.println("Count value equals number of overlays");
		
		for(int x=0; x<fieldsCount; x++) {
			
			int totalFields = response.body().path("overlays[0].levels[" + x + "].fields.size()");
			System.out.println("The fields count for overlays[0].levels[" + x + "] is " + totalFields);
			Assert.assertTrue(totalFields == 0, "Fields array has been returned.");
		}
		
	}
	
	
	@Test
	public void s400_BadRequestParams_Overlay_Field_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("overlay", "123")
				.param("fields", "0")
				.header("Authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryOverLays)
				.then()
				.body(containsString("error"))
				.body("error.errorCode", equalTo("Bad Request"))
				.body("error.message",equalTo("Bad overlay or overlay/level combination."))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	
	@Test
	public void s200_OverlayCAN_fields_0_NoFieldsReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("overlay", "CAN")
				.param("fields", "0")
				.header("Authorization",authorization)
				.then().expect().statusCode(200)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryOverLays)
				.then()
				.body(containsString("count"))
				.body(containsString("overlays"))
				.body(containsString("fields"))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		int countInt = response.body().path("count");
		int compareOverLaysIntValue = response.body().path("overlays.size()");	
		int fieldsCount = response.body().path("overlays[0].levels.size()");
		Assert.assertEquals(countInt, compareOverLaysIntValue);
		System.out.println("Count value equals number of overlays");
		
		for(int x=0; x<fieldsCount; x++) {
			
			int totalFields = response.body().path("overlays[0].levels[" + x + "].fields.size()");
			System.out.println("The fields count for overlays[0].levels[" + x + "] is " + totalFields);
			Assert.assertTrue(totalFields == 0, "Fields array has been returned. Assertion Failed");
			
		}
		
	 }
	
	
	@Test
	public void s200_FieldsParam_False_NoFieldsReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("overlay", "CAN")
				.param("fields", "false")
				.header("Authorization",authorization)
				.then().expect().statusCode(200)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryOverLays)
				.then()
				.body(containsString("count"))
				.body(containsString("overlays"))
				.body(containsString("fields"))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " seconds");
		
		int countInt = response.body().path("count");
		int compareOverLaysIntValue = response.body().path("overlays.size()");	
		int fieldsCount = response.body().path("overlays[0].levels.size()");
		Assert.assertEquals(countInt, compareOverLaysIntValue);
		System.out.println("Count value equals number of overlays");
		
		//to assert fields array are not empty for each levels object
		for(int x=0; x<fieldsCount; x++) {
			
			int totalFields = response.body().path("overlays[0].levels[" + x + "].fields.size()");
			System.out.println("The fields count for overlays[0].levels[" + x + "] is " + totalFields);
			Assert.assertTrue(totalFields == 0, "Fields array has been returned.");
			
		}
		
	 }
	
	/*
	 * boundary/autocomplete/1
	 */
	
	@Test
	public void s200_Partial_SearchtermParam_DataReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("overlay", "USA")
				.param("level", "4")
				.param("field", "usa_county")
				.param("searchterm", "coa")
				.header("Authorization",authorization)
				.then().expect().statusCode(200)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryAutoComplete)
				.then()
				.body(containsString("data"))
				.body(containsString("id"))
				.body(containsString("value"))
				.body(containsString("label"))
				.body("data[0].value",containsString("Coa"))
				.body("data[0].label",containsString("Coa"))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " seconds");
		
		
		int dataCount = response.body().path("data.size()");
		//to assert value and label fields values contains Coa
		for(int x=0; x<dataCount; x++) {
			
			String compareValue = response.path("data["+x+"].value");
			System.out.println("The value field value is " + compareValue);
			Assert.assertTrue(compareValue.contains("Coa"), "Value field does not start with coa.");
			
			String compareLabel = response.path("data["+x+"].label");
			System.out.println("The label field value is " + compareLabel);
			Assert.assertTrue(compareLabel.contains("Coa"), "Label field does not start with coa.");
			
		}
		
	 }
	
	
	@Test
	public void s200_NonExistant_SearchTerm_EmptyDataArrayReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("overlay", "USA")
				.param("level", "4")
				.param("field", "usa_county")
				.param("searchterm", "1234")
				.header("Authorization",authorization)
				.then().expect().statusCode(200)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryAutoComplete)
				.then()
				.body(containsString("data"))
				.body(not(containsString("id")))
				.body(not(containsString("value")))
				.body(not(containsString("label")))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		
		int dataCount = response.body().path("data.size()");
		//to assert data is empty		
		Assert.assertTrue(dataCount==0, "data is not empty.");
			
		
	 }
	
	@Test
	public void s400_MissingRequestParams_overlay_level_ErrorsReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("overlay", "USA")
				.param("level", "4")
				.header("Authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryAutoComplete)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("Missing Required Parameter: field"))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS)+ " seconds");
		
	}
	
	@Test
	public void s400_AllRequestParams_Null_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("overlay", "null")
				.param("level", "null")
				.param("field", "null")
				.param("searchterm", "null")
				.header("Authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryAutoComplete)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("Field does not exist at that overlay/level combination."))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	
	@Test
	public void s400_MissingAllRequestParams_ErrorsReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.header("Authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryAutoComplete)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("Missing Required Parameter: overlay"))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	
	@Test
	public void s400_MissingRequestParam_Level_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("overlay", "USA")
				.param("field", "usa_county")
				.param("searchterm", "FAY")
				.header("Authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryAutoComplete)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("Missing Required Parameter: level"))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	@Test
	public void s400_MissingRequestParam_Field_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("overlay", "USA")
				.param("searchterm", "FAY")
				.param("level", "4")
				.header("Authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryAutoComplete)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("Missing Required Parameter: field"))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
				
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	@Test
	public void s400_MissingRequestParam_searchterm_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("overlay", "USA")
				.param("field", "usa_county")
				.param("level", "4")
				.header("Authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryAutoComplete)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("Missing Required Parameter: searchterm"))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	
	@Test
	public void s400_BadRequestParam_Field_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("overlay", "USA")
				.param("level", "4")
				.param("searchterm", "FAY")
				.param("field", "1234")
				.header("Authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryAutoComplete)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("Field does not exist at that overlay/level combination."))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	
	@Test
	public void s400_BadRequestParam_Level_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("overlay", "USA")
				.param("level", "B")
				.param("searchterm", "FAY")
				.param("field", "usa_county")
				.header("Authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryAutoComplete)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("Field does not exist at that overlay/level combination."))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	@Test
	public void s400_BadRequestParam_Overlay_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("overlay", "123")
				.param("level", "1")
				.param("searchterm", "FAY")
				.param("field", "usa_county")
				.header("Authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryAutoComplete)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("Field does not exist at that overlay/level combination."))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	
	@Test
	public void s400_BadRequestParam_all_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("overlay", "123")
				.param("level", "ABC")
				.param("searchterm", "/[]")
				.param("field", "765")
				.header("Authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryAutoComplete)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("Field does not exist at that overlay/level combination."))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	@Test
	public void s400_SearchTerm_SpecialChar_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("overlay", "USA")
				.param("level", "4")
				.param("searchterm", "!@#")
				.param("field", "usa_county")
				.header("Authorization",authorization)
				.then().expect().statusCode(200)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryAutoComplete)
				.then()
				.body(containsString("data"))
				.body("data", empty())
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		int totalData = response.body().path("data.size()");
		System.out.println("The data count is " + totalData);
		Assert.assertTrue(totalData == 0, "data array has been returned. Assertion Failed");
		
	}

	/*
	 * commenting out for now as this has not been fixed yet
	 */
	/*
	@Test
	public void sGetting500Expecting400_RepeatingRequestParam_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("overlay", "USA")
				.param("level", "4")
				.param("searchterm", "coa")
				.param("field", "usa_county")
				.param("overlay", "USA")
				.param("level", "4")
				.param("field", "usa_county")
				.param("searchterm", "a")
				.header("Authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryAutoComplete)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("Field does not exist at that overlay/level combination."))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}  */
	
	
	@Test
	public void s400_Bad_LevelParam_Negative_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("overlay", "USA")
				.param("level", "-10")
				.param("searchterm", "coa")
				.param("field", "usa_county")
				.header("Authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryAutoComplete)
				.then()
				.body(containsString("error"))
				.body("error.message",equalTo("Field does not exist at that overlay/level combination."))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	/*
	 *    /boundary/search/1
	 */
	
	@Test
	public void s200_Oper_Range_100000To1000000_GeoidsReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.operatorRange100000_1000000_GeoIDsReturned;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("geoids"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		int geoidsCount = response.path("geoids.size()");
		System.out.println("Total geoids object count is " + geoidsCount );
		
		Assert.assertTrue(geoidsCount > 0, "geoids count is not greater than 0.");
		
		for(int x=0; x<geoidsCount; x++) {
			
			String compareValueStr = response.body().path("geoids[" + x + "].value");
			String compareLabelStr = response.body().path("geoids[" + x + "].label");
			Assert.assertTrue(compareValueStr != null,"Value is null.");
			Assert.assertTrue(compareLabelStr != null,"Label is null.");
			
		}
		
	}
	
	
	@Test
	public void s200_Oper_Contains_Fors_GeoidsReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.containsFors;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("geoids"))
	    .body(containsString("value"))
	    .body(containsString("label"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		int geoidsCount = response.path("geoids.size()");
		System.out.println("Total geoids object count is " + geoidsCount );
		
		Assert.assertTrue(geoidsCount > 0, "geoids count is not greater than 0.");
		
		for(int x=0; x<geoidsCount; x++) {
			
			String compareValueStr = response.body().path("geoids[" + x + "].value");
			String compareLabelStr = response.body().path("geoids[" + x + "].label");
			Assert.assertTrue(compareValueStr != null,"Value is null.");
			Assert.assertTrue(compareLabelStr != null,"Label is null.");
			
		}
		
	}
	
	
	@Test
	public void s200_Oper_Contains_Geo_GeoidsReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.containsGeo;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("geoids"))
	    .body(containsString("value"))
	    .body(containsString("label"))
	    .body("geoids[0].label",equalTo("Georgia"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		int geoidsCount = response.path("geoids.size()");
		System.out.println("Total geoids object count is " + geoidsCount );
		
		Assert.assertTrue(geoidsCount > 0, "geoids count is not greater than 0.");
		
		for(int x=0; x<geoidsCount; x++) {
			
			String compareValueStr = response.body().path("geoids[" + x + "].value");
			String compareLabelStr = response.body().path("geoids[" + x + "].label");
			Assert.assertTrue(compareValueStr != null,"Value is null.");
			Assert.assertTrue(compareLabelStr != null,"Label is null.");
			
		}

		
	}
	
	@Test
	public void s200_Oper_LessThan_10000_GeoidsReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.lessThan10000;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("geoids"))
	    .body(containsString("value"))
	    .body(containsString("label"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		int geoidsCount = response.path("geoids.size()");
		System.out.println("Total geoids object count is " + geoidsCount );
		
		Assert.assertTrue(geoidsCount > 0, "geoids count is not greater than 0.");

	}
	
	@Test
	public void s200_Oper_GreaterThan_10000_GeoidsReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.greaterThan10000;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("geoids"))
	    .body(containsString("value"))
	    .body(containsString("label"))
	    .and().time(lessThan(24000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		int geoidsCount = response.path("geoids.size()");
		System.out.println("Total geoids object count is " + geoidsCount );
		
		Assert.assertTrue(geoidsCount > 0, "geoids count is not greater than 0.");
			
				
	}
	
	@Test
	public void s200_Oper_LessOrEqual_100000_GeoidsReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.lessOrEqual100000;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("geoids"))
	    .body(containsString("value"))
	    .body(containsString("label"))
	    .and().time(lessThan(14000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		int geoidsCount = response.path("geoids.size()");
		System.out.println("Total geoids object count is " + geoidsCount );
		
		Assert.assertTrue(geoidsCount > 0, "geoids count is not greater than 0.");

	}
	
	@Test
	public void s200_Oper_GreaterOrEqual_10000_GeoidsReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.greaterOrEqual10000;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("geoids"))
	    .body(containsString("value"))
	    .body(containsString("label"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		int geoidsCount = response.path("geoids.size()");
		System.out.println("Total geoids object count is " + geoidsCount );
		
		Assert.assertTrue(geoidsCount > 0, "geoids count is not greater than 0.");
		
		
	}
	
	@Test
	public void s200_Oper_NotEqualTo_10000_GeoidsReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.notEqualTo10000;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("geoids"))
	    .body(containsString("value"))
	    .body(containsString("label"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		int geoidsCount = response.path("geoids.size()");
		System.out.println("Total geoids object count is " + geoidsCount );
		
		Assert.assertTrue(geoidsCount > 0, "geoids count is not greater than 0.");

		
	}
	
	@Test
	public void s200_Oper_Equals_1000_GeoidsReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.equals1000;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("geoids"))
	    .body(containsString("value"))
	    .body(containsString("label"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		int geoidsCount = response.path("geoids.size()");
		System.out.println("Total geoids object count is " + geoidsCount );		
		Assert.assertTrue(geoidsCount > 0, "geoids count is not greater than 0.");
		
		for(int x=0; x<geoidsCount; x++) {
			
			String compareValueStr = response.body().path("geoids[" + x + "].value");
			String compareLabelStr = response.body().path("geoids[" + x + "].label");
			Assert.assertTrue(compareValueStr != null,"Value is null.");
			Assert.assertTrue(compareLabelStr != null,"Label is null.");
			
		}
		
	}
	
	@Test
	public void s200_Oper_StartsWith_A_GeoidsReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.startsWithA;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("geoids"))
	    .body(containsString("value"))
	    .body(containsString("label"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		int geoidsCount = response.path("geoids.size()");
		System.out.println("Total geoids object count is " + geoidsCount );		
		Assert.assertTrue(geoidsCount > 0, "geoids count is not greater than 0.");
		
		for(int x=0; x<geoidsCount; x++) {
			
			String compareValueStr = response.body().path("geoids[" + x + "].value");
			String compareLabelStr = response.body().path("geoids[" + x + "].label");
			Assert.assertTrue(compareValueStr != null,"Value is null.");
			Assert.assertTrue(compareLabelStr.contains("A")||compareLabelStr.contains("a"),"Label does not contain an A or a.");
			
		}
		
	}
	
	@Test
	public void s200_Oper_Contains_X_GeoidsReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.containsX;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("geoids"))
	    .body(containsString("value"))
	    .body(containsString("label"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		int geoidsCount = response.path("geoids.size()");
		System.out.println("Total geoids object count is " + geoidsCount );		
		Assert.assertTrue(geoidsCount > 0, "geoids count is not greater than 0.");
		
		for(int x=0; x<geoidsCount; x++) {
			
			String compareValueStr = response.body().path("geoids[" + x + "].value");
			String compareLabelStr = response.body().path("geoids[" + x + "].label");
			Assert.assertTrue(compareValueStr != null,"Value is null.");
			Assert.assertTrue(compareLabelStr.contains("X")||compareLabelStr.contains("NM"),"Label does not contain an X or NM.");
			
		}
		
	}
	
	@Test
	public void s200_Oper_DoesNotContain_H_GeoidsReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.doesNotContainH;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("geoids"))
	    .body(containsString("value"))
	    .body(containsString("label"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		int geoidsCount = response.path("geoids.size()");
		System.out.println("Total geoids object count is " + geoidsCount );		
		Assert.assertTrue(geoidsCount > 0, "geoids count is not greater than 0.");
		
		for(int x=0; x<geoidsCount; x++) {
			
			String compareValueStr = response.body().path("geoids[" + x + "].value");
			String compareLabelStr = response.body().path("geoids[" + x + "].label");
			Assert.assertTrue(compareValueStr != null,"Value is null.");
			Assert.assertFalse(compareLabelStr.contains("H"),"Label field contains an H.");
			
		}
		
	}
	
	@Test
	public void s200_Oper_EndsWith_E_GeoidsReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.endsWithE;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("geoids"))
	    .body(containsString("value"))
	    .body(containsString("label"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		int geoidsCount = response.path("geoids.size()");
		System.out.println("Total geoids object count is " + geoidsCount );		
		Assert.assertTrue(geoidsCount > 0, "geoids count is not greater than 0.");
		
		for(int x=0; x<geoidsCount; x++) {
			
			String compareValueStr = response.body().path("geoids[" + x + "].value");
			String compareLabelStr = response.body().path("geoids[" + x + "].label");
			Assert.assertTrue(compareValueStr != null,"Value is null.");
			Assert.assertTrue(compareLabelStr.endsWith("e"),"Label field does not end with an e.");
			
		}
		
	}
	
	@Test
	public void s200_Oper_Contains_Fors_Bagley1_GeoidsReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.containsForsErrorEncounteredBagley;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("geoids"))
	    .body(containsString("value"))
	    .body(containsString("label"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		int geoidsCount = response.path("geoids.size()");
		System.out.println("Total geoids object count is " + geoidsCount );		
		Assert.assertTrue(geoidsCount > 0, "geoids count is not greater than 0.");
		
		for(int x=0; x<geoidsCount; x++) {
			
			String compareValueStr = response.body().path("geoids[" + x + "].value");
			String compareLabelStr = response.body().path("geoids[" + x + "].label");
			Assert.assertTrue(compareValueStr != null,"Value is null.");
			Assert.assertTrue(compareLabelStr != null,"Label is null.");
			
		}
		
	}
	
	@Test
	public void oper_Contains_GEO_Bagley2_GeoidsReturned_200() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.containsGeoErrorEncounteredBagley;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("geoids"))
	    .body(containsString("value"))
	    .body(containsString("label"))
	    .body("geoids[0].label",equalTo("Georgia"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		int geoidsCount = response.path("geoids.size()");
		System.out.println("Total geoids object count is " + geoidsCount );		
		Assert.assertTrue(geoidsCount > 0, "geoids count is not greater than 0.");
		
		for(int x=0; x<geoidsCount; x++) {
			
			String compareValueStr = response.body().path("geoids[" + x + "].value");
			String compareLabelStr = response.body().path("geoids[" + x + "].label");
			Assert.assertTrue(compareValueStr != null,"Value is null.");
			Assert.assertTrue(compareLabelStr.contains("Georgia"),"Label is null.");
			
		}
		
	}
	
	@Test
	public void s400_OperRange_BadMinMax_Char_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.operRangeBadMinMaxCharReturn400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body(containsString("message"))
	    .body("error.message",equalTo("Operator (range) must be used with decimal,date type fields."))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	@Test
	public void s400_MissingOverlayParam_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.missingOverlayParam_Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body(containsString("message"))
	    .body("error.message",equalTo("Missing Required Parameter: overlay"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	@Test
	public void s400_Oper_Contains_MissingLevelParam_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.missingBodyParamLevelReturn400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body(containsString("message"))
	    .body("error.message",equalTo("Missing Required Parameter: level"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + "sec");
		
	}
	
	@Test
	public void s400_OperContainsTrue_WrongDataType_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.operContainsTrue_WrongDataType_Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body(containsString("message"))
	    .body("error.message",equalTo("Operator (contains) must be used with string type fields."))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	@Test
	public void s400_BlankPostbody_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.blankPostBody_Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body(containsString("message"))
	    .body("error.message",equalTo("Missing Required Parameter: overlay"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	@Test
	public void s400_OperLessThan_A_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.operLessThan_A_Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body(containsString("message"))
	    .body("error.message",equalTo("Operator (less than) must be used with decimal,date type fields."))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	@Test
	public void s400_OperGreaterThan_B_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.operGreaterThan_B_Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body(containsString("message"))
	    .body("error.message",equalTo("Operator (greater than) must be used with decimal,date type fields."))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	@Test
	public void s400_OperLessOrEqualBadValueSpecialChar_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.operLessOrEqualBadValueSpecialChar_Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body(containsString("message"))
	    .body("error.message",equalTo("Operator (less or equal) must be used with decimal,date type fields."))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	@Test
	public void s400_OperGreaterOrEqual_True_WrongDataType_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.operGreaterOrEqualTrue_WrongDataType_Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body(containsString("message"))
	    .body("error.message",equalTo("Operator (greater or equal) must be used with decimal,date type fields."))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	@Test
	public void s400_OperLessOrEqual_LaFondaLatina_WrongDataTypeString_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.operLessOrEqual_LaFondaLatinaWrongDataType_Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body(containsString("message"))
	    .body("error.message",equalTo("Operator (less or equal) must be used with decimal,date type fields."))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	@Test
	public void s400_OperGreaterOrEqual_Rudebwoy_WrongDataTypeString_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.operGreaterOrEqual_RudebwoyWrongDataType_Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body(containsString("message"))
	    .body("error.message",equalTo("Operator (greater or equal) must be used with decimal,date type fields."))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	@Test
	public void s400_OperStartsWith_False_WrongDataTypeBool_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.operStartsWith_False_WrongDataTypeBool_Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body(containsString("message"))
	    .body("error.message",equalTo("Operator (starts with) must be used with string type fields."))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	@Test
	public void s400_OperContains_1234_WrongDataType_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.operContains1234_WrongDataType_Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body(containsString("message"))
	    .body("error.message",equalTo("Operator (contains) must be used with string type fields."))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	@Test
	public void s400_OperDoesNotContain_1234_WrongDataType_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.operDoesNotContain_1234_WrongDataType_Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body(containsString("message"))
	    .body("error.message",equalTo("Operator (does not contain) must be used with string type fields."))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	@Test
	public void s400_OperEndsWith_False_WrongDataType_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.operEndsWith_False_WrongDataType_Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body(containsString("message"))
	    .body("error.message",equalTo("Operator (ends with) must be used with string type fields."))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	
	@Test
	public void s400_Oper_StartsWith_1000_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.startsWith1000Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body(containsString("message"))
	    .body("error.message",equalTo("Cannot use that operator (starts with) with decimal type fields."))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	@Test
	public void s400_Oper_Contains_10000_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.contains10000Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body(containsString("message"))
	    .body("error.message",equalTo("Cannot use that operator (contains) with decimal type fields."))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	@Test
	public void s400_Oper_DoesNotContain_10000_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.doesNotContain10000Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body(containsString("message"))
	    .body("error.message",equalTo("Cannot use that operator (does not contain) with decimal type fields."))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	@Test
	public void s400_Oper_EndsWith_1000_ErrorReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.endsWith1000Return400;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body(containsString("message"))
	    .body("error.message",equalTo("Cannot use that operator (ends with) with decimal type fields."))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + boundarySearch)
	    .then().log().all()
	    .contentType(ContentType.JSON)
		.extract()
        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
	}
	
	
	/*
	 *    /boundary/tile/1
	 */
	
	
	@Test
	public void s200_X_Y_Z_ParamIncluded_MapBoundaryIMGReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("y", "23")
				.param("x", "19")
				.param("level", "2")
				.param("z", "6")
				.param("overlay", "USA")
				.header("Authorization",authorization)
				.then().expect().statusCode(200)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryTile)
				.then()
				.assertThat()
				.headers("Content-Type", equalTo("image/png"))
				.log().all()
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		String contentType = response.getHeader("Content-Type");
		System.out.println("The value of contentType is " + contentType);
		Assert.assertEquals(contentType, "image/png");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		
	 }
	
	@Test
	public void s200_TileID_ParamIncluded_MapBoundaryIMGReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("y", "23")
				.param("x", "19")
				.param("level", "2")
				.param("z", "6")
				.param("overlay", "USA")
				.param("tileid", "shape-670c7720-468e-11e7-badd-f318c13e87a8")
				.header("Authorization",authorization)
				.then().expect().statusCode(200)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryTile)
				.then()
				.assertThat()
				.headers("Content-Type", equalTo("image/png"))
				.log().all()
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		String contentType = response.getHeader("Content-Type");
		System.out.println("The value of contentType is " + contentType);
		Assert.assertEquals(contentType, "image/png");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		
	 }
	
	@Test
	public void s200_No_OverLay_ParamIncluded_MapBoundaryIMGReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("y", "23")
				.param("x", "19")
				.param("level", "2")
				.param("z", "6")
				.param("tileid", "shape-670c7720-468e-11e7-badd-f318c13e87a8")
				.header("Authorization",authorization)
				.then().expect().statusCode(200)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryTile)
				.then()
				.assertThat()
				.headers("Content-Type", equalTo("image/png"))
				.log().all()
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		String contentType = response.getHeader("Content-Type");
		System.out.println("The value of contentType is " + contentType);
		Assert.assertEquals(contentType, "image/png");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		
	 }
	
	@Test
	public void s200_Diff_X_Y_Param_MapBoundaryIMGReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("y", "26")
				.param("x", "16")
				.param("level", "2")
				.param("z", "6")
				.param("overlay", "USA")
				.header("Authorization",authorization)
				.then().expect().statusCode(200)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryTile)
				.then()
				.assertThat()
				.headers("Content-Type", equalTo("image/png"))
				.log().all()
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==200,"The status code is not 200.  Status code assertion Failed");
		
		String contentType = response.getHeader("Content-Type");
		System.out.println("The value of contentType is " + contentType);
		Assert.assertEquals(contentType, "image/png");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		
	 }
	
	@Test
	public void s400_Only_X_Y_Z_Params_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("y", "26")
				.param("x", "16")
				.param("z", "6")
				.header("Authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryTile)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("Overlay cannot be null."))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		
	 }
	
	@Test
	public void s400_No_OverLay_Param_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("y", "26")
				.param("x", "16")
				.param("level", "2")
				.param("z", "6")
				.header("Authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryTile)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("Overlay cannot be null."))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		
	 }
	
	@Test
	public void s400_No_Level_Param_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("y", "50")
				.param("x", "11")
				.param("z", "7")
				.param("overlay", "USA")
				.header("Authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryTile)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("Level cannot be null."))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		
	 }
	
	
	@Test
	public void s400_OverLay_Param_Null_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("y", "50")
				.param("x", "11")
				.param("z", "7")
				.param("overlay", "null")
				.param("level", "2")
				.header("Authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryTile)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("Overlay cannot be null."))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		
	 }
	
	@Test
	public void s400_Repeating_XYZ_Params_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("y", "50")
				.param("x", "11")
				.param("z", "7")
				.param("overlay", "USA")
				.param("level", "1")
				.param("y", "50")
				.param("x", "11")
				.param("z", "7")
				.header("Authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryTile)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("Z parameter out of bounds."))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
			
	 }
	
	/* returning 500 skipped for now until endpoint has been fixed
	@Test
	public void s400_Repeating_TileIdOverlayLevel_Params_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("y", "50")
				.param("x", "11")
				.param("z", "7")
				.param("overlay", "USA")
				.param("level", "1")
				.param("tileid", "shape-670c7720-468e-11e7-badd-f318c13e87a8")
				.param("overlay", "CAN")
				.param("level", "1")
				.param("tileid", "shape-670c7720-468e-11e7-badd-f318c13e87a8")
				.header("Authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryTile)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("Z parameter out of bounds."))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		
	 } */
	
	public void s400_Bad_OverLay_Param_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("y", "23")
				.param("x", "19")
				.param("z", "6")
				.param("overlay", "usausa")
				.param("level", "1")
				.header("Authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryTile)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("Invalid overlay parameter."))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
		
		
	 }
	
	@Test
	public void s400_Bad_X_Param_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("y", "50")
				.param("x", "BAD")
				.param("z", "7")
				.param("overlay", "USA")
				.param("level", "1")
				.header("Authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryTile)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("X parameter must be a number."))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) +  " seconds");
				
	 }
	
	@Test
	public void s400_Bad_Y_Param_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("y", "BAD")
				.param("x", "69")
				.param("z", "7")
				.param("overlay", "USA")
				.param("level", "1")
				.header("Authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryTile)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("Y parameter must be a number."))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
			
	 }
	
	@Test
	public void s400_Bad_Z_Param_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("y", "105")
				.param("x", "69")
				.param("z", "BAD")
				.param("overlay", "USA")
				.param("level", "1")
				.header("Authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryTile)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("Z parameter must be a number."))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
			
	 }
	
	@Test
	public void s400_Missing_X_Param_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("y", "105")
				.param("z", "8")
				.param("overlay", "USA")
				.param("level", "1")
				.header("Authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryTile)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("X parameter cannot be null or undefined."))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
			
	 }
	
	@Test
	public void s400_Missing_Y_Param_ErrorReturned_400() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("x", "69")
				.param("z", "8")
				.param("overlay", "USA")
				.param("level", "1")
				.header("Authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryTile)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("Y parameter cannot be null or undefined."))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
			
	 }
	
	@Test
	public void s400_Missing_Z_Param_ErrorReturned() throws IOException, InterruptedException {
		
		getRestCallConfig();
				
		Response response = 
				given()
				.param("y", "105")
				.param("x", "69")
				.param("overlay", "USA")
				.param("level", "1")
				.header("Authorization",authorization)
				.then().expect().statusCode(400)
				.and().time(lessThan(12000L))
				.when().get(baseURL + boundaryTile)
				.then()
				.body(containsString("error"))
				.body("error.message", equalTo("Z parameter cannot be null or undefined."))
				.log().all()
				.contentType(ContentType.JSON)
				.extract()
		        .response();
		
		int code = response.getStatusCode();
		System.out.println("Status code is " + code);
		Assert.assertTrue(code==400,"The status code is not 400.  Status code assertion Failed");
		
		Assert.assertTrue(response.getTimeIn(TimeUnit.SECONDS) <= timeLimitInt, "Response Time is not within limit");
		System.out.println("The reponse time is " + response.getTimeIn(TimeUnit.SECONDS) + " seconds");
			
	 }
	
	/*
	 *  Zip Import
	 */
	
	@Test
	public void s200_ZipImport_ZipcodeValueReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.zipImportReturn200;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("validZips"))
	    .body(containsString("label"))
	    .body(containsString("value"))
	    .body("validZips[0].label", equalTo("30328"))
	    .body("validZips[1].label", equalTo("30117"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + zipImport)
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
	public void s200_Multip_ZipcodeValueReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.multiZipCodes_20_ZipValueReturned200;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("validZips"))
	    .body(containsString("label"))
	    .body(containsString("value"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + zipImport)
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
	public void s200_RepeatingZipCodes_ZipcodeValueReturned() throws FileNotFoundException, IOException {
	
	   PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	   String myPostJson = postdata.repeatingZipCodes_ZipValueReturned200;
	   getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(200)
	    .body(containsString("validZips"))
	    .body(containsString("label"))
	    .body(containsString("value"))
	    .body("validZips[0].label", equalTo("30328"))
	    .body("validZips[1].label", equalTo("30117"))
	    .and().time(lessThan(12000L))
	    .when()
	    .post(baseURL + zipImport)
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
	/*   returning 500 - will leave commented out until endpoint is fixed
	@Test
	public void s400_WrongDataType_NumberZipCode_ErrorReturned() throws FileNotFoundException, IOException {
	
		PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	    String myPostJson = postdata.wrongDataType_NumberZipCode_ErrorReturned;
	    getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("unknown"))
	    .when()
	    .post(baseURL + zipImport)
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
		
	} */
	
	/*   returning 500 - will leave commented out until endpoint is fixed
	@Test
	public void s400_WrongDataType_BoolZipCode_ErrorReturned() throws FileNotFoundException, IOException {
	
		PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	    String myPostJson = postdata.wrongDataType_BoolZipCode_ErrorReturned;
	    getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("unknown"))
	    .when()
	    .post(baseURL + zipImport)
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
		
	} */
	
	@Test
	public void s400_InvalidZipCode_ErrorReturned() throws FileNotFoundException, IOException {
	
		PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	    String myPostJson = postdata.invalidZipCode_ErrorReturned;
	    getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("No rows were returned for that query."))
	    .when()
	    .post(baseURL + zipImport)
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
	public void s400_InvalidZipCode_LeadingZerosLong_ErrorReturned() throws FileNotFoundException, IOException {
	
		PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	    String myPostJson = postdata.invalidZipCode_LeadingZeros_ErrorReturned;
	    getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("No rows were returned for that query."))
	    .when()
	    .post(baseURL + zipImport)
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
	public void s400_EmptyZipCodeArray_ErrorReturned() throws FileNotFoundException, IOException {
	
		PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	    String myPostJson = postdata.emptyZipCodeArray_ErrorReturned;
	    getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Array of zip codes must not be empty!"))
	    .when()
	    .post(baseURL + zipImport)
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
	public void s400_Blank_Post_Body_ErrorReturned() throws FileNotFoundException, IOException {
	
		PostDataShapesBoundary1 postdata = new PostDataShapesBoundary1();
	    String myPostJson = postdata.blankPostBody_Return400;
	    getRestCallConfig();
		
		Response response = 	   
	     given()
	    .header("Authorization",authorization)
	    .body(myPostJson).with().contentType("application/json")
	    .then().expect().statusCode(400)
	    .body(containsString("error"))
	    .body("error.message", equalTo("Missing Required Parameter: zips"))
	    .when()
	    .post(baseURL + zipImport)
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
	 *  Boundary Geography
	 */
	

}
