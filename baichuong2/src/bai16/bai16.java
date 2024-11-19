package bai16;

import java.util.Scanner;

public class bai16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		do {
			System.out.println("nhap so nguyen n");
			n=sc.nextInt();
			if(n<=0) {
				System.out.println("gia tri n khong hop le ");
			}
		}while(n<0);
		long b=1;
		for(int i=1;i<=n;i++){
			b=b*i;
		}
		System.out.println("giai thua cua n la"+b);
		sc.close();
	}

}
