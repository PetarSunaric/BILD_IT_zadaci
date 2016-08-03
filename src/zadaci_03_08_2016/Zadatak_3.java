package zadaci_03_08_2016;

public class Zadatak_3 {

	public static boolean equals(int arrayOne[], int arrayTwo[]) {

		boolean equals = false;
		int length = arrayOne.length;
		// Provjeravamo da li su dva niza identicna, ako jesu vracamo true, ili
		// u suprotnom false
		if (arrayOne == arrayTwo)
			equals = true;
		if (arrayTwo.length != length)
			equals = false;

		for (int i = 0; i < arrayOne.length; i++) {
			for (int j = 0; j < arrayTwo.length; j++) {
				if (arrayOne[i] != arrayTwo[j]) {
					equals = false;
				} else {
					equals = true;
				}
			}
		}
		return equals;
	}

	public static void main(String[] args) {

		int[] arrayOne = new int[5];
		int[] arrayTwo = new int[5];

		java.util.Scanner input = new java.util.Scanner(System.in);
		// Uzimamo od korisnika elemente prvog niza
		System.out.println("Molimo popunite prvi niz: ");
		for (int i = 0; i < arrayOne.length; i++) {
			arrayOne[i] = input.nextInt();
		}
		// Zatim i drugog
		System.out.println("Molimo popunite drugi niz: ");
		for (int i = 0; i < arrayTwo.length; i++) {
			arrayTwo[i] = input.nextInt();
		}
		input.close();
		// Pozivamo metodu koja nam pokazuje da li su jednaki
		System.out.println(equals(arrayOne, arrayTwo));
	}

}
