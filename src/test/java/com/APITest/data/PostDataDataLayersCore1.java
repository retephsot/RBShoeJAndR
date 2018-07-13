package com.APITest.data;

public class PostDataDataLayersCore1 {
	
	/*
	 * Post body for happy path tests returns 200 status - DataLayers /core/routing/1
	 */
	
	public final String tileVersionOfRoutingTrafficDisabled = 
 "{"
+	 "\"metricSystem\":\"metric\","
+	 "\"waypoint0\":\"geo!38.8855055,-77.013654\","
+	 "\"waypoint1\":\"geo!36.3454676,-79.6645379\","
+	 "\"mode\":\"fastest;car;traffic:disabled;\","
+	 "\"displaytiles\":true,"
+	 "\"directions\":true"
+ "}";
	
	
	public final String tileVersionOfRoutingTrafficEnabled = 
			 "{"
			+	 "\"metricSystem\":\"metric\","
			+	 "\"waypoint0\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint1\":\"geo!36.3454676,-79.6645379\","
			+	 "\"mode\":\"fastest;car;traffic:enabled;\","
			+	 "\"displaytiles\":true,"
			+	 "\"directions\":true"
			+ "}";
	
	
	public final String optimizeWaypoints_PrintDirectionsPolyline = 
			 "{"
			+	 "\"metricSystem\":\"metric\","
			+	 "\"waypoint0\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint1\":\"geo!36.3454676,-79.6645379\","
			+	 "\"mode\":\"fastest;car;traffic:disabled;\","
			+	 "\"displaytiles\":true,"
			+	 "\"directions\":true,"
			+	 "\"optimizeWaypoints\":true,"
			+	 "\"printdirections\":true,"
			+	 "\"polyline\":true"
			+ "}";
	
	
	public final String multipleWaypoints8 = 
			 "{"
			+	 "\"metricSystem\":\"metric\","
			+	 "\"waypoint0\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint1\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint2\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint3\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint4\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint5\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint6\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint7\":\"geo!36.3454676,-79.6645379\","
			+	 "\"mode\":\"fastest;car;traffic:disabled;\","
			+	 "\"displaytiles\":true,"
			+	 "\"directions\":true,"
			+	 "\"optimizeWaypoints\":true,"
			+	 "\"printdirections\":true,"
			+	 "\"polyline\":true"
			+ "}";
	
	public final String imperialUnitSystem = 
			 "{"
			+	 "\"metricSystem\":\"imperial\","
			+	 "\"waypoint0\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint1\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint2\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint3\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint4\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint5\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint6\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint7\":\"geo!36.3454676,-79.6645379\","
			+	 "\"mode\":\"fastest;car;traffic:disabled;\","
			+	 "\"displaytiles\":true,"
			+	 "\"directions\":true,"
			+	 "\"RouteName\":\"Lion\","
			+	 "\"optimizeWaypoints\":true,"
			+	 "\"printdirections\":true,"
			+	 "\"polyline\":true"
			+ "}";
	
	public final String eightyOne_WayPoints = 
			 "{"
			+	 "\"metricSystem\":\"imperial\","
			+	 "\"waypoint0\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint1\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint2\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint3\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint4\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint5\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint6\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint7\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint8\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint9\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint10\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint11\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint12\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint13\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint14\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint15\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint16\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint17\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint18\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint19\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint20\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint21\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint22\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint23\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint24\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint25\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint26\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint27\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint28\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint29\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint30\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint31\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint32\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint33\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint34\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint35\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint36\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint37\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint38\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint39\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint40\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint41\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint42\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint43\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint44\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint45\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint46\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint47\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint48\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint49\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint50\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint51\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint52\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint53\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint54\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint55\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint56\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint57\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint58\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint59\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint60\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint61\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint62\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint63\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint64\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint65\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint66\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint67\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint68\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint69\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint70\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint71\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint72\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint73\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint74\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint75\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint76\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint77\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint78\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint79\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint80\": \"geo!38.8855055,-77.013654\","
			+	 "\"mode\":\"fastest;car;traffic:disabled;\","
			+	 "\"displaytiles\":true,"
			+	 "\"directions\":true"
			+ "}";
	
	
	public final String oneFiftyOne_WayPointsReturn400 = 
			 "{"
			+	 "\"metricSystem\":\"imperial\","
			+	 "\"waypoint0\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint1\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint2\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint3\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint4\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint5\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint6\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint7\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint8\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint9\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint10\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint11\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint12\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint13\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint14\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint15\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint16\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint17\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint18\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint19\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint20\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint21\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint22\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint23\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint24\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint25\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint26\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint27\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint28\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint29\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint30\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint31\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint32\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint33\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint34\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint35\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint36\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint37\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint38\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint39\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint40\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint41\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint42\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint43\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint44\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint45\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint46\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint47\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint48\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint49\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint50\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint51\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint52\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint53\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint54\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint55\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint56\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint57\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint58\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint59\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint60\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint61\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint62\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint63\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint64\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint65\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint66\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint67\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint68\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint69\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint70\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint71\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint72\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint73\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint74\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint75\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint76\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint77\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint78\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint79\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint80\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint81\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint82\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint83\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint84\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint85\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint86\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint87\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint88\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint89\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint90\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint91\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint92\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint93\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint94\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint95\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint96\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint97\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint98\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint99\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint100\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint101\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint102\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint103\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint104\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint105\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint106\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint107\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint108\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint109\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint110\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint111\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint112\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint113\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint114\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint115\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint116\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint117\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint118\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint119\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint120\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint121\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint122\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint123\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint124\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint125\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint126\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint127\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint128\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint129\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint130\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint131\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint132\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint133\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint134\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint135\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint136\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint137\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint138\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint139\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint140\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint141\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint142\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint143\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint144\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint145\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint146\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint147\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint148\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint149\": \"geo!38.8855055,-77.013654\","
		    +	 "\"waypoint150\": \"geo!38.8855055,-77.013654\","
			+	 "\"mode\":\"fastest;car;traffic:disabled;\","
			+	 "\"displaytiles\":true,"
			+	 "\"directions\":true"
			+ "}";
	
	
	public final String missingWayPoint0_Return400 = 
			 "{"
			+	 "\"metricSystem\":\"metric\","
			+	 "\"waypoint1\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint2\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint3\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint4\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint5\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint6\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint7\":\"geo!36.3454676,-79.6645379\","
			+	 "\"mode\":\"fastest;car;traffic:disabled;\","
			+	 "\"displaytiles\":true,"
			+	 "\"directions\":true"
			+ "}";
	
	public final String onlyOne_WayPoint_Return400 = 
			 "{"
			+	 "\"metricSystem\":\"metric\","
			+	 "\"waypoint0\":\"geo!36.3454676,-79.6645379\","
			+	 "\"mode\":\"fastest;car;traffic:disabled;\","
			+	 "\"displaytiles\":true,"
			+	 "\"directions\":true"
			+ "}";
	
	
	public final String missingRequiredParam_MetricSystem_WayPoints_Mode_Return400 = 
			 "{"
			+	 "\"displaytiles\":true,"
			+	 "\"directions\":true"
			+ "}";
	
	public final String only_WayPoints_Provided_Return400 = 
			"{"
			+	 "\"waypoint0\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint1\":\"geo!38.8855055,-77.013654\""
			+ "}";
	
	
	public final String missingParams_Directions_Displaytiles_Return400 = 
			 "{"
			+	 "\"metricSystem\":\"metric\","
			+	 "\"waypoint0\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint1\":\"geo!36.3454676,-79.6645379\","
			+	 "\"mode\":\"fastest;car;traffic:disabled;\""
			+ "}";
	
	
	public final String invalidParams_Return400 = 
			 "{"
			+	 "\"metricSystemBAD\":\"metric\","
			+	 "\"waypoint0\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint1\":\"geo!36.3454676,-79.6645379\","
			+	 "\"mode\":\"fastest;car;traffic:disabled;\","
			+	 "\"displaytilesBAD\":true,"
			+	 "\"directionsBAD\":true"
			+ "}";
	
	
	public final String wrongDataType_AllBody_Param_Return400 = 
			"{" +
					"    \"metricSystem\": true," +
					"    \"waypoint0\": 1234," +
					"    \"waypoint1\": false," +
					"    \"mode\": \"1;1;1:1;\"," +
					"    \"displaytiles\": 1111," +
					"    \"directions\": \"yes\"" +
					"}";
	
	
	public final String blankPostBody_Return400 = 
			 "{"
			+ "}";
	
	
	public final String missingWayPoint2_Return400 = 
			 "{"
			+	 "\"metricSystem\":\"metric\","
			+	 "\"waypoint0\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint1\":\"geo!36.3454676,-79.6645379\","
			+	 "\"waypoint4\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint5\":\"geo!36.3454676,-79.6645379\","
			+	 "\"mode\":\"fastest;car;traffic:disabled;\","
			+	 "\"displaytiles\":true,"
			+	 "\"directions\":true"
			+ "}";
	
	public final String tileVersionRouting_Truck_Traff_Disabled = 
			 "{"
			+	 "\"metricSystem\":\"metric\","
			+	 "\"waypoint0\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint1\":\"geo!36.3454676,-79.6645379\","
			+	 "\"mode\":\"fastest;truck;traffic:disabled;\","
			+	 "\"displaytiles\":true,"
			+	 "\"directions\":true"
			+ "}";
	
	
	public final String tileVersionRouting_Truck_Traff_Enabled = 
			 "{"
			+	 "\"metricSystem\":\"metric\","
			+	 "\"waypoint0\":\"geo!38.8855055,-77.013654\","
			+	 "\"waypoint1\":\"geo!36.3454676,-79.6645379\","
			+	 "\"mode\":\"fastest;truck;traffic:enabled;\","
			+	 "\"displaytiles\":true,"
			+	 "\"directions\":true"
			+ "}";
	
	/*
	 * 		Routing V2    s200_profile_Car_Directions_Returned
	 */
	
	public final String routingV2Car_Directions_Returned =
			
			"{" +
			" \"traffic\": false," +
			" \"optimized\": false," +
			" \"timebased\": true," +
			" \"timebasedlegacy\":false," +
			" \"tiles\": true," +
			" \"directions\": true," +
			" \"waypoints\": [" +
			"   {\"lat\":40.532034,\"lng\":-74.194014,\"id\":\"66Hawley\",\"start\":1503567520,\"flexible\":true, \"duration\":5}," +
			"   {\"lat\":40.532860,\"lng\":-74.184933,\"id\":\"55Arbutus\",\"start\":1503569520,\"flexible\":false,\"duration\":5}," +
			"   {\"lat\":40.540188,\"lng\":-74.177045,\"id\":\"AnnadaleMeat\",\"start\":1503579520,\"flexible\":true,\"duration\":5}," +
			"   {\"lat\":40.600616,\"lng\":-74.091721,\"id\":\"PickleWorks\",\"start\":1503580520,\"flexible\":true,\"duration\":5}," +
			"   {\"lat\":40.600526,\"lng\":-74.092147,\"id\":\"Pastosas\",\"start\":1503587520,\"flexible\":true,\"duration\":5}," +
			"   {\"lat\":40.600526,\"lng\":-74.092147,\"id\":\"YOOO\",\"start\":1503597001, \"flexible\":true, \"duration\":5}," +
			"   {\"lat\":40.572603,\"lng\":-74.107036,\"id\":\"Excelsior\",\"start\":1503597014, \"flexible\":true, \"duration\":50}," +
			"   {\"lat\":40.540429,\"lng\":-74.177505,\"id\":\"AnnadaleBagels\",\"start\":1503597018, \"flexible\":true,\"duration\":5}," +
			"   {\"lat\":40.633603,\"lng\":-74.155865,\"id\":\"BadFlexWaypoint\",\"start\":1503580534, \"flexible\":true, \"duration\":5}" +
			" ]," +
			" \"profile\": {\"type\":\"car\"}," +
			" \"first\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503567000,\"duration\":0,\"id\":\"136HawleyStart\"}," +
			" \"last\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503597000,\"duration\":0,\"id\":\"136HawleyEnd\"}," +
			"\"routestart\":1503567000," +
			"\"routeend\":1503597000" +
			"}";
	
	public final String routingV2Bicycle_Directions_Returned =
			
