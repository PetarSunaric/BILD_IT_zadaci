package zadaci_12_08_2016;

import java.util.ArrayList;
import java.util.Collections;

public class Zadatak_4 {

	public static ArrayList<Integer> sortNumbers(int num1, int num2, int num3) {
		// Stavimo brojeve u listu, sortiramo je i vracamo
		ArrayList<Integer> list = new ArrayList<>();
		list.add(num1);
		list.add(num2);
		list.add(num3);
		Collections.sort(list);
		return list;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// Uzimamo unose i pozivom metode stampamo
		System.out.println("Molimo unesite brojeve: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();

		System.out.println(sortNumbers(num1, num2, num3));
	}
}
