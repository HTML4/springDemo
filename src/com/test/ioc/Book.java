package com.test.ioc;


public class Book {
	private String bname;
	
	//有参构造
	public Book(String bname) {
		this.bname = bname;
	}

	//无参构造
//	public void setBname(String bname) {
//		this.bname = bname;
//	}
	public void add() {
		System.out.println(bname);
	}
	
}
