package bai6;

import java.util.Scanner;

public class Employee extends Person{
	protected String employeeid;
	protected String dateHired;
	
	public Employee(String ten,int tuoi,char gender) {
		super(ten,tuoi,gender);
	}

	public Employee(String employeeid, String dateHired,String ten,int tuoi,char gender) {
		super(ten,tuoi,gender);
		this.employeeid = employeeid;
		this.dateHired = dateHired;
	}

	public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public String getDateHired() {
		return dateHired;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", dateHired=" + dateHired + "]"+super.toString();
	}
	Scanner sc=new Scanner(System.in);
	@Override
	public void datainput() {
		System.out.println("nhap ten ");
		this.name=sc.nextLine();
		System.out.println("nhap tuoi ");
		this.tuoi=sc.nextInt();
		System.out.println("nhap gioi tinh ");
		this.gender=sc.next().charAt(0);
		System.out.println("nhap ngay vao lam ");
		this.dateHired=sc.nextLine();
		sc.nextLine();
		System.out.println("nhap ma nhan vien");
		this.employeeid=sc.nextLine();
	}


}
