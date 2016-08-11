package zadaci_11_08_2016;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Zadatak_3 {

	public static void main(String[] args) {
		Date date = new Date();
		String newDate = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss").format(date);
		System.out.println("Trenutni datum i vrijeme: " + newDate.toString());
	}
}
