package zadaci_12_08_2016;

public class Zadatak_2 {

	public static void delioci(int firstNum, int secondNum) {
		
		// Izracunamo najmanji zajednicki delilac
		for (int i = 2; i < firstNum; i++) {
			if (firstNum % i == 0 && secondNum % i == 0) {
				System.out.println("NAJMANJI = " + i);
				break;
			}
		}
		// Izracunamo najveci zajednicki delilac
		for (int i = firstNum; i > 1; i--) {
			if (firstNum % i == 0 && secondNum % i == 0) {
				System.out.println("NAJVECI = " + i);
				break;
			}
		}
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int firstNum, secondNum;
		// Uzimamo unos, pozivamo metodu i stampamo
		System.out.print("Prvi prirodan broj: ");
		firstNum = input.nextInt();
		System.out.print("Drugi prirodan broj: ");
		secondNum = input.nextInt();

		System.out.println("Zajednicki delioci broja " + firstNum + " i " + secondNum + " su: ");
		if (firstNum < secondNum) {
			delioci(firstNum, secondNum);
		} else {
			delioci(secondNum, firstNum);
		}
	}
}
