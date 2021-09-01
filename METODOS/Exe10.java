import java.util.Scanner;


public class Exe10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0, num2 = 0, num3 = 0;

        System.out.println("Digite um numero inteiro: ");
            num = sc.nextInt();
        System.out.println("Digite um numero inteiro: ");
            num2 = sc.nextInt();
        System.out.println("Digite um numero inteiro: ");
            num3 = sc.nextInt();





        System.out.println(" o maior é " + Verificar(num, num2, num3));

    }
    static int Verificar(int y, int x ) {

       return Math.max(x,y);

    }

    static int Verificar(int y, int x, int z) {

        if (y > x && y > z) {

            return y;

        }else if (z > x && z > y){
            return z ;
        }
        return x;
    } 
}
