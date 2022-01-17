package application; 
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import entities.Funcionario;

public class Program { 
	
	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 Scanner scS = new Scanner(System.in);
	 Random rand = new Random (10);
	 
	 System.out.print("Digite a quantidade de funcionarios a ser registrado: ");
	 Integer register = sc.nextInt();
	 
	 List<Funcionario> list = new ArrayList<>(); 
	 
	 for(int i = 1; i <= register; i++) {

		 System.out.println("Employee #"+i);
		 System.out.print("Id: " );
		 Integer id = sc.nextInt();
		 System.out.print("Name: \n");
		 String name = scS.nextLine();
		 System.out.print("Salary: \n");
		 Double salary = sc.nextDouble(); 
		 Funcionario fun = new Funcionario (name,salary,id);  
		 list.add(fun);   
	 }     
	 
	 System.out.println("Digite o id do funcionario: ");
	 Integer readId = sc.nextInt(); 
	

	 Funcionario fun =  getListFiltred(list,readId);
	 
	 if(getListFiltred(list,readId) == null) {
		 System.out.println("Funcionario nao existe ! Aqui mostra a lista dos funcionarios cadastrados: ");
		 for(Funcionario x : list) {
			 System.out.println(x);
		 }
	 }else {
		 System.out.println("Deu certo ???!!!");
		 
		 for(Funcionario x : list) {
			 System.out.println(x);
		 }
	 }
	 
	 
	} 
	public static Funcionario getListFiltred(List<Funcionario>list,int readId) {
		return list.stream().filter(x -> x.getId()==  readId).findFirst().orElse(null); 
	}
}
