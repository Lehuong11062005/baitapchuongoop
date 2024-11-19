package bai10;
import java.util.Scanner;
public class bai10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double a,b,c,d;
		do{
			System.out.println("nhap canh thu nhat hcnh");
			 a=sc.nextDouble();
			 System.out.println("nhap canh thu hai cua hcnh");
			 b=sc.nextDouble();
		}
		while(a<=0 || b<=0);
		 c=a*b;
		 d=(a+b)*2;
		sc.close();
		System.out.println("dien tich hinh chu nhat la "+c+" chu vi hinh chu nhat la "+d);
	}

}
