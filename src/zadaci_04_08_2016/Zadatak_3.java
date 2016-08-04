package zadaci_04_08_2016;

public class Zadatak_3 {

	public static void displaySortedNumbers(double num1, double num2, double num3) {
		// Sortiramo brojeve od najmanjeg ka najvecem
		if (num1 < num2 && num1 < num3 && num2 < num3) {
			System.out.println(num1 + " " + num2 + " " + num3);
		} else if (num1 <= num2 && num1 <= num3 && num3 <= num2) {
			System.out.println(num1 + " " + num3 + " " + num2);
		} else if (num2 <= num1 && num2 <= num3 && num1 <= num3) {
			System.out.println(num2 + " " + num1 + " " + num3);
		} else if (num2 <= num1 && num2 <= num3 && num3 <= num1) {
			System.out.println(num2 + " " + num3 + " " + num1);
		} else if (num3 <= num1 && num3 <= num2 && num2 <= num1) {
			System.out.println(num3 + " " + num2 + " " + num1);
		} else if (num3 <= num1 && num3 <= num2 && num1 <= num2) {
			System.out.println(num3 + " " + num1 + " " + num2);
		}
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// Unos i poziv metode
		System.out.println("Molimo unesite tri broja: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		displaySortedNumbers(num1, num2, num3);
	}
}
