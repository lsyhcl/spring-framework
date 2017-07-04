package com.tr;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;

/**
 * Created by chenlin on 2017/6/5.
 */
public class MyTestBean {
    private String testStr = "testStr";

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }

    public static void main(String[] args) {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring.xml"));
        //BeanFactory bf1 = new ClassPathXmlApplicationContext("spring.xml");
        InputStream is = MyTestBean.class.getClassLoader().getResourceAsStream("spring.xml");
        System.out.println(is.toString());
        System.out.println(MyTestBean.class.getResource(""));
        MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
        System.out.println(bean.getTestStr());
    }
}
