package com.yys;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: ys
 * @Date: 2022/7/14 16:16
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
		UserBean userBean = (UserBean)applicationContext.getBean("userBean");
		System.out.println(userBean.toString());
	}
}
