package br.com.construtor;

// importar biblioteca de entrada de dados
	import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// instacia de objetos
		Scanner leia = new Scanner(System.in);
		Pessoa usuario = new Pessoa(2, "feminino");
		
		//entraqda de dados do usuário
		
		System.out.println("Informe o nome:");
		usuario.nome = leia.nextLine();
		System.out.println("Informe o CPF:");
		usuario.cpf = leia.nextLine();
		System.out.println("Informa a cidade:");
		usuario.cidade = leia.nextLine();
		System.out.println("Informe a profissão:");
		usuario.profissao = leia.nextLine();
		System.out.println("Informe a idade:");
		usuario.idade = leia.nextLine();
		
		//definir os dados do npc
		
		npc.nome = "leia";
		npc.idade = 18;
		npc.cidade = "Taguatinga";
		npc.cpf = "123.456.789.-12";
		npc.profissao = "Bancária";
		
		// saida de dados do 
		System.out.println();
		
		// saidad de dados do npc
		
		System.out.println("Nome do NPC:" + npc.nome + ".");
		System.out.println("ID do NPC:");

	}

}
