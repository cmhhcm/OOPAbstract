package com.hmc.controller;
/**
Author:Meice
Date:2019年1月6日下午2:44:11
**/
/**
 *@Path
 *@Component
 *@Consumes
 *@Produces
 */

import com.hmc.pojo.Line;
import com.hmc.service.Impl.BusAutoReportingService;
import com.hmc.service.Interface.BusAutoReportingInterface;

public class BusAutoReportingResource {

	//@Autowired
	private BusAutoReportingInterface busAutoReportingInterface;
	//自主报站
	
	public void autoReporting() {
		//busAutoReportingInterface.reporting(Line.getLine1());//会调用哪个实现呢？因为没有框架，自然会NPX ：BusAutoReportingResources
		BusAutoReportingService bars = new BusAutoReportingService();
		bars.reporting(Line.getLine1());
	}
}
