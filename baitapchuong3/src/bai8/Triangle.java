package bai8;

public class Triangle extends Shape{
	protected int base;
	protected int height;
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Triangle(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]"+super.toString();
	}
	@Override
	public double getArea() {
		return (1/2)*base*height;
	}

}
