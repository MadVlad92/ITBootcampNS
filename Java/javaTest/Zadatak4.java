package javaTest;

import java.util.Scanner;

public class Zadatak4 {

	public static double konvertorValuta(double iznos, String valuta) {

		double vrednost = 0;

		if (valuta.equals("evro")) {

			vrednost += iznos * 0.0085;

		}

		else if (valuta.equals("franak")) {

			vrednost += iznos * 0.0093;

		}

		else if (valuta.equals("dolar")) {

			vrednost += iznos * 0.010;

		}

		return vrednost;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Molim vas unesite iznos u dinarima:");

		double unosIznosa = scan.nextDouble();

		System.out.println("Molim vas da unesete valutu u koju da konvertujemo dinare:");

		String unosValute = scan.next();

		if (unosValute.equals("evro") || unosValute.equals("franak") || unosValute.equals("dolar")) {

			System.out.println(unosIznosa + ", kad se prebaci u " + unosValute + ", iznosi "
					+ konvertorValuta(unosIznosa, unosValute) + " u toj valuti");

		}

		else {

			System.out.println("Niste uneli dobru valutu");

		}

	}

}
