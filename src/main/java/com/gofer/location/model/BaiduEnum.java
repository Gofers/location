package com.gofer.location.model;

public enum BaiduEnum {


	createcirclefence("http://yingyan.baidu.com/api/v3/fence/createcirclefence","POST");
	private String url;
	private String requestType;

	BaiduEnum(String url,String requestType){
		this.url=url;
		this.requestType=requestType;
	}
}
