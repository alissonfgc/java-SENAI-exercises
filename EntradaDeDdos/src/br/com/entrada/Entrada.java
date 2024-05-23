package br.com.entrada;

// importar biblioteca para entrada de dados  
import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// intacia os objetos
		pessoa human = new Pessoa();
		Pessoa npc = new pessoa();
		Scanner leia = new Scanner(System.in);
		
		//entrada de dados
		System.out.println("Informe o nome do humano:");
		humano.nome = leia.nextLine();
		System.out.println("informe a idade do humano:");
		humano.idade = leia.nextInt();
		System.out.println("informe a cidade do humano:");
		humano.cidade = leia.nextLine();
		
		//informar dados do npc
		npc.nome = "Nathyla Dochorn";
		npc.idade = 25;
		npc.cidade = "alexania";
		npc.profissao = "fantamas";
		//saida de dados 
		
		huamno.apresentar();
		npc.apresentaCumprimento(humano.nome)
		humano.responde
		
		
	
		
	}
	
	

}
