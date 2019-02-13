package com.programmingsearch.java;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InitDestroyExample implements InitializingBean,DisposableBean {
	private String message;
	
	
	public void toPrint(){
		System.out.println("InitDestroyExample method is called "+message);
	}


	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("InitDestroy Destroy Method Called inside InitDestroyExample java class");
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet() Method called inside InitDestroyExample java class");
	}
}
