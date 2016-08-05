package zadaci_04_08_2016;

public class Zadatak_4 {

	public static char upperCaseLetter(int character) {
		//Random slova
		character = (int) (Math.random() * 26) + (int) 'A';
		return (char) character;
	}

	public static char upperCaseDigit() {
		//Random brojevi
		int digit = (int) (Math.random() * 10) + (int) '0';
		return (char) digit;
	}

	public static void main(String[] args) {
		//Stampamo slova pozivom metode 
		for (int i =1; i <= 100; i++) {
			System.out.print(upperCaseLetter(i));
			if (i % 10 == 0)
				System.out.print("\n");
		}
		//Pravimo razmak
		System.out.println("\n");
		//Stampamo brojeve pozivom metode
		for (int i = 1; i <= 100; i++) {
			System.out.print(upperCaseDigit());
			if (i % 10 == 0)
				System.out.print("\n");
		}
	}
}
