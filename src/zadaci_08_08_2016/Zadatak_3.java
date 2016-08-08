package zadaci_08_08_2016;

public class Zadatak_3 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		String mjesec;
		int godina;

		System.out.println("Molimo unesite godinu: ");
		godina = input.nextInt();
		System.out.println("Molimo unesite prva tri slova mjeseca(prvo slovo mora biti veliko): ");
		mjesec = input.next();

		//Uzimamo unos sve dok ne unese tacno kako je trazeno
		while (Mjesec(mjesec) != true) {
			System.out.println("Molimo ponovite unos mjeseca: ");
			mjesec = input.next();
		}
		System.out.println(mjesec + " " + godina + " ima " + brojDana(godina, mjesec) + " dana.");

	}
	//Racunamo da li je godina prestupna
	public static boolean prestupna(int godina) {
		if (godina % 4 == 0 && godina % 100 != 0 || godina % 400 == 0) {
			return true;
		}
		return false;
	}
	//Racunamo koliko mjesec ima dana
	public static int brojDana(int godina, String mjesec) {
		int brojDana;
		if (mjesec.equals("Apr") || mjesec.equals("Jun") || mjesec.equals("Sep") || mjesec.equals("Nov")) {
			brojDana = 30;
		} else if (mjesec.equals("Feb")) {
			if (prestupna(godina) == true) {
				brojDana = 29;
			} else {
				brojDana = 28;
			}
		} else {
			brojDana = 31;
		}
		return brojDana;
	}
	//Uporedjujemo unos korisnika sa trazenim unosom
	public static boolean Mjesec(String mjesec) {
		switch (mjesec) {
		case "Jan":
			return true;
		case "Feb":
			return true;
		case "Mar":
			return true;
		case "Apr":
			return true;
		case "Maj":
			return true;
		case "Jun":
			return true;
		case "Jul":
			return true;
		case "Aug":
			return true;
		case "Sep":
			return true;
		case "Okt":
			return true;
		case "Nov":
			return true;
		case "Dec":
			return true;
		}
		return false;
	}
}
