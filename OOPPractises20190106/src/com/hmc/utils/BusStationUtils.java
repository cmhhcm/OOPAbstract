package com.hmc.utils;

import com.hmc.pojo.BusStation;

/**
Author:Meice
Date:2019年1月6日下午3:04:38
**/
public class BusStationUtils {

	
	//开始启动
	public static void start(BusStation startBusStation,BusStation endBusStation) {
		System.out.println("各位乘客，列车开始启动了,本次列车始发站:"+startBusStation.getStationName()+",开往:"+endBusStation.getStationName());
	}
	
	//行驶中
	public static void running() {
		System.out.println("行驶中......");
	}
	
	//即将进站
	public static void toPausing(BusStation busStation) {
		System.out.println("各位乘客，列车即将到站"+busStation.getStationName()+"，请拿好您的行李物品，准备下车");
	}
	
	//进站
	public static void pause(BusStation busStation) {
		System.out.println("各位乘客，列车到达"+busStation.getStationName()+"请从后门有序下车，祝您旅途愉快，谢谢！");
	}
	
	//出站
	public static void startToNext(BusStation preBusStation,BusStation nextBusStation) {
		System.out.println("各位乘客，下一站将开往："+nextBusStation.getStationName());
	}
	
	//到达终点站
	public static void end(BusStation busStation) {
		System.out.println("各位乘客，列车已到达:"+busStation.getStationName()+",请全部乘客下车，谢谢！再见！");
	}
}
