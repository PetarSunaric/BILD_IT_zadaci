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

		double odnos1 = cena1 / tezina1;
		double odnos2 = cena2 / tezina2;

		// Racunamo koja je cijena i tezina povoljnija
		if (odnos1 > odnos2) {
			System.out.println("Cena drugog paketa je povoljnija.");
		} else if (odnos2 > odnos1) {
			System.out.println("Cena prvog paketa je povoljnija.");
		} else {
			System.out.println("Oba paketa su povoljna.");
		}
	}
}
