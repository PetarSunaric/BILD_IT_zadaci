package zadaci_05_08_2016;

public class Zadatak_1 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		double racun = 0;
		// Uzimamo unose stednje i mjeseci
		System.out.println("Molimo unesite mjesecni iznos stednje: ");
		int stednja = input.nextInt();
		System.out.println("Molimo unesite koliko mjeseci traje stednja: ");
		double mjesec = input.nextInt();

		// Racunamo po formuli kolika je stednja
		for (int i = 0; i < mjesec; i++) {
			racun = ((stednja + racun) * (1 + 0.00417));

		}
		// Ispisujemo korisniku koliko je ustedio
		System.out.println("Stanje vaseg racuna iznosi : " + racun);

	}
}
