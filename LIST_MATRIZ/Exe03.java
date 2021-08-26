 import java.util.Scanner;

public class Exe03 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int linha = 0, coluna = 0;
    int matriz[][];
    
    do{
	 System.out.print("Digite o valor da dimensao da matriz: ");
    linha = sc.nextInt();
    
   
  }while(linha >=20);

  coluna = linha + 1;
   matriz = new int[linha][coluna];

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
		  
		   matriz[i][j] = (int)(Math.random()*100);
		   
		   
        System.out.print(matriz[i][j] + " ");
      }
    

      System.out.println();
    }
}
}
