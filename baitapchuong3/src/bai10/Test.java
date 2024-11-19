package bai10;

public class Test {
	public static void main(String[] args) {
		svDoHoa dh=new svDoHoa();
		svlaptrinh lt=new svlaptrinh();
		dh.nhapsvdohoa();
		lt.nhapsvlaptrinh();
		System.out.println(dh.toString()+lt.toString());
	}
}
