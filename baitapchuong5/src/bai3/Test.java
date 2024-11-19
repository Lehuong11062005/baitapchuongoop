package bai3;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		// mang ky tu de bai đã cho
		String [] b= {"learn java by example",
				"guide to advance java",
				"example of distributed in java"
		};
		int tong =0;// tôngr số ký tự
		Map<String , Integer> sotu = new HashMap<String, Integer>();// khai báo hashmap để lưu chữ ký tự String và số lần nó xuất hiện 
		for (String string : b) {//cho ký tự String chay từng ký tự trong mảng b
			String[] tu =string.split("\\W+");//khai báo mảng tu để luu trữ ký tự trong mảng b đã tách ra bởi ký tự không phải chư và số
			for (String tu2 : tu) {
				sotu.put(tu2, sotu.getOrDefault(tu2, 0)+1);//so sách và thêm từ vào mảng sotu để biết có từ nào và xuất hiện bao lần 
				// sotu.getOrDefault(tu2, 0)+1 cho biết nếu từ tu2 đã cuất hiện thì cộng thêm 1 nếu chưa thì thêm vào sotu và số lần xuất hiện
				tong++;//tong số từ của mảng 
			}
		}
		 System.out.println("Tần suất xuất hiện của mỗi từ:");
	        for (Map.Entry<String, Integer> entry : sotu.entrySet()) {//tìm các cặp từ vào só lần xuất hiện in ra
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }

	        System.out.println("Total words: " +tong);//in tong so tu
	}

}
