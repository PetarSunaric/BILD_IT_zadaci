package zadaci_13_08_2016;

public class Zadatak_2 {

	public static void reverse(int number) {
		// Okrenemo broj naopako
		if (number < 10) {
			System.out.println(number);
		} else {
			System.out.print(number % 10);
			reverse(number / 10);
		}
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// Uzimamo od korisnika broj, i pozivom metode stampamo naopako taj broj
		System.out.println("Molimo unesite vas broj: ");
		int number = input.nextInt();

		System.out.println("Vas broj ispisan naopako: ");
		reverse(number);
	}
}
