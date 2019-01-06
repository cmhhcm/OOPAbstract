package com.hmc.service.Impl;

import java.util.List;

import com.hmc.pojo.Bus;
import com.hmc.pojo.BusStation;
import com.hmc.pojo.Line;
import com.hmc.service.Interface.BusAutoReportingInterface;
import com.hmc.utils.AudioEnum;
import com.hmc.utils.BusStationUtils;
import com.hmc.utils.DistanceFields;
import com.hmc.utils.DistanceUtils;

/**
Author:Meice
Date:2019年1月6日下午2:35:47
**/
//@Service
public class BusAutoReportingService extends DistanceFields implements BusAutoReportingInterface {
	

	@Override
	public void reporting(Line line) {
		// TODO Auto-generated method stub
		if(line != null) {
			String lineName = line.getLineName();
			List<BusStation> lineRoute = line.getLineRoute();
			
		
		BusStation startBusStation = lineRoute.get(0);
		BusStation endBusStation = lineRoute.get(lineRoute.size()-1);
		
		//启动
		BusStationUtils.start(startBusStation, endBusStation);
		
		//行驶中
		if(lineRoute != null) {
			BusStationUtils.running();
			
			for(int i=0;i<lineRoute.size();i++) {
				Double distanceToNext = DistanceUtils.getDistance(Bus.getBusPosition(), lineRoute.get(i+1).getPosition());
				if(distanceToNext < DISTANCE_TO_NEXT_STATION  ) {
					BusStationUtils.toPausing(lineRoute.get(i+1));
				}
				if(distanceToNext ==0) {
					BusStationUtils.pause(lineRoute.get(i+1));
				}
				
				if(i<lineRoute.size()-1) {
					if(distanceToNext > DISTANCE_FROM_PRE_STATION) {
						BusStationUtils.startToNext(lineRoute.get(i+1), lineRoute.get(i+2));
					}
				}
				
				if(i==lineRoute.size()-1) {
					if(distanceToNext > DISTANCE_FROM_PRE_STATION) {
						BusStationUtils.end(lineRoute.get(i));
						break;
					}
				}
				
			}
			
		}
		}
	
	}
	
	

	@Override
	public void reportingReverse(Line line) {
		// TODO Auto-generated method stub
		String lineName = line.getLineName();
		List<BusStation> lineRoute = line.getLineRoute();
		BusStation startBusStation = lineRoute.get(0);
		BusStation endBusStation = lineRoute.get(lineRoute.size());
		
		//启动
		BusStationUtils.start(startBusStation, endBusStation);
		
		//行驶中
		if(lineRoute != null) {
			
			for(int i=lineRoute.size();i>=0;i--) {
				Double distanceToNext = DistanceUtils.getDistance(Bus.getBusPosition(), lineRoute.get(i-1).getPosition());
				if(distanceToNext < DISTANCE_TO_NEXT_STATION  ) {
					BusStationUtils.toPausing(lineRoute.get(i-1));
				}
				if(distanceToNext ==0) {
					BusStationUtils.pause(lineRoute.get(i-1));
				}
				
				if(i>lineRoute.size()-2) {
					if(distanceToNext > DISTANCE_FROM_PRE_STATION) {
						BusStationUtils.startToNext(lineRoute.get(i-1), lineRoute.get(i-2));
					}
				}
				
				if(i==0) {
					if(distanceToNext > DISTANCE_FROM_PRE_STATION) {
						BusStationUtils.end(lineRoute.get(i));
						break;
					}
				}
				
			}
			
		}
	}


	@Override
	public Line addLine(Line line) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLine(Line line) {
		// TODO Auto-generated method stub

	}

	@Override
	public BusStation addBusStation(BusStation busStation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeBusStation(BusStation busStation) {
		// TODO Auto-generated method stub

	}

	@Override
	public BusStation changeStatusOfBusStationStartOrEnd(BusStation busStation1, BusStation busStation2) {
		// TODO Auto-generated method stub
		return null;
	}



}
