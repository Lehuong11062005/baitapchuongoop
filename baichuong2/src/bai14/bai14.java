package bai14;
import java.util.Scanner;
public class bai14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double a;
		do {
			System.out.println("nhap so tien dien");
			a= sc.nextDouble();
		}while(a<0);
		double b;
		if(a<=50) {
			b=a*1484;
		}else if(a<=100) {
			b= 50*1484+(a-50)*1533;
		}else if(a<=200) {
			b=50*1484+50*1533+(a-100)*1786;
		}else {
			b=50*1484+50*1533+100*1786+(a-200)*2242;
		}
		System.out.println("tien dien la "+b);
		sc.close();
	}

}
