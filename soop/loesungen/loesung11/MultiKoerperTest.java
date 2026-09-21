



public class MultiKoerperTest
{

   public static void main(String[] args)
   {
      Koerper k1 = new Koerper("blau", 2, -5, 0.4);
      Koerper k2 = new Koerper("rot", 0, 0, 0);
      Koerper k3 = new Koerper("gelb", 0, 10, 0);
      Koerper k4 = new Koerper();
      
      MultiKoerper m1 = new MultiKoerper();
      MultiKoerper m2 = new MultiKoerper();
      MultiKoerper m3 = new MultiKoerper();
      MultiKoerper m4 = new MultiKoerper();
      
      m1.einfuegen(k1);
      m1.einfuegen(k2);
      
      m2.einfuegen(k2);
      m2.einfuegen(k3);

      m3.einfuegen(k1);
      m3.einfuegen(k2);
      m3.einfuegen(k3);
      m3.einfuegen(k4);
      m3.einfuegen(k1);
      
      m4.einfuegen(k3);
      
      System.out.println("MulitKörper: "+ m1 +": " + m1.abstand(m2));
      System.out.println("MulitKörper: "+ m2 +": " + m1.abstand(m3));
      System.out.println("MulitKörper: "+ m3 +": " + m2.abstand(m3));
      System.out.println("MulitKörper: "+ m4 +": " + m3.abstand(m4));
      
      System.out.println("Volumen: " + m1.volumen() + ", Fläche: " + m1.flaeche() + ", Teilkörper:" + m1.getAnzahlTeilKoerper());
      System.out.println("Volumen: " + m2.volumen() + ", Fläche: " + m2.flaeche() + ", Teilkörper:" + m2.getAnzahlTeilKoerper());
      System.out.println("Volumen: " + m3.volumen() + ", Fläche: " + m3.flaeche() + ", Teilkörper:" + m3.getAnzahlTeilKoerper());
      System.out.println("Volumen: " + m4.volumen() + ", Fläche: " + m4.flaeche() + ", Teilkörper:" + m4.getAnzahlTeilKoerper());
   }

}
