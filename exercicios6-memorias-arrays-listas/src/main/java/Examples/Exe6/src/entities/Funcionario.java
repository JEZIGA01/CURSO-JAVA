package entities;
 

public class Funcionario {
		
		private String name;
		private Double salary;
		private Integer id;
	
	public Funcionario() { 
 }
	
	public Funcionario(String name, Double salary, int id) {
		
		this.name = name;
		this.salary= salary;
		this.id= id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}  
	public String toString() {
		return "Id: " + id +"," + name+"," + ","+ salary;
	}
}
	
