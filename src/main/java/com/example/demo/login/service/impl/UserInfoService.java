package com.example.demo.login.service.impl;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.login.dao.IUserInfoDao;
import com.example.demo.login.service.IUserInfoService;
import com.example.login.vo.UserInfoVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserInfoService implements IUserInfoService {

	// private Logger logger = Logger.getLogger(UserInfoService.class);

	@Autowired
	IUserInfoDao userInfoDao;

	@Override
	public String getUser(UserInfoVO userInfo) {
		log.info("登录用户信息" + userInfo.toString());
		UserInfoVO detaileInfo = userInfoDao.getUserInfoByTel(userInfo);
		// 密码验证
		if (Objects.isNull(detaileInfo)) {
			return "false";
		} else if (Objects.isNull(detaileInfo.getUserPassword()) || Objects.isNull(userInfo.getUserPassword())) {
			return "false";
		} else if (userInfo.getUserPassword().equals(detaileInfo.getUserPassword())) {
			return "true";
		}
		// 密码错误
		return "false";
	}

	@Override
	public void insertUser(UserInfoVO userInfo) {
		userInfoDao.insertUser(userInfo);
	}

	private static String name = "英雄联盟";

	private void planGanme() {
		System.out.println("我会玩" + name);
	}

}
