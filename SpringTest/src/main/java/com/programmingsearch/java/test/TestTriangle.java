package com.programmingsearch.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.programmingsearch.java.ByTypeExample;
import com.programmingsearch.java.Shape;
import com.programmingsearch.java.Triangle;

public class TestTriangle {

	public static void main(String[] args) {
		// Get Spring application context
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		// Get a bean instance
		Triangle helloWorldBeanInst = (Triangle) applicationContext.getBean("triangle");

		// Execute SpringCoreHelloWorld bean's method
		helloWorldBeanInst.sayHello();

		// Triangle hell=BeanManager.getBean("triangle");

		/*Shape shape = (Shape) applicationContext.getBean("circleannot");
		shape.draw();

		MapListExample mapList = (MapListExample) applicationContext.getBean("maplist");
		System.out.println(mapList.getBptconfigs());
		
		
		ByTypeExample factore = (ByTypeExample)applicationContext.getBean("bytypeExample");
		factore.showShape();*/
		// Point point=BeanManager.getBean("point");
	}
}
