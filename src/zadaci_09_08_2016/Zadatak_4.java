package zadaci_09_08_2016;

public class Zadatak_4 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int counter = 0, brojac = 0;
		/*
		 * Uzimamo unos dok je razlicit od nule, i provjeravamo koji je broj //
		 * veci,njega dodjeljujemo counter varijabli,brojacem brojimo koliko se
		 * // puta pojavio
		 */
		System.out.println("Molimo unesite vase brojeve: ");
		int num = input.nextInt();
		while (num != 0) {
			if (num > counter) {
				counter = num;
				brojac = 1;
			} else if (num == counter) {
				brojac++;
			}
			num = input.nextInt();

		}
		System.out.println("Najveci broj je " + counter + " i pojavljuje se " + brojac + " puta.");
	}
}
