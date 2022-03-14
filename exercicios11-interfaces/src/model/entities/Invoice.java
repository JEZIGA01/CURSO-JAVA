package model.entities;

public class Invoice {

	private Double basicPayment;
	public Double getBasicPayment() {
		return basicPayment;
	}

	public Invoice() {
	}

	public Invoice(Double basicPayment, Double tax) {
		super();
		this.basicPayment = basicPayment;
		this.tax = tax;
	}
	public Double getTotalPayment(Double  basicPayment) {
		return this.basicPayment = basicPayment ;
	}
 
	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	private Double tax;
}
