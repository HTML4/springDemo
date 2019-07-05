package com.test.service;

import com.test.dao.UserDao;

public class UserService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void add() {
		System.out.println("add.....");
		userDao.add();
	}
}
