package zadaci_04_08_2016;

import java.util.ArrayList;

public class Zadatak_5 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		int array[] = new int[100];
		int sum = 0, average = 0, iznadProseka = 0, ispodProseka = 0, counter = 0, jednak = 0;

		/*
		 * Punimo niz i postavljamo uslov da 0 prekida unos,racunamo sumu i
		 * brojimo koliko je unosa bilo 
		 */
		System.out.println("Molimo unesite vase brojeve, 0 prekida unos: ");
		for (int i = 0; i <= array.length; i++) {
			array[i] = input.nextInt();
			if (array[i] == 0)
				break;
			counter++;
			sum += array[i];
		}
		// Racunamo prosek
		average = sum / counter;
		/*
		 * Prolazimo kroz petlju i racunamo koliko je iznad,ispod i jednakih
		 * brojeva datom proseku
		 */
		for (int i = 0; i < counter; i++) {
			if (array[i] > average) {
				iznadProseka++;
			} else if (array[i] == average) {
				jednak++;
			} else {
				ispodProseka++;
			}
		}
		System.out.println("Suma svih brojeva je " + sum);
		System.out.println("Prosek svih brojeva je " + average + " iznad proseka je " + iznadProseka + " , "
				+ ispodProseka + " je ispod proseka, a jednakih proseku " + jednak + " .");
	}
}
