package com.programmingsearch.java.annot;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.programmingsearch.java.Point;
import com.programmingsearch.java.Shape;


@Component
public class Circleannot implements Shape {

	@Resource
	private Point point;
	
	

	public void draw() {
		System.out.println("CircleAnnot Draw is called");
		System.out.println("CircleAnnot Point is "+point.getPointX()+" Y "+point.getPointY());
	}

}
