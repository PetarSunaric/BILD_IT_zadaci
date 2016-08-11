package zadaci_10_09_2016;

public class Zadatak_4 {

	public static int count(String str, char a) {
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.println("Molimo unesite vas string: ");
		String str = input.nextLine().toUpperCase();
		System.out.println("Molimo unesite koje slovo zelite da izbrojite: ");
		char a = input.next().toUpperCase().charAt(0);
		
		System.out.println("U stringu " + str + " ima " + count(str, a) + " slova " + a);

	}
}
