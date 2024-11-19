package bai11;
// tinh chu vi va dien tich duong tron
import java.util.Scanner;
public class bai11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double r,c,s;
		do {
			System.out.println("nhap ban kinh duong tron");
			r=sc.nextDouble();
		}while(r<0);
		c=2*3.14*r;
		s=3.14*r*r;
		sc.close();
		System.out.println("chu vi hinh tron la "+c+" dien tich duong tron la "+s);
	}

}
