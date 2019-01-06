package com.hmc.pojo;
/**
Author:Meice
Date:2019年1月6日下午3:32:45
**/
public class Position {
	private Double longitude;//经度
	private Double latitude;//纬度
	
	public Position (Double longitude,Double latitude) {
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
}
