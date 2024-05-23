package br.com.cinema;
 import java.util.Scanner;
 
public class Cinema {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// Recebe o nome e a idade do usuário
        System.out.print("Digite seu nome: ");
        String nomeUsuario = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idadeUsuario = scanner.nextInt();
        
     // Lista de filmes e suas classificações indicativas
        
        
        String[] filmes = {
            "Vingadores: Ultimato (16 anos)",
            "Toy Story 4 (Livre)",
            "Velozes & Furiosos 10 (14anos)",
            "O Poderoso Chefão (19anos)",
            "Top Gun: Maverick (12 anos)"
        };
        
     // Exibe a lista de filmes
        
        
        System.out.println("\nFilmes disponíveis:");
        for (int i = 0; i < filmes.length; i++) {
            System.out.println((i + 1) + ". " + filmes[i]);
        }
        
        // Solicita ao usuário escolher um filme
        
        
        System.out.print("\nEscolha o número do filme desejado: ");
        int escolhaFilme = scanner.nextInt();
        
     // Verifica se o usuário tem idade mínima para assistir o filme escolhido
        
        
        boolean temIdadeMinima = false;
        switch (escolhaFilme) {
            case 1:
                temIdadeMinima = idadeUsuario >= 16;
                break;
            case 2:
                temIdadeMinima = true; // Livre para todas as idades
                break;
            case 3:
                temIdadeMinima = idadeUsuario >= 10;
                break;
            case 4:
                temIdadeMinima = idadeUsuario >= 19;
                break;
            case 5:
                temIdadeMinima = idadeUsuario >= 12;
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        
        // Imprime o ingresso ou exibe mensagem de restrição
        
        if (temIdadeMinima) {
            System.out.println("\nIngresso para " + nomeUsuario + ":");
            System.out.println(filmes[escolhaFilme - 1]);
            System.out.println("Aproveite o filme!");
        } else {
            System.out.println("\nDesculpe, você não tem idade mínima para assistir a este filme.");
        }
        	
     // Encerra o programa
        
        scanner.close();

		

	}

}
