package zadaci_01_08_2016;

public class Zadatak_2 {

	public static void main(String[] args) {

        int samoglasnik = 0, suglasnik = 0;
        boolean isSamoglasnik = false;
       
        // Napraviti niz koji sadrzi samoglasnike
        char smg[] = { 'a', 'e', 'i', 'o', 'u' };
 
        // Upisati scanner da bismo mogli uzeti unos od korisnika
        java.util.Scanner input = new java.util.Scanner(System.in);
 
        /*
         * Ispisati poruku i traziti od korisnika da upise string, prebaciti
         * slova u mala u slucajnu da je korisnik upisao velika
         */
        System.out.println("Molimo unesite vas string: ");
        String wort = input.nextLine().toLowerCase();
 
        // Zatvoren scanner
        input.close();
 
        /*
         * Proci kroz niz i uneseni string, ispitati da li je korisnik uneo
         * slovo, pri tom brojati koliko u strignu ima samoglasnika a koliko
         * suglasnika
         */
        for (int i = 0; i < wort.length(); i++) {
            //Ako je karakter slovo
            if (Character.isLetter(wort.charAt(i))) {
                //prodji kroz niz samoglasnik i provjeri da li je karakter samoglasnik
                for (int j = 0; j < smg.length; j++) {
                    if (wort.charAt(i) == smg[j]) {
                        isSamoglasnik = true; //karakter je samoglasnik
                        break;
                    }
                }
               
                //Ako je karakter samoglasnik povecaj brojac samoglasnika
                //u suprotnom povecaj brojac suglasnika
                if(isSamoglasnik){
                    samoglasnik++;
                }else{
                    suglasnik++;
                }
               
                //Postavi indikator samoglasnika na podrazumijevano stanje
                isSamoglasnik = false;
            }
 
        }
        // Ispisati korisniku
        System.out.println("U vasem stringu imate " + samoglasnik + " samoglasnika i " + suglasnik + " suglasnika.");
    }
}
