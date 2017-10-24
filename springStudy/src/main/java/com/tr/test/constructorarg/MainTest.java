package com.tr.test.constructorarg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("test/constructorarg/constructorarg.xml");
		ConstrBean constrBean = (ConstrBean)ac.getBean("constrBean");
		System.out.println(constrBean.toString());
	}
}
