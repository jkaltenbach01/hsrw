import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int eingabe  = 0;
		int ergebnis = 0;
		
		do {
			System.out.print("Zahl: ");
			eingabe = s.nextInt();
		} while (eingabe < 0);
		
		for(int i = 1; i <= eingabe; i++)
		{
		   ergebnis += i;
		}
		
		System.out.println("Summe 1 .. " + eingabe + " = " + ergebnis);
	}

}