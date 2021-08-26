
public class Exe02 {
	
		public static void main (String[] args) {
		
		
		int matriz [][] = new int[6][3];
			
		
		for(int  i = 0; i < matriz.length; i++){
			
			for(int  j = 0; j < matriz[i].length; j++){
			
	System.out.print( matriz[i][j]+ " ");
			
			}
			
			System.out.println();	
			}
			System.out.println();
			System.out.println("Matriz invertida \n");
			for( int i = matriz.length-1; i >=0;  i--){
			
			for(int j = matriz[i].length-1; j  >=0;  j--){
			
	System.out.print( matriz[i][j]+ " ");
			
			}
			System.out.println();	
		}
		
	}
}

		

