package com.hmc.test;

import org.junit.jupiter.api.Test;

import com.hmc.controller.BusAutoReportingResource;
import com.hmc.pojo.Line;
import com.hmc.service.Impl.BusAutoReportingService;

/**
Author:Meice
Date:2019年1月6日下午4:56:03
**/
public class BusAutoReportingTest {

	
	@Test
	public void testBusAutoReporting() {
		BusAutoReportingResource barr = new BusAutoReportingResource();
		barr.autoReporting();
	}
}
