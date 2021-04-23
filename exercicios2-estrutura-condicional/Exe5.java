/*
Com base na tabela abaixo,
*  escreva um programa que leia o código de um item e a quantidade deste item. 
* A seguir, calcule e mostre o valor da conta a pagar.
 */


import java.util.Scanner;

public class Exe5 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int cod_item = sc.nextInt();
		int quantidade_item = sc.nextInt();
		
		if(cod_item == 1){
			
			double valor = quantidade_item * 4.00;
			System.out.printf("Total = %.2f ",valor);
			
			
			}
			
			else if(cod_item == 2){
				double valor = quantidade_item * 4.50;
					System.out.printf("Total = %.2f ",valor);
					
					
				}
				
				
				else if(cod_item == 3){
				         double valor = quantidade_item * 5.00;
					         System.out.printf("Total = %.2f ",valor);
					
					
				}
				
					    else if(cod_item == 4){
				             double valor = quantidade_item * 2.00;
					            System.out.printf("Total = %.2f ",valor);
					
					
				}
					       else if(cod_item == 5){
				                double valor = quantidade_item * 1.50;
					               System.out.printf("Total = %.2f ",valor);
					
					}
					
		
				    
				else{
				System.out.println("Codigo errado");
				}
				
			
	


    }
}
