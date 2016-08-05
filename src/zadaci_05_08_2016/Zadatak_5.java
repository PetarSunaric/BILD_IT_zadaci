package zadaci_05_08_2016;

public class Zadatak_5 {

	public static int countLetters(String s) {
		int counter = 0;
		// Provjerimo da li je korisnik uneo slovo, ako jeste povecamo counter
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// Uzimamo unos od korisnika i ispisujemo pozivom metode
		System.out.println("Molimo unesite vas string: ");
		String s = input.nextLine();
		System.out.println("Vas string ima " + countLetters(s) + " slova.");
	}
}
