package br.com.construtores;
// importa a biblioteca de entrada de dados
	import java.util.Scanner;
	
public class Principal {

	public static void main(String[] args) {
		
		// instanciando objetos
		Scanner leia = new Scanner(System.in);
		Pessoa progamador = new Pessoa();
		Pessoa usuario = new Pessoa(1,"masculino");
		Pessoa npc = new Pessoa(2, "Leia", "999.999.999-9", "Bancaria", "Virtual", 18 );
		
		
		
		


			// entradad de dados
		System.out.println("Infome o nome da Pessoa");
		System.out.println("inform o CPF");
		System.out.println("informe a Profisao");
		System.out.println("informe o Genero");
		System.out.println("informe a Idade");
		
	}

}
