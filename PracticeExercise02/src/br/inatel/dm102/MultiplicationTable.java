package br.inatel.dm102;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int base, number1, number2;

		System.out.print("Choose number to multiply (between 0 - 10): ");
		base = sc.nextInt();

		if (verifyValidNumber(base)) {
			System.out.println("Choose two numbers, to start and finish the multiplication (between 0 - 10): ");
			System.out.print("Enter first number: ");
			number1 = sc.nextInt();
			System.out.print("Enter second number: ");
			number2 = sc.nextInt();

			if (verifyValidNumber(number1) && verifyValidNumber(number2)) {
				if (number1 <= number2) {
					showMultiplicationTable(base, number1, number2);
				} else {
					showMultiplicationTable(base, number2, number1);
				}
			} else
				showErrorMessageInvalidNumber();
		} else
			showErrorMessageInvalidNumber();
		sc.close();
	}

	private static boolean verifyValidNumber(int number) {
		return number >= 0 && number <= 10;
	}

	private static void showMultiplicationTable(int number, int start, int finish) {
		for (int i = 0; i <= finish; i++) {
			if (i >= start && i <= finish) {
				System.out.println(number + " * " + i + " = " + number * i);
			}
		}
	}

	private static void showErrorMessageInvalidNumber() {
		System.out.println("Invalid number inserted!");
	}

}
