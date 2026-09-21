



public class WuerfelTest
{

   public static void main(String[] args)
   {
      Koerper k1 = new Koerper("blau", 2, -5, 0.4);
      Wuerfel w1 = new Wuerfel("rot", 1, 2, 1, 1);
      Wuerfel w2 = new Wuerfel("gelb", 0, 10, 0, 10);
      Wuerfel w3 = new Wuerfel("schwarz", 0, 0, 0, 0);
      
      System.out.println("Würfel: "+ w1 +": " + w1.abstand(w2));
      System.out.println("Würfel: "+ w2 +": " + w1.abstand(w3));
      System.out.println("Würfel: "+ w3 +": " + w2.abstand(w3));
      System.out.println("Würfel: "+ w3 +": " + w3.abstand(k1));

      System.out.println("Würfel 1 Volumen:" + w1.volumen());
      System.out.println("Würfel 2 Volumen:" + w2.volumen());
      System.out.println("Würfel 3 Volumen:" + w3.volumen());
      
      System.out.println("Würfel 1 Fläche:" + w1.flaeche());
      System.out.println("Würfel 2 Fläche:" + w2.flaeche());
      System.out.println("Würfel 3 Fläche:" + w3.flaeche());
   }

}
