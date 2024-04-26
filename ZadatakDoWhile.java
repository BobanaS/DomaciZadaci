import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class ZadatakDoWhile {
    public static void main(String[] args) {
        /*
 Napisati program koji koristi do-while petlju da omoguci korisniku
  unos lozinke sve dok ne unese ispravnu lozinku.
  Ispravna lozinka moze biti unapred inicijalozovana.
         */

        Scanner skener = new Scanner(System.in);
       String lozinka = "lozinka";
        String pokusaj;
        int i=1;
        do{
            System.out.println("Pokusaj unosenja lozinke broj " + i + ":");
            pokusaj = skener.nextLine();
            i++;
        } while(!(pokusaj.equals(lozinka)));
        System.out.println("Bravo, uneli ste tacne podatke");

    }
}
