package com.yash.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.yash.pojo.HelloWorld;

public class TestApp {

	public static void main(String[] args) {
		//create class path resource
		Resource resource = new ClassPathResource("resource/beans.xml");
		XmlBeanFactory factory = new XmlBeanFactory (resource); 
	      HelloWorld obj = (HelloWorld) factory.getBean("hello");    
	      obj.sayHello();    

	}

}
