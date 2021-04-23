/*
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos 
* ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
* Obviamente se o valor não estiver em nenhum destes intervalos,
 */
 
 
import java.util.Scanner;


public class Exe6 {
	
	public static void main (String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		int valor = sc.nextInt();

		 
		 
		 if(valor >= 0 && valor <=25){
			 
			 System.out.println(" se encontra no intervalo de 0 a 25");
			 }
			  
		 else if(valor > 25 && valor <=50){
			 
			 System.out.println(" se encontra no intervalo de 25 a 50");
			 }
			  
		 else if(valor > 50 && valor <=75){
			 
			 System.out.println(" se encontra no intervalo de 50 a 75");
			 }
			  
			   else {
			 
			 System.out.println(" Fora do intervalo ");
			 }
	

	}
	
	
}

