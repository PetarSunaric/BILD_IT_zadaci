package zadaci_01_08_2016;

import java.util.Scanner;

public class Zadatak_3 {

	public static int najveciDjelilac(int num1, int num2) {
		int temp, ost;

		//Mijenjamo brojevima mjesta, tako da manji broj uvijek bude prvi
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		/*Nalazimo ostatak, ako postoji ostatak onda manji broj postaje djeljenik a ostatak djelilac..
		ako je ostatak 0 onda djelilac postaje najveci zajednicki djelilac */
		do {
			ost = num2 % num1;
			num2 = num1;
			num1 = ost;
		} while (num1 > 0);

		return num2;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num1, num2;

		System.out.println("Molimo unesite prvi broj: ");
		num1 = input.nextInt();

		System.out.println("Molimo unesite drugi broj: ");
		num2 = input.nextInt();
		input.close();

		//Ispisujemo korisniku ujedno pozivajuci metodu koja vraca najveci djelilac
		System.out.println(
				"Za brojeve " + num1 + " i " + num2 + " najveci djelilac je " + (najveciDjelilac(num1, num2)) + " .");
	}
}
