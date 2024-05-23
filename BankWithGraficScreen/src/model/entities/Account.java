package model.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Class Account
 *
 * @author alissonfgc
 */

public class Account {
	private int idACC;
	// private int password;
	private String holderNameACC;
	private String agencyACC;
	private LocalDateTime openDateACC;
	private double balanceACC;
	private int numberACC;
	// private String cpf;
	private static int totalAccounts;
	static DateTimeFormatter formatedDatePTBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	// Constructor
	public Account(String holderName, String agency, int number, LocalDateTime openDate, double balance) {
		Account.this.setHolderNameACC(holderName);
		Account.this.setAgencyACC(agency);
		Account.this.setOpenDateACC(openDate);
		Account.this.setNumberACC(number);
		Account.this.setBalanceACC(balance);
		Account.setTotalAccounts(this.getTotalAccounts() + 1);
		Account.this.setIdACC(this.getTotalAccounts());

	}

	// Methods getters and setters
	/*
	 * private int getPassword() { return idACC; }
	 * 
	 * private void setPassword(int password) { this.password = password; }
	 */

	public int getIdACC() {
		return idACC;
	}

	private void setIdACC(int id) {
		this.idACC = id;
	}

	public String getHolderNameACC() {
		return holderNameACC;
	}

	private void setHolderNameACC(String name) {
		this.holderNameACC = name;
	}

	public String getAgencyACC() {
		return agencyACC;
	}

	private void setAgencyACC(String agency) {
		this.agencyACC = agency;
	}

	public LocalDateTime getOpenDateACC() {
		return openDateACC;
	}

	private void setOpenDateACC(LocalDateTime openDate) {
		this.openDateACC = openDate;
	}

	public double getBalanceACC() {
		return balanceACC;
	}

	private void setBalanceACC(double balance) {
		this.balanceACC = balance;
	}

	public int getNumberACC() {
		return numberACC;
	}

	private void setNumberACC(int number) {
		this.numberACC = number;
	}

	/*
	 * public String getCpf() { return cpf; }
	 * 
	 * private void setCpf(PrivatePerson cpf) { this.cpf = Piv; }
	 */

	public int getTotalAccounts() {
		return Account.totalAccounts;
	}

	private static void setTotalAccounts(int totalAccounts) {
		Account.totalAccounts = totalAccounts;
	}

	// Others methods
	public boolean withdraw(double amount) {
		if (this.balanceACC < amount) {
			return false;
		} else {
			double newBalance = this.balanceACC - amount;
			this.balanceACC = newBalance;
			return true;
		}

	}

	public boolean deposit(double amount) {
		if (this.balanceACC < 0) {
			return false;
		} else {
			this.balanceACC += amount;
			return true;
		}

	}

	public boolean transferTo(Account destiny, double value) {
		boolean withdrew = this.withdraw(value);
		if (withdrew == false) {
			return false;
		} else {
			destiny.deposit(value);
			return true;
		}
	}

	public double getIncome() {
		return balanceACC + balanceACC * 0.1;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("\nDados do usuário:\n");
		sb.append("\nAgência: " + Account.this.getAgencyACC() + "\n");
		sb.append("\nNúmero: " + Account.this.getNumberACC() + "\n");
		sb.append("\nTitular: " + Account.this.getHolderNameACC() + "\n");
		sb.append("\nSaldo: " + Account.this.getBalanceACC() + "\n");

		return sb.toString();

	}
}
