package bai24;
import java.util.*;
public class bai24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,a[];
		do {
			System.out.println("nhap so sinh vien trong lop");
			n=sc.nextInt();
			if(n<0) {
				System.out.println("so sinh vien khong hop le ");
			}
		}while(n<0);
		a= new int[n];
		System.out.println("nhap diem cua sinh vien");
		for(int i=0;i<n;i++) {
			do {
			int b=i+1;
			System.out.println("nhap diem sinh vien "+b);
			a[i]=sc.nextInt();
			if(a[i]<0 || a[i]>100) {
				System.out.println("nhap diem sinh vien khong hop le");
			}
			}while (a[i]<0 || a[i]>100);
			}
			System.out.println("nhap diem sinh vien can tim");
			int c=sc.nextInt();
			for(int i=0;i<n;i++) {
				if(a[i]==c) {
					int b=i+1;
					System.out.println("sinh vien co diem tieng anh ="+c+" la sinh vien ");
					System.out.println(b);
				}
			}
			sc.close();
		}
	}

