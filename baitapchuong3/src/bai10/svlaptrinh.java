package bai10;

public class svlaptrinh extends Hocvien{
	protected int sobuoi;
	protected double dongia;
	protected int loaiuutien;
	public svlaptrinh() {
		super();
	}
	public svlaptrinh(int sobuoi, double dongia, int loaiuutien,String hoten, String dichi, String loai) {
		super(hoten,dichi,loai);
		this.sobuoi = sobuoi;
		this.dongia = dongia;
		this.loaiuutien = loaiuutien;
	}
	public int getSobuoi() {
		return sobuoi;
	}
	public void setSobuoi(int sobuoi) {
		this.sobuoi = sobuoi;
	}
	public double getDongia() {
		return dongia;
	}
	public void setDongia(double dongia) {
		this.dongia = dongia;
	}
	public int getLoaiuutien() {
		return loaiuutien;
	}
	public void setLoaiuutien(int loaiuutien) {
		this.loaiuutien = loaiuutien;
	}
	
	public  double hocphi() {
		double a =sobuoi*dongia;
		if(loaiuutien==1) {
			a=a-1000000;
		}else if(loaiuutien==2) {
			a=a-800000;
		}
		return a;
	}
	public void nhapsvlaptrinh() {
		super.nhapsinhvien();
		System.out.println("nhap loai uu tien");
		this.loaiuutien=sc.nextInt();
		System.out.println("nhap so buoi");
		this.sobuoi=sc.nextInt();
		System.out.println("nhap don gia");
		this.dongia=sc.nextInt();
	}
	@Override
	public String toString() {
		return super.toString()+"svlaptrinh [sobuoi=" + sobuoi + ", dongia=" + dongia + ", loaiuutien=" + loaiuutien + "]";
	}
	

}
