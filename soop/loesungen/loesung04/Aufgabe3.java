import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int untereGrenze = 0;
      int obereGrenze  = 0;
		
		do {
			System.out.print("Untere Grenze: ");
			untereGrenze = s.nextInt();
		} while (untereGrenze < 0);
		
      do {
         System.out.print("Obere Grenze: ");
         obereGrenze = s.nextInt();
      } while (obereGrenze < 0 || obereGrenze < untereGrenze);

      System.out.print("Die Reihe lautet:");
		for(int i = untereGrenze; i <= obereGrenze; i++)
		{
		   System.out.print(" " + i);
		}
		
	}

}
