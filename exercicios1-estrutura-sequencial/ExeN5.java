/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
 */


import java.util.Scanner;

public class ExeN5 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		int cod_peca1 = sc.nextInt();
		int cod_peca2 = sc.nextInt();
		int numeroDePecas1 = sc.nextInt();
		int numeroDePecas2 = sc.nextInt();
		double valorUnitario1 =sc.nextDouble();
		double valorUnitario2 =sc.nextDouble();
		
		double valor = valorUnitario1 * numeroDePecas1;
		double valor2 = valorUnitario2 * numeroDePecas2;
		
		double  total = valor + valor2;
		
		System.out.printf("VALOR A PAGAR = U$ %.2f ",total);
			
	}
}

