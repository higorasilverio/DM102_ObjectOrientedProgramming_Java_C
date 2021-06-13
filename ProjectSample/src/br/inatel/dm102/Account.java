package br.inatel.dm102;

public class Account {

	private String client;
	private Double balance;

	public Account(String client, Double balance) {
		this.client = client;
		this.balance = balance;
	}

	public Account() {
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void withdraw(double value) {
		if (this.balance > value) {
			this.balance -= value;
			System.out.println("Withdraw successfull!");
			System.out.println();
		} else
			System.out.println("Withdraw fail: Not enough balance!");
		System.out.println();
	}

	public void deposit(double value) {
		this.balance += value;
		System.out.println("Deposit successfull!");
		System.out.println();
	}

}
