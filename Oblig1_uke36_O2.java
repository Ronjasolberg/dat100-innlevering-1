import java.util.Scanner;

public class Oblig1_uke36_O2 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Skriv inn poengsum, mellom 0 og 100; ");

        for (int i = 0; i<10; i++) {

            int poengsum = input.nextInt();

            if(poengsum <= 100 & poengsum >= 90) {
                System.out.println("Karakter A");
            } else if (poengsum <= 89 & poengsum >= 80) {
                System.out.println("Karakter B");
            } else if (poengsum <= 79 & poengsum >= 60) {
                System.out.println("Karakter C");
            } else if (poengsum <= 59 & poengsum >= 50) {
                System.out.println("Karakter D");
            } else if (poengsum <= 49 & poengsum >= 40) {
                System.out.println("Karakter E");
            } else if (poengsum <= 39 & poengsum >= 0) {
                System.out.println("Karakter F");
            }

            if (poengsum < 0 || poengsum > 100) {
                System.out.println("Ugyldig verdi");
            }
        }

    }
}
