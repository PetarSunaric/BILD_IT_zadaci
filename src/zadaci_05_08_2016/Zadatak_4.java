package zadaci_05_08_2016;

public class Zadatak_4 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int[] array = new int[10];
		// Uzimamo unos od korisnika
		System.out.println("Molimo unesite deset cijelih brojeva: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		// Prikazujemo korisniku njegov unos u obrnutom redosledu
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}
}
