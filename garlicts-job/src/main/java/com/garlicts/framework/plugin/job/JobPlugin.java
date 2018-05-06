package com.garlicts.framework.plugin.job;

import com.garlicts.framework.extension.Plugin;

public class JobPlugin implements Plugin {

	@Override
	public void init() {
		JobComponent.startJobAll();
	}

	@Override
	public void destroy() {
		JobComponent.stopJobAll();
	}

}
