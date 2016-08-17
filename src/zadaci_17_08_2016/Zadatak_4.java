package zadaci_17_08_2016;

public class Zadatak_4 {

	public static String format(int number, int width) {
		// Dodajemo nule na broj
		return String.format("%0" + width + "d", number);
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// Uzimamo unos i pozivamo metodu
		System.out.println("Molimo unesite vas broj: ");
		int number = input.nextInt();
		System.out.println("Molimo unesite duzinu broja: ");
		int width = input.nextInt();

		System.out.println(format(number, width));
	}
}
