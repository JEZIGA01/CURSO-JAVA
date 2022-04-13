package application;

import entities.PrintService;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        //Generics permitem que classes, interfaces e metodos
        // possam ser parametrizados por tipo.

        Scanner sc = new Scanner(System.in);
        PrintService<Integer> ps = new PrintService<>();

        System.out.print("Quantos numeros deseja inserir? ");
       int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int value = sc.nextInt();
            ps.addValue(value);
        }
        ps.print();
        System.out.println("");
        Integer x = ps.first();
       System.out.println("First: "+ x);
    }
}
