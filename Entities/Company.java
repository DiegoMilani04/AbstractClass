package Entities;

public class Company extends Person{

	private int numberOfEmproyees;
	
	public Company() {
		super();
	}
	
	public Company(String name, double income, int numberOfEmproyees) {
		super(name, income);
		this.numberOfEmproyees = numberOfEmproyees;
	}

	public int getNumberOfEmproyees() {
		return numberOfEmproyees;
	}

	public void setNumberOfEmproyees(int numberOfEmproyees) {
		this.numberOfEmproyees = numberOfEmproyees;
	}

	@Override
	public double tax() {
		if(numberOfEmproyees < 10) {
			return super.getIncome()*0.16;
		}
		else {
			return super.getIncome()*0.14;
		}
	}

	@Override
	public String taxPaid() {
		return super.getName() + ": $ " + String.format("%.2f", tax());
	}
}