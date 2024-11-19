package bai10;

import java.util.Scanner;

public abstract  class Hocvien {
	protected String hoten;
	protected String dichi;
	protected String loai;
	public Hocvien() {
		
	}
	public Hocvien(String hoten, String dichi, String loai) {
		
		this.hoten = hoten;
		this.dichi = dichi;
		this.loai = loai;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getDichi() {
		return dichi;
	}
	public void setDichi(String dichi) {
		this.dichi = dichi;
	}
	public String getLoai() {
		return loai;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}
	
	public abstract double hocphi();
	Scanner sc=new Scanner(System.in);
	public void nhapsinhvien() {

		System.out.println("nhap ten sv");
		this.hoten=sc.nextLine();
		System.out.println("nhap dia chi sv");
		this.dichi=sc.nextLine();
		System.out.println("nhap loai chuong trinh sv");
		this.loai=sc.nextLine();
		
	}
	@Override
	public String toString() {
		return "Hocvien [hoten=" + hoten + ", dichi=" + dichi + ", loai=" + loai + "]";
	}
	
}
