package bai1;



import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cr0=new Circle();
		cr0.setRadius(1);
		System.out.println(cr0.toString());
		CircleCollection cr1 =new CircleCollection();
		int n;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1 .them duong tron.\n"
					+"2 lay duong tron tu vi chi pos.\n"
					+"3 nhap gia tri cho duong tron vi tri pos.\n"
					+"4 in thong tin cac duong tron.\n"
					+"5 in tong dien tich cac duong tron.\n"
					+"6 in dien tich nho nhat.\n"
					+"7in dien tich lon nhat.\n"
					+"0 thoat\n"
					+"8 sap xep tang dan theo ban kinh"
					);
			 n=sc.nextInt();
			if(n==1) {
				Circle cr=new Circle();
				cr1.them(cr);
			}else if(n==2) {
				System.out.println("nhap vi tri pos");
				int a=sc.nextInt();
				System.out.println(cr1.getCircle(a));
			}else if(n==3) {
				System.out.println("nhap vi tri pos");
				int a=sc.nextInt();
				Circle cr=new Circle();
				cr1.setCircle(a, cr);
			}else if(n==4) {
				cr1.in();
			}else if(n==5) {
				System.out.println("tong dien tich la"+cr1.sumArea());
				cr1.sumArea();
			}else if(n==6) {
				System.out.println(" dien tich nho nhat la"+cr1.minArea());
				cr1.minArea();
			}else if(n==7) {
				System.out.println(" dien tich nho nhat la"+cr1.maxArea());
				
			}else if(n==8) {
				cr1.xeptang();
				cr1.in();
			}
		}while(n!=0);
		sc.close();
	
	}

}
			
