package com.test.ioc;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Orders {
	private String [] array;
	private List<String> list;
	private Map<String, String> map;
	private Properties properties;
	public void setArray(String[] array) {
		this.array = array;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	public void console() {
		System.out.println(Arrays.toString(array));
		System.out.println(list);
		System.out.println(map);
		System.out.println(properties);
	}
}
