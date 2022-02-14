package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Se for no iMac : File file = new File("/Users/user/desktop/in.txt");
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch(FileNotFoundException e) {
			System.out.println("Error opening file: "+ e.getMessage());
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
	}

}