			"{" +
			" \"traffic\": false," +
			" \"optimized\": false," +
			" \"timebased\": true," +
			" \"timebasedlegacy\":false," +
			" \"tiles\": true," +
			" \"directions\": true," +
			" \"waypoints\": [" +
			"   {\"lat\":40.532034,\"lng\":-74.194014,\"id\":\"66Hawley\",\"start\":1503567520,\"flexible\":true, \"duration\":5}," +
			"   {\"lat\":40.532860,\"lng\":-74.184933,\"id\":\"55Arbutus\",\"start\":1503569520,\"flexible\":false,\"duration\":5}," +
			"   {\"lat\":40.540188,\"lng\":-74.177045,\"id\":\"AnnadaleMeat\",\"start\":1503579520,\"flexible\":true,\"duration\":5}," +
			"   {\"lat\":40.600616,\"lng\":-74.091721,\"id\":\"PickleWorks\",\"start\":1503580520,\"flexible\":true,\"duration\":5}," +
			"   {\"lat\":40.600526,\"lng\":-74.092147,\"id\":\"Pastosas\",\"start\":1503587520,\"flexible\":true,\"duration\":5}," +
			"   {\"lat\":40.600526,\"lng\":-74.092147,\"id\":\"YOOO\",\"start\":1503597001, \"flexible\":true, \"duration\":5}," +
			"   {\"lat\":40.572603,\"lng\":-74.107036,\"id\":\"Excelsior\",\"start\":1503597014, \"flexible\":true, \"duration\":50}," +
			"   {\"lat\":40.540429,\"lng\":-74.177505,\"id\":\"AnnadaleBagels\",\"start\":1503597018, \"flexible\":true,\"duration\":5}," +
			"   {\"lat\":40.633603,\"lng\":-74.155865,\"id\":\"BadFlexWaypoint\",\"start\":1503580534, \"flexible\":true, \"duration\":5}" +
			" ]," +
			" \"profile\": {\"type\":\"car\"}," +
			" \"first\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503567000,\"duration\":0,\"id\":\"136HawleyStart\"}," +
			" \"last\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503597000,\"duration\":0,\"id\":\"136HawleyEnd\"}," +
			"\"routestart\":1503567000," +
			"\"routeend\":1503597000" +
			"}";
			
	public final String routingV2Custom_Directions_Returned =
			
			"{" +
			" \"traffic\": false," +
			" \"optimized\": false," +
			" \"timebased\": true," +
			" \"timebasedlegacy\":false," +
			" \"tiles\": true," +
			" \"directions\": true," +
			" \"waypoints\": [" +
			"   {\"lat\":40.532034,\"lng\":-74.194014,\"id\":\"66Hawley\",\"start\":1503567520,\"flexible\":true, \"duration\":5}," +
			"   {\"lat\":40.532860,\"lng\":-74.184933,\"id\":\"55Arbutus\",\"start\":1503569520,\"flexible\":false,\"duration\":5}," +
			"   {\"lat\":40.540188,\"lng\":-74.177045,\"id\":\"AnnadaleMeat\",\"start\":1503579520,\"flexible\":true,\"duration\":5}," +
			"   {\"lat\":40.600616,\"lng\":-74.091721,\"id\":\"PickleWorks\",\"start\":1503580520,\"flexible\":true,\"duration\":5}," +
			"   {\"lat\":40.600526,\"lng\":-74.092147,\"id\":\"Pastosas\",\"start\":1503587520,\"flexible\":true,\"duration\":5}," +
			"   {\"lat\":40.600526,\"lng\":-74.092147,\"id\":\"YOOO\",\"start\":1503597001, \"flexible\":true, \"duration\":5}," +
			"   {\"lat\":40.572603,\"lng\":-74.107036,\"id\":\"Excelsior\",\"start\":1503597014, \"flexible\":true, \"duration\":50}," +
			"   {\"lat\":40.540429,\"lng\":-74.177505,\"id\":\"AnnadaleBagels\",\"start\":1503597018, \"flexible\":true,\"duration\":5}," +
			"   {\"lat\":40.633603,\"lng\":-74.155865,\"id\":\"BadFlexWaypoint\",\"start\":1503580534, \"flexible\":true, \"duration\":5}" +
			" ]," +
			" \"profile\": {\"type\":\"custom\"}," +
			" \"first\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503567000,\"duration\":0,\"id\":\"136HawleyStart\"}," +
			" \"last\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503597000,\"duration\":0,\"id\":\"136HawleyEnd\"}," +
			"\"routestart\":1503567000," +
			"\"routeend\":1503597000" +
			"}";
	
	public final String routingV2TruckWithCustomProfileParams_Directions_Returned =
			
			"{" +
					" \"traffic\": false," +
					" \"optimized\": false," +
					" \"timebased\": true," +
					" \"timebasedlegacy\":false," +
					" \"tiles\": true," +
					" \"directions\": true," +
					" \"waypoints\": [" +
					"   {\"lat\":40.532034,\"lng\":-74.194014,\"id\":\"66Hawley\",\"start\":1503567520,\"flexible\":true, \"duration\":5}," +
					"   {\"lat\":40.532860,\"lng\":-74.184933,\"id\":\"55Arbutus\",\"start\":1503569520,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.540188,\"lng\":-74.177045,\"id\":\"AnnadaleMeat\",\"start\":1503579520,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.600616,\"lng\":-74.091721,\"id\":\"PickleWorks\",\"start\":1503580520,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.600526,\"lng\":-74.092147,\"id\":\"Pastosas\",\"start\":1503587520,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.600526,\"lng\":-74.092147,\"id\":\"YOOO\",\"start\":1503597001,\"flexible\":true, \"duration\":5}," +
					"   {\"lat\":40.572603,\"lng\":-74.107036,\"id\":\"Excelsior\",\"start\":1503598374,\"flexible\":true,\"duration\":5}" +
					" ]," +
					" \"profile\": {\"type\":\"custom\",\"axles\":15,\"height\":15, \"length\":25, \"width\": 10, \"weight\": 900, \"hazmat\":true,\"trailers\": 2, \"weightPerAxle\":700}," +
					" \"first\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1502567000,\"duration\":0,\"id\":\"136HawleyStart\"}," +
					" \"last\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1508597000,\"duration\":0,\"id\":\"136HawleyEnd\"}," +
					"\"routestart\":1502567000," +
					"\"routeend\":1509597000" +
					"}";
	
	public final String routingV2Profile_Pedestrian_URL_Directions_Returned =
			
			"{" +
					" \"traffic\": false," +
					" \"optimized\": false," +
					" \"timebased\": true," +
					" \"timebasedlegacy\":false," +
					" \"tiles\": true," +
					" \"directions\": true," +
					" \"waypoints\": [" +
					"   {\"lat\":40.532034,\"lng\":-74.194014,\"id\":\"66Hawley\",\"start\":1503567520, \"flexible\":true, \"duration\":5}," +
					"   {\"lat\":40.532860,\"lng\":-74.184933,\"id\":\"55Arbutus\",\"start\":1503569520, \"flexible\":false, \"duration\":5}," +
					"   {\"lat\":40.540188,\"lng\":-74.177045,\"id\":\"AnnadaleMeat\",\"start\":1503579520, \"flexible\":true, \"duration\":5}," +
					"   {\"lat\":40.600616,\"lng\":-74.091721,\"id\":\"PickleWorks\",\"start\":1503580520, \"flexible\":true, \"duration\":5}," +
					"   {\"lat\":40.600526,\"lng\":-74.092147,\"id\":\"Pastosas\",\"start\":1503587520, \"flexible\":true, \"duration\":5}" +
					" ]," +
					" \"profile\": {\"type\":\"pedestrian\"}," +
					" \"first\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503567000, \"flexible\":false, \"duration\":0,\"id\":\"136HawleyStart\"}," +
					" \"last\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503597000, \"flexible\":false, \"duration\":0,\"id\":\"136HawleyEnd\"}," +
					"\"routestart\":1503567000," +
					"\"routeend\":1513567000" +
					"}";
	
	public final String timeBasedLegacyTrue_URL_Directions_Returned =
			"{" +
					"	\"tiles\":true," +
					"	\"directions\":false," +
					"	\"optimized\":true," +
					"	\"timebased\":true," +
					"	\"profile\":{\"type\": \"car\"}," +
					"	\"traffic\":true," +
					"	\"timebasedlegacy\":true," +
					"	\"waypoints\":[" +
					"		{\"lat\":34.4752819,\"lng\":-84.92862650000001,\"id\":\"c9a0938b-abab-5d53-532e-d47724092048\",\"duration\":45,\"start\":1516225307,\"flexible\":true}," +
					"		{\"lat\":34.7712097,\"lng\":-84.92270719999999,\"id\":\"48a9cdb5-416f-ca37-2c4a-86e508c7048c\",\"duration\":45,\"start\":1516225307,\"flexible\":true}" +
					"	]," +
					"	\"routestart\":1516197600," +
					"	\"routeend\":1516233600" +
					"}";
	
	public final String routingV2Profile_Bicycle_AllFlexibleParamFalse_URL_Directions_Returned =
			
			"{" +
					" \"traffic\": false," +
					" \"optimized\": false," +
					" \"timebased\": true," +
					" \"timebasedlegacy\":false," +
					" \"tiles\": true," +
					" \"directions\": true," +
					" \"waypoints\": [" +
					"   {\"lat\":40.532034,\"lng\":-74.194014,\"id\":\"66Hawley\",\"start\":1501567520,\"flexible\":false, \"duration\":5}," +
					"   {\"lat\":40.532860,\"lng\":-74.184933,\"id\":\"55Arbutus\",\"start\":1503569520,\"flexible\":false,\"duration\":5}," +
					"   {\"lat\":40.540188,\"lng\":-74.177045,\"id\":\"AnnadaleMeat\",\"start\":1503579520,\"flexible\":false,\"duration\":5}," +
					"   {\"lat\":40.600616,\"lng\":-74.091721,\"id\":\"PickleWorks\",\"start\":1510510520,\"flexible\":false,\"duration\":5}," +
					"   {\"lat\":40.600526,\"lng\":-74.092147,\"id\":\"Pastosas\",\"start\":1510567000,\"flexible\":false,\"duration\":5}" +
					" ]," +
					" \"profile\": {\"type\":\"bicycle\"}," +
					" \"first\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1501567000,\"duration\":0,\"id\":\"136HawleyStart\"}," +
					" \"last\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1510997000,\"duration\":0,\"id\":\"136HawleyEnd\"}," +
					"\"routestart\":1501567000," +
					"\"routeend\":1513567000" +
					"}";
	
	public final String routingV2Profile_Pedestrian_AllFlexibleParamTrue_URL_Directions_Returned =
			
			"{" +
					" \"traffic\": false," +
					" \"optimized\": false," +
					" \"timebased\": true," +
					" \"timebasedlegacy\":false," +
					" \"tiles\": true," +
					" \"directions\": true," +
					" \"waypoints\": [" +
					"   {\"lat\":40.532034,\"lng\":-74.194014,\"id\":\"66Hawley\",\"start\":1501567520,\"flexible\":true, \"duration\":5}," +
					"   {\"lat\":40.532860,\"lng\":-74.184933,\"id\":\"55Arbutus\",\"start\":1503569520,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.540188,\"lng\":-74.177045,\"id\":\"AnnadaleMeat\",\"start\":1503579520,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.600616,\"lng\":-74.091721,\"id\":\"PickleWorks\",\"start\":1510510520,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.600526,\"lng\":-74.092147,\"id\":\"Pastosas\",\"start\":1510567000,\"flexible\":true,\"duration\":5}" +
					" ]," +
					" \"profile\": {\"type\":\"pedestrian\"}," +
					" \"first\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1501567000,\"duration\":0,\"id\":\"136HawleyStart\"}," +
					" \"last\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503597000,\"duration\":0,\"id\":\"136HawleyEnd\"}," +
					"\"routestart\":1501567000," +
					"\"routeend\":1513567000" +
					"}";
	
	public final String routingV2BlockedTime_ProfileBicycle_URL_Directions_Returned =
			"{" +
					"  \"traffic\": true," +
					"  \"optimized\": false," +
					"  \"timebased\": true," +
					"  \"tiles\": true," +
					"  \"directions\": false," +
					"  \"waypoints\": [" +
					"    {\"lat\":40.532034,\"lng\":-74.194014,\"id\":\"66Hawley\",\"start\":1503567900,\"duration\":10, \"flexible\": true}," +
					"    {\"lat\":40.532860,\"lng\":-74.184933,\"id\":\"55Arbutus\",\"start\":1503570600,\"duration\":15, \"flexible\": true}" +
					"  ]," +
					"   \"blockedtimes\": [" +
					"    {\"starttime\":1503570600, \"endtime\":1503571500}" +
					"  ]," +
					"  \"profile\": {\"type\":\"car\"}," +
					"  \"first\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503567000,\"duration\":0,\"id\":\"136HawleyS\", \"flexible\":false}," +
					"  \"last\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503595800,\"duration\":0,\"id\":\"136HawleyE\", \"flexible\":false}," +
					"  \"routestart\":1501567000," +
					"  \"routeend\":1513567000" +
					"}";
	
	
	public final String routingV2Profile_Pedestrian_25WayPoints_URL_Directions_Returned =
			
