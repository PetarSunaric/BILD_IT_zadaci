package zadaci_02_08_2016;

public class Zadatak_4 {

	public static void printMatrix(int n) {
		//Pravimo niz i ubacimo elemente u njega, od 0 do 1
		int array[][] = new int [n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				array[i][j] = (int)(Math.random() * 2);
			}
		}
		//Ispisujemo matricu
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		//Uzimamo unos od korisnika kolika ce biti matrica
		System.out.println("Unesite broj do kog zelite da ispisete matricu: ");
		int n = input.nextInt();
		//Pozivamo metodu da isprinta niz
		printMatrix(n);

	}
}
