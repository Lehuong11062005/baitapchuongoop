package bai2;

public class DiaChi {
	private String thon;
	private String huyen;
	private String tinh;
	private String xa;
	public DiaChi() {
		super();
	}
	public DiaChi(String thon, String huyen, String tinh, String xa) {
		super();
		this.thon = thon;
		this.huyen = huyen;
		this.tinh = tinh;
		this.xa = xa;
	}
	public String getThon() {
		return thon;
	}
	public void setThon(String thon) {
		this.thon = thon;
	}
	public String getHuyen() {
		return huyen;
	}
	public void setHuyen(String huyen) {
		this.huyen = huyen;
	}
	public String getTinh() {
		return tinh;
	}
	public void setTinh(String tinh) {
		this.tinh = tinh;
	}
	public String getXa() {
		return xa;
	}
	public void setXa(String xa) {
		this.xa = xa;
	}
	@Override
	public String toString() {
		return "DiaChi [thon=" + thon + ", huyen=" + huyen + ", tinh=" + tinh + ", xa=" + xa + "]";
	}
	

}
