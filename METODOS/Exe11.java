import java.util.Scanner;

/*

*/
public class Exe11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);

        int num = 0, num2 = 0, num3 = 0;
        String resp = "s";
        boolean ok = true;

        do {
            ok=true;
            System.out.println("Digite um numero inteiro: ");
            num = sc.nextInt();
            System.out.println("quer continuar s/n: ");
            resp = scs.nextLine();
            if(resp.equals("n")){
                ok=false;
                System.out.println(" o menor é " + Verificar(num, num2, num3));
            }
        } while (resp != "s");

     
        sc.close();
        scs.close();
    }

    static int Verificar(int y, int x) {

        return Math.max(x, y);

    }

    static int Verificar(int y, int x, int z) {

        if (y > x && y > z) {

            return y;

        } else if (z > x && z > y) {
            return z;
        }
        return x;
    }
}
