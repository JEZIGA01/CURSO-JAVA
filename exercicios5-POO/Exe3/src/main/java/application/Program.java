package application;

import entities.Aluno;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner Str = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite seu nome : ");
        aluno.nome = Str.nextLine();

        System.out.println("Digite as 3 notas : ");
         
          aluno.nota_a  = sc.nextDouble();
          aluno.nota_b  = sc.nextDouble();
          aluno.nota_c = sc.nextDouble();
          
            System.out.println();
            
             System.out.println("Nome " +aluno.nomeDoAluno());
              System.out.printf("Nota %.2f", aluno.notaDoAluno());
              
               System.out.println();
          if (aluno.notaDoAluno() < 60.0){
                   
              System.out.println("Reprovado ... ");
               System.out.println("Pontos que faltaram para passar : " + aluno.pontosQueFaltaram());
          }
          
          else {
                 
          
           System.out.println(" Aprovado !!! ");
          }
   
           
    }

}
