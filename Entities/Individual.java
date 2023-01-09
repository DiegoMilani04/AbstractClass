package Entities;

public class Individual extends Person {

	private double healthExpenses;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, double income, double healthExpenses) {
		super(name, income);
		this.healthExpenses = healthExpenses;
	}

	public double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public double tax() {
		if(super.getIncome() < 20000.00) {
			return (super.getIncome()*0.15)-(healthExpenses*0.5);
		}
		else {
			return (super.getIncome()*0.25)-(healthExpenses*0.5);	
		}
	}

	@Override
	public String taxPaid() {
		return super.getName() + ": $ " + String.format("%.2f", tax());
	}
}