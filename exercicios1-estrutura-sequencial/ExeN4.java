/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais.
 * 
 */


import java.util.Scanner;

public class ExeN4 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		int funcionario = sc.nextInt();
		int h_trabalhadas = sc.nextInt();
		double valorPorHora =sc.nextDouble();
		
		double salario = valorPorHora * h_trabalhadas;
		
		System.out.println("NUMBER = "+funcionario);
		System.out.printf("SALARY = U$ %.2f ",salario);
		
	}
}

