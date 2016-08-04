package zadaci_03_08_2016;

import java.util.Scanner;

public class Zadatak_1 {

	public static boolean isPrime(int n) {
		boolean prime = true;
		if (n <= 1) {
			return false;
		}
		// U ovoj petlji racunamo da li je broj prost 
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void primeNum(int n, int b, int numPerLine) {
		int count = 0;
		// Pozivamo metodu koja racuna da li je prost, i ako jeste ispisujemo
		for (int i = n; i <= b; i++) {
			if (isPrime(i) == true) {
				System.out.print(i + " ");
				count++;
				if (count % numPerLine == 0) {
					System.out.println();
				}
			}
		}
	}

	public static void main(String[] args) {
		// Unos poterbnih podataka i poziv metode za ispis
		Scanner input = new Scanner(System.in);
		int n, b, numPerLine;
		System.out.println("Molimo unesite prvi broj: ");
		n = input.nextInt();
		System.out.println("Molimo unesite drugi broj: ");
		b = input.nextInt();
		System.out.println("Molimo unesite koliko zelite da ispisete brojeva u jednoj liniji: ");
		numPerLine = input.nextInt();
		primeNum(n, b, numPerLine);
	}
}
