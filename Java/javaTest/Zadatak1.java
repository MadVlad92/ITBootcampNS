package javaTest;

public class Zadatak1 {

	public static void main(String[] args) {

		int[] nizBrojeva = { 4, 56, 3, 98, -50, 0, -5, -76, 12, 1235 };

		int min = 0;

		for (int i = 0; i < nizBrojeva.length; i++) {

			if (nizBrojeva[i] < min) {

				min = nizBrojeva[i];

			}

		}

		System.out.println("Najmanji broj u nizu je " + min);

	}

}
