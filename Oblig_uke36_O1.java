import java.util.Scanner; 

public class Oblig_uke36_O1 {
  public static void main(String args[]) {
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Skriv inn din bruttoinntekt: "); 
      double inntekt = input.nextDouble();
      
      //Tar innlest beløp og regner ut trinnskatt
      if (inntekt > 0 && inntekt <= 217400 ) {
          System.out.println("Du skal ikke betale trinnskatt");
      } else if (inntekt <= 306050) {
          double skatt = inntekt * (1.7 / 100); 
          double avrundet = Math.round(skatt * 100.0) / 100.0;
          System.out.println("Med " + inntekt + " i inntekt, er du på Trinn 1 og skal betale " + avrundet + "kr i skatt.");
      } else if (inntekt <= 697150) {
          double skatt = inntekt * (4.0 / 100); 
          double avrundet = Math.round(skatt * 100.0) / 100.0;
          System.out.println("Med " + inntekt + " i inntekt, er du på Trinn 2 og skal betale " + avrundet + "kr i skatt.");
      } else if (inntekt <= 942400) {
          double skatt = inntekt * (13.7 / 100);
          double avrundet = Math.round(skatt * 100.0) / 100.0;
          System.out.println("Med " + inntekt + " i inntekt, er du på Trinn 3 og skal betale " + avrundet + "kr i skatt.");
      } else if (inntekt <= 1410750) {
          double skatt = inntekt * (16.7 / 100);
          double avrundet = Math.round(skatt * 100.0) / 100.0;
          System.out.println("Med " + inntekt + " i inntekt, er du på Trinn 4 og skal betale " + avrundet + "kr i skatt.");
      } else if (inntekt <= 1410751) {
          double skatt = inntekt * (17.7 / 100);
          double avrundet = Math.round(skatt * 100.0) / 100.0;
          System.out.println("Med " + inntekt + " i inntekt, er du på Trinn 5 og skal betale " + avrundet + "kr i skatt.");
      }
     
    input.close();
  }
}