/*
Leia a hora inicial e a hora final de um jogo. 
* A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, 
* tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */

import java.util.Scanner;

public class Exe4 {
	
	public static void main (String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		 int duracao;
		 
	    int hora_inicial = sc.nextInt();
	     int hora_final = sc.nextInt();
	    
	     
	     
	  if (hora_inicial < hora_final) {
		  
			duracao = hora_final - hora_inicial;
		}
		else {
			duracao = hora_inicial + hora_final-24;
		}
	    
	     System.out.println(" o jogo durou " +duracao+" horas ");
	     
	     
		
		
	}
}

