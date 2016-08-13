package zadaci_12_08_2016;

import java.util.Random;

public class Zadatak_1 {

	public static void main(String[] args) {
		//Stampamo tri slova
		for (int i = 0; i < 3; i++) {
			int num1 = (int) (Math.random() * 26 + 65);
			System.out.print((char)num1);
		}
		//Stampamo crticu i 4 broja
		System.out.print("-");
		for (int i = 0; i < 4; i++) {
			int num2 = (int) (Math.random() * 10);
			System.out.print(num2);
		}
	}
}
