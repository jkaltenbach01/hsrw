import java.util.Arrays;

public class Primfaktorzerlegung
{

   public static void main(String[] args)
   {
      long n = 1025;
      
      long[] ergebnis = primfaktoren(n);
      
      //Ausgabe
      System.out.println(Arrays.toString(ergebnis));
   }
   
   public static long[] primfaktoren(long x)
   {
      long[] erg = new long[0];
      long[] temp;
      long primzahl = 2;
      
      // 0 und 1 sind keine Primzahlen und werden zurückgegeben
      if(x <= 1) {
         erg = new long[1];
         erg[0] = x;
         return erg;
      }
      
      while(x != 1) {
         // Wenn x durch die primzahl teilbar ist, dann
         if(x % primzahl == 0) {
            // x verkleinern für nächste Schritte
            x = x / primzahl;
            // Aktuelles Array mit Werten in temp sichern 
            temp = new long[erg.length];
            for(int i = 0; i < erg.length; i++) {
               temp[i] = erg[i];
            }
            // Ergebnis Array neu erstellen mit einer Stelle mehr als vorher 
            erg = new long[temp.length+1];
            for(int i = 0; i < temp.length; i++) {
               erg[i] = temp[i];
            }
            // Neu gefundene Primzahl in Array
            erg[temp.length] = primzahl;
            /*
            * Alternativ kann im if-Block auch folgender Code stehen,
            * wenn man Arrays Funktionen nutzt:
            *
            * erg = Arrays.copyOf(erg, erg.length + 1);
				* erg[erg.length - 1] = primzahl;
            * x = x / primzahl;
            *
            */
         } else {
            // nächste Primzahl suchen
            do {
               primzahl++;
            } while(!istPrim(primzahl));
         }
      }
      return erg;
   }
   
   public static boolean istPrim(long x) 
   {
      if (x <= 2) {
         return (x == 2);
      }
      for (long l = 2; l <= Math.sqrt(x); l++) {
         if (x % l == 0) {
            return false;
         }
      }
      return true; 
   }
}
