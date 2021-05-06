
import java.util.Scanner;


public class Exe03 {
	
	public static void main (String[] args) {
		
Scanner sc = new Scanner (System.in);
		
		
		double media = 0;
		
		
		 int N = sc.nextInt() ;
		 
		 for ( int i = 1 ; i <= N ; i++){
			
			 double a  = sc.nextDouble() ;
		  double b = sc.nextDouble() ;
		   double c = sc.nextDouble() ;
		   
		 media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
		 
		  System.out.printf(" Media : %.2f%n  " , media );

		
		
	}

               
			
}

}
