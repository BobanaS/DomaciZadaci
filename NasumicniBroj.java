import java.util.Random;

public class NasumicniBroj {
    public static void main(String[] args) {
        /*
        3. Generisati i ispisivati nasumicne brojeve u opsegu od 0 do 100, sve dok se ne ispise broj 99.
         */

        int broj = 99;
        Random r = new Random();
        int randombroj;
        while (true) {
            randombroj = r.nextInt(0, 100);
            if(randombroj!=99) {
                System.out.println("Random broj je " + randombroj);
            } else if (randombroj == 99) {
                System.out.println("Ispisan je broj " + randombroj);
                break;
            }
        }
    }
}