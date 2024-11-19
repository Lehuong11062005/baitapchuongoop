package bai3;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String t;
		while(true) {
			System.out.println("Nhập chuỗi (gõ 'DONE' để kết thúc):");
		  		t = sc.nextLine();
		  		if (t.equals("DONE")) { 
		  			System.out.println("Kết thúc chương trình!");
		  			break;
		  		}
		  	try {
			   if(t.length()>30) {
				   throw new StringTooLongException("độ dài của đoạn ký tự quá dài"+ t.length());
			   }
			   System.out.println("chuỗi đã nhập :"+t);
		   }catch(StringTooLongException e) {
			   System.out.println("Lỗi: " + e.getMessage());
               System.out.println("Chương trình kết thúc do lỗi chuỗi quá dài.");
               break;
		   }
	}
		sc.close();

}
}
