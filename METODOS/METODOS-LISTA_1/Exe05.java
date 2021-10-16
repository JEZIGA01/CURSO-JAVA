import java.util.Arrays;
import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Entre com o valor a ");
        double a = sc.nextDouble();
        System.out.println("Entre com o valor b ");
        double b = sc.nextDouble();
        System.out.println("Entre com o valor c ");
        double c = sc.nextDouble();

       Exibir(Equacao(a,b,c));

    }

    static double Delta(double a,double b,double c){

        return   Math.pow(b,2) - 4*a*c;
    }
    static  boolean Verifica(double a){

        return a != 0 ;
    }
    static double[] Equacao(double a, double b, double c){


        int raiz = 0;
       double d = Delta(a,b,c);
       if( !Verifica(a) || d < 0.0 ){

           return null;
       }if(d > 0){
           raiz = 2;
        }else{
           raiz = 1;
        }

       double  vetor [] = new double[raiz];
       if (d > 0){

           vetor[0] = (-b + Math.sqrt(d))/2*a;
           vetor[1] = (-b - Math.sqrt(d))/2*a;

       }else{
           vetor[0]= -b /2*a;
       }


       return vetor ;
    }
    static void Exibir(double [] array ){

        System.out.println(Arrays.toString(array));

    }


}
 
