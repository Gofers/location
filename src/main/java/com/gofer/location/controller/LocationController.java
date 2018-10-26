package com.gofer.location.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author fangzongzhou
 */
@RestController
@RequestMapping("location")
public class LocationController {

	@RequestMapping("location")
	public String getLocation() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForEntity("http://api.map.baidu.com/place/v2/suggestion?query=天安门&region=北京&city_limit=true&output=json&ak=3IXiGGjSxjjLbThcy7n04qZr6W9cVjGH", String.class).getBody();
	}
}
