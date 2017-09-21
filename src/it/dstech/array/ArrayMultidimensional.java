package it.dstech.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayMultidimensional {

	public static void main(String[] args) {

		int[][] array = riempiArray();

		stampaArray(array);

		sommaDiagSx(array);

		sommaDiagDx(array);

		sommaArray(array);
	}

	private static int[][] riempiArray() {

		Random random = new Random();

		int[][] array = new int[5][5];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(100);
			}
		}
		return array;
	}

	private static void stampaArray(int[][] array) {

		for (int[] a : array) {
			System.out.println(Arrays.toString(a));
		}
	}

	private static void sommaDiagSx(int[][] array) {

		int somma = 0;

		for (int i = 0; i < array.length; i++) {
			somma += array[i][i];
		}
		System.out.println("La somma della diagolale sinistra è :" + somma);
	}

	private static void sommaDiagDx(int[][] array) {

		int somma = 0;

		for (int i = 0; i < array.length; i++) {
			somma += array[i][array.length - 1 - i];
		}
		System.out.println("La somma della diagolale destra è :" + somma);
	}

	public static void sommaArray(int[][] array) {

		int somma = 0;

		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				somma += array[row][col];
			}
		}
		System.out.println("La somma di tutti gli elementi dell'array è: " + somma);
	}

}
