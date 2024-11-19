package bai2;

import java.util.Scanner;

public class Rate {
	protected String code1;
	protected String code2;
	protected double rate;
	
	public Rate() {
	}

	public Rate(String code1, String code2, double rate) {
		super();
		this.code1 = code1;
		this.code2 = code2;
		this.rate = rate;
	}

	public String getCode1() {
		return code1;
	}

	public void setCode1(String code1) {
		this.code1 = code1;
	}

	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return " loại tiền thứ nhất" +code1+"loại tiền thứ 2"+code2+"tỷ giá "+rate;
	}
	Scanner sc=new Scanner(System.in);
	public void input() {
		System.out.println("nhap loai tien co");
		this.code1=sc.nextLine();
		System.out.println("nhap loai tien can doi");
		this.code2=sc.nextLine();
		System.out.println("nhap ti gia");
		this.rate=sc.nextDouble();
		
	}
	
	

}
