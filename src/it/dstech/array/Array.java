package it.dstech.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		int[] array = new int[5];
		leggi(array);
		System.out.println("** verifica acquisizione dati **");
		stampa(array);
	}

	public static void leggi(int[] array) {

		Scanner input = new Scanner(System.in);
		System.out.println("Scrivi " + array.length + " interi");

		for (int i = 0; i < array.length; i++)
			array[i] = input.nextInt();
		input.close();
	}

	public static void stampa(int[] array) {

		System.out.println("Array letto: ");
		System.out.println(Arrays.toString(array));
	}

}
