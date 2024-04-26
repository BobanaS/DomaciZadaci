import java.util.Scanner;

public class PrviDodatniZadatak {
    public static void main(String[] args) {
        /*
        Dodatni zadatak:
1. Izbroj koliko puta se javlja slovo 'a' u unetom stringu.
         */

        Scanner skener = new Scanner(System.in);
        System.out.println("Unesite zeljeni tekst");
        String tekst=skener.nextLine();
        int brA=0;
        for(int i=0; i< tekst.length(); i++){
            if( tekst.toLowerCase().charAt(i) == 'a'){
                brA++;
            }
        }
        System.out.println("U tekstu koji ste naveli ( " + tekst +" ) se nalazi tacno " + brA + " slova a.");
    }
}
