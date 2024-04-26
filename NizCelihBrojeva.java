import java.util.Scanner;

public class NizCelihBrojeva {
    public static void main(String[] args) {
        /*
        Napisati program koji trazi od korisnika da unese niz celih brojeva, zatim vraca odgovor da li je veca
apsolutna vrednost zbira pozitivnih brojeva ili apsolutna vrednost zbira negativnih brojeva. Funkcija za
dobijanje apsoultne vrednosti broja je: Math.abs(broj).
         */

        Scanner skener = new Scanner(System.in);
        System.out.println("Unesite koliko zelite da vas niz ima celobrojnih brojeva ");
        int duzina = 0;
        while (duzina == 0) {
            duzina = skener.nextInt();
            if (duzina == 0) {
                System.out.println("Igramo se unesi, neki veci broj");
                continue;
            }
        }
        int[] niz = new int[duzina];
        int sumaPozitivnih = 0;
        int sumaNegativnih = 0;
        int i = 0;
        for (i = 0; i < niz.length; i++) {
            System.out.println("Unesite zeljene brojeve u svoj niz, nakon svakog unosa pritisnite enter:");
            niz[i] = skener.nextInt();
        }
        System.out.println("Vas niz je ");
        for (i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + " ");
        }
        for (i = 0; i < niz.length; i++) {
            if (niz[i] < 0) {
                sumaNegativnih += niz[i];
            } else if (niz[i] > 0) {
                sumaPozitivnih += niz[i];
            }
        }
        System.out.println();
        if (Math.abs(sumaNegativnih) > sumaPozitivnih) {
            System.out.println("Veca je apsolutna vrednost zbira negativnih (" + Math.abs(sumaNegativnih) + " od sume pozitivnih " + sumaPozitivnih);
        } else if (sumaPozitivnih > Math.abs(sumaNegativnih)) {
            System.out.println("Veca je suma pozitivnih " + sumaPozitivnih + " od apsolutne vrednosti negativnih " + Math.abs(sumaNegativnih));
        } else {
            System.out.println("Suma pozitivnih " + sumaPozitivnih + " je jednaka apsolutnoj vrednosti negativnih " + Math.abs(sumaNegativnih));
        }
    }
}
