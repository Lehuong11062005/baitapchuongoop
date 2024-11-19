package bai2;

import java.util.Scanner;

import bai1.Thoigian;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Nhập ngày");
			int ngay=sc.nextInt();
		System.out.println("Nhập tháng");
			int thang=sc.nextInt();
		System.out.println("Nhập năm");
			int nam=sc.nextInt();
		Thoigian t=new Thoigian(ngay, thang, nam);
		System.out.println(t.toString());
		}catch (InvalidDateException e) {
			System.out.println("lỗi "+e.getMessage());
		}
		sc.close();
		
	}

}
