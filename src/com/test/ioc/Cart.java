package com.test.ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class Cart {
	@Value(value="java")
	private String cname;
	public void delete() {
		System.out.println(cname);
	}
}
