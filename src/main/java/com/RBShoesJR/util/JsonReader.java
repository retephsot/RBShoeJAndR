package com.RBShoesJR.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class JsonReader {
	
	public static Object[][] getdata(String JSON_path, String typeData) 
			throws JsonIOException, JsonSyntaxException, FileNotFoundException {
			
			JsonParser jsonParser =  new JsonParser();
			JsonObject jsonObj = jsonParser.parse(new FileReader(JSON_path)).getAsJsonObject();
	        JsonArray array = (JsonArray) jsonObj.get(typeData);
	        
	        return searchJsonElement(array);
		}


		 public static Object[][] toArray(List<List<Object>> list) {
			 
			 Object[][] r = new Object[list.size()+1][];
			 int i = 0;
			 for (List<Object> next : list) 
			    {
			       r[i++] = next.toArray(new Object[next.size()+1]);
			    }
			 
			  return r;
			  
		 }
		
		public static Object[][] searchJsonElement(JsonArray jsonArray) throws NullPointerException {
			int jsonRowCount = jsonArray.size();
			int jsonElementCount = 0;
			
			for(JsonElement jsonElement : jsonArray){
				jsonElementCount = jsonElement.getAsJsonObject().entrySet().size();
			}
		
			
			Object[][] dataSet = new Object[jsonRowCount][jsonElementCount];
	        int i =0;
	        int j = 0;
	        for (JsonElement jsonElement : jsonArray) {
	        	
	             for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
	            	 
	            	 dataSet[i][j] = entry.getValue().toString().replace("\"","");
	                 j++;   
	            }
	             
	            i++;
	            j = 0;
	            
	        }
	        
	        return dataSet;
	        
		}

}
