/*
 * Faça um programa para ler o valor do raio de um círculo, 
 * e depois mostrar o valor da área deste círculo com quatro 
casas decimais conforme exemplos.
 */

import java.util.Scanner;

import java.lang.Math;

public class ExeN2 {
	
	public static void main (String[] args) {
		
			Scanner sc = new Scanner (System.in);
		
		
		double raio = sc.nextDouble();
		
		double pi = 3.14159;
		double A = pi*Math.pow(raio,2);
		
		System.out.printf("A = %.4f  ",A);
		
		
		
		
	}
}

