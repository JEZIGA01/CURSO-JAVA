package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee; 

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 Scanner scS = new Scanner(System.in);
		 
		 List<Employee> list = new ArrayList<>(); 
		 
		 System.out.print("Numero de funcionarios a ser registrados: " );
		 Integer register = sc.nextInt();
		 
		 for(int i = 1; i <= register; i++) {

			 System.out.println("Employee #"+i);
			
			 System.out.print("Nome: \n");
			 String name = scS.nextLine();
			 System.out.print("Horas: " );
			 Integer hours = sc.nextInt();
			 System.out.print("Tercerizado [s/n]: " );
			 char ch= sc.next().charAt(0);
			 System.out.print("Valor por hora: \n");
			 Double valuePerHour = sc.nextDouble(); 
			
			 if(ch == 's') {
				 System.out.println("Valor adicional: ");
				 double addtionalCharge = sc.nextDouble();
				 list.add(new  OutsourcedEmployee(name,hours,valuePerHour,addtionalCharge));   
			 }    
			 
			 else { 
				 list.add(new  Employee(name,hours,valuePerHour));
			 } 
			 } 
		 System.out.println("Lista de pagamentos dos funcionarios: ");
		 for( Employee fun: list) {
			 System.out.print(fun.getName() + ", " + String.format("%.2f",fun.payment()) + "\n");
		 }
	}

}