			"{" +
					"\"traffic\": true," +
					"\"optimized\": false," +
					"\"timebased\": true," +
					"\"tiles\": true," +
					"\"directions\": true," +
					"\"waypoints\": [" +
					"" +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x001\", \"start\":1503567001, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x002\", \"start\":1503567100, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x003\", \"start\":1503567200, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x004\", \"start\":1503567300, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x005\", \"start\":1503567400, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x006\", \"start\":1503567500, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x007\", \"start\":1503567600, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x008\", \"start\":1503567700, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x009\", \"start\":1503567800, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8893,\"lng\":-77.0502, \"id\":\"x010\", \"start\":1503567850, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x011\", \"start\":1503567900, \"flexible\":true, \"duration\":5}," +
					"" +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x012\", \"start\":1503568000, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x013\", \"start\":1503568100, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x014\", \"start\":1503568200, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x015\", \"start\":1503568300, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x016\", \"start\":1503568400, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x017\", \"start\":1503568500, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x018\", \"start\":1503568600, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x019\", \"start\":1503568700, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x020\", \"start\":1503568800, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x021\", \"start\":1503568900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x022\", \"start\":1503569000, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x023\", \"start\":1503569100, \"flexible\":true, \"duration\":5}" +
					"]," +
					"" +
					"\"profile\": { \"type\": \"pedestrian\" }," +
					"\"first\": {\"lat\":40.7127,\"lng\":-74.0134, \"start\":1503567000, \"flexible\":false, \"duration\":0, \"id\":\"x000\"}," +
					"\"last\": {\"lat\":40.7127,\"lng\":-74.0134, \"start\":1503569200, \"flexible\":false, \"duration\":0, \"id\":\"x234\"}," +
					"\"routestart\":1503567000," +
					"\"routeend\":1503569200" +
					"}";
	
	public final String routingV2Profile_Car_27WayPoints_URL_Directions_Returned =
			
			"{" +
					"\"traffic\": true," +
					"\"optimized\": false," +
					"\"timebased\": true," +
					"\"tiles\": true," +
					"\"directions\": true," +
					"\"waypoints\": [" +
					"" +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x001\", \"start\":1503567001, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x002\", \"start\":1503567100, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x003\", \"start\":1503567200, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x004\", \"start\":1503567300, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x005\", \"start\":1503567400, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x006\", \"start\":1503567500, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x007\", \"start\":1503567600, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x008\", \"start\":1503567700, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x009\", \"start\":1503567800, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8893,\"lng\":-77.0502, \"id\":\"x010\", \"start\":1503567850, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x011\", \"start\":1503567900, \"flexible\":true, \"duration\":5}," +
					"" +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x012\", \"start\":1503568000, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x013\", \"start\":1503568100, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x014\", \"start\":1503568200, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x015\", \"start\":1503568300, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x016\", \"start\":1503568400, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x017\", \"start\":1503568500, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x018\", \"start\":1503568600, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x019\", \"start\":1503568700, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x020\", \"start\":1503568800, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x021\", \"start\":1503568900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x022\", \"start\":1503569000, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x023\", \"start\":1503569100, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x024\", \"start\":1503569200, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.0893,\"lng\":-77.2703, \"id\":\"x025\", \"start\":1503569300, \"flexible\":true, \"duration\":5}" +
					"" +
					"]," +
					"\"profile\": { \"type\": \"car\" }," +
					"\"first\": {\"lat\":40.7127,\"lng\":-74.0134, \"start\":1503567000,  \"flexible\":true, \"duration\":0, \"id\":\"x000\"}," +
					"\"last\": {\"lat\":33.9171,\"lng\":-84.3555, \"start\":1503697000,  \"flexible\":true,  \"duration\":0, \"id\":\"x234\"}," +
					"\"routestart\":1503566900," +
					"\"routeend\":1503697000" +
					"}";
	
	public final String routingV2Profile_Car_65WayPoints_URL_Directions_Returned =
			
			"{" +
					" \"traffic\": false," +
					" \"optimized\": false," +
					" \"timebased\": true," +
					" \"tiles\": true," +
					" \"directions\": false," +
					" \"waypoints\": [" +
					"   {\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x001\", \"start\":1503567000,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x002\", \"start\":1503567100,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x003\", \"start\":1503567200,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x004\", \"start\":1503567300,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x005\", \"start\":1503567400,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x006\", \"start\":1503567500,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x007\", \"start\":1503567600,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x008\", \"start\":1503567700,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x009\", \"start\":1503567800,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8893,\"lng\":-77.0502, \"id\":\"x010\", \"start\":1503567850,  \"flexible\":true, \"duration\":5}," +
					"" +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x011\", \"start\":1503567900,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x012\", \"start\":1503568000,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x013\", \"start\":1503568100,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x014\", \"start\":1503568200,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x015\", \"start\":1503568300,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x016\", \"start\":1503568400,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x017\", \"start\":1503568500,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x018\", \"start\":1503568600,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x019\", \"start\":1503568700,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x020\", \"start\":1503568800,  \"flexible\":true, \"duration\":5}," +
					"" +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x021\", \"start\":1503568900,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x022\", \"start\":1503569000,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x023\", \"start\":1503569100,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x024\", \"start\":1503569200,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.0893,\"lng\":-77.2703, \"id\":\"x025\", \"start\":1503569300,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x026\", \"start\":1503567400,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x027\", \"start\":1503569400,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x028\", \"start\":1503569500,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x029\", \"start\":1503569600,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x030\", \"start\":1503569700,  \"flexible\":true, \"duration\":5}," +
					"" +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x031\", \"start\":1503569800,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x032\", \"start\":1503569900,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x033\", \"start\":1503570000,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x034\", \"start\":1503570100,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x035\", \"start\":1503570200,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8893,\"lng\":-77.0502, \"id\":\"x036\", \"start\":1503570300,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x037\", \"start\":1503570400,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x038\", \"start\":1503570500,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x039\", \"start\":1503570600,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x040\", \"start\":1503570700,  \"flexible\":true, \"duration\":5}," +
					"" +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x041\", \"start\":1503570800,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x042\", \"start\":1503570900,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x043\", \"start\":1503571900,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x044\", \"start\":1503572900,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x045\", \"start\":1503573900,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x046\", \"start\":1503574900,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x047\", \"start\":1503575900,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x048\", \"start\":1503576900,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x049\", \"start\":1503577900,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x050\", \"start\":1503578900,  \"flexible\":true, \"duration\":5}," +
					"" +
					"{\"lat\":42.0893,\"lng\":-77.2703, \"id\":\"x051\", \"start\":1503579900,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x052\", \"start\":1503580900,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x053\", \"start\":1503581900,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x054\", \"start\":1503582900,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x055\", \"start\":1503583900,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x056\", \"start\":1503584900,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x057\", \"start\":1503585900,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x058\", \"start\":1503586900,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x059\", \"start\":1503587900,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8893,\"lng\":-77.0502, \"id\":\"x060\", \"start\":1503588900,  \"flexible\":true, \"duration\":5}," +
					"" +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x061\", \"start\":1503589900,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x062\", \"start\":1503590900,  \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x063\", \"start\":1503591900,  \"flexible\":true, \"duration\":5}" +
					" ]," +
					" \"profile\": {\"type\":\"car\"}," +
					" \"first\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503566000,  \"flexible\":true, \"duration\":0,\"id\":\"136HawleyStart\"}," +
					" \"last\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503591905, \"flexible\":true, \"duration\":0,\"id\":\"136HawleyEnd\"}," +
					" \"routestart\":1503566000," +
					" \"routeend\":1503591905" +
					" " +
					"}";
	
	
	final public String routingV2_120WayPointsCar_DirReturned200 = 
			
			"{" +
					"\"traffic\": true," +
					"\"optimized\": false," +
					"\"timebased\": true," +
					"\"tiles\": true," +
					"\"directions\": true," +
					"\"waypoints\": [" +
					"" +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x001\", \"start\":1503567001, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x002\", \"start\":1503567100, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x003\", \"start\":1503567200, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x004\", \"start\":1503567300, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x005\", \"start\":1503567400, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x006\", \"start\":1503567500, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x007\", \"start\":1503567600, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x008\", \"start\":1503567700, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x009\", \"start\":1503567800, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8893,\"lng\":-77.0502, \"id\":\"x010\", \"start\":1503567850, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x011\", \"start\":1503567900, \"flexible\":true, \"duration\":5}," +
					"" +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x012\", \"start\":1503568000, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x013\", \"start\":1503568100, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x014\", \"start\":1503568200, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x015\", \"start\":1503568300, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x016\", \"start\":1503568400, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x017\", \"start\":1503568500, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x018\", \"start\":1503568600, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x019\", \"start\":1503568700, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x020\", \"start\":1503568800, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x021\", \"start\":1503568900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x022\", \"start\":1503569000, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x023\", \"start\":1503569100, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x024\", \"start\":1503569200, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.0893,\"lng\":-77.2703, \"id\":\"x025\", \"start\":1503569300, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x026\", \"start\":1503569305, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x027\", \"start\":1503569400, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x028\", \"start\":1503569500, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x029\", \"start\":1503569600, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x030\", \"start\":1503569700, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x031\", \"start\":1503569800, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x032\", \"start\":1503569900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x033\", \"start\":1503570000, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x034\", \"start\":1503570100, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x035\", \"start\":1503570200, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8893,\"lng\":-77.0502, \"id\":\"x036\", \"start\":1503570300, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x037\", \"start\":1503570400, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x038\", \"start\":1503570500, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x039\", \"start\":1503570600, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x040\", \"start\":1503570700, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x041\", \"start\":1503570800, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x042\", \"start\":1503570900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x043\", \"start\":1503571900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x044\", \"start\":1503572900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x045\", \"start\":1503573900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x046\", \"start\":1503574900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x047\", \"start\":1503575900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x048\", \"start\":1503576900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x049\", \"start\":1503577900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x050\", \"start\":1503578900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.0893,\"lng\":-77.2703, \"id\":\"x051\", \"start\":1503579900, \"flexible\":true, \"duration\":5}," +
					"" +
					"" +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x052\", \"start\":1503580900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x053\", \"start\":1503581900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x054\", \"start\":1503582900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x055\", \"start\":1503583900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x056\", \"start\":1503584900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x057\", \"start\":1503585900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x058\", \"start\":1503586900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x059\", \"start\":1503587900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8893,\"lng\":-77.0502, \"id\":\"x060\", \"start\":1503588900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x061\", \"start\":1503589900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x062\", \"start\":1503590900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x063\", \"start\":1503591900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x064\", \"start\":1503592900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x065\", \"start\":1503593900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x066\", \"start\":1503594900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x067\", \"start\":1503595900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x068\", \"start\":1503596900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x069\", \"start\":1503597900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x070\", \"start\":1503598900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x071\", \"start\":1503599900, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x072\", \"start\":1503600000, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x073\", \"start\":1503600010, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x074\", \"start\":1503600020, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.0893,\"lng\":-77.2703, \"id\":\"x075\", \"start\":1503600030, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x076\", \"start\":1503600040, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x077\", \"start\":1503600050, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x078\", \"start\":1503600060, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x079\", \"start\":1503600070, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x080\", \"start\":1503600080, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x081\", \"start\":1503600090, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x082\", \"start\":1503600100, \"flexible\":true, \"duration\":5}," +
					"" +
					"" +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x083\", \"start\":1503600110, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x084\", \"start\":1503600120, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x085\", \"start\":1503600130, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8893,\"lng\":-77.0502, \"id\":\"x086\", \"start\":1503600140, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x087\", \"start\":1503600150, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x088\", \"start\":1503600160, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x089\", \"start\":1503600170, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x090\", \"start\":1503600180, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x091\", \"start\":1503600190, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x092\", \"start\":1503600200, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x093\", \"start\":1503600210, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x094\", \"start\":1503600220, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x095\", \"start\":1503600230, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x096\", \"start\":1503600240, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x097\", \"start\":1503600250, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x098\", \"start\":1503600260, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x099\", \"start\":1503600270, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x100\", \"start\":1503600280, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x101\", \"start\":1503600290, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x102\", \"start\":1503600300, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x103\", \"start\":1503600310, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x104\", \"start\":1503600320, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x105\", \"start\":1503600330, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x106\", \"start\":1503600340, \"flexible\":true, \"duration\":5}," +
					"" +
					"" +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x107\", \"start\":1503600350, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x108\", \"start\":1503600360, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x109\", \"start\":1503600370, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8893,\"lng\":-77.0502, \"id\":\"x110\", \"start\":1503600380, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x111\", \"start\":1503600390, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x112\", \"start\":1503600410, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x113\", \"start\":1503600420, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x114\", \"start\":1503600430, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x115\", \"start\":1503600440, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x116\", \"start\":1503600450, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x117\", \"start\":1503600460, \"flexible\":true, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x118\", \"start\":1503600470, \"flexible\":true, \"duration\":5}" +
					"]," +
					"\"profile\": { \"type\": \"car\" }," +
					"\"first\": {\"lat\":40.7127,\"lng\":-74.0134, \"start\":1503566900, \"flexible\":true, \"duration\":0, \"id\":\"x000\"}," +
					"\"last\": {\"lat\":33.9171,\"lng\":-84.3555, \"start\":1503797000, \"flexible\":true, \"duration\":0, \"id\":\"x234\"}," +
					"\"routestart\":1503566900," +
					"\"routeend\":1503797000" +
					"}";
	
