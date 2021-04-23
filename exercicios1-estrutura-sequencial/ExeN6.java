/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
mostre: 
a) a área do triângulo retângulo que tem A por base e C por altura. 
b) a área do círculo de raio C. (pi = 3.14159) 
c) a área do trapézio que tem A e B por bases e C por altura. 
d) a área do quadrado que tem lado B. 
e) a área do retângulo que tem lados A e B.
 * 
 */
import java.util.Scanner;
import java.lang.Math;

public class ExeN6 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		
		double  A =sc.nextDouble();
		double B =sc.nextDouble();
		double  C =sc.nextDouble();
		
		double pi = 3.14159;
		
		double a =  (A*C)/2;
		double b =  pi * Math.pow(C,2);//pi * (raio * raio) izi
		double c =  (A+B)*C/2;
		double d =  Math.pow(B,2);
		double e =  A*B;
		
		
		
		
		System.out.printf("Triangulo %.3f %n",a);
		System.out.printf("CIRCULO %.3f%n",b);
		System.out.printf("TRAPEZIO %.3f%n",c);
		System.out.printf("QUADRADO %.3f%n",d);
		System.out.printf("RETANGULO %.3f%n",e);
			
	}
}


