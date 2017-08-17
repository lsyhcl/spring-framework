package com.tr.test.lookupmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		ApplicationContext bf = new ClassPathXmlApplicationContext("test/lookupmethod/lookupmethod.xml");
		GetBean getBean = (GetBean) bf.getBean("getBean");
		getBean.test();
	}
}
