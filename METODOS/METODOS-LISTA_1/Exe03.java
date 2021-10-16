import java.util.Scanner;

public class Exe03 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        double num = 0;

        System.out.println("Digite um numero double : ");
        num = sc.nextDouble();

        System.out.println(Verificar2(num));

    }

    static boolean VerificarZero(double x) {

        return (x == 0);

    }

    static boolean Verificar(double x) {

        return (x >= 0);

    }

    static String Verificar2(double x) {

        if (VerificarZero(x)) {
            return ("É zero");
        } else if (Verificar(x)) {
            return ("É positivo");
        } else {
            return ("É negativo");
        }


    }
} 
