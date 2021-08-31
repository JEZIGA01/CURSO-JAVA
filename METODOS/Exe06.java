import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num = 0;
        System.out.println("Digite um numero double : ");
        num = sc.nextDouble();

        System.out.println(isPositivo(num)? " positivo ": " negativo");

    }

    static boolean isPositivo(double x) {

        return x >= 0 ;

    }
}