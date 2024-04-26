import java.util.Scanner;

public class TreciZadatakPet {
    public static void main(String[] args) {
       /*
        3.  Napravi program koji korisnika pita za korisnicko ime i lozinku.
            Zatim, proveri da li je korisnicko ime "admin" i da li je lozinka "password".
            Ako su oba ispravna, program treba da ispise poruku "Dobrodosli!".
            U suprotnom, program treba da ispise poruku "Pogresno korisnicko ime ili lozinka!".
        */

        Scanner skener=new Scanner(System.in);
        System.out.println("Unesite korisnicko ime: ");
        String text1= skener.nextLine();
        System.out.println("Unesite password");
        String text2= skener.nextLine();

        if(text1.equals("admin")&&text2.equals("password")){
            System.out.println("Dobrodosli");
        }else{
            System.out.println("Pogresno korisnicko ime ili lozinka!!!");
        }

    }
}
