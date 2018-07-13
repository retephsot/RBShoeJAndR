package com.APITest.data;

public class PostDataShapesBoundary1 {
	
	
	/*
	 * Post body for happy path tests returns 200 status - Shapes /boundary/search/1
	 */
	
	public final String operatorRange100000_1000000_GeoIDsReturned = 
 "{"
+	 "\"overlay\":\"USA\","
+	 "\"level\":\"4\","
+	 "\"filters\": ["
+					 "{"
+    					  "\"field_id\":\"usa_pp_total\","
+     					  "\"operator\":\"range\","
+     					  "\"min\":100000,"
+     					  "\"max\":1000000"
+   				 "}"
+ 				  "]"
+"}";
	
	public final String containsFors = 
			 "{"
			+	 "\"overlay\":\"USA\","
			+	 "\"level\":\"4\","
			+	 "\"filters\": ["
			+					 "{"
			+    					  "\"field_id\":\"usa_county\","
			+     					  "\"operator\":\"contains\","
			+     					  "\"values\":[\"fors\"]"
			+   				 "}"
			+ 				  "]"
			+"}";
	
	
	public final String containsGeo = 
			 "{"
			+	 "\"overlay\":\"USA\","
			+	 "\"level\":\"1\","
			+	 "\"filters\": ["
			+					 "{"
			+    					  "\"field_id\":\"label\","
			+     					  "\"operator\":\"contains\","
			+     					  "\"values\":[\"geo\"]"
			+   				 "}"
			+ 				  "]"
			+"}";
	
	
	public final String lessThan10000 = 
			 "{"
			+	 "\"overlay\":\"USA\","
			+	 "\"level\":\"4\","
			+	 "\"filters\": ["
			+					 "{"
			+    					  "\"field_id\":\"usa_pp_total\","
			+     					  "\"operator\":\"less than\","
			+     					  "\"values\":[\"10000\"]"
			+   				 "}"
			+ 				  "]"
			+"}";
	
	public final String greaterThan10000 = 
			 "{"
			+	 "\"overlay\":\"USA\","
			+	 "\"level\":\"4\","
			+	 "\"filters\": ["
			+					 "{"
			+    					  "\"field_id\":\"usa_pp_total\","
			+     					  "\"operator\":\"greater than\","
			+     					  "\"values\":[\"10000\"]"
			+   				 "}"
			+ 				  "]"
			+"}";
	
	public final String lessOrEqual100000 = 
			 "{"
			+	 "\"overlay\":\"USA\","
			+	 "\"level\":\"4\","
			+	 "\"filters\": ["
			+					 "{"
			+    					  "\"field_id\":\"usa_pp_total\","
			+     					  "\"operator\":\"less or equal\","
			+     					  "\"values\":[\"100000\"]"
			+   				 "}"
			+ 				  "]"
			+"}";
	
	
	public final String greaterOrEqual10000 = 
			 "{"
			+	 "\"overlay\":\"USA\","
			+	 "\"level\":\"4\","
			+	 "\"filters\": ["
			+					 "{"
			+    					  "\"field_id\":\"usa_pp_total\","
			+     					  "\"operator\":\"greater or equal\","
			+     					  "\"values\":[\"100000\"]"
			+   				 "}"
			+ 				  "]"
			+"}";
	
	public final String notEqualTo10000 = 
			 "{"
			+	 "\"overlay\":\"USA\","
			+	 "\"level\":\"4\","
			+	 "\"filters\": ["
			+					 "{"
			+    					  "\"field_id\":\"usa_pp_total\","
			+     					  "\"operator\":\"not equal to\","
			+     					  "\"values\":[\"10000\"]"
			+   				 "}"
			+ 				  "]"
			+"}";
	
	public final String equals1000 = 
			 "{"
			+	 "\"overlay\":\"USA\","
			+	 "\"level\":\"4\","
			+	 "\"filters\": ["
			+					 "{"
			+    					  "\"field_id\":\"usa_pp_total\","
			+     					  "\"operator\":\"equals\","
			+     					  "\"values\":[\"1000\"]"
			+   				 "}"
			+ 				  "]"
			+"}";
	
