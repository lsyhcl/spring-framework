package com.tr.test.lookupmethod;

public abstract class GetBean {
	public void test(){
		this.getUser().say();
	}
	public abstract User getUser();
}
