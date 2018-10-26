package com.gofer.location.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 调用百度请求的必要参数
 * @author fangzongzhou
 */
@Getter
@Setter
@ToString
public class BaiduLocationRequest<T> {

	String ak="3IXiGGjSxjjLbThcy7n04qZr6W9cVjGH";
	T request;

}