	public final String startsWithA = 
			 "{"
			+	 "\"overlay\":\"USA\","
			+	 "\"level\":\"2\","
			+	 "\"filters\": ["
			+					 "{"
			+    					  "\"field_id\":\"usa_state\","
			+     					  "\"operator\":\"starts with\","
			+     					  "\"values\":[\"A\"]"
			+   				 "}"
			+ 				  "]"
			+"}";
	
	public final String containsX = 
			 "{"
			+	 "\"overlay\":\"USA\","
			+	 "\"level\":\"2\","
			+	 "\"filters\": ["
			+					 "{"
			+    					  "\"field_id\":\"usa_state\","
			+     					  "\"operator\":\"contains\","
			+     					  "\"values\":[\"x\"]"
			+   				 "}"
			+ 				  "]"
			+"}";
	
	public final String doesNotContainH = 
			 "{"
			+	 "\"overlay\":\"USA\","
			+	 "\"level\":\"1\","
			+	 "\"filters\": ["
			+					 "{"
			+    					  "\"field_id\":\"label\","
			+     					  "\"operator\":\"does not contain\","
			+     					  "\"values\":[\"H\"]"
			+   				 "}"
			+ 				  "]"
			+"}";
	
	public final String endsWithE = 
			 "{"
			+	 "\"overlay\":\"USA\","
			+	 "\"level\":\"1\","
			+	 "\"filters\": ["
			+					 "{"
			+    					  "\"field_id\":\"label\","
			+     					  "\"operator\":\"ends with\","
			+     					  "\"values\":[\"E\"]"
			+   				 "}"
			+ 				  "]"
			+"}";
	
	public final String containsForsErrorEncounteredBagley = 
			 "{"
			+	 "\"overlay\":\"USA\","
			+	 "\"level\":\"4\","
			+	 "\"filters\": ["
			+					 "{"
			+    					  "\"field_id\":\"usa_county\","
			+     					  "\"operator\":\"contains\","
			+     					  "\"values\":[\"fors\"]"
			+   				 "}"
			+ 				  "]"
			+"}";
	
	public final String containsGeoErrorEncounteredBagley = 
			 "{"
			+	 "\"overlay\":\"USA\","
			+	 "\"level\":\"1\","
			+	 "\"filters\": ["
			+					 "{"
			+    					  "\"field_id\":\"label\","
			+     					  "\"operator\":\"contains\","
			+     					  "\"values\":[\"geo\"]"
			+   				 "}"
			+ 				  "]"
			+"}";
	
	/*
	 * Post body for negative tests returns 400 status - Shapes /boundary/search/1
	 */
	
	public final String operRangeBadMinMaxCharReturn400 =
			"{" +
					"\"overlay\":\"USA\"," +
					" \"level\":\"4\"," +
					" \"filters\": [" +
					"   {" +
					"     \"field_id\":\"usa_pp_total\"," +
					"     \"operator\":\"range\"," +
					"     \"min\":\"A\"," +
					"     \"max\":\"Z\"" +
					"   }" +
					" ]" +
					"}";
	
	public final String missingOverlayParam_Return400 =
			"{" +
					"" +
					" \"level\":\"4\"," +
					" \"filters\": [" +
					"   {" +
					"     \"field_id\":\"usa_county\"," +
					"     \"operator\":\"contains\"," +
					"     \"values\":[\"fors\"]" +
					"   }" +
					" ]" +
					"}";
	
	public final String operContainsTrue_WrongDataType_Return400 =
			"{" +
					"\"overlay\":\"USA\"," +
					" \"level\":\"1\"," +
					" \"filters\": [" +
					"   {" +
					"     \"field_id\":\"label\"," +
					"     \"operator\":\"contains\"," +
					"     \"values\":[true]" +
					"   }" +
					" ]" +
					"}";
			
	public final String blankPostBody_Return400 =
			"{" +
					"" +
					"}";
	
	public final String operLessThan_A_Return400 =
			"{" +
					"\"overlay\":\"USA\"," +
					" \"level\":\"4\"," +
					" \"filters\": [" +
					"   {" +
					"     \"field_id\":\"usa_pp_total\"," +
					"     \"operator\":\"less than\"," +
					"     \"values\":[\"A\"]" +
					"   }" +
					" ]" +
					"}";
		
