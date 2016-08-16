package zadaci_16_08_2016;

public class Zadatak_5 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Molimo unesite do kog broja zelite da ispisete piramidu: ");
		int n = input.nextInt();
		// Ispisemo piramidu, ne mogu otkriti kako jer to ne zna svako, i idemo
		// da spavamo
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print(" ");
			for (int k = i; k >= 1; k--)
				System.out.print(k);
			for (int k = 2; k <= i; k++)
				System.out.print(k);

			System.out.println();
		}
	}
}
