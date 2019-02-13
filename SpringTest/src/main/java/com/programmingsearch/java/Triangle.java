package com.programmingsearch.java;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware,BeanNameAware, Shape{

	private String message;
	private ApplicationContext context;

	public String getMessage() {
		return message;
	}

	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println(getMessage());
	}

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		System.out.println("setApplicationContext() of ApplicationContext Inside Triangle class is ");
		this.context = context;

	}

	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("setBeanName() of BeanNameAware Inside Triangle class is "+arg0);

	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void draw() {
		System.out.println("Triangle Drwaw is called");
		
	}


}
