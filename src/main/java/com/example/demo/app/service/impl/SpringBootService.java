package com.example.demo.app.service.impl;

import java.util.concurrent.Callable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.app.dao.IUserInfoDao;
import com.example.demo.app.service.ISpringBootService;
import com.example.demo.app.vo.UserInfoVO;

@Service
public class SpringBootService implements ISpringBootService {

	@Autowired
	IUserInfoDao userInfoDao;

	@Override
	public UserInfoVO getUser(String userName) {
		return userInfoDao.getUserInfoByTel();
	}

	class ThreadDemo implements Callable<Integer> {

		@Override
		public Integer call() throws Exception {
			int sum = 0;

			for (int i = 0; i <= 100; i++) {
				sum += i;
			}
			return sum;
		}

	}

	interface MathOperation {
		int operation(int a, int b);
	}

	interface GreetingService {
		void sayMessage(String message);
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}
