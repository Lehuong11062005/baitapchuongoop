package bai4;

public class Nguoi {
	private String ten;
	private int tuoi;
	private char gioitinh;
	public Nguoi() {
		super();
	}
	public Nguoi(String ten, int tuoi, char gioitinh) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioitinh = gioitinh;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public char getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(char gioitinh) {
		this.gioitinh = gioitinh;
	}
	@Override
	public String toString() {
		return "Nguoi [ten=" + ten + ", tuoi=" + tuoi + ", gioitinh=" + gioitinh + "]";
	}
	

}
