package com.programmingsearch.spring.lifecycle;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;


public class DisplaySetBeanNameAware implements BeanNameAware{

	public void setBeanName(String name) {
		System.out.println("setBeanName() "+name);
		
	}

}
