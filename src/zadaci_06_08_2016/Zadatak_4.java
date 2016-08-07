package zadaci_06_08_2016;

public class Zadatak_4 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("Molimo unesite vas string: ");
		String str = input.nextLine();
	
		for(int i = 0; i < str.length(); i++){
			if(i % 2 == 0){
				System.out.print(str.charAt(i));
			}
		}
	}
}
