package com.programmingsearch.java.bean;

import com.programmingsearch.java.annot.Circleannot;

public class TestBeanManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circleannot circle = BeanManager.getBean("circleannot");
		circle.draw();
	}

}
