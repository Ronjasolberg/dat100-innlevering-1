import java.util.Scanner;

public class Oblig1_uke36_O3 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Skriv inn et positivt heltall: ");
        int n = input.nextInt();

        if (n > 0) {
            int nFakultet = 1;

            for (int i = 1; i <= n; i++) {
                nFakultet = nFakultet * i;
                System.out.println(n + "! = " + nFakultet);
            }
        } else {
            System.out.print("Skriv inn et positivt heltall: ");
        }
        input.close();
    }
}