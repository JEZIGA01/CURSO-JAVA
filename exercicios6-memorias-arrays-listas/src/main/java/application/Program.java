package application;

import entities.Reservas;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);

        System.out.println("Digite o numero de estudantes para a reserva: ");
        int num_estudantes = sc.nextInt();

        Reservas[] quarto = new Reservas[10];

        for (int i =0; i < num_estudantes; i++){

            System.out.print("Nome do estudante "+i+" : ");
            String nome = scs.nextLine();
            System.out.print("E-mail do estudante: ");
            String email = scs.nextLine();
            System.out.print("Quarto do estudante ");
            int num_quarto = sc.nextInt();

            quarto[num_quarto] = new Reservas (nome,email);

        }

        for (int q = 0 ; q < 10; q++){
            if (quarto[q] != null){
                System.out.println(q +", "+quarto[q]);
            }
        }

    }
}
