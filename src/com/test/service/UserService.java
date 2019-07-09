package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.test.dao.UserDao;

@Controller
public class UserService {
	@Autowired
	private UserDao userDao;

//	public void setUserDao(UserDao userDao) {
//		this.userDao = userDao;
//	}
	public void add() {
		System.out.println("add.....");
		userDao.add();
	}
}
