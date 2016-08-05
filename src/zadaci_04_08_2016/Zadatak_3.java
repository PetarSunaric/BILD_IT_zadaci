package zadaci_04_08_2016;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Zadatak_3 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int[] array = new int[3];
		
		// Unos i poziv metode
		System.out.println("Molimo unesite tri broja: ");
		for (int i = 0; i < 3; i++) {
			array[i] = input.nextInt();
		}
		//Pozivamo metodu i stampamo niz
		Arrays.sort(array);
		for (int i = 0; i < 3; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
