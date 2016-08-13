package zadaci_11_08_2016;

import java.util.Arrays;

public class Zadatak_1 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		//Uzimamo unos i stavljamo u niz 
		String[] array = new String[3];
		System.out.println("Molimo unesite imena tri grada: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextLine();
		}
		//Sortiramo niz i ispisujemo
		Arrays.sort(array);
		for (String citys : array) {
			System.out.println(citys);
		}
	}
}
