package zadaci_13_08_2016;

public class Zadatak_5 {

	public static void main(String[] args) {
		java.util.Scanner unos = new java.util.Scanner(System.in);
		// Uzimamo unose od korisnika
		System.out.println("Molimo unesite cenu i tezinu prvog paketa kafe:");
		double cena1 = unos.nextDouble();
		double tezina1 = unos.nextDouble();

		System.out.println("Molimo unesite cenu i tezinu drugog paketa kafe:");
		double cena2 = unos.nextDouble();
		double tezina2 = unos.nextDouble();

		// Racunamo koja je cijena i tezina povoljnija
		if ((cena1 > cena2) && (tezina1 >= tezina2)) {
			System.out.println("Cena drugog paketa je povoljnija.");
		} else if ((cena2 > cena1) && (tezina2 >= tezina1)) {
			System.out.println("Cena prvog paketa je povoljnija.");
		} else {
			System.out.println("Oba paketa su povoljna.");
		}
	}
}
