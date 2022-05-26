package com.cg.practice.assignment2;

abstract class Shape {
	//Abstract method
	public abstract void draw();
}

class Line extends Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Line Shape");
	}

}

class Rectangle extends Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Rectangles Shape");

	}

}

class Cubes extends Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Cube shape");
	}

}
public class DrawAllShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creation of object of Shape class
				Shape shapeline = new Line();
				//Calling the method
				shapeline.draw();

				Shape shapeRect = new Rectangle();
				shapeRect.draw();

				Shape shapeCube = new Cubes();
				shapeCube.draw();
	}

}
