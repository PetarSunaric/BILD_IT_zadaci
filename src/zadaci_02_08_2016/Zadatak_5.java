package zadaci_02_08_2016;

public class Zadatak_5 {

	public static void coin(int n) {
		int heads = 0, tails = 0;
		/* Bacamo novcic random brojem 0 i 1, ispitamo na koji je broj palo, i
		 brojimo, tako sto odredimo broj 0 zapismo, i 1 za glavu*/
		for (int i = 0; i < n; i++) {
			int coin = (int) (Math.random() * 2);
			if (coin == 0) {
				tails++;
			} else {
				heads++;
			}
		}
		//Ispisujemo korisniku koliko je puta novcic pao na koju stranu
		System.out.println("Novcic je pao " + tails + " na stranu pismo, a " + heads + " na stranu glava!");
	}

	public static void main(String[] args) {
		
		int heads = 0, tails = -1;
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		//Pitamo korisnika koliko puta zeli da se novcic baci i uzimamo unos
		System.out.println("Koliko puta zelite da bacite novcic? ");
		int n = input.nextInt();
		
		//Pozivamo metodu
		coin(n);
	}
}
