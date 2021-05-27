/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Salario;
import java.util.Scanner;

/**
 *
 * @author jessi
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
         Scanner Str = new Scanner (System.in);
        Scanner sc = new Scanner (System.in);
        
        
        Salario salario = new Salario();
        
           System.out.println("Digite seu nome : ");
          salario.nome  = Str.nextLine();
          
          System.out.println("Digite o salario bruto: ");
          salario.bruto = sc.nextDouble();
          System.out.println("Digite a taxa: ");
          salario.taxa = sc.nextDouble();
          
           System.out.println();
           System.out.println(salario);
        
             System.out.println("Acrescente a porcentagem: ");
             double porcentagem  = sc.nextDouble();
         salario.acrescimo(porcentagem);
           
           System.out.println();
           System.out.println(salario);
        
          
    }
    
}