	final public String routingV2_152WayPointsCar_ErrorReturned400 = 
			"{" +
					"\"traffic\": true," +
					"\"optimized\": false," +
					"\"timebased\": true," +
					"\"tiles\": true," +
					"\"directions\": true," +
					"\"waypoints\": [" +
					"" +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x001\", \"start\":1503567000, \"duration\":5}," +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x002\", \"start\":1503567100, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x003\", \"start\":1503567200, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x004\", \"start\":1503567300, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x005\", \"start\":1503567400, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x006\", \"start\":1503567500, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x007\", \"start\":1503567600, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x008\", \"start\":1503567700, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x009\", \"start\":1503567800, \"duration\":5}," +
					"{\"lat\":38.8893,\"lng\":-77.0502, \"id\":\"x010\", \"start\":1503567850, \"duration\":5}," +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x011\", \"start\":1503567900, \"duration\":5}," +
					"" +
					"" +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x012\", \"start\":1503568000, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x013\", \"start\":1503568100, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x014\", \"start\":1503568200, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x015\", \"start\":1503568300, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x016\", \"start\":1503568400, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x017\", \"start\":1503568500, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x018\", \"start\":1503568600, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x019\", \"start\":1503568700, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x020\", \"start\":1503568800, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x021\", \"start\":1503568900, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x022\", \"start\":1503569000, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x023\", \"start\":1503569100, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x024\", \"start\":1503569200, \"duration\":5}," +
					"{\"lat\":42.0893,\"lng\":-77.2703, \"id\":\"x025\", \"start\":1503569300, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x026\", \"start\":1503569310, \"duration\":5}," +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x027\", \"start\":1503569400, \"duration\":5}," +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x028\", \"start\":1503569500, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x029\", \"start\":1503569600, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x030\", \"start\":1503569700, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x031\", \"start\":1503569800, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x032\", \"start\":1503569900, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x033\", \"start\":1503570000, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x034\", \"start\":1503570100, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x035\", \"start\":1503570200, \"duration\":5}," +
					"{\"lat\":38.8893,\"lng\":-77.0502, \"id\":\"x036\", \"start\":1503570300, \"duration\":5}," +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x037\", \"start\":1503570400, \"duration\":5}," +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x038\", \"start\":1503570500, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x039\", \"start\":1503570600, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x040\", \"start\":1503570700, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x041\", \"start\":1503570800, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x042\", \"start\":1503570900, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x043\", \"start\":1503571900, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x044\", \"start\":1503572900, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x045\", \"start\":1503573900, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x046\", \"start\":1503574900, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x047\", \"start\":1503575900, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x048\", \"start\":1503576900, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x049\", \"start\":1503577900, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x050\", \"start\":1503578900, \"duration\":5}," +
					"{\"lat\":42.0893,\"lng\":-77.2703, \"id\":\"x051\", \"start\":1503579900, \"duration\":5}," +
					"" +
					"" +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x052\", \"start\":1503580900, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x053\", \"start\":1503581900, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x054\", \"start\":1503582900, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x055\", \"start\":1503583900, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x056\", \"start\":1503584900, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x057\", \"start\":1503585900, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x058\", \"start\":1503586900, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x059\", \"start\":1503587900, \"duration\":5}," +
					"{\"lat\":38.8893,\"lng\":-77.0502, \"id\":\"x060\", \"start\":1503588900, \"duration\":5}," +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x061\", \"start\":1503589900, \"duration\":5}," +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x062\", \"start\":1503590900, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x063\", \"start\":1503591900, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x064\", \"start\":1503592900, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x065\", \"start\":1503593900, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x066\", \"start\":1503594900, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x067\", \"start\":1503595900, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x068\", \"start\":1503596900, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x069\", \"start\":1503597900, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x070\", \"start\":1503598900, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x071\", \"start\":1503599900, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x072\", \"start\":1503600000, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x073\", \"start\":1503600010, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x074\", \"start\":1503600020, \"duration\":5}," +
					"{\"lat\":42.0893,\"lng\":-77.2703, \"id\":\"x075\", \"start\":1503600030, \"duration\":5}," +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x076\", \"start\":1503600040, \"duration\":5}," +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x077\", \"start\":1503600050, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x078\", \"start\":1503600060, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x079\", \"start\":1503600070, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x080\", \"start\":1503600080, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x081\", \"start\":1503600090, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x082\", \"start\":1503600100, \"duration\":5}," +
					"" +
					"" +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x083\", \"start\":1503600110, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x084\", \"start\":1503600120, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x085\", \"start\":1503600130, \"duration\":5}," +
					"{\"lat\":38.8893,\"lng\":-77.0502, \"id\":\"x086\", \"start\":1503600140, \"duration\":5}," +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x087\", \"start\":1503600150, \"duration\":5}," +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x088\", \"start\":1503600160, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x089\", \"start\":1503600170, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x090\", \"start\":1503600180, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x091\", \"start\":1503600190, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x092\", \"start\":1503600200, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x093\", \"start\":1503600210, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x094\", \"start\":1503600220, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x095\", \"start\":1503600230, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x096\", \"start\":1503600240, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x097\", \"start\":1503600250, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x098\", \"start\":1503600260, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x099\", \"start\":1503600270, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x100\", \"start\":1503600280, \"duration\":5}," +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x101\", \"start\":1503600290, \"duration\":5}," +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x102\", \"start\":1503600300, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x103\", \"start\":1503600310, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x104\", \"start\":1503600320, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x105\", \"start\":1503600330, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x106\", \"start\":1503600340, \"duration\":5}," +
					"" +
					"" +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x107\", \"start\":1503600350, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x108\", \"start\":1503600360, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x109\", \"start\":1503600370, \"duration\":5}," +
					"{\"lat\":38.8893,\"lng\":-77.0502, \"id\":\"x110\", \"start\":1503600380, \"duration\":5}," +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x111\", \"start\":1503600390, \"duration\":5}," +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x112\", \"start\":1503600410, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x113\", \"start\":1503600420, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x114\", \"start\":1503600430, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x115\", \"start\":1503600440, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x116\", \"start\":1503600450, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x117\", \"start\":1503600460,  \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x118\", \"start\":1503600470, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x119\", \"start\":1503600480, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x120\", \"start\":1503600490, \"duration\":5}," +
					"" +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x121\", \"start\":1503600500, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x122\", \"start\":1503600510, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x123\", \"start\":1503600520, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x124\", \"start\":1503600530, \"duration\":5}," +
					"{\"lat\":42.0893,\"lng\":-77.2703, \"id\":\"x125\", \"start\":1503600540, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x126\", \"start\":1503600544, \"duration\":5}," +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x127\", \"start\":1503600551, \"duration\":5}," +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x128\", \"start\":1503600562, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x129\", \"start\":1503600573, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x130\", \"start\":1503600580, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x131\", \"start\":1503600590, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x132\", \"start\":1503600600, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x133\", \"start\":1503600610, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x134\", \"start\":1503600620, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x135\", \"start\":1503600630, \"duration\":5}," +
					"{\"lat\":38.8893,\"lng\":-77.0502, \"id\":\"x136\", \"start\":1503600640, \"duration\":5}," +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x137\", \"start\":1503600650, \"duration\":5}," +
					"{\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x138\", \"start\":1503600660, \"duration\":5}," +
					"{\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x139\", \"start\":1503600670, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x140\", \"start\":1503600680, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x141\", \"start\":1503600690, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x142\", \"start\":1503600700, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x143\", \"start\":1503600710, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x144\", \"start\":1503600720, \"duration\":5}," +
					"{\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x145\", \"start\":1503600730, \"duration\":5}," +
					"{\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x146\", \"start\":1503600740, \"duration\":5}," +
					"{\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x147\", \"start\":1503600750, \"duration\":5}," +
					"{\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x148\", \"start\":1503600760, \"duration\":5}," +
					"{\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x149\", \"start\":1503600770, \"duration\":5}," +
					"{\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x150\", \"start\":1503600780, \"duration\":5}" +
					"]," +
					"\"profile\": { \"type\": \"car\" }," +
					"\"first\": {\"lat\":40.7127,\"lng\":-74.0134, \"start\":1503567000, \"duration\":0, \"id\":\"x000\"}," +
					"\"last\": {\"lat\":33.9171,\"lng\":-84.3555, \"start\":1503797000, \"duration\":0, \"id\":\"x234\"}," +
					"\"departure\": \"2017-08-24T05:30:00Z\"" +
					"}";
	
	public final String coreRoutingV2_RepeatWayPointID_Return400 =
			"{" +
					" \"traffic\": false," +
					" \"optimized\": false," +
					" \"timebased\": true," +
					" \"timebasedlegacy\":false," +
					" \"tiles\": true," +
					" \"directions\": true," +
					" \"waypoints\": [" +
					"   {\"lat\":40.532034,\"lng\":-74.194014,\"id\":\"66Hawley\",\"start\":1503567520,\"flexible\":true, \"duration\":5}," +
					"   {\"lat\":40.532860,\"lng\":-74.184933,\"id\":\"55Arbutus\",\"start\":1503569520,\"flexible\":false,\"duration\":5}," +
					"   {\"lat\":40.540188,\"lng\":-74.177045,\"id\":\"55Arbutus\",\"start\":1503579520,\"flexible\":true,\"duration\":5}" +
					" ]," +
					" \"profile\": {\"type\":\"car\"}," +
					" \"first\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503567000,\"duration\":0,\"id\":\"136HawleyStart\"}," +
					" \"last\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503597000,\"duration\":0,\"id\":\"136HawleyEnd\"}," +
					"\"routestart\":1503567000," +
					"\"routeend\":1513567000" +
					"}";
	
	
	public final String missingLastParam_Return200 =
			"{" +
					"\"traffic\": true," +
					"\"optimized\": false," +
					"\"timebased\": true," +
					"\"tiles\": true," +
					"\"directions\": true," +
					"\"waypoints\": [" +
					"  {\"lat\":40.532034,\"lng\":-74.194014,\"id\":\"66Hawley\", \"start\":1503567990, \"flexible\":false, \"duration\":5}," +
					"   {\"lat\":40.532860,\"lng\":-74.184933,\"id\":\"55Arbutus\",\"start\":1503567950, \"flexible\":true, \"duration\":5}" +
					"]," +
					"\"profile\": { \"type\": \"car\" }," +
					"\"first\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503567000,\"duration\":0,\"id\":\"136HawleyStart\"}," +
					"" +
					"\"routestart\":1503566900," +
					"\"routeend\":1503933597" +
					"}";
	
	public final String missingFirstAndLastParam_Return200 =
			"{" +
					" \"traffic\": false," +
					" \"optimized\": false," +
					" \"timebased\": true," +
					" \"timebasedlegacy\":false," +
					" \"tiles\": true," +
					" \"directions\": true," +
					" \"waypoints\": [" +
					"   {\"lat\":40.532034,\"lng\":-74.194014,\"id\":\"66Hawley\",\"start\":1503567520,\"flexible\":true, \"duration\":5}," +
					"   {\"lat\":40.532860,\"lng\":-74.184933,\"id\":\"55Arbutus\",\"start\":1503569520,\"flexible\":false,\"duration\":5}," +
					"   {\"lat\":40.540188,\"lng\":-74.177045,\"id\":\"AnnadaleMeat\",\"start\":1503579520,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.600616,\"lng\":-74.091721,\"id\":\"PickleWorks\",\"start\":1503580520,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.600526,\"lng\":-74.092147,\"id\":\"Pastosas\",\"start\":1503587520,\"flexible\":true,\"duration\":5}" +
					" ]," +
					" \"profile\": {\"type\":\"car\"}," +
					"\"routestart\":1503567000," +
					"\"routeend\":1513567000" +
					"}";
	
