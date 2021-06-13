package br.inatel.dm102;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Random randomGenerator = new Random();
		int ramdonNumber = randomGenerator.nextInt(10) + 1;

		System.out.println("Make a guess (between 1 to 10): ");
		int numberGuessed = sc.nextInt();

		while (numberGuessed != ramdonNumber) {
			System.out.println("That's wrong! Try again: ");
			numberGuessed = sc.nextInt();
		}

		System.out.println("*** CONGRATULATIONS! ***");
		System.out.println("That is correct!");
		System.out.println("The hidden random number was: " + ramdonNumber);
		sc.close();

	}

}
