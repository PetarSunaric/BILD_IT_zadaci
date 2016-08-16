package zadaci_15_08_2016;

public class Zadatak_5 {

	public static void printMatrix(int n) {
		// Unosimo random brojeve u matricu
		int[][] b = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int p = 0; p < b[i].length; p++) {
				b[i][p] = ((int) (Math.random() * 2));
			}
		}
		// Ispisujemo matricu
		for (int i = 0; i < n; i++) {
			for (int p = 0; p < n; p++) {
				System.out.print(b[i][p] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// Uzimamo unos i pozivamo metodu da nam ispise matricu
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Unesite koliku matricu zelite da ispisete:");
		int n = input.nextInt();
		printMatrix(n);
	}
}
