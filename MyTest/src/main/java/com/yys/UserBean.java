package com.yys;

/**
 * @Auther: ys
 * @Date: 2022/7/14 16:05
 */
public class UserBean {
	private String name;

	public UserBean(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + "构建spring成功了！！！";
	}
}
