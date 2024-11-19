package bai4;

public class BenhVien {
	private String tenbv;
	private String diachi;
	private String giamdoc;
	public BenhVien() {
		super();
	}
	public BenhVien(String tenbv, String diachi, String giamdoc) {
		super();
		this.tenbv = tenbv;
		this.diachi = diachi;
		this.giamdoc = giamdoc;
	}
	public String getTenbv() {
		return tenbv;
	}
	public void setTenbv(String tenbv) {
		this.tenbv = tenbv;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getGiamdoc() {
		return giamdoc;
	}
	public void setGiamdoc(String giamdoc) {
		this.giamdoc = giamdoc;
	}
	@Override
	public String toString() {
		return "BenhVien [tenbv=" + tenbv + ", diachi=" + diachi + ", giamdoc=" + giamdoc + "]";
	}
	
}
