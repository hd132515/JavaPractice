package org.dimigo.inheritance;

public class Circle extends Figure {
	
	private int radius;
	
	public Circle(int radius){
		super(0, 0);
		this.radius = radius;
	}
	
	public Circle(int centerX, int centerY, int radius){
		super(centerX, centerY);
		this.radius = radius;
	}
	
	@Override
	public double calcArea(){
		return Math.pow(radius, 2) * Math.PI;
	}

}
