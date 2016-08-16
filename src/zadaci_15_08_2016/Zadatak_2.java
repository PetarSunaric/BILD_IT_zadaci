package zadaci_15_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_2 {

	static String[] name = { "makaze", "kamen", "papir" };
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// Uzimamo unos i provjeravamo da li je unesen jedan od ponudjenih
		// brojeva
		System.out.println("Unesite jedan od brojeva 0 (scissor), 1 (rock), 2 (paper)");
		int number = proveraUnosa();
		input.close();
		game(number);
	}

	public static void game(int number) {
		// Uzimamo random broj za racunar,ispisujemo dobijene brojeve i racunamo
		// ko je bolji
		int racunar = (int) (Math.random() * 3);
		System.out.print("Kompjuter je dobio " + name[racunar] + ", vi ste dobili " + name[number] + ". ");
		if (number == racunar)
			System.out.println("Nerijeseno je!");
		else {
			switch (number) {
			case 0:
				if (racunar == 2)
					System.out.println("Pobjedili ste.");
				else
					System.out.println("Izgubili ste.");
				break;
			case 1:
				if (racunar == 0)
					System.out.println("Pobjedio si.");
				else
					System.out.println("izgubio si.");
				break;
			case 2:
				if (racunar == 1)
					System.out.println("Pobjedio si.");
				else
					System.out.println("Izgubio si.");
				break;
			default:
				System.out.println("Pogresan unos.");
				System.exit(1);
			}
		}
	}

	// Provjerimo unos podatka,ako nije tacan unos ponavlja se petlja
	public static int proveraUnosa() {
		int unos = -1;
		boolean proveraUnosa = true;
		do {
			try {
				unos = input.nextInt();
				if (unos == 0 || unos == 1 || unos == 2)
					proveraUnosa = false;
				else
					System.out.println("Pogresan unos. Pokusajte ponovo: ");
			} catch (InputMismatchException ex) {
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		} while (proveraUnosa);
		return unos;
	}

}