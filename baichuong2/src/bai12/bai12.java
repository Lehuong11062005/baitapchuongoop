package bai12;
//tinh xep loai dua tren diem
import java.util.Scanner;
public class bai12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double a;
		do {
			System.out.println("nhap diem cua sinh vien");
			a=sc.nextDouble();
		}while(a<0||a>100);
		if(a>=90) {
			System.out.println("sinh vien loai A");
			
		}else if(a>=80) {
			System.out.println("sinh vien loai B");
			
		}else if(a>=70) {
			System.out.println("sinh vien loai C");
			
		}else if(a>=50) {
			System.out.println("sinh vien loai D");
		}else {
			System.out.println("sinh vien loai F ");
		
		}
		sc.close();
	}

}
