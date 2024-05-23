package com.imc;

import java.util.Scanner;


public class IMC {

	public static void main(String[] args) {
		
		
		// instacia os objetos
		
		Scanner leia = new Scanner(System.in);
		Pessoa paciente = new Pessoa();
		
		//entrada de dados
		
		System.out.println("infome o nome:");
		paciente.nome = leia.nextLine();
		System.out.println("informe o peso em kg:");
		paciente.peso = leia.nextDouble();
		System.out.println("informe a altura em metros:");
		paciente.altura = leia.nextDouble();
		
		
		//saida de dados
		
		System.out.println("O IMC do" + paciente.nome + " é " + String.format("%.2f , paciente.imc") + ".");
		System.out.println(paciente.receberDiagnostico(paciente.imc));
		
		
		
		
		
		
		
	}

}
