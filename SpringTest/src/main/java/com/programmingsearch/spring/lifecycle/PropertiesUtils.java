package com.programmingsearch.spring.lifecycle;

import javax.sql.DataSource;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class PropertiesUtils extends PropertyPlaceholderConfigurer {
	
	private String dataSource;
	private static CustomProperties customProps;
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("populateProperties() called from PropertiesUtils");
		DataSource dataSource =(DataSource) beanFactory.getBean(getDataSource());
		customProps = new CustomProperties(dataSource);
		setProperties(customProps);
		super.postProcessBeanFactory(beanFactory);
	}

	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}
	public static String getProperty(String name) {
		return (null == customProps.get(name)) ? "" : customProps.get(name).toString();
	}
}
