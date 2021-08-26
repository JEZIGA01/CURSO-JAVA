
import java.util.Scanner;

public class Exe04 {

    public static void main(String[] args) {

        // int calculo = (int) ((Math.pow(b, 2)) - (4*a*c));

        Scanner sc = new Scanner(System.in);


        System.out.println("Entre com o valor a ");
        double a = sc.nextDouble();
        System.out.println("Entre com o valor b ");
        double b = sc.nextDouble();
        System.out.println("Entre com o valor c ");
        double c = sc.nextDouble();

        System.out.println("Delta "+Calc(a,b,c));

    }

    static double Calc(double a,double b,double c){

        return  Math.pow(b,2) - (4*a*c);
    }
}
