package bai7;

public class ResizableCircle extends Circle implements Resizable {

	

	public ResizableCircle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResizableCircle(double radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void  resize(int percent) {
		// TODO Auto-generated method stub
		radius =radius*percent/100; 
	}

}
