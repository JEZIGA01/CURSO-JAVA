 import java.util.Scanner;
 
public class Exe05 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int linha =0, coluna =0;
		
		int matriz1 [][] , matriz2[][], matriz3[][];
		
		System.out.print(" Numero de Linhas: ");
		linha = leia.nextInt();

		System.out.print(" Numero de Colunas: ");
		coluna = leia.nextInt();		
		
		matriz1 = new int [linha][coluna];
		matriz2 = new int [linha][coluna];
		matriz3 = new int [linha][coluna];
		
		System.out.println("\n Matriz 1: ");
		
		for (int i = 0; i < matriz1.length; i++){
			for (int j = 0; j < matriz1[i].length; j++){
				
				matriz1[i][j] = (int)(Math.random()*20);
				System.out.print(matriz1[i][j]+" ");				
			}
			
			System.out.println();
		}
		System.out.println();
		
		System.out.println(" Matriz 2: ");
		
		for (int i = 0; i < matriz2.length; i++){
			for (int j = 0; j < matriz2[i].length; j++){
				
				matriz2[i][j] = (int)(Math.random()*20);
				System.out.print(matriz2[i][j]+" ");				
			}
			
			System.out.println();
		}
		System.out.println("\n Matriz 3: ");
		for (int i = 0; i < matriz2.length; i++){
			for (int j = 0; j < matriz2[i].length; j++){
				
				matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
				System.out.print(matriz3[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}

