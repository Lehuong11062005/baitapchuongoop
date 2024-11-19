package bai13;

import java.util.Scanner;
public class bai13 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		double a;
		int b;
		do {
			System.out.println("nhap vao gia ban san pham");
			 a=sc.nextDouble();
			System.out.println("nhap vao phan tram giam gia");
			b=sc.nextInt();
		}while(a<0 || b>100|b<0);
		double c=a-(double) a*b/100;
		System.out.println(" gia cua san pham sau khi giam gia la "+c);
		sc.close();
	}

}
