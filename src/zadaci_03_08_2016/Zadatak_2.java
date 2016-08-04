package zadaci_03_08_2016;

public class Zadatak_2 {

	public static double min(double[] array) {
		// Pronalazimo najmanju vrijednost u nizu
		double minValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
			}
		}
		return minValue;
	}

	public static void main(String[] args) {
		/*
		 * Trazimo od korisnika unos i pozivamo metodu koja pronalazi najmanji
		 * element u nizu 
		 */
		java.util.Scanner input = new java.util.Scanner(System.in);
		double array[] = new double[10];
		System.out.println("Unesite niz od 10 cifri: ");
		for (int i = 0; i < 10; i++) {
			array[i] = input.nextDouble();

		}
		System.out.println(min(array));
	}
}
