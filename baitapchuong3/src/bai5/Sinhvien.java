package bai5;
import bai4.Nguoi;
public class Sinhvien extends Nguoi{
	private String lop;
	private String nganh;
	private Truong truong=new Truong();
	public Sinhvien(String ten,int tuoi,char gioitinh) {
		super(ten,tuoi,gioitinh);
	}
	public Sinhvien(String lop, String nganh, Truong truong,String ten,int tuoi,char gioitinh) {
		super(ten,tuoi,gioitinh);
		this.lop = lop;
		this.nganh = nganh;
		this.truong = truong;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public String getNganh() {
		return nganh;
	}
	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	public Truong getTruong() {
		return truong;
	}
	public void setTruong(Truong truong) {
		this.truong = truong;
	}
	@Override
	public String toString() {
		return "Sinhvien [lop=" + lop + ", nganh=" + nganh +  "]" + truong.toString()+super.toString();
	}
	
	
	
}
