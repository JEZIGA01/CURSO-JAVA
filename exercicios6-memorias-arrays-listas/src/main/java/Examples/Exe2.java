package Examples;

import Examples.entities.Produto;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);

         int num = sc.nextInt();

        Produto[] vetor = new Produto[num];

        for (int i=0; i< vetor.length; i++){
            String nome = scs.nextLine();
            double preco = sc.nextDouble();

            vetor[i] = new Produto(nome, preco);
        }

        double soma = 0.0;

        for (int i=0; i< vetor.length; i++){
            soma += vetor[i].getPreco();
        }
        double media = soma/ vetor.length;

        System.out.printf("Media: %.2f ",media);
    }
}
