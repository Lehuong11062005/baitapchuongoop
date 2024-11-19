package bai5;

public class Truong {
	private String tentr;
	private String diachi;
	private String hieutruong;
	public Truong() {
		super();
	}
	public Truong(String tentr, String diachi, String hieutruong) {
		super();
		this.tentr = tentr;
		this.diachi = diachi;
		this.hieutruong = hieutruong;
	}
	public String getTentr() {
		return tentr;
	}
	public void setTentr(String tentr) {
		this.tentr = tentr;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getHieutruong() {
		return hieutruong;
	}
	public void setHieutruong(String hieutruong) {
		this.hieutruong = hieutruong;
	}
	@Override
	public String toString() {
		return "Truong [tentr=" + tentr + ", diachi=" + diachi + ", hieutruong=" + hieutruong + "]";
	}
	
}
