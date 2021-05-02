/*
 
 */


import java.util.Scanner;
public class Exe03 {
	
	public static void main (String[] args) {
		
			
			Scanner sc = new Scanner (System.in);
				int a = 0 , g = 0, d = 0;
				
				
				 
				boolean  continuar = true;
				
 			System.out.println(" ** ESCOLHA O TIPO DE COMBUSTIVEL ** ");
			System.out.println(" 1 - ALCOOL ");
			System.out.println(" 2 - GASOLINA");
			System.out.println(" 3 - DIESEL");
			System.out.println(" 4 - SAIR");
		
		do{

			
			System.out.print("\nInsira sua opcao: ");
			int x = sc.nextInt();
			
			
			if ( x == 1){
				
				a++;
				
				}
				else if ( x == 2){
					
					g++;
					} 
					else if ( x == 3){
					
					d++;
					} 
					else if (x == 4 ){
						continuar = false;
                System.out.print(" \n        MUITO OBRIGADA  !!!");
                System.out.print("\n CLIENTES QUE ESCOLHERAM ALCOOL: "+a);
                 System.out.print("\n CLIENTES QUE ESCOLHERAM GASOLINA: "+g);
                  System.out.print("\n CLIENTES QUE ESCOLHERAM DIESEL: "+d);
						}
					 
			} while( continuar );
			
			
	} 
}

