import java.util.Scanner;

public class PrviZadatakPet {
    public static void main(String[] args) {
       /* 1. Napisati program koji izracunava povrsinu i obim kruga za radijus r.
    */
        Scanner skener=new Scanner(System.in);
        System.out.println("Unesite radijus kruga: ");
        double r= skener.nextDouble();
       double p=Math.PI*r*r;
       double  o=2*Math.PI*r;
        System.out.println("Za radijus " + r + ", povrsina kruga iznosi " + p + ", a obim je jednak: "+ o + ".");


    }
}
