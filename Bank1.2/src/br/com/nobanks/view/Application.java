package br.com.nobanks.view;

import javax.swing.JOptionPane;
import br.com.nobanks.model.Account;
import br.com.nobanks.model.Date;

/**
 * Main viewer class for screen
 *
 * @version 1.2
 * @author alissonfgc
 */

public class Application {

	public static void main(String[] args) {
		
		String holderName = JOptionPane.showInputDialog("Digite o nome do titular da conta: ");
		String agency = JOptionPane.showInputDialog("Digite a agência do titular da conta: ");
		int number = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: "));
		int day = Integer.parseInt(JOptionPane.showInputDialog("Dia: "));
		int mouth = Integer.parseInt(JOptionPane.showInputDialog("Mês: "));
		int year = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));

		Account acc1 = new Account(holderName, agency, new Date(mouth, day, year), number);

		// Another's accounts
//		Account acc2 = new Account("Alef", "12345-2", new Date(2, 29, 2023), 002);
//		Account acc3 = new Account("Frank", "12345-3", new Date(11, 02, 2019), 003);
//		Account acc4 = new Account("Mario", "12345-4", new Date(12, 06, 2018), 004);
//		Account acc5 = new Account("Guilherme", "12345-5", new Date(05, 07, 202), 005);
		
		//Menu for select the action
		String menuText = "Escolha uma operação\n1- Consultar saldo\n2-Realizar deposito\n3-Realizar saque\n4-Realizar tranzação\n5-Exibir dados da conta\n6-Sair";

		int option = 0;

		do {
			option = Integer.parseInt(JOptionPane.showInputDialog(menuText));
			switch(option) {
			case 1:
				//double result = ;
				JOptionPane.showMessageDialog(null, "Saldo atual: " + acc1.getBalanceACC());
				break;
			case 2:
				acc1.deposit(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que deseja depositar: ")));
				break;
			case 3:
				acc1.withdraw(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que deseja  sacar: ")));
				break;
			case 4:
				acc1.transferTo(acc1, option);
				break;
			case 5:
				JOptionPane.showMessageDialog(null, acc1.dataPrint());
				break;
			case 6:
				JOptionPane.showConfirmDialog(null, "Saindo...");
				break;				
			}
		}while (option != 6);

	}

}
