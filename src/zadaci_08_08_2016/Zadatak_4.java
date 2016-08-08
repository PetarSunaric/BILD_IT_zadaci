package zadaci_08_08_2016;

public class Zadatak_4 {

	public static void main(String[] args) {
		System.out.println("Savrseni brojevi su: ");
		// Pozivamo metodu koja provjerava da li je broj savrsen i ispisujemo ga
		for (int i = 1; i < 10000; i++) {
			if (savrsenBroj(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static boolean savrsenBroj(int broj) {
		int sum = 0;
		//Provjeravamo da li je broj savrsen tako sto sumu broja poredimo sa brojem
		for (int i = 1; i < broj; i++) {
			if (broj % i == 0) {
				sum += i;
			}
		}
		if (broj == sum) {
			return true;
		}
		return false;
	}
}
