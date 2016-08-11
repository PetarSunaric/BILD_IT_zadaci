package zadaci_11_08_2016;

public class Zadatak_4 {
	
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("Molimo unesite broj minuta: ");
		long min = input.nextLong();
		
		long year = min / 525600;
		long minutes = min % 525600;
		long day = minutes / 1440;
		
		System.out.println(min + " minuta iznosi " + year + " godina " + day + " dana.");

	}
}
