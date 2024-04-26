public class DomaciNizString {

    public static void main(String[] args) {
        /*
        Domaci
1. Napisati program koji za niz od 10 stringova ispisuje koliko
stringova pocinje sa velikim slovom. - koristiti charAt()
         */

        String[] niz = {"Prolece", "Leto", "zima", "jesen", "Plaza", "Sladoled", "kisa", "Sneg", "Knjiga", "grom"};

        int brVelikihSlova = 0;

        for (int i = 0; i < niz.length; i++) {
            if ((niz[i]).charAt(0) >= 'A' && (niz[i]).charAt(0) <= 'Z') {

                brVelikihSlova++;

            }
        }
        System.out.println("Broj stingova koji pocinju sa velikim slovom: " + brVelikihSlova);

    }
}