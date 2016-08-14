package zadaci_13_08_2016;

public class Zadatak_4 {

	public static void main(String[] args) {
		int counter = 0, stop = 100;
		/*
		 * Idemo kroz petlju i provjeravamo da li je i prost i da li je
		 * palindom..Ispisujemo prvih 100 i prekidamo
		 */
		for (int i = 0; i <= 100000; i++) {
			if (zadaci_13_08_2016.Zadatak_3.isPrime(i) && zadaci_06_08_2016.Zadatak_3.isPalindrom(i)) {
				System.out.print(i + " ");
				counter++;
				if (counter % 10 == 0) {
					System.out.println();
					if (counter == stop) {
						break;
					}
				}
			}
		}
	}

}
