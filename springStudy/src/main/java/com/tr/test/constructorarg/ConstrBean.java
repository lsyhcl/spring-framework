package com.tr.test.constructorarg;

public class ConstrBean {

	private String name;

	private String content;

	public ConstrBean() {

	}

	public ConstrBean(String name, String content) {
		this.name = name;
		this.content = content;
	}

	@Override
	public String toString() {
		return name+":"+content;
	}
}
