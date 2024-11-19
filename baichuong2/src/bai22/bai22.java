package bai22;
import java.util.Scanner;

public class bai22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		double a[],t=0;
		do {
			System.out.println("nhap so phan tu cua mang");
			n=sc.nextInt();
			if(n<0) {
				System.out.println("nhap lai so phan tu cua mang");
			}
		}while(n<0);
		a=new double[n];
		System.out.println("nhap phan tu cua mang ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextDouble();
			t=t+a[i];
		}
		System.out.println("tong phan tu cua mang la  "+t);
		sc.close();
	}

}
