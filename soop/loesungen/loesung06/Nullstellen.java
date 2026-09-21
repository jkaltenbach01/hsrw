

import java.util.Scanner;

public class Nullstellen
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      System.out.println("Geben Sie a, b, c ein: ");

      double a = s.nextDouble();
      double b = s.nextDouble();
      double c = s.nextDouble();
      
      double[] nullstellen = nullstellen(a, b, c);
      
      if(nullstellen.length == 2)
      {
         System.out.println("Die Nullstellen sind " + nullstellen[0] + " und " + nullstellen[1]);
      }
      if(nullstellen.length == 1)
      {
         System.out.println("Die Nullstelle ist " + nullstellen[0]);
      }
      else
      {
         System.out.println("Die Gleichung hat keine reellen Nullstellen.");
      }
   }
   
   public static double[] nullstellen(double a, double b, double c)
   {
      double[] nullstellen;

      double diskriminante = Math.pow(b, 2) - 4*a*c;
      
      if(diskriminante > 0)
      {
         nullstellen = new double[2];
         nullstellen[0] = (-b + Math.sqrt(diskriminante)) / (2*a);
         nullstellen[1] = (-b - Math.sqrt(diskriminante)) / (2*a);
      }
      else if(diskriminante == 0)
      {
         nullstellen = new double[1];
         nullstellen[0] = -b / (2*a);
      }
      else
      {
         nullstellen = new double[0];
      }
   
   return nullstellen;
   }
}
