package zadaci_05_08_2016;

public class Zadatak_2 {

	public static void main(String[] args) {
		int [] spil = new int[52];
		String [] broj = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String [] znak = {"Herc","Pik", "Tref", "Karo"};

		//Promijesamo spil
		for(int i = 0; i < spil.length; i++){
			int index = (int)(Math.random()* spil.length);
			int temp = spil[i];
			spil[i] = spil[index];
			spil[index] = temp;
		}
		//Odaberemo kartu i znak
		for(int i = 0; i < 1; i++){
			String znak1 = znak[spil[i] / 13];
			String num = broj[spil[i] % 13];
			System.out.println("Karta koju ste izvukli je " + num + " u znaku " + znak1 + ".");
		}
	}
	
	}

