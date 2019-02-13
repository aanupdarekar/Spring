package com.programmingsearch.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.programmingsearch.java.InitDestroyExample;

public class InitDestoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//need to use this to use destroy AbstractApplicationContext
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		applicationContext.registerShutdownHook();
		InitDestroyExample init= (InitDestroyExample)applicationContext.getBean("initDestroyExample");
		init.toPrint();

	}

}
