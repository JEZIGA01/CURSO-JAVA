/*
 * FORMATAR : 
 * toLowerCase() transformar para minusculo
 * toUpperCase() transformar para maisculo
 * trim()        remover espaços
 * 
 * RECORTAR:
 * substring(inicio)
 * substring(inicio e fim)
 * 
 * SUBSTITUIR:
 * Replace(char, char) 
 * Replace(string, string)
 * 
 * BUSCAR:
 * indexOf
 * LastIndexOf
 * 
 * RECORTA STRING COM BASE NO SEPARADOR QUE USAR
 * str.Split("")
 * */

public class modificarPalavras {
	
	public static void main (String[] args) {
		
		
		   String original = "estou aprendendo JAVA NA FACULDADE /  twitch";
		
		  String s01 = original.toLowerCase();
		  String s02 = original.toUpperCase();
		  String s03 = original.trim();
		  String s04 = original.substring(2);//pegar do 2 em diante  que seria "es"tou
		  String s05 = original.substring(2,9);// vai recortar a partir do 2 até o 9 para tras "es"tou apr"endendo" contando tbm os espaços
		  String s06 = original.replace('a', 'x');// trocar a para x se o A estiver maiusculo ele n reconhece
		  String s07 = original.replace("twitch", "site roxo ");// TBM FUNCIONA PARA SUBSTRING
		  int i = original.indexOf("VA");// n contou o espaço
		  int k = original.lastIndexOf("NA");// n contou o espaço
		  
		  
		  
		System.out.println("ORIGINAL - "+ original + "-");
		System.out.println("\n");
		
		System.out.println("com toLowerCase - "+ s01 + "-");
		System.out.println("\n");
		 
		System.out.println("com toUpperCase - "+ s02 + "-");
		System.out.println("\n");
		 
		System.out.println("com trim() - "+ s03 + "-");
		System.out.println("\n");
		 
		System.out.println("com substring(2) - "+ s04 + "-");
		System.out.println("\n");
		 
		System.out.println("com substring(2 a 9) - "+ s05 + "-");
		System.out.println("\n");
		 
		System.out.println("com replace char- "+ s06 + "-");
		System.out.println("\n");
		 
		System.out.println("com replace string - "+ s07 + "-");
		System.out.println("\n");
		
		System.out.println("Index of 'en' "+ i );
		System.out.println("Last Index of 'en' "+ k );
		System.out.println("\n");
		
		
		System.out.println("Usando a funcao split()");
		//
		//
		System.out.println("\n");
		String s = "meu adc batata";
		
		String[] vect = s.split(" "); // usando espaço em branco como separador
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		System.out.println("Aprendendo vetores ");
		System.out.println("\n");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
		
	}
}

