package it.dstech.somma;

import java.util.Scanner;

public class SommaScanner {

	private static int number;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un numero");

		number = input.nextInt();

		sommaWhile();
		sommaFor();
		sommaDoWhile();

		input.close();
	}

	public static void sommaWhile() {

		int somma = 0;
		int i = 0;

		while (i <= number) {
			if (i % 3 == 0) {
				somma += i;
			}
			i++;
		}
		System.out.println(
				"La somma degli interi da 0 a " + number + " divisibili per 3 utilizzando il while e' " + somma);
	}

	public static void sommaFor() {

		int somma = 0;

		for (int i = 0; i <= number; i++) {
			if (i % 3 == 0) {
				somma += i;
			}
		}
		System.out
				.println("La somma degli interi da 0 a " + number + " divisibili per 3 utilizzando il for e' " + somma);
	}

	public static void sommaDoWhile() {

		int somma = 0;
		int i = 0;

		do {
			if (i % 3 == 0) {
				somma += i;
			}
			i++;
		} while (i <= number);

		System.out.println(
				"La somma degli interi da 0 a " + number + " divisibili per 3 utilizzando il do while e' " + somma);
	}

}
