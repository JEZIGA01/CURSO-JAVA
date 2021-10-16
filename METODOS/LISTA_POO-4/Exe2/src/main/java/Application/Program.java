package Application;

import entities.Comanda;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas na mesa: ");
        Integer qtd_pessoa = sc.nextInt();

        System.out.println("Digite o valor da conta");
        Double valor_comanda = sc.nextDouble();

        Comanda comanda = new Comanda(qtd_pessoa,valor_comanda);

        System.out.println("Pagar gorjeta ? s/n");
        String resp = scs.nextLine();

        if (resp.equals("s")){
            System.out.println("Valor para cada com gorjeta: "+ comanda.porcGorjeta(valor_comanda));
        }else {
            System.out.println("Valor para cada com gorjeta: "+comanda.racharConta(valor_comanda));
        }
    }
}
