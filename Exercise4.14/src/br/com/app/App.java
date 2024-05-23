package br.com.app;

import br.com.entities.*;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person usr = new Person();
		
		String loop = "s";
		
		usr.setName("Alisson Fernandes");
		
		System.out.println("Nome: " + usr.getName() + "Idade: " + usr.getAge());
		
		while (loop.equalsIgnoreCase("s")) {
			System.out.print("Deseja fazer aniversario? (s/n): ");
			loop = sc.nextLine();
			
			if (loop.equalsIgnoreCase("s")) {
				usr.doBirthday();
				System.out.println("Nome: " + usr.getName() + " Idade: " + usr.getAge());
				System.out.println("Fez aniversario!");
			} else {
				System.out.println("__________________________");
				System.out.println("Nome: " + usr.getName() + " Idade: " + usr.getAge());
				
			}
		}
		sc.close();
	}

}
