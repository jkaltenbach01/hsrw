

public class KanteTest
{

   public static void main(String[] args)
   {
      Kante k1 = new Kante(new Punkt(0, 0, 0), new Punkt(1, 2, 3));
      Kante k2 = new Kante(new Punkt(1, 2, 3), new Punkt(2, 4, 6));
      Kante k3 = new Kante(new Punkt(1, 1, 1), new Punkt(2, 2, 2));
      Kante k4 = new Kante();
      
      System.out.println("Kante " + k1 + " Länge: " + k1.laenge() + " Parallel zu k2: " + k1.istParallel(k2));
      System.out.println("Kante " + k2 + " Länge: " + k2.laenge() + " Parallel zu k3: " + k2.istParallel(k3));
      System.out.println("Kante " + k3 + " Länge: " + k3.laenge() + " Parallel zu k4: " + k3.istParallel(k4));
      System.out.println("Kante " + k4 + " Länge: " + k4.laenge() + " Parallel zu k1: " + k4.istParallel(k1));
   }

}
