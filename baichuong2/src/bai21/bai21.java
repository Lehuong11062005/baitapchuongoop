package bai21;
import java.util.Scanner;

public class bai21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,a[];
		do {
			System.out.println("nhap so phan tu cua mang");
			n=sc.nextInt();
			if(n<0) {
				System.out.println("nhap so phan tu cua mang khong hop le ! yeu cau ");
			}
		}while(n<0);
		a=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("nhap phan tu cua mang ");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int b=i+1;
			System.out.println("phan tu thu "+b+" cua mang la "+a[i]);
		}
		sc.close();
	}

}
