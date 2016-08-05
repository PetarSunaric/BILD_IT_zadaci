package zadaci_05_08_2016;

public class Zadatak_3 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("Molimo unesite dva stringa: ");
		String s = input.nextLine();
		String b = input.nextLine();
		int length = Math.min(s.length(), b.length());
		System.out.print("Prefix dva stringa je: ");
		for(int i = 0; i < length; i++){
			if(s.charAt(i) == b.charAt(i)){
				System.out.print(s.charAt(i));
			}
		}
	}
}
