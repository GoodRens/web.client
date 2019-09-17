package com.example.demo.login.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/activityService")
public interface ActivityController {
	/**
	 * 流程demo
	 * @return
	 */
	 @RequestMapping(value="/startActivityDemo",method=RequestMethod.GET)
	 public boolean startActivityDemo();
}
