package com.programmingsearch.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.programmingsearch.java.Shape;
import com.programmingsearch.java.Triangle;

public class LifeCycleTest {

	public static void main(String[] args) {
		// Get Spring application context
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		// Get a bean instance
		Triangle helloWorldBeanInst = (Triangle) applicationContext.getBean("triangle");

		// Execute SpringCoreHelloWorld bean's method
		helloWorldBeanInst.sayHello();


		Shape shape = (Shape) applicationContext.getBean("circleannot");
		shape.draw();
	}

}
