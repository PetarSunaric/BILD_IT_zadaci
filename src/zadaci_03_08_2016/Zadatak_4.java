package zadaci_03_08_2016;

public class Zadatak_4 {

	public static int[] locateLargest(double[][] a) {
		int largest[] = new int[2];
		double max = a[0][0];
		// Trazimo najveci element, na kom se mjestu nalazi
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (max < a[i][j]) {
					max = a[i][j];
					largest[0] = i;
					largest[1] = j;
				}
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		double a[][] = new double[5][5];
		java.util.Scanner input = new java.util.Scanner(System.in);
		// Unosimo elemente u matricu 
		System.out.println("Molimo unesite elemente u niz: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = input.nextInt();
			}
		}
		input.close();
		// Pozivamo metodu koja sadrzi niz, ispisujemo korisniku njegova dva
		// elementa
		int larg[] = locateLargest(a);
		System.out.print("Najveci element u nizu nalazi se na mjestu " + larg[0] + " " + larg[1]);

	}
}
