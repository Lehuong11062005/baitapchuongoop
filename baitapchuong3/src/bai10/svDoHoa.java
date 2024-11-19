package bai10;

public class svDoHoa extends Hocvien{
	protected int loaiuutien;
	protected int sobuoi;
	protected double dongia;

	public svDoHoa() {
		super();
	}

	public svDoHoa(int loaiuutien,int sobuoi,double dongia,String hoten, String dichi, String loai) {
		super(hoten,dichi,loai);
		this.loaiuutien = loaiuutien;
		this.sobuoi=sobuoi;
		this.dongia=dongia;
	}

	public int getSobuoi() {
		return sobuoi;
	}

	public void setSobuoi(int sobuoi) {
		this.sobuoi = sobuoi;
	}

	public int getLoaiuutien() {
		return loaiuutien;
	}
	

	public void setLoaiuutien(int loaiuutien) {
		this.loaiuutien = loaiuutien;
		
	}
	
	public double getDongia() {
		return dongia;
	}

	public void setDongia(double dongia) {
		this.dongia = dongia;
	}

	public void nhapsvdohoa() {
		super.nhapsinhvien();

		System.out.println("nhap loai uu tien");
		this.loaiuutien=sc.nextInt();
		System.out.println("nhap so buoi");
		this.sobuoi=sc.nextInt();
		System.out.println("nhap don gia");
		this.dongia=sc.nextInt();
	}
	public  double hocphi() {
		double a=sobuoi*dongia;
		if(loaiuutien==1) {
			a=a-1000000;
			
		}else if(loaiuutien==2) {
			a=a-500000;
		}
		return a;	
	}

	@Override
	public String toString() {
		return super.toString()+"svDoHoa [loaiuutien=" + loaiuutien + ", sobuoi=" + sobuoi + ", dongia=" + dongia + "]";
	}
	

}
