package zadaci_15_08_2016;

public class Zadatak_3 {

	public static void main(String[] args) {
		double sum = 0.0;
		// Idemo do 97 i dodajemo po 2 na i,sabiramo i dodajemo na sum, stampamo 
		for (int i = 1; i <= 97; i += 2) {
			sum += (double) i / (i + 2);
		}
		System.out.println("Zbir iznosi: " + sum);

	}
}
