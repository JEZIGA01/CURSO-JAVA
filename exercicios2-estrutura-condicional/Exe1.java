/*
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 */


import java.util.Scanner;

public class Exe1 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		
		int A =sc.nextInt();
		
		if (A<0){
	
			System.out.println("Negativo");
			
			}
			
			else{
				
				System.out.println("Positivo"); 
				}
			
		
	}
}

