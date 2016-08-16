package zadaci_16_08_2016;

public class Zadatak_2 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// Uzimamo unos,ispisujemo duzinu stringa i prvo slovo
		System.out.println("Molimo unesite vas string: ");
		String str = input.nextLine();
		System.out.println("Duzina vaseg stringa je " + str.length() + 
				" a prvo slovo stringa je: " + str.charAt(0));
	}
}
