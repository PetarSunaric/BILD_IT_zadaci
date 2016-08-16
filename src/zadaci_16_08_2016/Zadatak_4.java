package zadaci_16_08_2016;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Zadatak_4 {

	public static String currentTimeToString() {
		// Uzimamo tacno vreme i datum, vracamo string
		Date date = new Date();
		String newDate = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss").format(date);
		return newDate.toString();

	}

	public static void main(String[] args) {
		// Pozivamo string metodu za vreme i datum
		System.out.println("Tacan datum i vreme: " + currentTimeToString());
	}
}
