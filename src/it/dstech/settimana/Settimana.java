package it.dstech.settimana;

import java.util.Scanner;

public class Settimana {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		stampaGiorno();
	}

	private static void stampaGiorno() {
		int giorno = 0;
		boolean exit = false;
		do {
			System.out.println(
					"Inserisci numero da 1 a 7 per stampare il nome del giorno per esteso, oppure 8 per terminare:");
			giorno = input.nextInt();
			input.nextLine();

			switch (giorno) {

			case 1:
				System.out.println("Lunedi");
				break;
			case 2:
				System.out.println("Martedi");
				break;
			case 3:
				System.out.println("Mercoledi");
				break;
			case 4:
				System.out.println("Giovedi");
				break;
			case 5:
				System.out.println("Venerdi");
				break;
			case 6:
				System.out.println("Sabato");
				break;
			case 7:
				System.out.println("Domenica");
				break;
			case 8:
				System.out.println("Grazie per l'utilizzo");
				exit = true;
				break;
			default:
				stampaGiorno();
			}
		} while (!exit);
	}
}