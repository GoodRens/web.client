package com.example.demo.login.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.login.vo.UserInfoVO;



@Mapper
public interface IUserInfoDao {

	/**
	 * 根据电话号码查询是否存在
	 * 
	 * @return
	 */
	public UserInfoVO getUserInfoByTel(UserInfoVO userInfo);

	/**
	 * 用户注册
	 * 
	 * @param userInfo
	 */
	public void insertUser(UserInfoVO userInfo);
}
