package it.dstech.operazioni;

import java.util.Scanner;

public class Operazioni {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci il primo numero");
		int n1 = input.nextInt();
		input.nextLine();

		System.out.println("Inserisci il secondo numero");
		int n2 = input.nextInt();
		input.nextLine();

		System.out.println("Il risultato della somma e' " + somma(n1, n2));
		System.out.println("Il risultato della sottrazione e' " + sottrazione(n1, n2));
		System.out.println("Il risultato della moltiplicazione e' " + moltiplicazione(n1, n2));
		System.out.println("Il risultato della divisione e' " + divisione(n1, n2));

		input.close();
	}

	public static int somma(int n1, int n2) {
		return n1 + n2;
	}

	public static int sottrazione(int n1, int n2) {
		return n1 - n2;
	}

	public static int moltiplicazione(int n1, int n2) {
		return n1 * n2;
	}

	public static double divisione(double n1, double n2) {
		return n1 / n2;
	}

}