package com.APITest.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class APITestConfiguration {
	
	protected static Properties apiTestConfig;
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
	
public void getRestCallConfig() throws FileNotFoundException, IOException {
		
		apiTestConfig = new Properties();
		apiTestConfig.load(new FileInputStream("APITestConfig.properties"));
		
		baseURLStaging = apiTestConfig.getProperty("baseURLStaging");
		baseURLProd = apiTestConfig.getProperty("baseURLProd");
		baseURL = apiTestConfig.getProperty("baseURLStaging");
		timeLimit = apiTestConfig.getProperty("timeLimit");
		timeLimitLStr = apiTestConfig.getProperty("timeLimitL");
		tileKey1Prod = apiTestConfig.getProperty("tileKey1Prod");
		tileKey2Prod = apiTestConfig.getProperty("tileKey2Prod");
		authorization = apiTestConfig.getProperty("authorization");
		xAPIKey = apiTestConfig.getProperty("xAPIKey");
		
		timeLimitInt = Integer.parseInt(timeLimit);	
	}

}
