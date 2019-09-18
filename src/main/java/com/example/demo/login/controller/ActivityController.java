package com.example.demo.login.controller;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = "工作流")
@RequestMapping("/activityService")
public class ActivityController {
	/**
	 * 流程demo
	 * 
	 * @return
	 */
	@RequestMapping(value = "/startActivityDemo", method = RequestMethod.GET)
	@ApiOperation(value = "启动流程", notes = "启动流程")
	public boolean startActivityDemo() {
		ProcessEngineConfiguration cfg = ProcessEngineConfiguration
	            .createProcessEngineConfigurationFromResource("config/activiti.cfg.xml");
		ProcessEngine processEngine = cfg.buildProcessEngine();
		return false;
	};
}
