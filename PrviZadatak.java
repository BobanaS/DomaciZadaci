public class PrviZadatak {
    public static void main(String[] args) {
        /*
        1. Napisati program u Javi koji racuna povrsinu i obim pravougaonika sa zadatim
dimenzijama a = 5 i b = 13 (duzine stranica).

         */
        int a=5;
        int b=13;
        int povrsina=a*b;
        int obim=2*(a+b);

        System.out.println("Ukoliko stranice pravougaonika iznose a: "+ a+ ", b: " + b +
                ", onda povrsina tog pravougaonika iznosi: " + povrsina + ", a njegov obim iznosi: "+ obim +".");
    }
}
