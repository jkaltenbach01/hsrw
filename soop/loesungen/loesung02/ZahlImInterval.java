

import java.util.Scanner;

public class ZahlImInterval {

	public static void main(String[] args) {
		// ganzzahlige Variable x und y deklarieren
		int x;
		int y;
		int zahl;
				
		// Variable s vom Typ Scanner deklarieren
		Scanner s;
		// Festlegen, dass s von der Konsole einlesen soll 
		s = new Scanner(System.in);
				
		// Nachricht auf die Konsole ausgeben
		// der Variablen x die Eingabe von der Konsole zuweisen
		System.out.print("1. Intervallgrenze: ");		
		x = s.nextInt();
				
		// Nachricht auf die Konsole ausgeben
		// der Variablen y die Eingabe von der Konsole zuweisen
		System.out.print("2. Intervallgrenze: ");		
		y = s.nextInt();
		
		// Nachricht auf die Konsole ausgeben
		// der Variablen zahl die Eingabe von der Konsole zuweisen
		System.out.print("Zahl: ");		
		zahl = s.nextInt();
		
		int untereGrenze = (x > y) ? y : x;
		int obereGrenze  = (x > y) ? x : y;
		
		if ((zahl >= untereGrenze) && (zahl <= obereGrenze)) {
			System.out.println(zahl + " liegt im Intervall [" + untereGrenze + ", " + obereGrenze + "]");
		} else {
			System.out.println(zahl + " liegt nicht im Intervall [" + untereGrenze + ", " + obereGrenze + "]");
		}

	}

}
