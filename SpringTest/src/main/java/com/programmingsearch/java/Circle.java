package com.programmingsearch.java;

import javax.annotation.Resource;

public class Circle implements Shape {

	@Resource
	private Point point;
	
	

	public void draw() {
		System.out.println("Circle Draw is called");
		System.out.println("Circle Point is "+point.getPointX()+" Y "+point.getPointY());
	}

}
