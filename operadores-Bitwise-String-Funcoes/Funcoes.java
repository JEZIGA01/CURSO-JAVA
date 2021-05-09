//Representam um processamento que possui um significado
//Math.sqrt(double)
//System.out.println(String)
//Principais vantagens: modularizaçao,delegação e reaproveitamento
//Funcoes podem receber dados de entrada(parametros ou argumentos)
//Funcoes podem ou nao retornar uma saida

//Em POO , funcoes em classes recebem o nome de "métodos"

import java.util.Scanner;

public class Funcoes {
	
	public static void main (String[] args) {
	
	Scanner sc = new Scanner(System.in);
		
		double j= 25.0;
		double x = Math.sqrt(j);
		
		System.out.println(x);
		
		
		System.out.println("\n");
		System.out.println("\n");
 
		
		System.out.println("Entre com 3 numeros inteiros : ");
		
		int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
		
		  int higher =  max(a,b,c);
		
		 showResult(higher);
		 
		 }
		
		public static int max(int x, int y, int z){
			
			int aux;
			
				 if(x > y && x > z){
			
			aux = x;
			
			} 
			
			else if (y > z){
				aux = y;
				}
				else{
					aux = z;
					}
					System.out.println("\n");
					return aux;
					
			}
			
			public static void showResult(int value){
				System.out.println(" Higher = "+ value);
				}
	
		
	}


