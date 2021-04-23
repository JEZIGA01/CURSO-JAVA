/*
Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
mensagem explicativa, conforme exemplos.
* entrada 10 30  soma = 40;
 */


import java.util.Scanner;

public class ExeN1 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		
		int soma = x1+x2;
		
		System.out.println("SOMA = "+soma);
		
		
		
		
	}
}

