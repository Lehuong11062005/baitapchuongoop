package bai18;
import java.util.Scanner;

public class bai18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap so nguyen n");
		int n=sc.nextInt();
		if( n<=1) {
			System.out.println("n khong la so nguyen to");
		}else {
			if(n==3 || n==2) {
				System.out.println("n la so nguyen to");
			}
			else{
				for( int i=2;i<Math.sqrt(n);i++) {
					if(n%i==0) {
						System.out.println("n khong la so nguyen to");
						break;
					}else {
						System.out.println("n la so nguyen to");
				}
			}
		}}
		sc.close();

	}}
