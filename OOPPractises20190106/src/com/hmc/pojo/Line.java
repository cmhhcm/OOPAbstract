package com.hmc.pojo;
/**
Author:Meice
Date:2019年1月6日上午11:36:24
**/

import java.util.ArrayList;
import java.util.List;

import com.hmc.utils.BaseEntity;

public class Line extends BaseEntity {

	private String lineName;//线路名
	
	private static  List<BusStation> lineRoute;//站名不重复，最好用Set。不过Set无序，不好报站
	
	private static Line line1;
	private static Line line2;
	private static Line line3;
	private static Line line4;
	
	static {
		
		
		//TODO 有N条线路初始化N条线路
		
		
		
		
	}
	
	
	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}


	public static List<BusStation> getLineRoute() {
		return lineRoute;
	}

	public static void setLineRoute(List<BusStation> lineRoute) {
		Line.lineRoute = lineRoute;
	}

	public static Line getLine1() {
		
		line1 = new Line();
		line1.setLineName("地铁8号线");
			
			BusStation busStation1 = new BusStation();
			busStation1.setStationName("市光路");
			busStation1.setStartStation(true);
			busStation1.setPosition(new Position(121.5319955349, 31.3227005153));
			
			BusStation busStation2  = new BusStation();
			busStation2.setStationName("沈杜公路");
			busStation2.setEndStation(true);
			busStation2.setPosition(new Position(121.5124797821, 31.0612425567));
			
			 BusStation busStation3 = new BusStation();
			 busStation3.setStationName("人民广场");//...其他省略
			 BusStation busStation4 = new BusStation();
			 busStation3.setStationName("东方体育中心");//...其他省略
			 BusStation busStation5 = new BusStation();
			 busStation3.setStationName("联航路");//...其他省略
			
			List<BusStation> lineRouteOfLine1 = new ArrayList<>();
			lineRouteOfLine1.add(busStation1);
			lineRouteOfLine1.add(busStation3);
			lineRouteOfLine1.add(busStation4);
			lineRouteOfLine1.add(busStation5);
			lineRouteOfLine1.add(busStation2);
		line1.setLineRoute(lineRouteOfLine1);
		return line1;
	}

	public static void setLine1(Line line1) {
		Line.line1 = line1;
	}

	public static Line getLine2() {
		return line2;
	}

	public static void setLine2(Line line2) {
		Line.line2 = line2;
	}

	public static Line getLine3() {
		return line3;
	}

	public static void setLine3(Line line3) {
		Line.line3 = line3;
	}

	public static Line getLine4() {
		return line4;
	}

	public static void setLine4(Line line4) {
		Line.line4 = line4;
	}
	
	
		
	
}
