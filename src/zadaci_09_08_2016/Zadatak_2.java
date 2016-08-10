package zadaci_09_08_2016;

import java.util.Scanner;

public class Zadatak_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double d;
		//Uzimamo unose
		System.out.println(
				"Unesite geografsku sirinu i duzinu u stepenima (za istok i zapad upisite negativno): ");
		double x1 = Math.toRadians(input.nextDouble());
		double y1 = Math.toRadians(input.nextDouble());
		System.out.println(
				"Unesite geografsku sirinu i duzinu u stepenima (za istok i zapad upisite negativno): ");
		double x2 = Math.toRadians(input.nextDouble());
		double y2 = Math.toRadians(input.nextDouble());
		//Prosecni radius zemlje
		double radius = 6371.01;
		//Hvala za formulu
		System.out.println("Udaljenost iznosi " + (d = radius
				* Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2))) + " km.");

	}
}
