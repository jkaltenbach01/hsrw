import java.util.Scanner;

public class Wahrheitstabelle_Teilaufgabe_c_mit_binString{

   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Anzahl Stellen = ");
      int spalten = scanner.nextInt();
        int zeilen = (int)Math.pow(2, spalten);
        
        for (int i = 0; i < zeilen; i++) {
            String binaryString = Integer.toBinaryString(i);
            String newBinaryString = "";
            // führende Nullen hinzufügen
            while (binaryString.length() < spalten) {
                binaryString = "0" + binaryString;
            }
            // Leerzeichen einfügen
            for (int j = 0; j < binaryString.length(); j++) {
                newBinaryString = newBinaryString + " " + binaryString.charAt(j);
            }
            newBinaryString = newBinaryString.trim();
            System.out.println(newBinaryString);
        }
   }
}
