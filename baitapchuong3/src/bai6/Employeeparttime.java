package bai6;

public class Employeeparttime extends Employee{
	protected int hourperWeek;

	public Employeeparttime(String employeeid, String dateHired,String ten,int tuoi,char gender) {
		super(employeeid,dateHired,ten, tuoi, gender);
	}
	public Employeeparttime(String employeeid, String dateHired,String ten,int tuoi,char gender, int hourperWeek) {
		super(employeeid,dateHired,ten, tuoi, gender);
		this.hourperWeek = hourperWeek;
	}
	
	public int getHourperWeek() {
		return hourperWeek;
	}
	public void setHourperWeek(int hourperWeek) {
		this.hourperWeek = hourperWeek;
	}
	@Override
	public String toString() {
		return "Employeeparttime [hourperWeek=" + hourperWeek + "]" +super.toString();
	}
	public void dataupdate1() {
		super.datainput();
		System.out.println("nhap so gio lam viec");
		this.hourperWeek=sc.nextInt();
	}
	
	

}
