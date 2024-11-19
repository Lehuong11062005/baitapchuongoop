package bai1;

import java.util.Scanner;

public class Circle {
	protected double radius;

	public Circle() {
	}
Scanner sc=new Scanner(System.in);
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	@Override
	public String toString() {
		return "ban kinh "+radius +" dien tich "+getArea();
	}
	public void nhapthem(Circle s) {
		System.out.println("nhap ban kinh");
    	double a=sc.nextDouble();
    	this.setRadius(a);
    	 s =new Circle(a);	
    	 }
	

}
