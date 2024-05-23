package br.com.heranca;

import java.util.Scanner;

public class Principal {

		public static void main(String[] args) {

			Scanner leia = new Scanner(System.in);
			PessoaFisica usuario = new PessoaFisica();
			PessoaJuridica empresa = new PessoaJuridica();
			
			
			//entrada de dados da pessoa fisica
			
			System.out.println("informe o nome:");
			usuario.nome = leia.nextLine();
			System.out.println("infome o cpf:");
			usuario.cpf = leia.nextLine();
			System.out.println("informe o endereco:");
			usuario.endereco = leia.nextLine();
			System.out.println("infome o telefone:");
			usuario.telefone = leia.nextLine();
			System.out.println("informe o email:");
			usuario.email = leia.nextLine();
			
			// entrada de dados da pessoa juridica 
			
			System.out.println("infome a Razão Social da empresa:");
			empresa.razaoSocial = leia.nextLine();
			System.out.println("infome o nome fantasia:");
			empresa.nomeFantasia = leia.nextLine();
			System.out.println("Informe o CNPJ:");
			empresa.cnpj = leia.nextLine();
			System.out.println("Iforme o Endereço da empresa:");
			empresa.endereco = leia.nextLine();
			System.out.println("");
		
	}

}
