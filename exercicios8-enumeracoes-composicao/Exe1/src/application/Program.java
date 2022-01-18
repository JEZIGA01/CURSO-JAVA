package application;
 
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {
 
 
	public static void main(String[] args) throws ParseException {
		

		


		Scanner scs = new Scanner (System.in);  
		
		Scanner sc = new Scanner (System.in);  
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Nome do departamento: ");
		String departmentName = scs.nextLine(); 
		
		System.out.print("Nome: ");
		String workerName = scs.nextLine();
		
		System.out.print("Level: ");
		String workerLevel = scs.nextLine();
		
		System.out.print("Salario base: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
			 


		System.out.print("Digite quantos contratos este trabalhador tem: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <=n; i++) {

			System.out.print("Contrato #"+i + "Data: "); 
			System.out.print("Digite quantos contratos este trabalhador tem: ");
			System.out.print("Data (DD/MM/YYYY): ");
			Date contractDate =sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			Double valuePerHour = sc.nextDouble();
			System.out.print("Duracao (hora): ");
			Integer hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour,hours);
			worker.addContract(contract); 
		}
		

		System.out.println(" ----------  ------  ---------");
		System.out.print("Entre com o mes e ano para calcular o rendimento (MM/YYYY): ");
		String monthAndYear = scs.nextLine();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		

		System.out.println("Nome: "+worker.getName()); 
		System.out.println("Departamento: "+ worker.getDepartment().getName()); 
		System.out.println("Redimento por ano e mes: "+ monthAndYear + ": "+ String.format("%.2f", worker.income(year,month))); 
		}

	}


