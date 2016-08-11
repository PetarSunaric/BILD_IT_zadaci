package zadaci_10_09_2016;

public class Zadatak_1 {

	public static int numberOfDaysInAYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return 366;
		}
		return 365;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.println("Molimo unesite pocetnu godinu: ");
		int num1 = input.nextInt();
		System.out.println("Molimo unesite krajnju godinu: ");
		int num2 = input.nextInt();

		for (int i = num1; i <= num2; i++) {
			System.out.println(i + " = " + numberOfDaysInAYear(i));
		}
	}
}
