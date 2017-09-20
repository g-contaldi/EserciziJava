package it.dstech.array;

import java.util.Arrays;
import java.util.Random;

public class Array {

	public static void main(String[] args) {

		int[] array = new int[5];
		riempi(array);
		System.out.println("** verifica acquisizione dati **");
		stampa(array);
	}

	public static void riempi(int[] array) {

		Random random = new Random();
		for (int i = 0; i < array.length; i++)
			array[i] = random.nextInt(100);
	}

	public static void stampa(int[] array) {

		System.out.println("Array letto: ");
		System.out.println(Arrays.toString(array));
	}

}
