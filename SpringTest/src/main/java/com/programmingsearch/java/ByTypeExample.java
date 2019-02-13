package com.programmingsearch.java;

import java.util.List;

public class ByTypeExample {

	private List<Shape> shapes;

	public List<Shape> getShapes() {
		return shapes;
	}

	public void setShapes(List<Shape> shapes) {
		this.shapes = shapes;
	}

	public void showShape() {

		for (Shape shape : shapes) {
			System.out.println(shape.getClass().getName());
		}
	}
}
