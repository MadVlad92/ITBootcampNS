package javaTest;

import java.util.Scanner;

public class Zadatak5 {

	public static int brojacElemenataNiza(int element, int[] niz) {

		int counter = 0;

		for (int i = 0; i < niz.length; i++) {

			if (niz[i] == element) {

				counter++;

			}

		}

		return counter;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] niz1 = { 2, 12, 432, 21, 2, 7, 12, 2, 21, -2 };

		System.out.println("Unesite broj koji zelite da prbrojimo u nizu brojeva:");

		int broj = scan.nextInt();

		if (brojacElemenataNiza(broj, niz1) > 0) {

			System.out.println("Broj " + broj + " se pojavljuje " + brojacElemenataNiza(broj, niz1)
					+ " puta u nasem nizu brojeva");

		}

		else {

			System.out.println("Broj " + broj + " se ne pojavljuje u nasem nizu.");

		}

	}

}
