package br.com.cauculadora;

//importar classe scanner 
import java.util.Scanner;

public class Cauculadora {

	public static void main(String[] args) {
		
		//instancia objeto
		Scanner leia = new Scanner(System.in);
		
		double x, y, result;
		int opcao;
		
		//faça enquanto
		do {
			
			
			//entada de dados
			
			System.out.println(" informe o 1° numero:");
			x = leia.nextDouble();
			System.out.println("iforme o 2° numero:");
			y = leia.nextDouble();
			
			//lipeza de buffe
			leia.nextLine();
			
			// mostra as opções 
			System.out.println("escolha uma opção:");
			System.out.println("1 - Soma.");
			System.out.println("2 Subtração");
			System.out.println("3 Multiplicação");
			System.out.println("4 Divisão");
			System.out.println("5 Sair");
			opcao = leia.nextInt();
			
			//escolha...caso
			switch (opcao) {
			case 1:
				result = x + y;
				System.out.println(" A soma é. " + result + ".");
				break;
			case 2:
				result =x + y;
				System.out.println(" A subtração. é " + result + ".");
				break;
			case 3:
				result = x = y;
				System.out.println(" A Mutiplicação. é " + result + ".");
				break;
			case 4:
				result = x + y;
				System.out.println(" A divisão. é. " + result + ".");
				break;
			case 5:
				System.out.println(" Progama encerrado. ");
				break;
				default:
					System.out.println("Opção invalida.");
					break;
			}
		} while (opcao != 5 );
		
	}

}
