package bai6;
import java.util.Scanner;
public class bai6 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("nhap so nguyen thu nhat ");
	int a=sc.nextInt();
	System.out.println("nhap so nguyen thu hai");
	int b=sc.nextInt();
	int t=a+b;
	int h=Math.abs(a-b);
	int ti=a*b;
	double th=(float) a/b;
	
	System.out.println("tong hai so la"+t+"hieu hai so la "+h+"tich hai so la "+ti+" thuong hai so la "+th);
	sc.close();
	}

}
