package bai5;

import java.util.Scanner;

public class Test {
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		long nguoi;
		try {
		System.out.println("nhap so luong trong khoang[5000000;20000000]");
		nguoi=sc.nextLong();
		sc.close();
		if(nguoi<5000000||nguoi>20000000) {
			throw new OutOfRangeException("nhap so luong khong hop le "+nguoi);
		}
		System.out.println("số lương là "+nguoi);
		}catch(OutOfMemoryError e) {
			System.out.println(e.getMessage());
			
		}catch(Exception e) {
			System.out.println("nhập sai số lương");
		}
	}

}