	public final String notEnoughTimeForAllWayPointsQueueReturned200 =
			"{" +
					" \"traffic\": false," +
					" \"optimized\": false," +
					" \"timebased\": true," +
					" \"timebasedlegacy\":false," +
					" \"tiles\": true," +
					" \"directions\": true," +
					" \"waypoints\": [" +
					" 	" +
					"  {\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x001\", \"start\":1503567001, \"flexible\":true, \"duration\":5}," +
					"  {\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x002\", \"start\":1503567100, \"flexible\":true, \"duration\":5}," +
					"  {\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x003\", \"start\":1503567200, \"flexible\":true, \"duration\":5}," +
					"  {\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x004\", \"start\":1503567300, \"flexible\":true, \"duration\":5}," +
					"  {\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x005\", \"start\":1503567400, \"flexible\":true, \"duration\":5}," +
					"  {\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x006\", \"start\":1503567500, \"flexible\":true, \"duration\":5}," +
					"  {\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x007\", \"start\":1503567600, \"flexible\":true, \"duration\":5}," +
					"  {\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x008\", \"start\":1503567700, \"flexible\":true, \"duration\":5}," +
					"  {\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x009\", \"start\":1503567800, \"flexible\":true, \"duration\":5}," +
					"  {\"lat\":38.8893,\"lng\":-77.0502, \"id\":\"x010\", \"start\":1503567850, \"flexible\":true, \"duration\":5}," +
					"  {\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x011\", \"start\":1503567900, \"flexible\":true, \"duration\":5}," +
					"" +
					"  {\"lat\":40.8893,\"lng\":-79.0502, \"id\":\"x012\", \"start\":1503568000, \"flexible\":true, \"duration\":5}," +
					"  {\"lat\":41.8893,\"lng\":-77.0602, \"id\":\"x013\", \"start\":1503568100, \"flexible\":true, \"duration\":5}," +
					"  {\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x014\", \"start\":1503568200, \"flexible\":true, \"duration\":5}," +
					"  {\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x015\", \"start\":1503568300, \"flexible\":true, \"duration\":5}," +
					"  {\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x016\", \"start\":1503568400, \"flexible\":true, \"duration\":5}," +
					"  {\"lat\":40.8896,\"lng\":-79.0506, \"id\":\"x017\", \"start\":1503568500, \"flexible\":true, \"duration\":5}," +
					"  {\"lat\":41.8897,\"lng\":-77.0607, \"id\":\"x018\", \"start\":1503568600, \"flexible\":true, \"duration\":5}," +
					"  {\"lat\":42.8898,\"lng\":-77.0708, \"id\":\"x019\", \"start\":1503568700, \"flexible\":true, \"duration\":5}," +
					"  {\"lat\":42.8893,\"lng\":-77.0703, \"id\":\"x020\", \"start\":1503568800, \"flexible\":true, \"duration\":5}," +
					"  {\"lat\":38.8894,\"lng\":-77.0504, \"id\":\"x021\", \"start\":1503568900, \"flexible\":true, \"duration\":5}," +
					"  {\"lat\":39.8895,\"lng\":-78.0505, \"id\":\"x022\", \"start\":1503569000, \"flexible\":true, \"duration\":5}," +
					" 	" +
					"   {\"lat\":40.532034,\"lng\":-74.194014,\"id\":\"66Hawley\",\"start\":1503591520,\"flexible\":true, \"duration\":5}," +
					"   {\"lat\":40.532860,\"lng\":-74.184933,\"id\":\"55Arbutus\",\"start\":1503588520,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.600526,\"lng\":-74.092147,\"id\":\"Pastosas\",\"start\":1503587520,\"flexible\":true,\"duration\":5}" +
					" ]," +
					" \"profile\": {\"type\":\"car\"}," +
					" \"first\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503567000,\"duration\":1,\"id\":\"136HawleyStart\"}," +
					" \"last\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503569000,\"duration\":8,\"id\":\"136HawleyEnd\"}," +
					"\"routestart\":1503566800," +
					"\"routeend\":1503570000" +
					"}";
		
	
	public final String badWayPointLatSetTo0400Returned =
			"{" +
					" \"traffic\": false," +
					" \"optimized\": false," +
					" \"timebased\": true," +
					" \"tiles\": true," +
					" \"directions\": false," +
					" \"waypoints\": [" +
					"   {\"lat\":39.8893,\"lng\":-78.0502,\"id\":\"66Hawley\",\"start\":1503566800, \"flexible\":true, \"duration\":5}," +
					"   {\"lat\":0,\"lng\":-79.0502,\"id\":\"55Arbutus\",\"start\":1503566805, \"flexible\":true, \"duration\":5}," +
					"   {\"lat\":41.8893,\"lng\":-77.0602,\"id\":\"AnnadaleMeat\",\"start\":1503566810, \"flexible\":true, \"duration\":5}," +
					"   {\"lat\":42.8893,\"lng\":-77.0703,\"id\":\"PickleWorks\",\"start\":1503566820, \"flexible\":true, \"duration\":5}," +
					"   {\"lat\":38.8894,\"lng\":-77.0504,\"id\":\"Excelsior\",\"start\":1503567000, \"flexible\":true, \"duration\":5}," +
					"   {\"lat\":39.8895,\"lng\":-78.0505,\"id\":\"AnnadaleBagels\",\"start\":1503567100, \"flexible\":true, \"duration\":5}," +
					"   {\"lat\":40.8896,\"lng\":-79.0506,\"id\":\"BadFlexWaypoint\",\"start\":1503567200, \"flexible\":true, \"duration\":5}" +
					" ]," +
					" \"profile\": {\"type\":\"car\"}," +
					" \"first\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503567000, \"flexible\":false, \"duration\":0,\"id\":\"136HawleyStart\"}," +
					" \"last\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503599400, \"flexible\":false, \"duration\":0,\"id\":\"136HawleyEnd\"}," +
					" \"routestart\":1503567000," +
					" \"routeend\":1503599400" +
					"}";
	
	public final String noStartTimeWithFlexibleTrue_400Returned =
			"{" +
					" \"traffic\": false," +
					" \"optimized\": false," +
					" \"timebased\": true," +
					" \"tiles\": true," +
					" \"directions\": true," +
					" \"waypoints\": [" +
					"   {\"lat\":39.8893,\"lng\":-78.0502,\"id\":\"66Hawley\",\"start\":1503566800,\"duration\":5}," +
					"   {\"lat\":40.8893,\"lng\":-79.0502,\"id\":\"55Arbutus\",\"flexible\":true, \"duration\":5}," +
					"   {\"lat\":41.8893,\"lng\":-77.0602,\"id\":\"AnnadaleMeat\",\"start\":1503566810,\"duration\":5}," +
					"   {\"lat\":42.8893,\"lng\":-77.0703,\"id\":\"PickleWorks\",\"start\":1503566820,\"duration\":5}," +
					"   {\"lat\":38.8894,\"lng\":-77.0504,\"id\":\"Excelsior\",\"start\":1503567000,\"duration\":5}," +
					"   {\"lat\":39.8895,\"lng\":-78.0505,\"id\":\"AnnadaleBagels\",\"start\":1503567100,\"duration\":5}," +
					"   {\"lat\":40.8896,\"lng\":-79.0506,\"id\":\"BadFlexWaypoint\",\"start\":1503567200,\"duration\":5}" +
					" ]," +
					" \"profile\": {\"type\":\"car\"}," +
					" \"first\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503567000,\"duration\":0,\"id\":\"136HawleyStart\"}," +
					" \"last\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503599400,\"duration\":0,\"id\":\"136HawleyEnd\"}," +
					" \"routestart\":1503567000," +
					" \"routeend\":1503599400" +
					"}";
	
	public final String routeStartAndRouteEndTimeIsBeforeWayPointStartTime_400Returned =
			"{" +
					"  \"traffic\": true," +
					"  \"optimized\": false," +
					"  \"timebased\": true," +
					"  \"tiles\": true," +
					"  \"directions\": false," +
					"  \"waypoints\": [" +
					"    {\"lat\":40.532034,\"lng\":-74.194014,\"id\":\"66Hawley\",\"start\":1503567900,\"duration\":10}," +
					"    {\"lat\":40.532860,\"lng\":-74.184933,\"id\":\"55Arbutus\",\"start\":1503570600,\"duration\":500}," +
					"    {\"lat\":40.540188,\"lng\":-74.177045,\"id\":\"AnnadaleMeat\",\"start\":1503577860,\"duration\":20}," +
					"    {\"lat\":40.600616,\"lng\":-74.091721,\"id\":\"PickleWorks\",\"start\":1503577800,\"duration\":20}," +
					"    {\"lat\":40.600526,\"lng\":-74.092147,\"id\":\"Pastosas\",\"start\":1503571800,\"duration\":10}" +
					"  ]," +
					"  \"profile\": {\"type\":\"car\"}," +
					"  \"first\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503567000,\"duration\":0,\"id\":\"136HawleyS\"}," +
					"  \"last\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503595800,\"duration\":0,\"id\":\"136HawleyE\"}," +
					"  \"routestart\":1503067000," +
					"  \"routeend\":1503095800" +
					"}";
	
	public final String badLastStartTimeNotEnoughTime_400Returned =
			"{" +
					" \"traffic\": false," +
					" \"optimized\": false," +
					" \"timebased\": true," +
					" \"timebasedlegacy\":false," +
					" \"tiles\": false," +
					" \"directions\": true," +
					" \"waypoints\": [" +
					"   {\"lat\":40.532034,\"lng\":-74.194014,\"id\":\"66Hawley\",\"start\":1503567000,\"flexible\":true, \"duration\":5}," +
					"   {\"lat\":40.532860,\"lng\":-74.184933,\"id\":\"55Arbutus\",\"start\":1503567010,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.540188,\"lng\":-74.177045,\"id\":\"AnnadaleMeat\",\"start\":1503567020,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.600616,\"lng\":-74.091721,\"id\":\"PickleWorks\",\"start\":1503567030,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.600526,\"lng\":-74.092147,\"id\":\"Pastosas\",\"start\":1503567060,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.600526,\"lng\":-74.092147,\"id\":\"YOOO\",\"start\":1503567070, \"flexible\":true, \"duration\":5}," +
					"   {\"lat\":40.572603,\"lng\":-74.107036,\"id\":\"Excelsior\",\"start\":1503567090, \"flexible\":true, \"duration\":5}," +
					"   {\"lat\":40.540429,\"lng\":-74.177505,\"id\":\"AnnadaleBagels\",\"start\":1503567100, \"flexible\":true, \"duration\":5}," +
					"   {\"lat\":40.633603,\"lng\":-74.155865,\"id\":\"BadFlexWaypoint\",\"start\":1503567004, \"flexible\":false, \"duration\":5}" +
					" ]," +
					" \"profile\": {\"type\":\"car\"}," +
					" \"first\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503567000, \"flexible\":false, \"duration\":0,\"id\":\"136HawleyStart\"}," +
					" \"last\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503597000, \"flexible\":false, \"duration\":0,\"id\":\"136HawleyEnd\"}," +
					"\"routestart\":1503567000," +
					"\"routeend\":1503597000" +
					"}";
	
	public final String blockTimeUeseUpAvailTime_FlexFalse_400Returned =
			"{" +
					"  \"traffic\": true," +
					"  \"optimized\": false," +
					"  \"timebased\": true," +
					"  \"tiles\": true," +
					"  \"directions\": true," +
					"  \"waypoints\": [" +
					"    {\"lat\":40.532034,\"lng\":-74.194014,\"id\":\"66Hawley\",\"start\":1503567900,\"duration\":10, \"flexible\": false}," +
					"    {\"lat\":40.532860,\"lng\":-74.184933,\"id\":\"55Arbutus\",\"start\":1503570600,\"duration\":15, \"flexible\": false}," +
					"    {\"lat\":40.540188,\"lng\":-74.177045,\"id\":\"AnnadaleMeat\",\"start\":1503581400,\"duration\":20, \"flexible\": false}," +
					"    {\"lat\":40.600616,\"lng\":-74.091721,\"id\":\"PickleWorks\",\"start\":1503587800,\"duration\":20, \"flexible\": false}," +
					"    {\"lat\":40.600526,\"lng\":-74.092147,\"id\":\"Pastosas\",\"start\":1503579600,\"duration\":10, \"flexible\": false}" +
					"  ]," +
					" \"blockedtimes\": [" +
					"    {\"starttime\":1503567000, \"endtime\":1503695800}" +
					"  ]," +
					" \"profile\": {\"type\":\"car\"}," +
					"  \"first\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503567000,\"duration\":0,\"id\":\"136HawleyS\", \"flexible\":false}," +
					"  \"last\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503595800,\"duration\":0,\"id\":\"136HawleyE\", \"flexible\":false}," +
					"  \"routestart\":1503567000," +
					"  \"routeend\":1503595800" +
					"}";
		
