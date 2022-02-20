package javaTest;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int zbir = 0;
		int counter = 1;

		System.out.println("Molim vas unesite " + counter + ". broj");

		int broj = scan.nextInt();

		while (broj != 0) {

			zbir += broj;

			System.out.println("Trenutni zbir je " + zbir);

			System.out.println("Molim vas unesite " + (counter + 1) + ". broj");

			broj = scan.nextInt();

			counter++;

		}

		if (broj == 0) {

			System.out.println("Uneli se 0 Kraj programa");

		}

	}
	
}

// Uradio sam i preko for loop, ali gornja granica nije dobra - kako se može bolje postaviti?

/* package javaTest;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int zbir = 0;

		for (int i = 1; i < 1000000; i++) { 

			System.out.println("Molim vas unesite " + i + ". broj");

			int broj = scan.nextInt();

			if (broj != 0) {

				zbir += broj;

				System.out.println("Trenutni zbir je " + zbir);

			}

			else {

				System.out.println("Uneli se 0 Kraj programa");

				break;

			}

		}

	}

} */

