package com.hmc.pojo;

import com.hmc.utils.BaseEntity;

/**
Author:Meice
Date:2019年1月6日上午11:34:26
**/
public class BusStation extends BaseEntity{
	private String stationName;//站名
	private Position position;//定位
	private boolean isStartStation;//是否是始发站
	private boolean isEndStation;//是否是终点站
	
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public boolean isStartStation() {
		return isStartStation;
	}
	public void setStartStation(boolean isStartStation) {
		this.isStartStation = isStartStation;
	}
	public boolean isEndStation() {
		return isEndStation;
	}
	public void setEndStation(boolean isEndStation) {
		this.isEndStation = isEndStation;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	
	
	
	
}
