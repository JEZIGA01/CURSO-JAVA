package Examples;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero de entrada de dados: ");
        int num = sc.nextInt();

        double [] vect = new double [num];

        for (int i=0; i<num; i++){
            vect[i] = sc.nextDouble();
        }

        double soma =0.0;
        for (int i=0; i<num; i++){
            soma += vect[i];
        }
        double media = soma / num;
        System.out.printf("media: %.2f ", media );
    }
}
