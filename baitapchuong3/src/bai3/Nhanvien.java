package bai3;
import bai2.DiaChi;
public class Nhanvien {
	private  String name;
	private DiaChi diachi=new DiaChi();
	private String dob;
	private char gender;
	public Nhanvien() {
		super();
	}
	public Nhanvien(String name, DiaChi diachi, String dob, char gender) {
		super();
		this.name = name;
		this.diachi = diachi;
		this.dob = dob;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DiaChi getDiachi() {
		return diachi;
	}
	public void setDiachi(DiaChi diachi) {
		this.diachi = diachi;
		
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Nhanvien [name=" + name + ", diachi=" + diachi + ", dob=" + dob + ", gender=" + gender + "]";
	}
	
	
	

}
