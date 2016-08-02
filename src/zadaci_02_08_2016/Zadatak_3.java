package zadaci_02_08_2016;

import java.io.IOException;
import java.io.File;

public class Zadatak_3 {
	
		public static void main(String[] args) throws IOException{
			
			//U string upisujemo lokaciju fajla
			String str = "C://Users/Tijana/git/BILD_IT_zadaci/src/zadaci_02_08_2016/myFile.txt";
			File file = new File(str);
			
			//Citamo iz fajla pomocu skenera, pozivajuci fajl
			java.util.Scanner input = new java.util.Scanner(file);

			int character = 0, word = 0, line = 0;
			
			//Brojimo karaktere, rijeci i linije u fajlu
			while (input.hasNextLine()) {
				String str1 = input.nextLine();
				character += str1.length();
				line++;
				String array[] = str1.split(" ");
				word += array.length;
		}
			//Zatvoren skener
			input.close();
			
			System.out.println("Broj karaktera u vasem fajlu je " + character + " .");
			System.out.println("Broj rijeci u vasem fajlu je " + word + " .");
			System.out.println("Broj linija u vasem fajlu je " + line + " .");
	}
}

