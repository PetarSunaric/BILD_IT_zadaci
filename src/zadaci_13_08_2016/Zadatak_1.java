package zadaci_13_08_2016;

public class Zadatak_1 {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		// Uzimamo potrebne podatke
		System.out.println("Molimo unesite iznos vaseg racuna: ");
		double racun = input.nextInt();
		System.out.println("Molimo unesite iznos napojnice u procentima: ");
		double stopaNapojnica = input.nextInt();
		// Izracunamo napojnicu, pa saberemo sa racunom, ispisemo
		stopaNapojnica = stopaNapojnica / 100.0;
		double napojnica = racun * stopaNapojnica;
		double ukupanIznos = racun + napojnica;
		System.out
				.println("Napojnica iznosi " + napojnica + " KM, a ukupan iznos racuna iznosi " + ukupanIznos + " KM.");

	}
}
