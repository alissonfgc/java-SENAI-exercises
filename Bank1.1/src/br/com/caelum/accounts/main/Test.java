package br.com.caelum.accounts.main;

import java.util.Scanner;

import br.com.caelum.accounts.model.*;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acc1 = new Account("Alisson", "12345-1", new Date(05, 12, 2024), 001);
		Account acc2 = new Account("Alef", "12345-2", new Date(2, 29, 2023), 002);
		Account acc3 = new Account("Helio", "12345-3", new Date(11, 02, 2019), 003);
		Account acc4 = new Account("Jão", "12345-4", new Date(12, 06, 2018), 004);
		Account acc5 = new Account("Guilherme", "12345-5", new Date(05, 07, 202), 005);

		// Print Accounts info
		System.out.println(acc1.dataPrint());
		System.out.println(acc2.dataPrint());
		System.out.println(acc3.dataPrint());
		System.out.println(acc4.dataPrint());
		System.out.println(acc5.dataPrint());

		// Method deposit
		System.out.print("Deposito conta 1: ");

		if (acc1.deposit(sc.nextDouble()) == true) {
			System.out.println("-Deposito realizado com sucesso!-\n");
		} else {
			System.out.println("-Deposito falhou-\n");
		}

		// Print Account info
		System.out.println(acc1.dataPrint());

		// Method withdraw
		System.out.print("Saque da conta 1: ");
		if (acc1.withdraw(sc.nextDouble()) == true) {
			System.out.println("-Saque realizado com sucesso!-\n");
		} else {
			System.out.println("-Saque falhou-\n");
		}

		// Print Account info
		System.out.println(acc1.dataPrint());

		System.out.print("Valor a transferir p/ conta 4: ");
		double value = sc.nextDouble();

		// Print Accounts info
		System.out.println("Saldos anteriores: ");
		System.out.println(acc1.dataPrint());
		System.out.println(acc4.dataPrint());

		// Method transferTo
		if (acc1.transferTo(acc4, value) == true) {
			System.out.println("-Transferência realizada com sucesso!-\n");
			System.out.println("Saldos atualizados: ");
			System.out.println(acc1.dataPrint());
			System.out.println(acc4.dataPrint());
		} else {
			System.out.println("-Transferência falhou-");
		}

		// Value of variable static totalAccounts
		System.out.println("Total de contas: " + acc3.getTotalAccounts());
		
		// Method

		// Method validateCPF
		sc.nextLine();
		System.out.print("Digite o cpf (Somente números): ");
		String cpf = sc.nextLine();
		String formatedCPF = cpf.substring(0, 3) + "." + (cpf.substring(3, 6)) + "." + (cpf.substring(6, 9)) + "-"
				+ (cpf.substring(9, 11));

		PrivatePerson pp = new PrivatePerson(formatedCPF);
		System.out.println(pp.validateCPF());

		sc.close();
	}

}