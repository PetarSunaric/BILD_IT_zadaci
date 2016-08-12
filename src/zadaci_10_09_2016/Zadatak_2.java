package zadaci_10_09_2016;

public class Zadatak_2 {

	public static boolean prost(int n) {
		// Provjerimo da li je broj prost
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int counter = 0;
		// Provjerimo da li je broj prost i ispisujemo sa njegovim parom plus 2
		for (int i = 3; i < 10000; i++) {
			if (prost(i) && prost(i + 2)) {
				System.out.printf(" (%d, %d) ", i, i + 2);
				counter++;
				if (counter % 10 == 0) {
					System.out.println();
				}
			}
		}
	}
}
