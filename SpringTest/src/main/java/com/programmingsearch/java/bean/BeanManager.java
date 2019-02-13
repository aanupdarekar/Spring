package com.programmingsearch.java.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanManager implements ApplicationContextAware,BeanFactoryPostProcessor {

	ApplicationContext context = null;
	BeanManager beanManager = new BeanManager();

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		// TODO Auto-generated method stub
		this.context = context;
		
	}

	public static <T> T getBean(String name) {
		return (T) getInstance().getBean(name);
	}

	
	private static ApplicationContext getInstance(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		return applicationContext;
	}

	public void postProcessBeanFactory(ConfigurableListableBeanFactory paramConfigurableListableBeanFactory)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Bean Manager Factor Method called");
		
	}

	
}
