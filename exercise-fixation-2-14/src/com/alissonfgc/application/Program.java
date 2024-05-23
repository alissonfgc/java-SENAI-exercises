package com.alissonfgc.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.alissonfgc.entities.ImportedProduct;
import com.alissonfgc.entities.Product;
import com.alissonfgc.entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int qnt = sc.nextInt();
		sc.nextLine();
		int i;
		
		List<Product> products = new ArrayList<>();
		
		for (i =1; i <= qnt; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			String option = sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			sc.nextLine();
			
			
			
			if(option.equals("c")) {
				
				products.add(new Product(name, price));
				
			} else if(option.equals("u")) {
				
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate manufactureDate = LocalDate.parse(sc.nextLine(), fmt);
				
				products.add(new UsedProduct(name, price, manufactureDate));
			
			} else if(option.equals("i")) {
				
				System.out.print("Custom fee: ");
				Double customsFee = sc.nextDouble();
				sc.nextLine();
				
				products.add(new ImportedProduct(name, price, customsFee));				
				
			} else {
				System.out.println("Opção inválida");
			}
			
		}
		
		System.out.println("\nPRICE TAGS:");
		
		for (Product p : products) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
		
		
	}

}
