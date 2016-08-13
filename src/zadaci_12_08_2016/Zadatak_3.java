package zadaci_12_08_2016;

public class Zadatak_3 {

	public static int isPrime(int n) {
		// Provjeravamo da li je broj prost
		if (n % 2 == 0)
			return 0;
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return 0;
		}
		return n;
	}

	public static void main(String[] args) {
		// Pozivamo metodu, ako je broj post stampamo, 10 po liniji
		int counter = 0;
		for (int i = 0; i < 100000; i++) {
			if (isPrime(i) != 0 && i != 1) {
				System.out.print(i + " ");
				counter++;
				if (counter % 10 == 0)
					System.out.println();
			}
		}
	}
}
