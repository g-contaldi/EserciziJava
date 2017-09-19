package it.dstech.somma;

public class Somma {

	public static void main(String[] args) {

		sommaWhile();
		sommaFor();
		sommaDoWhile();
	}

	public static void sommaWhile() {

		int somma = 0;
		int i = 0;

		while (i <= 30) {
			if (i % 3 == 0) {
				somma += i;
			}
			i++;
		}
		System.out.println("La somma degli interi da 0 a 30 divisibili per 3 utilizzando il while è: " + somma);
	}

	public static void sommaFor() {

		int somma = 0;

		for (int i = 0; i <= 30; i++) {
			if (i % 3 == 0) {
				somma += i;
			}
		}
		System.out.println("La somma degli interi da 0 a 30 divisibili per 3 utilizzando il for è: " + somma);
	}

	public static void sommaDoWhile() {

		int somma = 0;
		int i = 0;
		do {
			if (i % 3 == 0) {
				somma += i;
			}
			i++;
		} while (i <= 30);
		System.out.println("La somma degli interi da 0 a 30 divisibili per 3 utilizzando il do while è: " + somma);
	}

}