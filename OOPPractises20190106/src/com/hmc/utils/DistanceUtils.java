package com.hmc.utils;

import com.hmc.pojo.BusStation;
import com.hmc.pojo.Position;

/**
Author:Meice
Date:2019年1月6日下午3:30:59
**/
public class DistanceUtils {

	//根据两站点计算距离(简化版-单位:m)
		public static Double getDistance(BusStation preBusStation,BusStation nextBusStation) {
			Position prePosition = preBusStation.getPosition();
			
			Position nextPosition = nextBusStation.getPosition();
			return Math.sqrt(Math.pow((nextPosition.getLongitude()-prePosition.getLongitude()), 2)+Math.pow((nextPosition.getLatitude()-prePosition.getLatitude()), 2));
		}
	
	//计算两个Position之间的距离
		
		public static Double getDistance(Position prePosition,Position nextPosition) {
			
			//数学公式计算距离即可(简化版-单位:m)
			
			double preLongitude = prePosition.getLongitude();
			double preLatitude = prePosition.getLatitude();
			
			double nextLongitude = nextPosition.getLongitude();
			double nextLatitde = nextPosition.getLatitude();
			
			return Math.sqrt(Math.pow((nextLongitude-preLongitude), 2)+Math.pow((nextLatitde-preLatitude), 2));

		}
	
}
