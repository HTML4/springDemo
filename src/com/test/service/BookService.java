package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.dao.BookDao;

public class BookService {
	@Autowired
	private BookDao bookDao;
	public void add() {
		System.out.println("bookService");
		bookDao.add();
	}
}
