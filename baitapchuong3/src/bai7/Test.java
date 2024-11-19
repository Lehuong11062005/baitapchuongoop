package bai7;

public class Test {
	public static void main(String[]args) {
		ResizableCircle rc=new ResizableCircle();
		rc.setRadius(3);
		System.out.println(rc.getArea()+rc.getPerimeter());
		rc.resize(10);
		System.out.println(rc.getArea()+rc.getPerimeter());
	}

}
