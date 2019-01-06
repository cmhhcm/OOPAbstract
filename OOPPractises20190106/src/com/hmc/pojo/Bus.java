package com.hmc.pojo;

import com.hmc.utils.BaseEntity;

/**
Author:Meice
Date:2019年1月6日下午3:26:00
**/
public class Bus  extends BaseEntity{
	
	private  static String busName;
	private static  Position position;//同GPS获取即可，怎么获取的不Care
	
	public static Position getBusPosition() {
		position.setLongitude(110);
		position.setLatitude(90);
		
		return position;
	}
	
	
}