	public final String operGreaterThan_B_Return400 =
			"{" +
					"\"overlay\":\"USA\"," +
					" \"level\":\"4\"," +
					" \"filters\": [" +
					"   {" +
					"     \"field_id\":\"usa_pp_total\"," +
					"     \"operator\":\"greater than\"," +
					"     \"values\":[\"B\"]" +
					"   }" +
					" ]" +
					"}";
	
	public final String operLessOrEqualBadValueSpecialChar_Return400 =
			"{" +
					"\"overlay\":\"USA\"," +
					" \"level\":\"4\"," +
					" \"filters\": [" +
					"   {" +
					"     \"field_id\":\"usa_pp_total\"," +
					"     \"operator\":\"less or equal\"," +
					"     \"values\":[\"@#$%\"]" +
					"   }" +
					" ]" +
					"}";
	
	public final String operGreaterOrEqualTrue_WrongDataType_Return400 =
			"{" +
					"\"overlay\":\"USA\"," +
					" \"level\":\"4\"," +
					" \"filters\": [" +
					"   {" +
					"     \"field_id\":\"usa_pp_total\"," +
					"     \"operator\":\"greater or equal\"," +
					"     \"values\":[true]" +
					"   }" +
					" ]" +
					"}";
	
	public final String operLessOrEqual_LaFondaLatinaWrongDataType_Return400 =
			"{" +
					"\"overlay\":\"USA\"," +
					" \"level\":\"4\"," +
					" \"filters\": [" +
					"   {" +
					"     \"field_id\":\"usa_pp_total\"," +
					"     \"operator\":\"less or equal\"," +
					"     \"values\":[\"LaFondaLatina\"]" +
					"   }" +
					" ]" +
					"}";
	
	public final String operGreaterOrEqual_RudebwoyWrongDataType_Return400 =
			"{" +
					"\"overlay\":\"USA\"," +
					" \"level\":\"4\"," +
					" \"filters\": [" +
					"   {" +
					"     \"field_id\":\"usa_pp_total\"," +
					"     \"operator\":\"greater or equal\"," +
					"     \"values\":[\"Rudebwoy\"]" +
					"   }" +
					" ]" +
					"}";
	
	public final String operStartsWith_False_WrongDataTypeBool_Return400 =
			"{" +
					"  \"overlay\":\"USA\"," +
					"  \"level\":\"2\"," +
					"  \"filters\": [" +
					"    {" +
					"      \"field_id\":\"usa_state\"," +
					"      \"operator\":\"starts with\"," +
					"      \"values\":[ false ]" +
					"    }" +
					"  ]" +
					"}";
			
	public final String operContains1234_WrongDataType_Return400 =
			"{" +
					"  \"overlay\":\"USA\"," +
					"  \"level\":\"2\"," +
					"  \"filters\": [" +
					"    {" +
					"      \"field_id\":\"usa_state\"," +
					"      \"operator\":\"contains\"," +
					"      \"values\":[ 1234 ]" +
					"    }" +
					"  ]" +
					"}";
	
	public final String operDoesNotContain_1234_WrongDataType_Return400 =
			"{" +
			"  \"overlay\":\"USA\"," +
			"  \"level\":\"1\"," +
			"  \"filters\": [" +
			"    {" +
			"      \"field_id\":\"label\"," +
			"      \"operator\":\"does not contain\"," +
			"      \"values\":[ 1234 ]" +
			"    }" +
			"  ]" +
			"}";
	
	public final String operEndsWith_False_WrongDataType_Return400 =
			"{" +
					"  \"overlay\":\"USA\"," +
					"  \"level\":\"1\"," +
					"  \"filters\": [" +
					"    {" +
					"      \"field_id\":\"label\"," +
					"      \"operator\":\"ends with\"," +
					"      \"values\":[ false ]" +
					"    }" +
					"  ]" +
					"}";
	
	public final String startsWith1000Return400 = 
			 "{"
			+	 "\"overlay\":\"USA\","
			+	 "\"level\":\"4\","
			+	 "\"filters\": ["
			+					 "{"
			+    					  "\"field_id\":\"usa_pp_total\","
			+     					  "\"operator\":\"starts with\","
			+     					  "\"values\":[\"1000\"]"
			+   				 "}"
			+ 				  "]"
			+"}";
	
