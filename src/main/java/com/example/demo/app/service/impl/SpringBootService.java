package com.example.demo.app.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.app.service.ISpringBootService;

@Service
public class SpringBootService implements ISpringBootService {

	@Override
	public String getUser(String userName) {
		String string = null;
		try {
			string.length();

		} catch (Exception e) {
			System.out.println(e);

		} finally {
			return "你的姓名是：" + userName;
		}

	}

}
