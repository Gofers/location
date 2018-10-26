package com.gofer.location.model;

public class CircleFenceCreateRequest implements FenceCreateParam {


	@Override
	public String getUrl() {
		return "http://yingyan.baidu.com/api/v3/fence/createcirclefence";
	}

	@Override
	public String getRequestType() {
		return "POST";
	}

}
