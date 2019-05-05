package com.example.demo.app.service.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import org.springframework.stereotype.Service;

import com.example.demo.app.service.ISpringBootService;

@Service
public class SpringBootService implements ISpringBootService {

	@Override
	public String getUser(String userName) {

		ThreadDemo td = new ThreadDemo();

		BigDecimal dec = new BigDecimal("1.47658888888");
		// 1.执行 Callable 方式，需要 FutureTask 实现类的支持，用于接收运算结果。
		FutureTask<Integer> result = new FutureTask<>(td);

		new Thread(result).start();
		// 2.接收线程运算后的结果
		try {
			// FutureTask 可用于 闭锁 类似于CountDownLatch的作用，在所有的线程没有执行完成之后这里是不会执行的
			Integer sum = result.get();
			// System.out.println(sum);
			String[] atp = { "Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer",
					"Andy Murray", "Tomas Berdych", "Juan Martin Del Potro" };
			List<String> players = Arrays.asList(atp);

			// 使用 lambda 表达式以及函数操作(functional operation)
			//players.forEach((player) -> System.out.print(player + "; "));

			// 在 Java 8 中使用双冒号操作符(double colon operator)
			//players.forEach(System.out::print);
//			System.out.println(sum);
//			System.out.println(dec.setScale(3, RoundingMode.HALF_UP) + "------------------------------------");
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		SpringBootService tester = new SpringBootService();
		// 类型声明
		MathOperation addition = (int a, int b) -> a + b;

		// 不用类型声明
		MathOperation subtraction = (a, b) -> a - b;

		// 大括号中的返回语句
		MathOperation multiplication = (int a, int b) -> {
			return a * b;
		};

		// 没有大括号及返回语句
		MathOperation division = (int a, int b) -> a / b;

		
		System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
		System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
		System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + tester.operate(10, 5, division));

		// 不用括号
		GreetingService greetService1 = message -> System.out.println("Hello " + message);

		// 用括号
		GreetingService greetService2 = (message) -> System.out.println("Hello " + message);

		greetService1.sayMessage("Runoob");
		greetService2.sayMessage("Google");

		return "你的姓名是：" + userName;
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
