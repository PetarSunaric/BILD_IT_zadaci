package zadaci_17_08_2016;

import java.util.HashSet;

public class Zadatak_5 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		HashSet<Integer> list = new HashSet<Integer>();
		for(int i = 0; i < 10; i++){
			list.add(input.nextInt());		
		}
		System.out.println("Jedinstveni brojevi su " + list);
		System.out.println("Jedinstvenih brojeva imamo " + list.size());
	}
}
