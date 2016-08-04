package zadaci_04_08_2016;

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int divider = 2;

		System.out.println("Unesite broj:");
		int result = input.nextInt();

		System.out.println("Faktori broja " + result + " su:");
		
		while (result != 1) {
			while (result % divider == 0) {
				System.out.print(divider);
				System.out.print(" ");
				result /= divider;
				if (result % divider != 0)
					divider++;
			}
			divider++;
		}
		System.out.println();
	}
}
