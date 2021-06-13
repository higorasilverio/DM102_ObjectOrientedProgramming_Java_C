package br.inatel.dm102;

import java.util.Locale;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		Account acc = new Account();
		acc.setClient("Higor Silvério");
		acc.setBalance(500.00);
		System.out.println("Welcome, " + acc.getClient() + "!");
		System.out.println("Your current balance is: $" + acc.getBalance());
		int bankOption, leaveOption;
		double value;
		boolean exit;
		do {
			System.out.println();
			System.out.println("What do you want to do? ");
			System.out.println("1 - Withdraw");
			System.out.println("2 - Deposit");
			System.out.println("3 - Check balance");
			System.out.println();
			bankOption = sc.nextInt();
			switch (bankOption) {
			case 1: {
				System.out.println();
				System.out.print("Enter withdraw value: $");
				value = sc.nextDouble();
				acc.withdraw(value);
				break;
			}
			case 2: {
				System.out.println();
				System.out.print("Enter deposit value: $");
				value = sc.nextDouble();
				acc.deposit(value);
				break;
			}
			case 3: {
				System.out.println();
				System.out.print("Your current balance is: $" + acc.getBalance());
				System.out.println();
				break;
			}
			default:
				System.out.println();
				System.out.println("That is an invalid option!");
				System.out.println();
			}
			System.out.println("Do you want anything else? ");
			System.out.println("1 - Yes");
			System.out.println("2 - Exit bank");
			leaveOption = sc.nextInt();
			exit = leaveOption == 1;
		} while (exit);
		System.out.println();
		System.out.println("Thanks for using our bank system!");
		sc.close();

	}

}
