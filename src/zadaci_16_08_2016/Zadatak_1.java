package zadaci_16_08_2016;

public class Zadatak_1 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Molimo unesite broj koji zelite da provjerite: ");
		int n = input.nextInt();
		/*
		 * Proverimo da li je broj palindrom pozivajuci metodu iz prethodnog
		 * zadatka, koja poziva metodu reverse i provjerava da li je broj
		 * palindrom
		 */
		if (zadaci_06_08_2016.Zadatak_3.isPalindrom(n)) {
			System.out.println("Vas broj je palindrom!");
		} else {
			System.out.println("Vas broj nije palindrom!");
		}
	}
}
