package zadaci_10_09_2016;

public class Zadatak_3 {

	public static void main(String[] args) {
		/*Prvom petljom ispisujemo prvi broj, drugom drugi dok se sve
		 * kombinacije ne izredaju od 1 do 7.
		 */
		for (int i = 1; i <= 7; i++) {
			for (int b = i + 1; b <= 7; b++) {
				System.out.println(i + "" + b);
			}
		}
	}
}
