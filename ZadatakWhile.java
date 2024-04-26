import java.util.Scanner;

public class ZadatakWhile {
    public static void main(String[] args) {
       /* 2.Napisati program koji koristi while petlju da omogući korisniku unos dva broja.
       Program treba da ispise rezultat deljenja prvog broja sa drugim.
       Petlja treba da se ponavlja u slucaju da je drugi broj jednak nuli.
*/
        Scanner skener = new Scanner(System.in);
        double a;
        double b;

        while(true) {
            System.out.println("Unesite prvi broj:");
            a = skener.nextDouble();
            System.out.println("Unesite drugi broj:");
            b = skener.nextDouble();
            if (b == 0) {
                System.out.println("Delilac ne sme biti nula");
                continue;
            }

            double k = a / b;
            System.out.println("Njihov kolicnik je: " + k);
            break;
        }
    }
}
