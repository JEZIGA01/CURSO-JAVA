import java.util.Scanner;

public class Exe02 {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        double num = 0;

        System.out.println("Digite um numero double : ");
        num = sc.nextDouble();

        System.out.println(Verificar(num)? "O numero é "+num : "O numero "+ num+ " não é zero ");

    }
    static boolean Verificar(double x ){

        return (x == 0);

    }
}