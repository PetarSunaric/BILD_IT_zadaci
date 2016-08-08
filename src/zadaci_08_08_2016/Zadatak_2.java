package zadaci_08_08_2016;

public class Zadatak_2 {
	//Racunamo da li je godina prestupna
	public static boolean prestupna(int godina) {
		if (godina % 4 == 0 && godina % 100 != 0 || godina % 400 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Molimo unesite mjesec i godinu za koje zelite da znate broj dana: ");
		int brojDana;
		int mjesec = input.nextInt();
		int godina = input.nextInt();
		//Provjeravamo koliko mjesec ima dana
		if (mjesec == 4 || mjesec == 6 || mjesec == 9 || mjesec == 11) {
			brojDana = 30;
		} else if (mjesec == 2) {
			if (prestupna(godina) == true) {
				brojDana = 29;
			} else {
				brojDana = 28;
			}
		} else {
			brojDana = 31;
		}
		System.out.println(mjesec + " mjesec " + godina + " godine ima " + brojDana + " dana.");
	}
}
