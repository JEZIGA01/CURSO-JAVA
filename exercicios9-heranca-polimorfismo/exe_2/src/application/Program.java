package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		Scanner scS = new Scanner(System.in); 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


		List<Product> list = new ArrayList<>();

		System.out.print("Digite a quantidade de produtos a ser registrada: ");
		Integer quantidade = sc.nextInt();

		for (int i = 1; i <= quantidade; i++) {

			System.out.println("Novo,usado ou importado [n/u/i]");
			char type = sc.next().charAt(0);
			System.out.println("Digiteo nome do produto: ");
			String name = scS.nextLine();
			System.out.println("Digite o preco do produto: ");
			Double price = sc.nextDouble();  
			
			if(type == 'i') {
				System.out.println("Digite a taxa: ");
				Double customsFee = sc.nextDouble();  
				list.add(new ImportedProduct(name,price,customsFee));
			}
			
			else if(type =='u') { 
				System.out.print("Data de fabricacao (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));
			}
			
			else { 
				list.add(new Product(name, price));
			}
			   
		} 
		System.out.println("**** Lista de produtos ***** "); 
		 
			for( Product prod: list) {
				 System.out.print(prod.priceTag()  +"\n"); 
		 
		 }
	}

}