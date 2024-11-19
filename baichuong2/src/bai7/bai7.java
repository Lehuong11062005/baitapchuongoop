package bai7;

import java.util.Scanner;

public class bai7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap so thuc 1 ");
		float a=sc.nextFloat();
		System.out.println("nhap so thuc 2");
		float b=sc.nextFloat();
		System.out.println("nhap ky tu thuc hien yeu cau");
		char k=sc.next().charAt(0);
		if(k=='A') {
			float t=a+b;
			System.out.println("tong cua hai so la "+t);
		} else if(k=='S') {
			float h= Math.abs(a-b);
			System.out.println("hieu cua hai so thuc la "+h);
		} else if(k=='M') {
			float ti=a*b;
			System.out.println("tich cua hai so tren la "+ti);
		} else if(k=='D' ) {
			if(b==0) {
				System.out.println("gia tri so hai khong thoa man dk thuong");
			}else {
			float th=a/b;
			System.out.println("thuong hai so tren la "+th);}
		}else {
			System.out.println(" ky tu khong thoa man");
		}
		sc.close();
	}
}
