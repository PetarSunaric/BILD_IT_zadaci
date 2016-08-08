package zadaci_08_08_2016;

public class Zadatak_5 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Molimo unesite vas pasword,(vise od 8 karaktera,najmanje 2 broja): ");
		String pass = input.next();
		// Provjerimo pozivom metode da li je validan i stampamo
		if (regular(pass) == true) {
			System.out.println("Pasword je validan.");
		} else {
			System.out.println("Unijeli ste pogresan pasword.");
		}
	}

	public static boolean regular(String pass) {
		int sum = 0, num = 0;
		boolean pasword = true;
		// Provjerimo da li sadrzi brojeve
		for (int i = 0; i < pass.length(); i++) {
			if (Character.isDigit(pass.charAt(i))) {
				sum++;
				if (sum >= 2 && pass.length() >= 8 && num >= 6) {
					pasword = true;
				}
				pasword = false;
			}
		}
		// Provjerimo da li sadrzi slova
		for (int i = 0; i < pass.length(); i++) {
			if (Character.isLetter(pass.charAt(i))) {
				num++;
				if (num >= 1 && pass.length() >= 8 && sum >= 2) {
					pasword = true;
				} else {
					pasword = false;
				}
			}
		}
		return pasword;
	}
}
