package com.example.demo.app.service;

import com.example.demo.app.vo.UserInfoVO;

public interface IUserInfoService {

	/**
	 * 用户登录
	 * @param userInfo
	 * @return
	 */
	public String getUser(UserInfoVO userInfo);
	
	/**
	 * 用户注册
	 * @param userInfo
	 * @return
	 */
	public void insertUser(UserInfoVO userInfo);
}
