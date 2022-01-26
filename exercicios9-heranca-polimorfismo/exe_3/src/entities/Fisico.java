package entities;

public class Fisico extends Pagador{
	
	private Double healthExpenses;
	
	public Fisico() {
		super();
	} 
	
	public Fisico(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	} 

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public final Double taxRate() {
	
		double basicTax;
		if (getAnnualIncome() < 20000.0) {
			basicTax = getAnnualIncome() * 0.15;
		}
		else {
			basicTax = getAnnualIncome() * 0.25;
		}
		basicTax -= getHealthExpenses() * 0.5;
		if (basicTax < 0.0) {
			basicTax = 0.0;
		}
		return basicTax;
	}
	
	public String toString() {
		return getName() + "," + String.format("%.2f", taxRate());
	}
}