import java.util.Scanner;

public class ZadatakOcena {
    public static void main(String[] args) {
        /*
        1. Napisi program koji korisnika pita da unese ocenu ucenika kao celobrojni broj (na primer, 5, 4, 3, 2, 1).
Koristiti switch za konvertovanje ocenu u slovnu ocenu prema sledećem kljucu:
Ako je ocena 5, slovna ocena je "Odlican".
Ako je ocena 4, slovna ocena je "Vrlo dobar".
Ako je ocena 3, slovna ocena je "Dobar".
Ako je ocena 2, slovna ocena je "Dovoljan".
Ako je ocena 1, slovna ocena je "Nedovoljan".
         */
        Scanner skener = new Scanner(System.in);
        System.out.println("Unesite ocenu ucenika kao celobrojni broj");
        int ocena = skener.nextInt();

        switch (ocena){
            case 1:
                System.out.println("Slovna ocena je 'Nedovoljan'.");
                 break;
            case 2:
                System.out.println("Slovna ocena je 'Dovoljan'.");
                break;
            case 3:
                System.out.println("Slovna ocena je 'Dobar '.");
                break;
            case 4:
                System.out.println("Slovna ocena je 'Vrlo dobar'.");
                break;
            case 5:
                System.out.println("Slovna ocena je 'Odlican'.");
                break;
            default:
                System.out.println("Pogresan unos.");
                break;

      }
    }
}
