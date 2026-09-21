

import java.util.Scanner;

public class TeilbarDurchDrei {
	public static void main(String[] args) {
		// ganzzahlige Variable x deklarieren
		int x;
		
		// Variable s vom Typ Scanner deklarieren
		Scanner s;
		// Festlegen, dass s von der Konsole einlesen soll 
		s = new Scanner(System.in);
		
		// Nachricht auf die Konsole ausgeben
		System.out.print("Geben Sie eine ganze Zahl ein: ");
		
		// der Variablen x die Eingabe von der Konsole zuweisen
		x = s.nextInt();
		
		// testen, ob der Wert der Variablen x durch 3 teilbar ist
		// Bestimme den Rest von x bei Division durch 3: x % 3
		// teste, ob dieser Rest Null ist: == 0 -> dann ist x durch 3 teilbar
		if (x % 3 == 0) {
			System.out.println(x + " ist durch 3 teilbar");
		} else {
			System.out.println(x + " ist nicht durch 3 teilbar");
		}
	}
}
