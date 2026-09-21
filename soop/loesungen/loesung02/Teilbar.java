

import java.util.Scanner;

public class Teilbar {
	public static void main(String[] args) {
		// ganzzahlige Variable x und y deklarieren
		int x;
		int y;
		
		// Variable s vom Typ Scanner deklarieren
		Scanner s;
		// Festlegen, dass s von der Konsole einlesen soll 
		s = new Scanner(System.in);
		
		// Nachricht auf die Konsole ausgeben
		// der Variablen x die Eingabe von der Konsole zuweisen
		System.out.print("erste Zahl: ");		
		x = s.nextInt();
		
		// Nachricht auf die Konsole ausgeben
		// der Variablen y die Eingabe von der Konsole zuweisen
		System.out.print("zweite Zahl: ");		
		y = s.nextInt();
		
		//Division durch 0 abfangen
		if(y == 0)
		{
         System.out.println("Division durch 0 nicht definiert");
		}
		else
		{
		   // testen, ob der Wert der Variablen x durch y teilbar ist
		   // Bestimme den Rest von x bei Division durch y: x % y
		   // teste, ob dieser Rest Null ist: == 0 -> dann ist x durch y teilbar
   		if (x % y == 0) {
   			System.out.println(x + " ist durch " + y + " teilbar");
   		} else {
   			System.out.println(x + " ist nicht durch " + y + " teilbar");
   		}
		}
	}
}
