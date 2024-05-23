package br.com.app;

import br.com.entities.*;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acc1 = new Account("Alisson", "12345-6", new Date(12, 05, 2024), 001);
		Account acc2 = new Account("Alef", "12345-7", new Date(30, 07, 2020), 002);
		Account acc3 = new Account("Helio", "12345-8", new Date(02, 11, 2019), 003);
		Account acc4 = new Account("Jão", "12345-9", new Date(06, 12, 2018), 004);
		
		System.out.println(acc1.getOpenDateACC());
		
		System.out.println(acc1.dataPrint());
		System.out.println(acc2.dataPrint());
		System.out.println(acc3.dataPrint());
		System.out.println(acc4.dataPrint());
		
		System.out.print("Deposito conta 1: ");
		acc1.deposit(sc.nextDouble());
		
		System.out.println(acc1.dataPrint());
		
		System.out.print("Saque da conta 1: ");
		acc1.withdraw(sc.nextDouble());
		
		System.out.println(acc1.dataPrint());
		
		System.out.print("Valor para transferir: ");
		double value = sc.nextDouble();
		
		System.out.println("Conta que vai receber transferencia: 4");
		
		
		System.out.println("Saldos anteriores: ");
		System.out.println(acc1.dataPrint());
		System.out.println(acc4.dataPrint());
		
		//acc = acc4;
		
		acc1.transferTo(acc4, value);
		
		System.out.println("Saldos atualizados: ");
		System.out.println(acc1.dataPrint());
		System.out.println(acc4.dataPrint());
		
		//System.out.println(acc3.getTotalAccounts());
		
		sc.close();

	}

}
