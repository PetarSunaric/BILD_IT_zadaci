package zadaci_16_08_2016;

public class Zadatak_3 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Molimo unesite vas SSN broj u sledecem formatu (DDD-DD-DDDD) : ");
		String ssn = input.nextLine();
		input.close();
		/*
		 * Ispitati da li je duzina stringa jednaka duzini formata ispisati
		 * poruku ako nije jednaka
		 */
		if (ssn.length() != 11) {
			System.out.println("Pogresno ste unijeli broj.");
		} else {
			for (int i = 0; i <= ssn.length() - 1; i++) {
				if (i != 3 && i != 6) {
					if (!Character.isDigit(ssn.charAt(i))) {
						System.out.println("Pogresno ste unijeli broj.");
						System.exit(1);
					}
				}
				/*
				 * Ispitati da li je na mjestu broj 3 i 6 unesena "-" ispisati
				 * poruku ako nije unos dobar
				 */
				if ((i == 3 || i == 6) && (ssn.charAt(i) != '-')) {
					System.out.println("Pogresno ste unijeli broj.");
					System.exit(1);
				}
			}
		}
		// Ispisati broj socijalnog
		System.out.println("Vas Social Security Nummber je: " + ssn);
	}
}
