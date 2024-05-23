package br.com.tremfantasma;
	
	// importa clsasse scanenr
	import java.util.Scanner;
	
public class TremFantasma {

	public static void main(String[] args) {
		
		//instancia objeto
		Scanner leia = new Scanner(System.in);
		Pessoa pagante = new Pessoa();
		
		//entrada de dados 
		System.out.println("Informe o nome:");
		pagante.nome = leia.nextLine();
		System.out.println("Informe a idade:");
		pagante.idade = leia.nextInt();
		System.out.println("Informe a altura:");
		pagante.altura = leia.nextDouble();
		
		//verificar idade e altura 
		if(pagante.idade >= 12 && pagante.altura >=  1.2) {
	    //verificar idade e altura
			System.out.println("Pague o valor de R$ 15,00");
			pagante.dinheiro = leia.nextDouble();
			System.out.println(pagante.pagar(pagante.dinheiro));
		}
		else {
			System.out.println("entrada proibida");
		}
		
	}

}
