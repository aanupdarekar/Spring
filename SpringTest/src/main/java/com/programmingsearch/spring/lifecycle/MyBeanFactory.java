package com.programmingsearch.spring.lifecycle;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactory implements BeanFactoryPostProcessor{

	public void postProcessBeanFactory(ConfigurableListableBeanFactory paramConfigurableListableBeanFactory)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessBeanFactory() of BeanFactoryPostProcessor in MyBeanFactory");
	}
	
	

}
