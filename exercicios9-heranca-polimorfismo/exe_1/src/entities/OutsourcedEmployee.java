package entities;

public class OutsourcedEmployee extends Employee {
	
	private Double addtionalCharge;
	
	public OutsourcedEmployee() {
		super();
	}  
	
	
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour,Double addtionalCharge) {
		super(name, hours, valuePerHour);
		this.addtionalCharge = addtionalCharge;
	}


	public Double getAdditionalCharge() {
		return addtionalCharge;
	}


	public void setAdditionalCharge(Double additionalCharge) {
		this.addtionalCharge = additionalCharge;
	}

	@Override
	public Double payment(){ 
		
		return super.payment() + addtionalCharge * 1.1;
	}

}
