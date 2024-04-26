import java.util.Scanner;

public class DrugiZadatakPet {
    public static void main(String[] args) {
        /*
         2. Napisati progam koji za uneti broj poena (0-100) dodeljuje odgovarajucu ocenu (6, 7, 8,
                9, 10) prema 8sledecem ranigiranju:
        51-60
        61-70
        71-80
        81-90
        91-100
        Ako je broj poena manji od 51, ispisati poruku da je broj bodova nedovoljan za polaganje
        ispita.
         */
        Scanner skener = new Scanner(System.in);
        System.out.println("Unesite broj osvojenih poena:");
        double poen = skener.nextDouble();

        if (poen < 0 || poen > 100) {
            System.out.println("Uneli ste pogresan broj peona. Broj osvojenih peona ne moze da bude manje 0 ili vise od 100");
        } else if (poen < 51) {
            System.out.println("Broj osvojenih poena je: " + poen + ". Nedovoljno za prolaz na ispitu.");
        } else if (poen <=60) {
            System.out.println("Broj osvojenih poena je: " + poen + ". Dobijena ocena je 6.");
        } else if (poen <=70) {
            System.out.println("Broj osvojenih poena je: " + poen + ". Dobijena ocena je 7.");
        } else if (poen <=80) {
            System.out.println("Broj osvojenih poena je: " + poen + ". Dobijena ocena je 8.");
        } else if (poen <=90) {
            System.out.println("Broj osvojenih poena je: " + poen + ". Dobijena ocena je 9.");
        } else {
            System.out.println("Broj osvojenih poena je: " + poen + ". Dobijena ocena je 10.");

        }
    }
}
