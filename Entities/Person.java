package Entities;

public abstract class Person {
	
	private String name;
	private double income;
	
	public Person() {
	}

	public Person(String name, double income) {
		this.name = name;
		this.income = income;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}
	
	public abstract double tax();
	public abstract String taxPaid();
}
