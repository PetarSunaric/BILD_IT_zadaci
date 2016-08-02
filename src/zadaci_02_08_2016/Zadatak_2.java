package zadaci_02_08_2016;

public class Zadatak_2 {

	public static void numberOfQuestions(int question) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		int counter = 0, correct = 0, incorrect = 0;
		/*
		 * Uzimamo dva random broja i postavljamo pitanje korisniku, uzimamo
		 * odgovor vrteci petlju sve dok se ne postavi broj pitanja koje je
		 * korisniku uneo, brojimo tacne i netacne odgovore
		 */
		for (int i = counter; i < question; i++) {
			int num1 = (int) (Math.random() * 10);
			int num2 = (int) (Math.random() * 10);
			System.out.println("Koliko je " + num1 + " - " + num2 + " ?");
			int answer = input.nextInt();
			if (answer == (num1 + num2)) {
				correct++;
			} else {
				incorrect++;
			}
		}
		System.out.println("Imali ste " + correct + " tacnih odgovora i " + incorrect + " netacnih.");
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		//Uzimamo unos od korisnika za broj pitanja
		System.out.println("Koliko biste zeleli da vam postavimo pitanja: ");
		int question = input.nextInt();

		numberOfQuestions(question);

	}

}
