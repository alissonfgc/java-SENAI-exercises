package br.com.maioridade;

//importar biblioteca para entrada de dados
import java.util.Scanner;

public class Maioridade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciar objetos 
		Scanner leia = new Scanner(System.in);
		Pessoa usuario = new Pessoa();
		
		//declaração de variaveis
		boolean entrada;
		
		//entrada de dados
		System.out.println("informe o nome");
		usuario.nome = leia.nextLine();
		System.out.println("infome a idade:");
		usuario.idade = leia.nextInt();
		
		//verificar a idade do usuario
		if (usuario.idade >=18) {
			System.out.println("entrada liberada!");
			entrada = true;
			usuario.brigar(entrada);
		}
		else {
			System.out.println("entrada negada!");
			entrada = false;
			usuario.brigar(entrada);

		}
		
		//fechar objeto scanner
		leia.close();
	}
		
}
