
import java.util.Scanner;

public class QuadratischeGleichung
{

   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      System.out.println("Geben Sie a, b, c ein: ");

      double a = s.nextDouble();
      double b = s.nextDouble();
      double c = s.nextDouble();
      
      double diskriminante = Math.pow(b, 2) - 4*a*c;
      
      double n1;
      double n2;
      
      if(diskriminante > 0)
      {
         n1 = (-b + Math.sqrt(diskriminante)) / 2*a;
         n2 = (-b - Math.sqrt(diskriminante)) / 2*a;
         System.out.println("Die Nullstellen sind " + n1 + " und " + n2);
      }
      else if (diskriminante == 0)
      {
         n1 = -b / 2*a;
         System.out.println("Die Nullstelle ist " + n1);
      }
      else
      {
         System.out.println("Die Gleichung hat keine reellen Nullstellen.");
      }
   }

}
