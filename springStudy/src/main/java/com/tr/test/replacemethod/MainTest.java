package com.tr.test.replacemethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("test/replacemethod/replacemethod.xml");
		TestChangeMethod t = (TestChangeMethod)ac.getBean("testChangeMethod");
		System.out.println(t.changeMe());
	}

}
