package zadaci_13_08_2016;

public class Zadatak_3 {

	public static boolean isPrime(int num) {
		// Proverimo da li je prost broj
		boolean prime = true;
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int counter = 0, stop = 100;
		/*
		 * Idemo kroz petlju i proveravamo da li je broj razlicit od istog tog
		 *  broja naopako ispisanog, da li je broj prost, i da li je taj isti
		 *  broj naopako ispisan prost..Ispisemo 100 brojeva i prekidamo.
		 */
		for (int i = 0; i < 4000; i++) {
			if (i != zadaci_06_08_2016.Zadatak_3.reverse(i) && isPrime(i)
					&& isPrime(zadaci_06_08_2016.Zadatak_3.reverse(i))) {
				System.out.print(i + " ");
				counter++;
				if (counter % 10 == 0) {
					System.out.println();
				}
				if (counter == stop) {
					break;
				}
			}
		}
	}
}
