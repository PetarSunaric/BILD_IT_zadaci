package zadaci_11_08_2016;

public class Zadatak_2 {

	public static boolean isPrime(int b) {
		// Proverimo da li je broj prost
		if (b <= 1) {
			return false;
		}
		if (b == 2 || b == 3)
			return true;
		for (int i = 2; i <= b / 2; i++) {
			if (b % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int counter = 0;
		// Proveravamo brojeve od 1 do 1000 i proste ispisujemo,8 po liniji
		for (int i = 1; i <= 1001; i++) {
			if (isPrime(i) == true) {
				System.out.print(i + " ");
				counter++;
				if (counter % 8 == 0) {
					System.out.println();
				}
			}
		}
	}
}
