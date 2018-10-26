package com.gofer.location.service.fence;

import com.gofer.location.model.FenceCreateParam;

public interface FenceServer {

	String create(FenceCreateParam fenceCreateParam);

	String delete(String fenceId);
}
