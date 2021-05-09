import java.util.Scanner;

public class Mask {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		
		
		/*(89) 0101 1001     numeros representados em decimais
		 *(60) 0011 1100
		 * 
		 * 
		 * Testando cada condição:
		 * 
		 * Quando utilizamos o operador &: 0001 1000 (24)
		 * Quando utilizamos o operador |: 0111 1101 (125) 
		 * Quando utilizamos o operador ^: 0110 0101 (101)
		 * */
		 System.out.println("\n");
		  System.out.println("\n");
		  
		  
		  
		 int mask =0b100000;
		 int n = sc.nextInt();
		 
		 if((n & mask) !=0){
			 System.out.println("6th bit is true !");
			 }
			 else{
				 System.out.println("6th bit is false !");
				 }
		 
	}
}

