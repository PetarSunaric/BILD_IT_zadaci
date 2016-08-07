package zadaci_06_08_2016;

import java.text.DecimalFormat;

public class Zadatak_1 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		//Uzimamo poterbne podatke od korisnika
		double iznosInvesticije, godisnjaInteresnaStopa, brojGodina, buducaVrednostInvesticije;
		System.out.println("Molimo unesite iznos vase investicije: ");
		iznosInvesticije = input.nextDouble();
		System.out.println("Molimo unesite iznos godisnju interesnu stopu: ");
		godisnjaInteresnaStopa = input.nextDouble() / 12;
		System.out.println("Molimo unesite iznos broj godina: ");
		brojGodina = input.nextDouble();
		//Izracunamo buducu investiciju, prebacujemo u format koji se trazi i ispisujemo korisniku
		buducaVrednostInvesticije = (iznosInvesticije * Math.pow(1 + godisnjaInteresnaStopa / 100, brojGodina * 12));
		buducaVrednostInvesticije = Double.parseDouble(new DecimalFormat("##.##").format(buducaVrednostInvesticije));
		System.out.println("Buduca vrednost investicije je " + buducaVrednostInvesticije);
	}
}
