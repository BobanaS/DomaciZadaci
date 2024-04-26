public class ZadatakSumaKvadrata {
    public static void main(String[] args) {
        /*2. Suma kvadrata:
         Napiši program koji će izračunati sumu kvadrata
         prvih 10 prirodnih brojeva (1^2 + 2^2 + 3^2 + ...)
         */
        int suma =0;
        for(int i=1; i<=10; i++){
            suma+=Math.pow(i,2);
        }
        System.out.println("Suma kvadrata prvih 10 prirodnih brojeva je: " + suma);
    }
}
