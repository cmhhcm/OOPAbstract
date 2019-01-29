package com.hmc.utils;
/**
Author:Meice
Date:2019年1月6日下午2:30:57
**/
public  abstract class BaseEntity {
	
	protected Integer id;
	long version;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public long getVersion() {
		return version;
	}
	public void setVersion(long version) {
		this.version = version;
	}
	
	
}
