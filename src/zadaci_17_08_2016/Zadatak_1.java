package zadaci_17_08_2016;

public class Zadatak_1 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Molimo unesite broj (0 - 127) : ");
		int num = input.nextInt();

		/*
		 * Ako je u okviru trazenog broja, stampamo slovo ili znak na tom
		 * broju.Ako nije, obavijestimo korisnika da je unos pogresan!
		 */
		if (num < 0 || num > 127) {
			System.out.println("Uneli ste pogresan broj!");
		} else {
			System.out.printf("Karakter na tom broju je " + (char)num);
		}
	}
}
