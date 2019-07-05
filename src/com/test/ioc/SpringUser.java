package com.test.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.service.UserService;



public class SpringUser {
	@SuppressWarnings("all")
	@Test
	public void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
		User u = (User) applicationContext.getBean("user");
		System.out.println(u);
		u.add();
	}
	@Test
	public void testBook() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
		Book b = (Book) applicationContext.getBean("book");
		b.add();
	}
	@Test
	public void testService() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
		UserService s = (UserService) applicationContext.getBean("userService");
		s.add();
	}
}