	public final String missingParam_Profile_400Returned =
			"{" +
					"\"traffic\": true," +
					"\"optimized\": false," +
					"\"timebased\": true," +
					"\"tiles\": true," +
					"\"directions\": true," +
					"\"waypoints\": [" +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x001\", \"start\":1503567000, \"flexible\":true, \"duration\":5}" +
					"]," +
					"\"profile\": {  }," +
					"\"first\": {\"lat\":40.7127,\"lng\":-74.0134, \"start\": 1503567001, \"id\":\"x123\",\"flexible\":false, \"duration\":5}," +
					"\"last\": {\"lat\":33.9171,\"lng\":-84.3555, \"start\": 1503566900, \"id\":\"x234\",\"flexible\":false, \"duration\":5}," +
					"\"routestart\":1503566900," +
					"\"routeend\":1503933197" +
					"}";
	
	public final String wrongDataTypeFirstParam_400Returned =
			"{" +
					"\"traffic\": true," +
					"\"optimized\": false," +
					"\"timebased\": true," +
					"\"tiles\": true," +
					"\"directions\": true," +
					"\"waypoints\": [" +
					"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x001\", \"start\":1503567000, \"flexible\":true, \"duration\":5}" +
					"]," +
					"\"profile\": { \"type\": \"car\" }," +
					"\"first\": \"soWhat\"," +
					"\"last\": {\"lat\":33.9171,\"lng\":-84.3555, \"start\": 1503577000, \"id\":\"x234\", \"flexible\":false, \"duration\":5}," +
					"\"routestart\":1503555000," +
					"\"routeend\":1503587000" +
					"}";
	
	public final String wrongDataTypeWayPointStartTime_400Returned =
			"{" +
					" \"traffic\": false," +
					" \"optimized\": false," +
					" \"timebased\": true," +
					" \"tiles\": true," +
					" \"directions\": false," +
					" \"waypoints\": [" +
					"   {\"lat\":40.532034,\"lng\":-74.194014,\"id\":\"66Hawley\", \"start\":true, \"flexible\":false, \"duration\":5}," +
					"   {\"lat\":40.532860,\"lng\":-74.184933,\"id\":\"55Arbutus\",\"start\":1503567950, \"flexible\":true, \"duration\":5}" +
					" ]," +
					" \"profile\": {\"type\":\"car\"}," +
					" \"first\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503567000,\"duration\":0,\"id\":\"136HawleyStart\"}," +
					" \"last\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503933587,\"duration\":0,\"id\":\"136HawleyEnd\"}," +
					" \"routestart\":1503566900," +
					" \"routeend\":1503933597" +
					"}";
	
	public final String blankPostBody_400Returned =
			"{" +
			 "" +
			"}";
	
	public final String Truck_TooTall_Height150_400Returned =
			"{" +
					" \"traffic\": false," +
					" \"optimized\": false," +
					" \"timebased\": true," +
					" \"timebasedlegacy\":false," +
					" \"tiles\": true," +
					" \"directions\": true," +
					" \"waypoints\": [" +
					"   {\"lat\":40.532034,\"lng\":-74.194014,\"id\":\"66Hawley\",\"start\":1503567520,\"flexible\":true, \"duration\":5}," +
					"   {\"lat\":40.532860,\"lng\":-74.184933,\"id\":\"55Arbutus\",\"start\":1503569520,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.540188,\"lng\":-74.177045,\"id\":\"AnnadaleMeat\",\"start\":1503579520,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.600616,\"lng\":-74.091721,\"id\":\"PickleWorks\",\"start\":1503580520,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.600526,\"lng\":-74.092147,\"id\":\"Pastosas\",\"start\":1503587520,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.600526,\"lng\":-74.092147,\"id\":\"YOOO\",\"start\":1503597001,\"flexible\":true, \"duration\":5}," +
					"   {\"lat\":40.572603,\"lng\":-74.107036,\"id\":\"Excelsior\",\"start\":1503598374,\"flexible\":true,\"duration\":5}" +
					" ]," +
					" \"profile\": {\"type\":\"custom\",\"axles\":18,\"height\":150, \"length\":25, \"width\": 10, \"weight\": 900, \"hazmat\":true,\"trailers\": 2, \"weightPerAxle\":700}," +
					" \"first\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1502567000,\"duration\":0,\"id\":\"136HawleyStart\"}," +
					" \"last\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1508597000,\"duration\":0,\"id\":\"136HawleyEnd\"}," +
					"\"routestart\":1502567000," +
					"\"routeend\":1509597000" +
					"}";
	
	public final String Truck_TooLong_Length400_400Returned =
			"{" +
					" \"traffic\": false," +
					" \"optimized\": false," +
					" \"timebased\": true," +
					" \"timebasedlegacy\":false," +
					" \"tiles\": true," +
					" \"directions\": true," +
					" \"waypoints\": [" +
					"   {\"lat\":40.532034,\"lng\":-74.194014,\"id\":\"66Hawley\",\"start\":1503567520,\"flexible\":true, \"duration\":5}," +
					"   {\"lat\":40.532860,\"lng\":-74.184933,\"id\":\"55Arbutus\",\"start\":1503569520,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.540188,\"lng\":-74.177045,\"id\":\"AnnadaleMeat\",\"start\":1503579520,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.600616,\"lng\":-74.091721,\"id\":\"PickleWorks\",\"start\":1503580520,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.600526,\"lng\":-74.092147,\"id\":\"Pastosas\",\"start\":1503587520,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.600526,\"lng\":-74.092147,\"id\":\"YOOO\",\"start\":1503597001,\"flexible\":true, \"duration\":5}," +
					"   {\"lat\":40.572603,\"lng\":-74.107036,\"id\":\"Excelsior\",\"start\":1503598374,\"flexible\":true,\"duration\":5}" +
					" ]," +
					" \"profile\": {\"type\":\"custom\",\"axles\":18,\"height\":50, \"length\":400, \"width\": 10, \"weight\": 900, \"hazmat\":true,\"trailers\": 2, \"weightPerAxle\":700}," +
					" \"first\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1502567000,\"duration\":0,\"id\":\"136HawleyStart\"}," +
					" \"last\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1508597000,\"duration\":0,\"id\":\"136HawleyEnd\"}," +
					"\"routestart\":1502567000," +
					"\"routeend\":1509597000" +
					"}";
	
	public final String Truck_TooWide_Width150_400Returned =
			"{" +
					" \"traffic\": false," +
					" \"optimized\": false," +
					" \"timebased\": true," +
					" \"timebasedlegacy\":false," +
					" \"tiles\": true," +
					" \"directions\": true," +
					" \"waypoints\": [" +
					"   {\"lat\":40.532034,\"lng\":-74.194014,\"id\":\"66Hawley\",\"start\":1503567520,\"flexible\":true, \"duration\":5}," +
					"   {\"lat\":40.532860,\"lng\":-74.184933,\"id\":\"55Arbutus\",\"start\":1503569520,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.540188,\"lng\":-74.177045,\"id\":\"AnnadaleMeat\",\"start\":1503579520,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.600616,\"lng\":-74.091721,\"id\":\"PickleWorks\",\"start\":1503580520,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.600526,\"lng\":-74.092147,\"id\":\"Pastosas\",\"start\":1503587520,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.600526,\"lng\":-74.092147,\"id\":\"YOOO\",\"start\":1503597001,\"flexible\":true, \"duration\":5}," +
					"   {\"lat\":40.572603,\"lng\":-74.107036,\"id\":\"Excelsior\",\"start\":1503598374,\"flexible\":true,\"duration\":5}" +
					" ]," +
					" \"profile\": {\"type\":\"custom\",\"axles\":18,\"height\":50, \"length\":300, \"width\": 150, \"weight\": 900, \"hazmat\":true,\"trailers\": 2, \"weightPerAxle\":700}," +
					" \"first\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1502567000,\"duration\":0,\"id\":\"136HawleyStart\"}," +
					" \"last\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1508597000,\"duration\":0,\"id\":\"136HawleyEnd\"}," +
					"\"routestart\":1502567000," +
					"\"routeend\":1509597000" +
					"}";
	
	public final String Truck_TooManyTrailers_5Trailers_400Returned =
			"{" +
					" \"traffic\": false," +
					" \"optimized\": false," +
					" \"timebased\": true," +
					" \"timebasedlegacy\":false," +
					" \"tiles\": true," +
					" \"directions\": true," +
					" \"waypoints\": [" +
					"   {\"lat\":40.532034,\"lng\":-74.194014,\"id\":\"66Hawley\",\"start\":1503567520,\"flexible\":true, \"duration\":5}," +
					"   {\"lat\":40.532860,\"lng\":-74.184933,\"id\":\"55Arbutus\",\"start\":1503569520,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.540188,\"lng\":-74.177045,\"id\":\"AnnadaleMeat\",\"start\":1503579520,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.600616,\"lng\":-74.091721,\"id\":\"PickleWorks\",\"start\":1503580520,\"flexible\":true,\"duration\":5}," +
					"   {\"lat\":40.600526,\"lng\":-74.092147,\"id\":\"Pastosas\",\"start\":1503588520,\"flexible\":true,\"duration\":5}" +
					" ]," +
					" \"profile\": {\"type\":\"custom\",\"axles\":18,\"height\":50, \"length\":300, \"width\": 50, \"weight\": 900, \"hazmat\":0,\"trailers\": 5, \"weightPerAxle\":700}," +
					" \"first\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1502567000,\"duration\":0,\"id\":\"136HawleyStart\"}," +
					" \"last\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503987000,\"duration\":0,\"id\":\"136HawleyEnd\"}," +
					"\"routestart\":1502567000," +
					"\"routeend\":1503997000" +
					"}";
	
	public final String timeBasedLegacyTrue_InvalidStartTime_400Returned =
			"{" +
					"	\"tiles\":true," +
					"	\"directions\":false," +
					"	\"optimized\":true," +
					"	\"timebased\":true," +
					"	\"profile\":{\"type\": \"car\"}," +
					"	\"traffic\":true," +
					"	\"timebasedlegacy\":true," +
					"	\"waypoints\":[" +
					"		{\"lat\":34.4752819,\"lng\":-84.92862650000001,\"id\":\"c9a0938b-abab-5d53-532e-d47724092048\",\"duration\":45,\"start\":1516197600,\"flexible\":true}," +
					"		{\"lat\":34.7712097,\"lng\":-84.92270719999999,\"id\":\"48a9cdb5-416f-ca37-2c4a-86e508c7048c\",\"duration\":45,\"start\":1516225307,\"flexible\":true}" +
					"	]," +
					"	\"first\": {" +
					"		\"lat\":34.4752819,\"lng\":-84.92862650000001,\"id\":\"c9a0938b-abab-5d53-532e-d47724092049\",\"duration\":45,\"start\":1516197600,\"flexible\":false" +
					"	}," +
					"	\"routestart\":1516197601," +
					"	\"routeend\":1516233600" +
					"}";
			
	public final String coreRoutingV2_3WayPointsTileTrue200 = "{"
			 + "\"traffic\": false,"
			 + "\"optimized\": false,"
			 + "\"timebased\": false,"
			 + "\"tiles\": true,"
			 + "\"directions\": false,"
			 + "\"waypoints\": ["
			 + "{"
			 + "\"lat\": 39.8893,"
			 + "\"lng\": -78.0502,"
			 + "\"id\": \"x001\""
			 + "}"
			 + "],"
			 + "\"profile\": {"
			 + "\"type\": \"bicycle\""
			 + "},"
			 + "\"first\": {"
			 + "\"lat\": 40.7127,"
			 + "\"lng\": -74.0134,"
			 + "\"start\": \"2017-08-24T05:30:00Z\","
			 + "\"id\": \"x123\""
			 + "},"
			 + "\"last\": {"
			 + "\"lat\": 33.9171,"
			 + "\"lng\": -84.3555,"
			 + "\"start\": \"2017-08-24T013:30:00Z\","
			 + "\"id\": \"x234\""
			 + "},"
			 + "\"departure\": \"2017-08-24T05:30:00Z\""
			 + "}";
	
	
	public final String coreRoutingV2_3WayPointsAllOptFalse200 = "{"
			 + "\"traffic\": false,"
			 + "\"optimized\": false,"
			 + "\"timebased\": false,"
			 + "\"tiles\": false,"
			 + "\"directions\": false,"
			 + "\"waypoints\": ["
			 + "{"
			 + "\"lat\": 39.8893,"
			 + "\"lng\": -78.0502,"
			 + "\"id\": \"x001\""
			 + "}"
			 + "],"
			 + "\"profile\": {"
			 + "\"type\": \"bicycle\""
			 + "},"
			 + "\"first\": {"
			 + "\"lat\": 40.7127,"
			 + "\"lng\": -74.0134,"
			 + "\"start\": \"2017-08-24T05:30:00Z\","
			 + "\"id\": \"x123\""
			 + "},"
			 + "\"last\": {"
			 + "\"lat\": 33.9171,"
			 + "\"lng\": -84.3555,"
			 + "\"start\": \"2017-08-24T013:30:00Z\","
			 + "\"id\": \"x234\""
			 + "},"
			 + "\"departure\": \"2017-08-24T05:30:00Z\""
			 + "}";
	
	
		
	
		
