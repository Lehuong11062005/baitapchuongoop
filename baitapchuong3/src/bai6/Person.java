package bai6;

public abstract class Person {
	protected String name;
	protected int tuoi;
	protected char gender;
	public Person() {
		super();
	}
	public Person(String name, int tuoi, char gender) {
		super();
		this.name = name;
		this.tuoi = tuoi;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public abstract void datainput();
	@Override
	public String toString() {
		return "Person [name=" + name + ", tuoi=" + tuoi + ", gender=" + gender + "]";
	}
	

}
