package zadaci_17_08_2016;

public class Zadatak_2 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// Uzimamo unos od korisnika, i karakter na prvom mjestu, kastujemo u
		// int i ispisujemo
		System.out.println("Molimo unesite karakter ili slovo : ");
		char num = input.nextLine().charAt(0);
		System.out.println("Broj koji se nalazi na mjestu je " + ((int) num));
	}
}
