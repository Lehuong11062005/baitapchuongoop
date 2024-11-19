package bai20;
import java.util.Scanner;

public class bai20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double c;
			System.out.println("nhap vao nhiet do C");
			c=sc.nextFloat();
			double f=c*1.8+32;
			System.out.println("nhiet do F la "+f );
			sc.close();
	}

}
