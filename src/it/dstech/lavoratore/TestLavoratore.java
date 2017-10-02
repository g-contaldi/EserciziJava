package it.dstech.lavoratore;

import java.util.Scanner;

public class TestLavoratore {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		lavoratore();
	}

	private static void lavoratore() {
		Lavoratore lavoratore;
		System.out.println("Inserisci nome: ");
		String nome = input.nextLine();

		System.out.println("Inserisci livello: 3/4/5/6");
		int livello = input.nextInt();

		System.out.println("Hai gli straordinari pagati?(s/n)");
		String risp = input.next().toLowerCase();

		if ((risp.equals("s"))) {
			System.out.print("Inserisci numero ore straordinario: ");
			int ore = input.nextInt();
			lavoratore = new LavoratoreConStraordinariPagati(nome, livello, ore);
		} else
			lavoratore = new Lavoratore(nome, livello);

		lavoratore.stampaStipendio();

		System.out.println("************");
		System.out.println("Inserire un altro lavoratore?(s/n)");
		String risposta = input.next().toLowerCase();
		input.nextLine();

		if ((risposta.equals("s"))) {
			lavoratore();
		} else {
			System.out.println("***ARRIVEDERCI***");
			input.close();
		}
	}
}
