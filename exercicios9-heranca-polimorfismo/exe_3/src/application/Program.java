package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Fisico;
import entities.Juridico;
import entities.Pagador;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner scS = new Scanner(System.in);
		
		List<Pagador> list = new ArrayList<>();
		
		System.out.println("Digite a quantidade de pagadores: ");
		int register = sc.nextInt();
		
		
		for(int i = 1; i <= register; i++) { 

			System.out.println("Digite se a pessoa é Fisica: [F] /Juridica: [J]");
			char type = sc.next().charAt(0);
			System.out.println("Digite o nome: ");
			String name = scS.nextLine();
			System.out.println("Digite a renda anual");
			Double annualIncome = sc.nextDouble();
			
			if(type == 'f') {
				System.out.println("Digite despesas da taxa de plano de saude: ");
				Double healthExpenses = sc.nextDouble(); 
				list.add(new Fisico(name,annualIncome,healthExpenses));
				
			}else { 
				System.out.println("Digite a quantidade de funcionarios: ");
				Integer numEmployee = sc.nextInt(); 
				list.add(new Juridico(name,annualIncome,numEmployee));
			} 
		}
		
		System.out.println("**** Lista dos pagadores ***** "); 
		for(Pagador pg : list) { 
			
			System.out.print(pg.toString()+"\n"); 
		}
		double sum = 0.0;
		
		for(Pagador pg : list) {  
			sum += pg.taxRate();    
		}
		 System.out.print("Total da taxa $: "+ String.format("%.2f", sum)); 
	}

}
