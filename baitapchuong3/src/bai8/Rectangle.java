package bai8;

public class Rectangle extends Shape{
	protected int length;
	protected int width;
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangle(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]"+super.toString();
	}
	
	@Override
	public double getArea() {
		return length*width;
		
	}
	

}
