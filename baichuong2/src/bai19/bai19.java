package bai19;
import java.util.Scanner;
public class bai19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		do {
			System.out.println("nhap so gio");
			 a=sc.nextInt();
			System.out.println("nhap so phut");
			 b=sc.nextInt();
			System.out.println("nhap so giay");
			 c=sc.nextInt();
		}while(a<0 || b<0|| c<0);
		long d=60*60*a+60*b+c;
		System.out.println("thoi gian tinh bang giay la"+ d);
		sc.close();
	}

}
