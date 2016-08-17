package zadaci_17_08_2016;

import java.util.HashSet;

public class Zadatak_5 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// Pravimo listu u koju se ne unose dupli brojevi,i od korisnika uzimamo
		// brojeve
		HashSet<Integer> list = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(input.nextInt());
		}
		// Stampamo listu i velicinu liste
		System.out.println("Jedinstveni brojevi su " + list);
		System.out.println("Jedinstvenih brojeva imamo " + list.size());
	}
}
