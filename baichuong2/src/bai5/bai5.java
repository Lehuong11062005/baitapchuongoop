package bai5;
 import java.util.Scanner;
 
public class bai5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhập số nguyên");
		int n=sc.nextInt();
		System.out.println("nhap so thuc");
		float t=sc.nextFloat();
		System.out.println("nhap 1 ky tu");
		char k=sc.next().charAt(1);
		sc.nextLine();
		System.out.println("nhap mot chuoi ky tu");
		String a=sc.nextLine();
		System.out.println("so nguyen la "+n+" so thuc la "+t+" ky tu duoc nhap la "+k+" chuoi ky tu la "+a);
		sc.close();
	}

}
