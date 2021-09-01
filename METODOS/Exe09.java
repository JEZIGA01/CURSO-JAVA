import java.util.Scanner;

public class Exe09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, num2;
        System.out.println("Digite um numero inteiro: ");
        num = sc.nextInt();
        System.out.println("Digite um numero inteiro: ");
        num2 = sc.nextInt();

        System.out.println(" o menor é " + Verificar(num, num2));

    }

    static int Verificar ( int x, int y){

        return Math.min(x,y);

    }
}


