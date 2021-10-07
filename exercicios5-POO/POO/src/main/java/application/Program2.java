package application;

import entities.Product;

import java.util.Scanner;
/*utilizando o this*/

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);


        System.out.println("Entre com os dados do produto: ");
        System.out.print("Nome: ");
        String nome = scs.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        Product produto = new Product(nome,preco,quantidade);

        System.out.print(produto+ "\n");
        System.out.print("Entre com um numero de produto para adicionar ao estoque: ");
        quantidade = sc.nextInt();
        produto.addProdutos(quantidade);
        System.out.print("Dados atualizados : "+ produto + "\n");
        System.out.print("Entre com um numero de produto para remover do estoque: ");
        quantidade = sc.nextInt();
        produto.removeProdutos(quantidade);
        System.out.print(produto+ "\n");

    }
}
