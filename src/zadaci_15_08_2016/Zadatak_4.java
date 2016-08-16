package zadaci_15_08_2016;

public class Zadatak_4 {

	public static int sumDigits(long n) {
		/*
		 * Broj prebacimo u string ,uzimamo slova i sabiramo 
		 */
		String num = n + "";
		int sum = 0;
		for (char c : num.toCharArray())
			sum += c - '0';
		return sum;
	}

	public static void main(String[] args) {
		System.out.printf("Suma vaseg broja iznosi = " + sumDigits(234));
	}

}
