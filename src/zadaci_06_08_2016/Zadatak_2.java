package zadaci_06_08_2016;

public class Zadatak_2 {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		int counter = 0;
		System.out.println("Molimo unesite pocetnu godinu: ");
		int godinaPrva = input.nextInt();
		System.out.println("Molimo unesite krajnju godinu: ");
		int godinaKrajnja = input.nextInt();
		
		for(int i = godinaPrva; i < godinaKrajnja; i++){
			if(i % 400 == 0 || (i % 100 != 0 && i % 4 == 0)){
				System.out.print(i + " ");
				counter++;
				if(counter % 10 == 0){

					System.out.println();
				}
			}
		}
	}
}
