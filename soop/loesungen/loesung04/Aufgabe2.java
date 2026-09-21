import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {
		// Hier die LÃ¶sung eintragen
		Scanner s = new Scanner(System.in);
		int z = 0;
		
		do {
			System.out.print("Zahl: ");
			z += s.nextInt();
		} while (z <= 100);
		
		System.out.println("Summe = " + z);
	}

}

