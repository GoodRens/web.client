package com.example.demo.app.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api("swagger2-example")
@RequestMapping("/spring/boot/user")
public class SpringBootConterller {

	@ApiOperation(value="获取用户姓名",notes="swagger学习")
	@RequestMapping(value = "/name" ,method = RequestMethod.POST)
	public String getUser(@RequestBody String userName) {
		
		return "你的姓名是："+userName;
	}
}
