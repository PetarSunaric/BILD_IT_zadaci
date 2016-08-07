package zadaci_06_08_2016;

import java.text.DecimalFormat;

public class Zadatak_5 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Molimo unesite ubrzanje aviona u m/s: ");
		double v = input.nextDouble();
		System.out.println("Molimo unesite brzinu pri kojoj avion uzlijece u m/s: ");
		double a = input.nextDouble();
		
		double minimalnaDuzinaPiste = ((v * v) / (2 * a));
		minimalnaDuzinaPiste = Double.parseDouble(new DecimalFormat("##.###").format(minimalnaDuzinaPiste));
		System.out.println("Minimalna duzina piste iznosi " + minimalnaDuzinaPiste);
		
	}
}