	public final String routingV2_6WayPointsNearBy_Esri200 = "{"
			 + "	\"traffic\": false,"
			 + "	\"optimized\": false,"
			 + "	\"timebased\": false,"
			 + "	\"tiles\": true,"
			 + "	\"directions\": true,"
			 + "	\"useesri\": true,"
			 + ""
			 + "	\"waypoints\": ["
			 + "		{"
			 + "			\"lat\": 33.9280850,"
			 + "			\"lng\": -84.354729,"
			 + "			\"id\": \"Costco\","
			 + "			\"start\": \"\""
			 + "		},"
			 + "		{"
			 + "			\"lat\": 33.9289880,"
			 + "			\"lng\": -84.355141,"
			 + "			\"id\": \"HomeDepot\","
			 + "			\"start\": \"\""
			 + "		},"
			 + "		{"
			 + "			\"lat\": 33.9277810,"
			 + "			\"lng\": -84.346762,"
			 + "			\"id\": \"TJMaxx\","
			 + "			\"start\": \"\""
			 + "		},"
			 + "		{"
			 + "			\"lat\": 33.9271310,"
			 + "			\"lng\": -84.346569,"
			 + "			\"id\": \"BedBathAndBeyond\","
			 + "			\"start\": \"\""
			 + "		}"
			 + "	],"
			 + "	\"profile\": {"
			 + "		\"type\": \"pedestrian\""
			 + "	},"
			 + "	\"first\": {"
			 + "		\"lat\": 33.9296420,"
			 + "		\"lng\": -84.350270,"
			 + "		\"start\": \"2017-08-24T05:45:00Z\","
			 + "		\"id\": \"VMWare-AirWatch-Building\""
			 + "	},"
			 + "	\"last\": {"
			 + "		\"lat\": 33.9296420,"
			 + "		\"lng\": -84.350270,"
			 + "		\"start\": \"2017-08-24T13:30:00Z\","
			 + "		\"id\": \"VMWare-AirWatch-Building-Done\""
			 + "	},"
			 + "	\"departure\": \"2017-08-24T05:30:00Z\""
			 + "}";



	
	

	public final String routingV2_120WayPointsPedesDirReturned200 = "{"
			 + "\"traffic\": true,"
			 + "\"optimized\": false,"
			 + "\"timebased\": false,"
			 + "\"tiles\": true,"
			 + "\"directions\": true,"
			 + "\"waypoints\": ["
			 + ""
			 + "{\"lat\":33.7806098,\"lng\":-84.3839049,\"id\":\"001\"},"
			 + "	    {\"lat\":33.8775752,\"lng\":-84.456051,\"id\":\"002\"},"
			 + "	    {\"lat\":33.8222934,\"lng\":-84.36833990000002,\"id\":\"003\"},"
			 + "	    {\"lat\":33.9291268,\"lng\":-84.34521940000002,\"id\":\"004\"},"
			 + "	    {\"lat\":33.77528809999999,\"lng\":-84.2995267,\"id\":\"005\"},"
			 + "	    {\"lat\":33.756936,\"lng\":-84.39665100000002,\"id\":\"006\"},"
			 + "	    {\"lat\":33.9078529,\"lng\":-84.37966970000002,\"id\":\"007\"},"
			 + "	    {\"lat\":33.7819954,\"lng\":-84.35458570000003,\"id\":\"008\"},"
			 + "	    {\"lat\":33.701454654509746,\"lng\":-84.2684502129062,\"id\":\"009\"},"
			 + "	    {\"lat\":33.65036709816411,\"lng\":-84.39250335784288,\"id\":\"010\"},"
			 + "	    {\"lat\":33.7990404,\"lng\":-84.1677851,\"id\":\"011\"},"
			 + "	    {\"lat\":33.7819954,\"lng\":-84.35458570000003,\"id\":\"012\"},"
			 + "	    {\"lat\":33.7806098,\"lng\":-84.3839049,\"id\":\"013\"},"
			 + "	    {\"lat\":33.8775752,\"lng\":-84.456051,\"id\":\"014\"},"
			 + "	    {\"lat\":33.8222934,\"lng\":-84.36833990000002,\"id\":\"015\"},"
			 + "	    {\"lat\":33.9291268,\"lng\":-84.34521940000002,\"id\":\"016\"},"
			 + "	    {\"lat\":33.77528809999999,\"lng\":-84.2995267,\"id\":\"017\"},"
			 + "	    {\"lat\":33.756936,\"lng\":-84.39665100000002,\"id\":\"018\"},"
			 + "	    {\"lat\":33.9078529,\"lng\":-84.37966970000002,\"id\":\"019\"},"
			 + "	    {\"lat\":33.7819954,\"lng\":-84.35458570000003,\"id\":\"020\"},"
			 + "	    {\"lat\":33.701454654509746,\"lng\":-84.2684502129062,\"id\":\"021\"},"
			 + "	    {\"lat\":33.65036709816411,\"lng\":-84.39250335784288,\"id\":\"022\"},"
			 + "	    {\"lat\":33.7990404,\"lng\":-84.1677851,\"id\":\"023\"},"
			 + "	    {\"lat\":33.7819954,\"lng\":-84.35458570000003,\"id\":\"024\"},"
			 + "	    {\"lat\":33.7806098,\"lng\":-84.3839049,\"id\":\"025\"},"
			 + "	    {\"lat\":33.8775752,\"lng\":-84.456051,\"id\":\"026\"},"
			 + "	    {\"lat\":33.8222934,\"lng\":-84.36833990000002,\"id\":\"027\"},"
			 + "	    {\"lat\":33.9291268,\"lng\":-84.34521940000002,\"id\":\"028\"},"
			 + "	    {\"lat\":33.77528809999999,\"lng\":-84.2995267,\"id\":\"029\"},"
			 + "	    {\"lat\":33.756936,\"lng\":-84.39665100000002,\"id\":\"030\"},"
			 + "	    {\"lat\":33.9078529,\"lng\":-84.37966970000002,\"id\":\"031\"},"
			 + "	    {\"lat\":33.7819954,\"lng\":-84.35458570000003,\"id\":\"032\"},"
			 + "	    {\"lat\":33.701454654509746,\"lng\":-84.2684502129062,\"id\":\"033\"},"
			 + "	    {\"lat\":33.65036709816411,\"lng\":-84.39250335784288,\"id\":\"034\"},"
			 + "	    {\"lat\":33.7990404,\"lng\":-84.1677851,\"id\":\"035\"},"
			 + "	    {\"lat\":33.7819954,\"lng\":-84.35458570000003,\"id\":\"036\"},"
			 + "	    {\"lat\":33.7806098,\"lng\":-84.3839049,\"id\":\"037\"},"
			 + "	    {\"lat\":33.8775752,\"lng\":-84.456051,\"id\":\"038\"},"
			 + "	    {\"lat\":33.8222934,\"lng\":-84.36833990000002,\"id\":\"039\"},"
			 + "	    {\"lat\":33.9291268,\"lng\":-84.34521940000002,\"id\":\"040\"},"
			 + "	    {\"lat\":33.77528809999999,\"lng\":-84.2995267,\"start\":\"2017-08-24T08:30:00Z\",\"id\":\"s041\"},"
			 + "	    {\"lat\":33.756936,\"lng\":-84.39665100000002,\"id\":\"042\"},"
			 + "	    {\"lat\":33.9078529,\"lng\":-84.37966970000002,\"id\":\"043\"},"
			 + "	    {\"lat\":33.7819954,\"lng\":-84.35458570000003,\"id\":\"044\"},"
			 + "	    {\"lat\":33.701454654509746,\"lng\":-84.2684502129062,\"id\":\"045\"},"
			 + "	    {\"lat\":33.65036709816411,\"lng\":-84.39250335784288,\"id\":\"046\"},"
			 + "	    {\"lat\":33.7990404,\"lng\":-84.1677851,\"id\":\"047\"},"
			 + "	    {\"lat\":33.7819954,\"lng\":-84.35458570000003,\"id\":\"048\"},"
			 + "	    {\"lat\":33.7806098,\"lng\":-84.3839049,\"id\":\"049\"},"
			 + "	    {\"lat\":33.8775752,\"lng\":-84.456051,\"id\":\"050\"},"
			 + "	    {\"lat\":33.8222934,\"lng\":-84.36833990000002,\"id\":\"051\"},"
			 + "	    {\"lat\":33.9291268,\"lng\":-84.34521940000002,\"id\":\"052\"},"
			 + "	    {\"lat\":33.77528809999999,\"lng\":-84.2995267,\"id\":\"053\"},"
			 + "	    {\"lat\":33.756936,\"lng\":-84.39665100000002,\"id\":\"054\"},"
			 + "	    {\"lat\":33.9078529,\"lng\":-84.37966970000002,\"id\":\"055\"},"
			 + "	    {\"lat\":33.7819954,\"lng\":-84.35458570000003,\"id\":\"056\"},"
			 + "	    {\"lat\":33.701454654509746,\"lng\":-84.2684502129062,\"id\":\"057\"},"
			 + "	    {\"lat\":33.65036709816411,\"lng\":-84.39250335784288,\"id\":\"058\"},"
			 + "	    {\"lat\":33.7990404,\"lng\":-84.1677851,\"id\":\"059\"},"
			 + "	    {\"lat\":33.7819954,\"lng\":-84.35458570000003,\"id\":\"060\"},"
			 + "	    {\"lat\":33.7806098,\"lng\":-84.3839049,\"id\":\"061\"},"
			 + "	    {\"lat\":33.8775752,\"lng\":-84.456051,\"id\":\"062\"},"
			 + "	    {\"lat\":33.8222934,\"lng\":-84.36833990000002,\"id\":\"063\"},"
			 + "	    {\"lat\":33.9291268,\"lng\":-84.34521940000002,\"id\":\"064\"},"
			 + "	    {\"lat\":33.77528809999999,\"lng\":-84.2995267,\"id\":\"065\"},"
			 + "	    {\"lat\":33.756936,\"lng\":-84.39665100000002,\"id\":\"066\"},"
			 + "	    {\"lat\":33.9078529,\"lng\":-84.37966970000002,\"id\":\"067\"},"
			 + "	    {\"lat\":33.7819954,\"lng\":-84.35458570000003,\"id\":\"068\"},"
			 + "	    {\"lat\":33.701454654509746,\"lng\":-84.2684502129062,\"id\":\"069\"},"
			 + "	    {\"lat\":33.65036709816411,\"lng\":-84.39250335784288,\"id\":\"070\"},"
			 + "	    {\"lat\":33.7990404,\"lng\":-84.1677851,\"id\":\"071\"},"
			 + "	    {\"lat\":33.7819954,\"lng\":-84.35458570000003,\"start\":\"2017-08-24T11:30:00Z\",\"id\":\"s072\"},"
			 + "	    {\"lat\":33.7806098,\"lng\":-84.3839049,\"id\":\"073\"},"
			 + "	    {\"lat\":33.8775752,\"lng\":-84.456051,\"id\":\"074\"},"
			 + "	    {\"lat\":33.8222934,\"lng\":-84.36833990000002,\"id\":\"075\"},"
			 + "	    {\"lat\":33.9291268,\"lng\":-84.34521940000002,\"id\":\"076\"},"
			 + "	    {\"lat\":33.77528809999999,\"lng\":-84.2995267,\"id\":\"077\"},"
			 + "	    {\"lat\":33.756936,\"lng\":-84.39665100000002,\"id\":\"078\"},"
			 + "	    {\"lat\":33.9078529,\"lng\":-84.37966970000002,\"id\":\"079\"},"
			 + "	    {\"lat\":33.7819954,\"lng\":-84.35458570000003,\"id\":\"080\"},"
			 + "	    {\"lat\":33.701454654509746,\"lng\":-84.2684502129062,\"id\":\"081\"},"
			 + "	    {\"lat\":33.65036709816411,\"lng\":-84.39250335784288,\"id\":\"082\"},"
			 + "	    {\"lat\":33.7990404,\"lng\":-84.1677851,\"id\":\"083\"},"
			 + "	    {\"lat\":33.7819954,\"lng\":-84.35458570000003,\"id\":\"084\"},"
			 + "	    {\"lat\":33.7806098,\"lng\":-84.3839049,\"id\":\"085\"},"
			 + "	    {\"lat\":33.8775752,\"lng\":-84.456051,\"id\":\"086\"},"
			 + "	    {\"lat\":33.8222934,\"lng\":-84.36833990000002,\"id\":\"087\"},"
			 + "	    {\"lat\":33.9291268,\"lng\":-84.34521940000002,\"id\":\"088\"},"
			 + "	    {\"lat\":33.77528809999999,\"lng\":-84.2995267,\"id\":\"089\"},"
			 + "	    {\"lat\":33.756936,\"lng\":-84.39665100000002,\"id\":\"090\"},"
			 + "	    {\"lat\":33.9078529,\"lng\":-84.37966970000002,\"id\":\"091\"},"
			 + "	    {\"lat\":33.7819954,\"lng\":-84.35458570000003,\"id\":\"092\"},"
			 + "	    {\"lat\":33.701454654509746,\"lng\":-84.2684502129062,\"id\":\"093\"},"
			 + "	    {\"lat\":33.65036709816411,\"lng\":-84.39250335784288,\"id\":\"094\"},"
			 + "	    {\"lat\":33.7990404,\"lng\":-84.1677851,\"id\":\"095\"},"
			 + "	    {\"lat\":33.7819954,\"lng\":-84.35458570000003,\"id\":\"096\"},"
			 + "	    {\"lat\":33.7806098,\"lng\":-84.3839049,\"id\":\"097\"},"
			 + "	    {\"lat\":33.8775752,\"lng\":-84.456051,\"id\":\"098\"},"
			 + "	    {\"lat\":33.8222934,\"lng\":-84.36833990000002,\"id\":\"099\"},"
			 + "	    {\"lat\":33.9291268,\"lng\":-84.34521940000002,\"id\":\"100\"},"
			 + "	    {\"lat\":33.77528809999999,\"lng\":-84.2995267,\"id\":\"101\"},"
			 + "	    {\"lat\":33.756936,\"lng\":-84.39665100000002,\"id\":\"102\"},"
			 + "	    {\"lat\":33.9078529,\"lng\":-84.37966970000002,\"id\":\"103\"},"
			 + "	    {\"lat\":33.7819954,\"lng\":-84.35458570000003,\"id\":\"104\"},"
			 + "	    {\"lat\":33.701454654509746,\"lng\":-84.2684502129062,\"id\":\"105\"},"
			 + "	    {\"lat\":33.65036709816411,\"lng\":-84.39250335784288,\"id\":\"106\"},"
			 + "	    {\"lat\":33.7990404,\"lng\":-84.1677851,\"id\":\"107\"},"
			 + "	    {\"lat\":33.7819954,\"lng\":-84.35458570000003,\"id\":\"108\"},"
			 + "	    {\"lat\":33.7806098,\"lng\":-84.3839049,\"id\":\"109\"},"
			 + "	    {\"lat\":33.8775752,\"lng\":-84.456051,\"id\":\"110\"},"
			 + "	    {\"lat\":33.8222934,\"lng\":-84.36833990000002,\"id\":\"111\"},"
			 + "	    {\"lat\":33.9291268,\"lng\":-84.34521940000002,\"id\":\"112\"},"
			 + "	    {\"lat\":33.77528809999999,\"lng\":-84.2995267,\"id\":\"113\"},"
			 + "	    {\"lat\":33.756936,\"lng\":-84.39665100000002,\"id\":\"114\"},"
			 + "	    {\"lat\":33.9078529,\"lng\":-84.37966970000002,\"id\":\"115\"},"
			 + "	    {\"lat\":33.7819954,\"lng\":-84.35458570000003,\"id\":\"116\"},"
			 + "	    {\"lat\":33.701454654509746,\"lng\":-84.2684502129062,\"start\":\"2017-08-24T014:30:00Z\",\"id\":\"s117\"},"
			 + "	    {\"lat\":33.65036709816411,\"lng\":-84.39250335784288,\"id\":\"118\"}"
			 + "],"
			 + "\"profile\": { \"type\": \"pedestrian\" },"
			 + "\"first\": {\"lat\":40.7127,\"lng\":-74.0134, \"start\": \"2017-08-24T05:30:00Z\", \"id\":\"x000\"},"
			 + "\"last\": {\"lat\":33.9171,\"lng\":-84.3555, \"start\": \"2017-08-24T013:30:00Z\", \"id\":\"x234\"},"
			 + "\"departure\": \"2017-08-24T05:30:00Z\""
			 + "}";

	
	
	
			final public String routingV2_25WayPointsBicycle_DirReturned200 =
			"{" +
			"\"traffic\": true," +
			"\"optimized\": true," +
			"\"timebased\": false," +
			"\"tiles\": true," +
			"\"directions\": true," +
			"\"waypoints\": [" +
			"" +
			"        {\"lat\":33.7806098,\"lng\":-84.3839049,\"id\":\"001\"}," +
			"	    {\"lat\":33.8775752,\"lng\":-84.456051,\"id\":\"002\"}," +
			"	    {\"lat\":33.8222934,\"lng\":-84.36833990000002,\"id\":\"003\"}," +
			"	    {\"lat\":33.9291268,\"lng\":-84.34521940000002,\"id\":\"004\"}," +
			"	    {\"lat\":33.77528809999999,\"lng\":-84.2995267,\"id\":\"005\"}," +
			"	    {\"lat\":33.756936,\"lng\":-84.39665100000002,\"id\":\"006\"}," +
			"	    {\"lat\":33.9078529,\"lng\":-84.37966970000002,\"id\":\"007\"}," +
			"	    {\"lat\":33.7819954,\"lng\":-84.35458570000003,\"id\":\"008\"}," +
			"	    {\"lat\":33.701454654509746,\"lng\":-84.2684502129062,\"id\":\"009\"}," +
			"	    {\"lat\":33.65036709816411,\"lng\":-84.39250335784288,\"id\":\"010\"}," +
			"	    {\"lat\":33.7990404,\"lng\":-84.1677851,\"id\":\"011\"}," +
			"	    {\"lat\":33.7819954,\"lng\":-84.35458570000003,\"id\":\"012\"}," +
			"	    {\"lat\":33.7806098,\"lng\":-84.3839049,\"id\":\"013\"}," +
			"	    {\"lat\":33.8775752,\"lng\":-84.456051,\"id\":\"014\"}," +
			"	    {\"lat\":33.8222934,\"lng\":-84.36833990000002,\"id\":\"015\"}," +
			"	    {\"lat\":33.9291268,\"lng\":-84.34521940000002,\"id\":\"016\"}," +
			"	    {\"lat\":33.77528809999999,\"lng\":-84.2995267,\"id\":\"017\"}," +
			"	    {\"lat\":33.756936,\"lng\":-84.39665100000002,\"id\":\"018\"}," +
			"	    {\"lat\":33.9078529,\"lng\":-84.37966970000002,\"id\":\"019\"}," +
			"	    {\"lat\":33.7819954,\"lng\":-84.35458570000003,\"id\":\"020\"}," +
			"	    {\"lat\":33.701454654509746,\"lng\":-84.2684502129062,\"id\":\"021\"}," +
			"	    {\"lat\":33.65036709816411,\"lng\":-84.39250335784288,\"id\":\"022\"}," +
			"	    {\"lat\":33.7990404,\"lng\":-84.1677851,\"id\":\"023\"}" +
			"	    " +
			"]," +
			"\"profile\": { \"type\": \"bicycle\" }," +
			"\"first\": {\"lat\":40.7127,\"lng\":-74.0134, \"start\": \"2017-08-24T05:30:00Z\", \"id\":\"x123\"}," +
			"\"last\": {\"lat\":33.9171,\"lng\":-84.3555, \"start\": \"2017-08-24T013:30:00Z\", \"id\":\"x234\"}," +
			"\"departure\": \"2017-08-24T05:30:00Z\"" +
			"}";
			

	
			public final String wrongDataType_First_Param_Return400 = 
					"{" +
							"\"traffic\": true," +
							"\"optimized\": false," +
							"\"timebased\": true," +
							"\"tiles\": true," +
							"\"directions\": true," +
							"\"waypoints\": [" +
							"{\"lat\":39.8893,\"lng\":-78.0502, \"id\":\"x001\", \"start\":1503567000, \"flexible\":true, \"duration\":5}" +
							"]," +
							"\"profile\": { \"type\": \"car\" }," +
							"\"first\": \"soWhat\"," +
							"\"last\": {\"lat\":33.9171,\"lng\":-84.3555, \"start\": 1503577000, \"id\":\"x234\", \"flexible\":false, \"duration\":5}," +
							"\"routestart\":1503555000," +
							"\"routeend\":1503587000" +
							"}";
			
