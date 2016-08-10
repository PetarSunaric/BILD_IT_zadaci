package zadaci_09_08_2016;

public class Zadatak_1 {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		// Pravimo niz stringova
		String[] days = { "ponedeljak", "utorak", "sreda", "cetvrtak", "petak", "subota", "nedelja" };
		// Uzimamo unose od korisnika
		System.out.println("Molimo unesite brojeve od 0 do 6 za dane u sedmicama: ");
		int dan = input.nextInt();
		System.out.println("Molimo unesite za koliko dana zelite znati koji ce biti dan: ");
		int day = input.nextInt();
		// Pomocu formule dolazimo do buduceg dana
		int next = (dan + day) % 7;
		// Ispisujemo korisniku
		System.out.println("Danas je " + days[dan] + " za " + day + " dana ce biti " + days[next] + ".");
	}
}
