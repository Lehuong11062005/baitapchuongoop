package bai4;

public class Benhnhan extends Nguoi {
	private String tuoisu;
	private String  chuandoan;
	private BenhVien benhvien=new BenhVien();
	public Benhnhan(String tuoisu, String chuandoan, BenhVien benhvien, String ten,int tuoi,char gioitinh) {
		super(ten,tuoi,gioitinh);
		this.tuoisu = tuoisu;
		this.chuandoan = chuandoan;
		this.benhvien = benhvien;
	}
	public Benhnhan(String ten,int tuoi,char gioitinh) {
		super(ten,tuoi,gioitinh);
	}
	public String getTuoisu() {
		return tuoisu;
	}
	public void setTuoisu(String tuoisu) {
		this.tuoisu = tuoisu;
	}
	public String getChuandoan() {
		return chuandoan;
	}
	public void setChuandoan(String chuandoan) {
		this.chuandoan = chuandoan;
	}
	public BenhVien getBenhvien() {
		return benhvien;
	}
	public void setBenhvien(BenhVien benhvien) {
		this.benhvien = benhvien;
	}
	@Override
	public String toString() {
		return "Benhnhan [tuoisu=" + tuoisu + ", chuandoan=" + chuandoan + benhvien.toString()  +super.toString();
	}
	
	
}
