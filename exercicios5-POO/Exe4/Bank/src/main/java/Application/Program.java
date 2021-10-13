package Application;

import entities.Conta;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);

        Conta caixa;

        System.out.println("Entre com o numero da conta: ");
        int num_conta = sc.nextInt();
        System.out.println("Entre com o titular da conta: ");
        String titular = scs.nextLine();

        System.out.println("Deseja fazer um deposito inicial (s/n) ?");
        String resp = scs.nextLine();

        if (resp.equals("s")) {
            System.out.println("Digite o deposito inicial: ");
            double deposito_inicial = sc.nextDouble();
            caixa = new Conta(deposito_inicial,num_conta,titular);
        }
        else {
            caixa = new Conta(num_conta,titular);
        }
        System.out.println("Dados da conta: ");
        System.out.println(caixa);

        System.out.println();
        System.out.println("Entre com um valor de deposito: ");
        double valor_deposito = sc.nextDouble();
        caixa.Deposito(valor_deposito);
        System.out.println("Atualização da conta: ");
        System.out.println(caixa);
        System.out.println();
        System.out.println("Entre com o valor do saque");
        double valor_saque = sc.nextDouble();
        caixa.Saque(valor_saque);
        System.out.println("Atualização da conta: ");
        System.out.println(caixa);

    }
}
