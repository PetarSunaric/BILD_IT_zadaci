package zadaci_10_09_2016;

public class Zadatak_5 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("Molimo unesite vas string: ");
		String str = input.nextLine().toUpperCase();
		System.out.println("Molimo unesite sta zelite da provjerite: ");
		String str2 = input.nextLine().toUpperCase();
		
		if(str.contains(str2)){
			System.out.println(str2 + " jeste substring vaseg stringa " + str);
		}
		else{
			System.out.println(str2 + " nije sybstring vaseg stringa " + str);
		}
	}
}
