package com.hmc.service.Interface;
/**
Author:Meice
Date:2019年1月6日下午2:24:15
**/

import com.hmc.pojo.BusStation;
import com.hmc.pojo.Line;

public interface BusAutoReportingInterface {
	Line addLine(Line line);
	void removeLine(Line line);
	
	
	BusStation addBusStation(BusStation busStation);
	void removeBusStation(BusStation busStation);
	BusStation changeStatusOfBusStationStartOrEnd(BusStation busStation1,BusStation busStation2);
	
	void reporting(Line line);
	void reportingReverse(Line line);
	
	
}
