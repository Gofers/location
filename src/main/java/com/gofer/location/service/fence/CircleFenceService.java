package com.gofer.location.service.fence;

import com.gofer.location.model.CircleFenceCreateRequest;
import com.gofer.location.model.FenceCreateParam;

import org.springframework.web.client.RestTemplate;

public class CircleFenceService implements FenceServer {
	@Override
	public String create(FenceCreateParam fenceCreateParam) {
		if(fenceCreateParam instanceof CircleFenceCreateRequest){
			RestTemplate restTemplate = new RestTemplate();

		}
		return null;
	}

	@Override
	public String delete(String fenceId) {
		return null;
	}
}
