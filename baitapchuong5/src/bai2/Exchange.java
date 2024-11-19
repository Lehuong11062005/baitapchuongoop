package bai2;

import java.util.ArrayList;

public class Exchange {
	ArrayList<Rate> a1;

	public Exchange() {
		this.a1= new ArrayList<Rate>();
	}

	public Exchange(ArrayList<Rate> a1) {
		this.a1 = a1;
	}
	// them 
	public void addrate(Rate r) {
		this.a1.add(r);
	}
	//doi
	public double convert(String code1,String code2,double amount) {
		Rate r1=new Rate();
		r1.setCode1(code1);
		r1.setCode2(code2);
		int pos=a1.indexOf(r1);
		if(pos>=0) {
			return a1.get(pos).getRate()*amount;
		}else {
			return 0;
		}
	}
	
	
	

}