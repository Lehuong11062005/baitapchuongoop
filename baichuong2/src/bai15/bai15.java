package bai15;

import java.util.Scanner;

public class bai15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a;
		double b,c;
		do {
			System.out.println("nhap so ngay luu chu");
			a=sc.nextInt();
			if(a<0) {
				System.out.println("nhap so ngay  khong hop le");
			}
			System.out.println("nhap don gia ");
			b=sc.nextDouble();
			if(b<0) {
				System.out.println("nhap don gia khong hop le ");
			} 
			}while(a<0 || b<0);
			if(a==1) {
				c=b;
			}else if(a<4) {
				c=(double) a*b*80/100;
			}else if(a<10) {
				c=(double) a*b*60/100;
			}else {
				c=(double) a*b*40/100;
			}
			System.out.println("gia tien phong la "+c);
			sc.close();

}
		}
