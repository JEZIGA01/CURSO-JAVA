
package application;

import entities.Retangulo;
import java.util.Scanner;

public class Program {

     
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner sc = new Scanner (System.in);
        
         
          Retangulo retangulo = new Retangulo();
          
          
          System.out.println("Digite o valor da largura : ");
        
        retangulo.largura = sc.nextDouble();
        
         System.out.println("Digite o valor da altura : ");
          retangulo.altura  = sc.nextDouble();
          
          System.out.printf("AREA = %.2f%n", retangulo.Area());
          System.out.printf("PERIMETER  = %.2f%n", retangulo.Perimetro());
          System.out.printf("DIAGONAL  = %.2f%n", retangulo.Diagonal());
        
          


    }
    
}