	public final String contains10000Return400 = 
			 "{"
			+	 "\"overlay\":\"USA\","
			+	 "\"level\":\"4\","
			+	 "\"filters\": ["
			+					 "{"
			+    					  "\"field_id\":\"usa_pp_total\","
			+     					  "\"operator\":\"contains\","
			+     					  "\"values\":[\"10000\"]"
			+   				 "}"
			+ 				  "]"
			+"}";
	
	public final String doesNotContain10000Return400 = 
			 "{"
			+	 "\"overlay\":\"USA\","
			+	 "\"level\":\"4\","
			+	 "\"filters\": ["
			+					 "{"
			+    					  "\"field_id\":\"usa_pp_total\","
			+     					  "\"operator\":\"does not contain\","
			+     					  "\"values\":[\"10000\"]"
			+   				 "}"
			+ 				  "]"
			+"}";
	
	public final String endsWith1000Return400 = 
			 "{"
			+	 "\"overlay\":\"USA\","
			+	 "\"level\":\"4\","
			+	 "\"filters\": ["
			+					 "{"
			+    					  "\"field_id\":\"usa_pp_total\","
			+     					  "\"operator\":\"ends with\","
			+     					  "\"values\":[\"1000\"]"
			+   				 "}"
			+ 				  "]"
			+"}";
	
	
	public final String missingBodyParamLevelReturn400 = 
			 "{"
			+	 "\"overlay\":\"USA\","
			+	 "\"filters\": ["
			+					 "{"
			+    					  "\"field_id\":\"usa_county\","
			+     					  "\"operator\":\"contains\","
			+     					  "\"values\":[\"fors\"]"
			+   				 "}"
			+ 				  "]"
			+"}";
	
	/*
	 *    Zip Import
	 */
	
	public final String zipImportReturn200 =
			"{ " +
					"  \"zips\":[ " +
					"    \"30117\"," +
					"    \"30328\"," +
					"    \"XXXXX\"" +
					"  ]" +
					"}";
			
	public final String multiZipCodes_20_ZipValueReturned200 =
			"{ " +
					"  \"zips\":[ " +
					"    \"30001\"," +
					"    \"30002\"," +
					"    \"30003\"," +
					"    \"30004\"," +
					"    \"30005\"," +
					"    \"30006\"," +
					"    \"30007\"," +
					"    \"30008\"," +
					"    \"30009\"," +
					"    \"30010\"," +
					"    \"30011\"," +
					"    \"30012\"," +
					"    \"30013\"," +
					"    \"30014\"," +
					"    \"30015\"," +
					"    \"30016\"," +
					"    \"30017\"," +
					"    \"30018\"," +
					"    \"30019\"," +
					"    \"30020\"" +
					"  ]" +
					"}";
	
	public final String repeatingZipCodes_ZipValueReturned200 =
			"{ " +
					"  \"zips\":[ " +
					"    \"30117\"," +
					"    \"30328\"," +
					"    \"30328\"," +
					"    \"30117\"," +
					"    \"30328\"," +
					"    \"30328\"," +
					"    \"30117\"," +
					"    \"30328\"," +
					"    \"30328\"," +
					"    \"30117\"," +
					"    \"30328\"," +
					"    \"30328\"" +
					"  ]" +
					"}";
	
	public final String wrongDataType_NumberZipCode_ErrorReturned =
			"{ " +
					"  \"zips\":[ " +
					"    30117," +
					"    30328" +
					"  ]" +
					"}";
	
	public final String wrongDataType_BoolZipCode_ErrorReturned =
			"{ " +
					"  \"zips\":[ " +
					"    true," +
					"    false" +
					"  ]" +
					"}";
	
	public final String invalidZipCode_ErrorReturned =
			"{ " +
					"  \"zips\":[ " +
					"    \"NOOO\"," +
					"    \"Yeesss\"" +
					"  ]" +
					"}";
	
	public final String invalidZipCode_LeadingZeros_ErrorReturned =
			"{ " +
					"  \"zips\":[ " +
					"    \"030117\"," +
					"    \"10000000000000000000000000000000000000000303280000000000000000000000000000000\"," +
					"    \"AAAABBBBBBCCCCCAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA1230328AAAAAAAAAAAAA\"" +
					"  ]" +
					"}";
	
	public final String emptyZipCodeArray_ErrorReturned =
			"{ " +
					"  \"zips\":[ " +
					"  ]" +
					"}";
	

}
