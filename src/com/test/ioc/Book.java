package com.test.ioc;


public class Book {
	private String bname;
	
	//�вι���
	public Book(String bname) {
		this.bname = bname;
	}

	//�޲ι���
//	public void setBname(String bname) {
//		this.bname = bname;
//	}
	public void add() {
		System.out.println(bname);
	}
	
}
