package zadaci_08_08_2016;

public class Zadatak_1 {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		//Nalazimo random brojeve
		int num1 = (int) (Math.random() * 100);
		int num2 = (int) (Math.random() * 100);
		int num3 = (int) (Math.random() * 100);
		int answer;
		//ispisujemo pitanje korisniku sve dok ne unese tacan odgovor
		do {
			System.out.println("Koliko je " + num1 + " + " + num2 + " + " + num3 + " ?");
			answer = input.nextInt();
		} while ((num1 + num2 + num3) != answer);
		System.out.println("Cestitamo!");
	}
}
