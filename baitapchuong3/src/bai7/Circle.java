package bai7;

public class Circle implements GeometricObject {
	protected double radius=1.0;
	

	public Circle() {
		super();
	}
	

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*3.14*radius;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}

}
