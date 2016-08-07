package zadaci_06_08_2016;

public class Zadatak_3 {

	public static int reverse(int number) {
		int reverse = 0;
		// Mijenjamo mjesta prvom i trecem broju
		while (number != 0) {
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
		}
		return reverse;
	}

	public static boolean isPalindrom(int number) {
		// Provjeravamo da li su prvi i poslednji isti
		return number == reverse(number);
	}

	public static void main(String[] args) {
		// Uzimamo unos i ispisujemo korisniku pozivom metoda
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.println("Molimo unesite vas broj: ");
		int number = input.nextInt();

		System.out.println("Vas broj ispisan naopako " + reverse(number));
		System.out.println("Da li je vas broj palindrom: " + isPalindrom(number));
	}
}
