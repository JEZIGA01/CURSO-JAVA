package entities;

public class Juridico extends Pagador{

	private Integer numEmployee;


	public Juridico() { 
	}
	
	public Juridico(String name, Double annualIncome, Integer numEmployee) {
		super(name, annualIncome);
		this.numEmployee = numEmployee;
	} 

	public Integer getNumEmployee() {
		return numEmployee;
	}

	public void setNumEmployee(Integer numEmployee) {
		this.numEmployee = numEmployee;
	}

	@Override
	public final Double taxRate() {
	
		if(getNumEmployee() > 10) {
		return getAnnualIncome() * 0.14;
		} else  
			return getAnnualIncome() * 0.16;
	}

	public String toString() {
		return getName() + "," + String.format("%.2f", taxRate());
	}
}
