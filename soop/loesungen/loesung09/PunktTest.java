

public class PunktTest
{

   public static void main(String[] args){
      Punkt p1 = new Punkt(1, 2, 3);
      Punkt p2 = new Punkt(2, 3, 4);
      Punkt p3 = new Punkt(2, 0, 4);
      
      System.out.println("Punkt 1: " + p1);
      p1.bewege(2, 4, 6);
      System.out.println("Punkt 1 bewegt: " + p1);
      System.out.println("Punkt 2: " + p2);
      System.out.println("Punkt 3: " + p3);
      System.out.println("Punkt 2 Punkt 3: " + p2.abstand(p3));

   }

}
