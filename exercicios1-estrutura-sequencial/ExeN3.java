/*
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */


import java.util.Scanner;


public class ExeN3 {
	
	public static void main (String[] args) {
		
				Scanner sc = new Scanner (System.in);
		
		
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int x3 = sc.nextInt();
		int x4 = sc.nextInt();
		
		int diferenca = (x1*x2-x3*x4);
		System.out.println("DIFERENCA = "+diferenca);
		
	}
}