			public final String wrongDataType_StartTime_Return400 = 
					"{" +
							" \"traffic\": false," +
							" \"optimized\": false," +
							" \"timebased\": true," +
							" \"tiles\": true," +
							" \"directions\": false," +
							" \"waypoints\": [" +
							"   {\"lat\":40.532034,\"lng\":-74.194014,\"id\":\"66Hawley\", \"start\":true, \"flexible\":false, \"duration\":5}," +
							"   {\"lat\":40.532860,\"lng\":-74.184933,\"id\":\"55Arbutus\",\"start\":1503567950, \"flexible\":true, \"duration\":5}" +
							" ]," +
							" \"profile\": {\"type\":\"car\"}," +
							" \"first\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503567000,\"duration\":0,\"id\":\"136HawleyStart\"}," +
							" \"last\": {\"lat\":40.530465,\"lng\":-74.195499,\"start\":1503933587,\"duration\":0,\"id\":\"136HawleyEnd\"}," +
							" \"routestart\":1503566900," +
							" \"routeend\":1503933597" +
							"}";
			
			/*
			 *   /batchgeocode/1 
			 */
			
			public final String s200_BatchGeocode_GeoCodeArrayReturned =
					"[" +
							"    { \"country\":\"USA\", \"city\":\"Dunwoody\", \"street\":\"10 Glenlake Pkwy\", \"postal\":\"30328\", \"state\":\"GA\" }," +
							"    { \"address\":\"100 Glenlake Pkwy Dunwoody GA 30328\" }" +
							"]";
			
			public final String s200_MultipleAddresses_LatLngReturned =
					"[" +
							"    { \"country\":\"USA\", \"city\":\"Blairsville\", \"street\":\"405 Vogel State Park Rd\", \"postal\":\"30512\", \"state\":\"GA\" }," +
							"    { \"address\":\"North Ave NW, Atlanta, GA 30332\" }," +
							"    { \"country\":\"USA\", \"city\":\"Mableton\", \"street\":\"991 Old Alabama Rd SW\", \"postal\":\"30126\", \"state\":\"GA\" }," +
							"    { \"address\":\"Atlanta, GA 30302\" }," +
							"    { \"country\":\"USA\", \"city\":\"Dunwoody\", \"street\":\"10 Glenlake Pkwy\", \"postal\":\"30328\", \"state\":\"GA\" }," +
							"    { \"address\":\"265 Park Ave W NW, Atlanta, GA 30313\" }" +
							"]";
			
			public final String s200_OnlyCityProvided_LatLngReturned =
					"[" +
							"    {  \"city\":\"Dunwoody\" }" +
							"]";
			
			public final String s200_OnlyCountryProvided_LatLngReturned =
					"[" +
							"    {  \"country\":\"CAN\" }" +
							"]";
			
			public final String s200_OnlyPostalProvided_LatLngReturned =
					"[" +
							"{ \"postal\":1234 }" +
							"]";
			
			public final String s200_OnlyStreetValueProvided_ErrorReturned =
					"[" +
							" { \"street\": \"6035 Peachtree Rd A101\" }" +
							"]";
			
			public final String s200_BatchGeocodeLithonia_LatLngReturned =
			"[" +
			"{ \"country\":\"USA\", \"city\":\"Lithonia\", \"street\":\"2929 Turner Hill Rd\", \"postal\":\"30038\", \"state\":\"GA\" }," +
			"{ \"address\":\"2929 Turner Hill Rd, Lithonia, GA 30038\" }" +
			"]";
			
			public final String s200_FirstAddressValueInvalid_GeocodeDataReturnedSecAdd =
					"[" +
					 "    { \"country\":\"USA\", \"city\":\"123\", \"street\":\"000000\", \"postal\":\"ABCDE\", \"state\":\"!A\" }," +
					 "    { \"address\":\"100 Glenlake Pkwy Dunwoody GA 30328\" }" +
					 "]";
			
			public final String s200_InvalidAddressValue_ErrorReturned =
					"[" +
						"    { \"address\":\"1122 Yoyoyo way wrong\" }" +
					"]";
			
			public final String s200_MisMatchingBodyParam_ErrorReturned =
					"[" +
							"{" +
							"\"country\": \"10 Glenlake Pkwy\"," +
							"\"city\": \"30328\"," +
							"\"street\": \"USA\"," +
							"\"postal\": \"GA\"," +
							"\"state\": \"Dunwoody\"" +
							"}" +
							"]";
			
			public final String s500_InvalidParam_WrongDataType_ErrorReturned =
					"[" +
							"{" +
							"\"country\": 111," +
							"\"city\": true," +
							"\"street\": 0000," +
							"\"postal\": false," +
							"\"state\": 111" +
							"}" +
							"]";
			

}
